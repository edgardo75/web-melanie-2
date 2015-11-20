package com.server;
import utilities.Reportes;
import com.melani.ejb.ServiceNotaPedido;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.ws.WebServiceRef;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.data.JRXmlDataSource;
import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
/**
 *
 * @author Edgardo
 */
public class ShowReportNotaPedido extends HttpServlet {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/ServiceNotaPedido/NotaPedidoWs.wsdl")
    private ServiceNotaPedido service;    
    private static final Logger LOGGER = Logger.getLogger(ShowReportNotaPedido.class);
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setHeader("Cache-Control","no-cache");  //Para evitar el cache
        response.setHeader("Pragma","no-cache");
        response.setDateHeader ("Expires", 0);
        response.setContentType("application/pdf");       
        ServletOutputStream servletOutputStream;
        String nronota;
        Integer idnota;
        java.lang.String result = null;
        try {
            nronota=request.getParameter("nronota");
            idnota = Integer.valueOf(nronota);
            try {
                com.melani.ejb.NotaPedidoWs port = service.getNotaPedidoWsPort();
                
                result = port.selectUnaNota(idnota);
            } catch (Exception ex) {           
                LOGGER.error("Error al llamar la operacion del webservice!!! "+ex.getMessage());
            }            
            servletOutputStream=response.getOutputStream();
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db =null;
                    try {
                        db = dbf.newDocumentBuilder();
                    } catch (ParserConfigurationException ex) {
               
                        LOGGER.error("Error en Servlet ShowReportNotaPedido "+ex.getLocalizedMessage());
                    }
                     InputSource is = new InputSource();
                        is.setCharacterStream(new StringReader(result));                        
                            Document doc = null;
                                try {
                                    doc = db.parse(is);
                                } catch (SAXException ex) {
                                       LOGGER.error("Error en Servlet ShowReportNotaPedido "+ex.getLocalizedMessage());
                                }                    
                             JRXmlDataSource xmlDataSource = null;
                            try {
                                xmlDataSource = new JRXmlDataSource(doc, "/Lista");
                            } catch (JRException ex) {
                          
                                LOGGER.error("Error en Servlet ShowReportNotaPedido "+ex.getLocalizedMessage());
                            }                            
                                byte[] bytes;                            
                             try {
                                    Map map = new HashMap();
                                    map.put("SUBREPORT_DIR","");
                                        bytes = JasperRunManager.runReportToPdf(Reportes.obtenerNotaPedido(), map, xmlDataSource);
                                        response.setContentType("application/pdf");
                                        response.setContentLength(bytes.length);
                                        servletOutputStream.write(bytes, 0, bytes.length);
                                        servletOutputStream.flush();                                      
                                } catch (JRException e) {                                 
                                        StringWriter stringWriter = new StringWriter();
                                        PrintWriter printWriter = new PrintWriter(stringWriter);
                                        e.printStackTrace(printWriter);
                                        response.setContentType("text/plain");
                                        response.getOutputStream().print(stringWriter.toString());
                                        LOGGER.error(stringWriter.toString(), e);
                                }
           //-------------------------------------------------------------------------------
        }catch(  IOException | NumberFormatException ex){
          
            LOGGER.error("Error en el Servlet ShowreportNotaPedido "+ex.getMessage());
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }  
   
}

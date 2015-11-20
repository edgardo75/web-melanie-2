package com.server;
import utilities.Reportes;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.sql.SQLException;
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

public class ShowReportPresupuesto extends HttpServlet {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/ServicesPresupuestos/PresupuestoWs.wsdl")
    private com.melani.ejb.ServicesPresupuestos service;

    private static final Logger LOGGER = Logger.getLogger(ShowReportPresupuesto.class);
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException, SQLException {
       response.setHeader("Cache-Control","no-cache");  //Para evitar el cache
        response.setHeader("Pragma","no-cache");
        response.setDateHeader ("Expires", 0);
        response.setContentType("application/pdf");        
        ServletOutputStream servletOutputStream;
        String xml = "";
        String presnro;
        Integer idpresupuesto;
        try {            
                presnro=request.getParameter("presnro");                
                idpresupuesto=Integer.valueOf(presnro);
                try {
                    com.melani.ejb.PresupuestoWs port = service.getPresupuestoWsPort();                    
                    xml = port.showReportPresupuesto(idpresupuesto);                    
                } catch (Exception ex) {                 
                    LOGGER.error("Error en Servlet ShowReportPresupuesto "+ex.getLocalizedMessage());
                }
                    servletOutputStream = response.getOutputStream();              
                    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();                    
                    DocumentBuilder db = null;
                            try {              
                                db = dbf.newDocumentBuilder();
                            } catch (ParserConfigurationException ex) {
                                LOGGER.error("Error en Servlet ShowReportPresupuesto "+ex.getLocalizedMessage());
                            }                    
                        InputSource is = new InputSource();                       
                        is.setCharacterStream(new StringReader(xml));                                               
                            Document doc = null;
                                try {                       
                                    doc = db.parse(is);
                                } catch (SAXException ex) {
                                        LOGGER.error("Error en Servlet ShowReportPresupuesto "+ex.getLocalizedMessage());
                                }                            
                             JRXmlDataSource xmlDataSource = null;
                            try {                                
                                xmlDataSource = new JRXmlDataSource(doc, "/Lista/Item");
                            } catch (JRException ex) {
                                LOGGER.error("Error en Servlet ShowReportPresupuesto "+ex.getLocalizedMessage());
                            }                     
                                byte[] bytes;                     
                    try {          
                                    Map map = new HashMap();
                                    map.put("SUBREPORT_DIR","");
                                    bytes = JasperRunManager.runReportToPdf(Reportes.obtenerPresupuesto(), map, xmlDataSource);
                                    response.setContentType("application/pdf");
                                    response.setContentLength(bytes.length);
                                    servletOutputStream.write(bytes, 0, bytes.length);
                                    servletOutputStream.flush();
                                 
                    } catch (JRException e) {
                            // display stack trace in the browser
                            StringWriter stringWriter = new StringWriter();
                            PrintWriter printWriter = new PrintWriter(stringWriter);
                            e.printStackTrace(printWriter);
                            response.setContentType("text/plain");
                            response.getOutputStream().print(stringWriter.toString());
                            LOGGER.error(stringWriter.toString(), e);
                    }           
        }catch(NullPointerException npe){
            LOGGER.error("Error en el Servlet ShowReportPresupuesto "+npe.getMessage());
        } 
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        try {
            processRequest(request, response);
        }catch(NullPointerException npe)    {
            LOGGER.error("Error en Servlet ShowReportPresupuestos ",npe.getCause());
        } catch (SQLException ex) {
            LOGGER.error("Error en Servlet ShowReportPresupuesto "+ex.getMessage());
        }
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            LOGGER.error("Error en Servlet ShowReportPresupuesto");
            
        }
    }    
}

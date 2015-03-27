package com.server;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import com.melani.ejb.ServiceNotaPedido;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
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
    
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    private static final Logger logger = Logger.getLogger(ShowReportNotaPedido.class);
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setHeader("Cache-Control","no-cache");  //Para evitar el cache
        response.setHeader("Pragma","no-cache");
        response.setDateHeader ("Expires", 0);
        response.setContentType("application/pdf");       
        ServletOutputStream servletOutputStream =null;
        String nronota="";
        Integer idnota =0;
        java.lang.String result="";
        try {
            nronota=request.getParameter("nronota");
            idnota = Integer.valueOf(nronota);
            try { // Call Web Service Operation
                com.melani.ejb.NotaPedidoWs port = service.getNotaPedidoWsPort();
                // TODO initialize WS operation arguments here
                // TODO process result here
                result = port.selectUnaNota(idnota);
            } catch (Exception ex) {
           
                // TODO handle custom exceptions here
                logger.error("Error al llamar la operacion del webservice!!! "+ex.getMessage());
            }
            
            servletOutputStream=response.getOutputStream();
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db =null;
                    try {
                        db = dbf.newDocumentBuilder();
                    } catch (ParserConfigurationException ex) {
               
                        java.util.logging.Logger.getLogger(ShowReportNotaPedido.class.getName()).log(Level.SEVERE, null, ex);
                    }
                     InputSource is = new InputSource();
                        is.setCharacterStream(new StringReader(result));
                        //----------------------------------------------------------------------------
                            Document doc = null;
                                try {
                                    doc = db.parse(is);
                                } catch (SAXException ex) {
           
                                    java.util.logging.Logger.getLogger(ShowReportNotaPedido.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            //----------------------------------------------------------------------------
                            //----------------------------------------------------------------------------
                             JRXmlDataSource xmlDataSource = null;
                            try {
                                xmlDataSource = new JRXmlDataSource(doc, "/Lista");
                            } catch (JRException ex) {
                          
                                java.util.logging.Logger.getLogger(ShowReportNotaPedido.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            //----------------------------------------------------------------------------
                                byte[] bytes = null;
                            //----------------------------------------------------------------------------
                             try {
                                    Map map = new HashMap();
                                    map.put("SUBREPORT_DIR","");
                                        bytes = JasperRunManager.runReportToPdf(Reportes.obtenerNotaPedido(), map, xmlDataSource);
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
                                        logger.error(stringWriter.toString(), e);
                                }
           //-------------------------------------------------------------------------------
        }catch(  IOException | NumberFormatException ex){
          
            logger.error("Error en el Servlet ShowreportNotaPedido "+ex.getMessage());
        }
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
    /**
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }  
   
}

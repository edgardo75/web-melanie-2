/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.server;
import com.melani.ejb.ServiceNotaPedido;
import java.io.File;
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
public class ShowReportEntreFechasEntrega extends HttpServlet {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/192.168.1.100_8080/ServiceNotaPedido/NotaPedidoWs.wsdl")
    private ServiceNotaPedido service;
   
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    private static final Logger logger = Logger.getLogger(ShowReportEntreFechasEntrega.class);
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setHeader("Cache-Control","no-cache");  //Para evitar el cache
        response.setHeader("Pragma","no-cache");
        response.setDateHeader ("Expires", 0);
        response.setContentType("application/pdf");
        String pathActual = System.getProperty("user.dir") + File.separatorChar + "reports" + File.separatorChar;
        String reportFileName =pathActual+"reportVerNotasEntreFechasEntrega.jasper";
        ServletOutputStream servletOutputStream =null;
        String fecha1;
        String fecha2;
        int vendedor=0;
        String result=null;
        try {
            fecha1=request.getParameter("fstart");
            fecha2=request.getParameter("fend");
            vendedor=Integer.parseInt(request.getParameter("vendor"));
            try { // Call Web Service Operation
                com.melani.ejb.NotaPedidoWs port = service.getNotaPedidoWsPort();
                // TODO initialize WS operation arguments here
                // TODO process result here
               result = port.selecNotaEntreFechasEntrega(fecha1, fecha2, vendedor);
            } catch (Exception ex) {
                // TODO handle custom exceptions here
            }
            System.out.println("result "+result);
                            servletOutputStream=response.getOutputStream();
                                DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
                                DocumentBuilder db =null;
                                try {
                                        db = dbf.newDocumentBuilder();
                                    } catch (ParserConfigurationException ex) {
                                        java.util.logging.Logger.getLogger(ShowReportEntreFechasEntrega.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                InputSource is = new InputSource();
                                    is.setCharacterStream(new StringReader(result));
                        //----------------------------------------------------------------------------
                                    Document doc = null;
                                      try {
                                    doc = db.parse(is);
                                } catch (SAXException ex) {
                                    java.util.logging.Logger.getLogger(ShowReportEntreFechasEntrega.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            //----------------------------------------------------------------------------
                            //----------------------------------------------------------------------------
                                    JRXmlDataSource xmlDataSource = null;
                                            try {
                                                xmlDataSource = new JRXmlDataSource(doc, "/Lista/item");
                                            } catch (JRException ex) {
                                                java.util.logging.Logger.getLogger(ShowReportEntreFechasEntrega.class.getName()).log(Level.SEVERE, null, ex);
                                            }
                            //----------------------------------------------------------------------------
                                             byte[] bytes = null;
                            //----------------------------------------------------------------------------
                                             try {
                                    Map map = new HashMap();
                                    map.put("SUBREPORT_DIR","");
                                        bytes = JasperRunManager.runReportToPdf(reportFileName, map, xmlDataSource);
                                        response.setContentType("application/pdf");
                                        response.setContentLength(bytes.length);
                                        servletOutputStream.write(bytes, 0, bytes.length);
                                        servletOutputStream.flush();
                                        servletOutputStream.close();
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
        }catch(IOException ex){
            logger.error("Error en el Servlet ShowReportEntreFechasEntrega "+ex.getMessage());
        } catch (NumberFormatException ex) {
            logger.error("Error en el Servlet ShowReportEntreFechasEntrega "+ex.getMessage());
        } finally {
            servletOutputStream.close();
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
    /**
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.server;

import com.melani.ejb.ServicesPresupuestos;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
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
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 *
 * @author win7
 */
@WebServlet(name = "ShowReportView", urlPatterns = {"/ShowReportView"})
public class ShowReportView extends HttpServlet {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/ServicesPresupuestos/PresupuestoWs.wsdl")
    private ServicesPresupuestos service;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws javax.xml.parsers.ParserConfigurationException
     * @throws net.sf.jasperreports.engine.JRException
     * @throws org.xml.sax.SAXException
     */
    private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(ShowReportView.class);
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParserConfigurationException, SAXException, JRException {
         response.setHeader("Cache-Control","no-cache");  //Para evitar el cache
        response.setHeader("Pragma","no-cache");
        response.setDateHeader ("Expires", 0);
        response.setContentType("application/pdf");
        //String pathActual = System.getProperty("user.dir") + File.separatorChar + "reports" + File.separatorChar;
        //String reportFileName =pathActual+"reportVerPresupuestos.jasper";
        ServletOutputStream servletOutputStream =null;
        Long first =0L;
        Long last =0L;
        String xml = "";
        try {
            first=Long.parseLong(request.getParameter("first"));
            last =Long.parseLong(request.getParameter("last"));
            try { // Call Web Service Operation
                com.melani.ejb.PresupuestoWs port = service.getPresupuestoWsPort();
                // TODO initialize WS operation arguments here
                // TODO process result here
                xml = port.showReportVerPresupuesto(first, last);
            } catch (Exception ex) {
                // TODO handle custom exceptions here
            }
               //----------------------------------------------------------------------------
                        servletOutputStream = response.getOutputStream();
                    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
                    DocumentBuilder db = null;
                    try {
                        db = dbf.newDocumentBuilder();
                    } catch (ParserConfigurationException ex) {
                    }
                        InputSource is = new InputSource();
                        is.setCharacterStream(new StringReader(xml));
                        Document doc = null;
                                try {
                                    doc = db.parse(is);
                                } catch (SAXException ex) {
                                }
                            //----------------------------------------------------------------------------
                             JRXmlDataSource xmlDataSource = null;
                            try {
                                xmlDataSource = new JRXmlDataSource(doc, "/Lista/Item");
                            } catch (JRException ex) {
                            }
                            //----------------------------------------------------------------------------
                                byte[] bytes = null;
                            //----------------------------------------------------------------------------
                                            try {
                                                Map map = new HashMap();
                                                map.put("SUBREPORT_DIR","");
                                                    bytes = JasperRunManager.runReportToPdf(Reportes.obtenerView(), map, xmlDataSource);
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
                                }
        } catch(NumberFormatException | IOException e){
            logger.error(e.getLocalizedMessage());
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParserConfigurationException | SAXException | JRException ex) {
            Logger.getLogger(ShowReportView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParserConfigurationException | SAXException | JRException ex) {
            Logger.getLogger(ShowReportView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

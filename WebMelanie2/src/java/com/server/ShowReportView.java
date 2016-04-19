package com.server;
import utilities.Reportes;
import com.melani.ejb.ServicesPresupuestos;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.ws.WebServiceRef;
import net.sf.jasperreports.engine.JRException;
import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;
@WebServlet(name = "ShowReportView", urlPatterns = {"/ShowReportView"})
public class ShowReportView extends HttpServlet {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/ServicesPresupuestos/PresupuestoWs.wsdl")
    private ServicesPresupuestos service;
    private static final Logger LOGGER = Logger.getLogger(ShowReportView.class);
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParserConfigurationException, SAXException, JRException {
         response.setHeader("Cache-Control","no-cache");  //Para evitar el cache
        response.setHeader("Pragma","no-cache");
        response.setDateHeader ("Expires", 0);
        response.setContentType("application/pdf");        
        ServletOutputStream servletOutputStream;
        Long first;
        Long last;
        String xml;
        Reportes reporte = new Reportes();        
            first=Long.parseLong(request.getParameter("first"));
            last =Long.parseLong(request.getParameter("last"));
         com.melani.ejb.PresupuestoWs port = service.getPresupuestoWsPort();
                xml = port.showReportVerPresupuesto(first, last);
                servletOutputStream = response.getOutputStream();
                Document doc = reporte.obtenerDocumentoParseado(xml);                                                  
                                                    byte []bytes = reporte.obtenerReporteJasper(doc, "/Lista/Item", reporte.obtenerView());
                                                    response.setContentType("application/pdf");
                                                    response.setContentLength(bytes.length);
                                                    servletOutputStream.write(bytes, 0, bytes.length);
                                                    servletOutputStream.flush();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParserConfigurationException | SAXException | JRException ex) {
            LOGGER.error("Error en Servlet ShowReportView");
            
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
            LOGGER.error("Error en Servlet ShowReportView");
        }
    }
}

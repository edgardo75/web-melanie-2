package com.server;
import utilities.Reportes;
import com.melani.ejb.ServicesPresupuestos;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.ws.WebServiceRef;
import net.sf.jasperreports.engine.JRException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;
@WebServlet(name = "ShowReportView", urlPatterns = {"/ShowReportView"})
public class ShowReportView extends HttpServlet {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/ServicesPresupuestos/PresupuestoWs.wsdl")
    private ServicesPresupuestos service;    
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
            Logger.getLogger(ShowReportView.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        try {
            processRequest(request, response);
        } catch (ParserConfigurationException | SAXException | JRException ex) {
            Logger.getLogger(ShowReportView.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

    private String showReportVerPresupuesto(java.lang.Long arg0, java.lang.Long arg1) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.melani.ejb.PresupuestoWs port = service.getPresupuestoWsPort();
        return port.showReportVerPresupuesto(arg0, arg1);
    }
}
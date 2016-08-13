package com.server;
import com.melani.ejb.ServiceBarrios;
import utilities.Reportes;
import java.io.IOException;
import java.util.logging.Level;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import net.sf.jasperreports.engine.JRException;
import org.w3c.dom.Document;
public class ShowReportBarrios extends HttpServlet {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/ServiceBarrios/BarriosWs.wsdl")
    private ServiceBarrios service;    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, JRException{
        response.setHeader("Cache-Control","no-cache");  //Para evitar el cache
        response.setHeader("Pragma","no-cache");
        response.setDateHeader("Expires", 0);        
        response.setContentType("application/pdf");
        ServletOutputStream servletOutputStream;
        String xml;        
        Reportes reporte = new Reportes();
               com.melani.ejb.BarriosWs port = service.getBarriosWsPort();             
                xml = port.searchAllBarrios();                
                servletOutputStream = response.getOutputStream();
                Document doc = reporte.obtenerDocumentoParseado(xml);                       
                                 byte[] bytes = reporte.obtenerReporteJasper(doc, "/Lista/item",reporte.obtenerTodosBarrios());
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
        } catch (JRException ex) {
            java.util.logging.Logger.getLogger(ShowReportBarrios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (JRException ex) {
            java.util.logging.Logger.getLogger(ShowReportBarrios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
}
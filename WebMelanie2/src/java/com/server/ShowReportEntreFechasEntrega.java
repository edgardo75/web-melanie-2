package com.server;
import utilities.Reportes;
import com.melani.ejb.ServiceNotaPedido;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import org.apache.log4j.Logger;
import org.w3c.dom.Document;
public class ShowReportEntreFechasEntrega extends HttpServlet {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/ServiceNotaPedido/NotaPedidoWs.wsdl")
    private ServiceNotaPedido service;
    private static final Logger LOGGER = Logger.getLogger(ShowReportEntreFechasEntrega.class);
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setHeader("Cache-Control","no-cache");  //Para evitar el cache
        response.setHeader("Pragma","no-cache");
        response.setDateHeader ("Expires", 0);
        response.setContentType("application/pdf");        
        ServletOutputStream servletOutputStream;
        String fecha1;
        String fecha2;        
        String result = "";        
        Reportes reporte = new Reportes();
        try {
            fecha1=request.getParameter("fstart");
            fecha2=request.getParameter("fend");           
            try { 
                com.melani.ejb.NotaPedidoWs port = service.getNotaPedidoWsPort();               
               result = port.selecNotaEntreFechasEntrega(fecha1, fecha2);
            } catch (Exception ex) {
                LOGGER.error("Error en Servlet ShowReportEntreFechasEntrega "+ex.getLocalizedMessage());
            }            
                            servletOutputStream=response.getOutputStream();
                            Document doc = reporte.obtenerDocumentoParseado(result);                                                                                 
                                             byte[] bytes = reporte.obtenerReporteJasper(doc, "/Lista/item",reporte.obtenerEntreFechasEntrega());                                             
                                             response.setContentType("application/pdf");
                                             response.setContentLength(bytes.length);
                                             servletOutputStream.write(bytes, 0, bytes.length);
                                             servletOutputStream.flush();
        }catch(  IOException | NumberFormatException ex){
            LOGGER.error("Error en el Servlet ShowReportEntreFechasEntrega "+ex.getMessage());
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
package com.server;
import utilities.Reportes;
import com.melani.ejb.ServiceNotaPedido;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import org.w3c.dom.Document;
@WebServlet(name = "ShowReportEntreFechasEntrega",urlPatterns = {"/ShowReportEntreFechasEntrega"})
public class ShowReportEntreFechasEntrega extends HttpServlet {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/ServiceNotaPedido/NotaPedidoWs.wsdl")
    private ServiceNotaPedido service;    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setHeader("Cache-Control","no-cache");  //Para evitar el cache
        response.setHeader("Pragma","no-cache");
        response.setDateHeader ("Expires", 0);
        response.setContentType("application/pdf");        
        ServletOutputStream servletOutputStream;
        String fecha1;
        String fecha2;        
        String result;        
        Reportes reporte = new Reportes();
            fecha1=request.getParameter("fstart");
            fecha2=request.getParameter("fend");           
                com.melani.ejb.NotaPedidoWs port = service.getNotaPedidoWsPort();               
               result = port.selectNotaEntreFechasEntrega(fecha1, fecha2);
                            servletOutputStream=response.getOutputStream();
                            Document doc = reporte.obtenerDocumentoParseado(result);                                                                                 
                                             byte[] bytes = reporte.obtenerReporteJasper(doc, "/Lista/item",reporte.obtenerEntreFechasEntrega());                                             
                                             response.setContentType("application/pdf");
                                             response.setContentLength(bytes.length);
                                             servletOutputStream.write(bytes, 0, bytes.length);
                                             servletOutputStream.flush();
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
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
import org.w3c.dom.Document;
public class ShowReportNotaPedido extends HttpServlet {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/ServiceNotaPedido/NotaPedidoWs.wsdl")
    private ServiceNotaPedido service;        
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setHeader("Cache-Control","no-cache");  //Para evitar el cache
        response.setHeader("Pragma","no-cache");
        response.setDateHeader ("Expires", 0);
        response.setContentType("application/pdf");       
        ServletOutputStream servletOutputStream;
        String nronota;
        Integer idnota;
        String result;
        Reportes reporte = new Reportes();
            nronota=request.getParameter("nronota");
            idnota = Integer.valueOf(nronota);
                com.melani.ejb.NotaPedidoWs port = service.getNotaPedidoWsPort();                
                result = port.selectUnaNota(idnota);
                            servletOutputStream=response.getOutputStream();
                                Document doc = reporte.obtenerDocumentoParseado(result);
                                    byte[] bytes = reporte.obtenerReporteJasper(doc, "/Lista",reporte.obtenerNotaPedido());
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
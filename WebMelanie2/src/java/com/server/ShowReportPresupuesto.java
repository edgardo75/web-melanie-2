package com.server;
import utilities.Reportes;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import org.apache.log4j.Logger;
import org.w3c.dom.Document;
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
        Reportes reporte = new Reportes();
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
                            Document doc = reporte.obtenerDocumentoParseado(xml);                            
                                byte[] bytes = reporte.obtenerReporteJasper(doc, "/Lista/item",reporte.obtenerPresupuesto());                                             
                                response.setContentType("application/pdf");
                                response.setContentLength(bytes.length);
                                servletOutputStream.write(bytes, 0, bytes.length);
                                servletOutputStream.flush();           
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
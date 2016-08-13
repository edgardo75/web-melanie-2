package utilities;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.data.JRXmlDataSource;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
public class Reportes {
    private static final String PATH = ResourceBundle.getBundle("config").getString("PATH_REPORT");    
   public String obtenerNotaPedido() {        
        return PATH+"reportNotaPedido.jasper";
    }
   public String obtenerTodosBarrios() {        
        return PATH+"reportAllBarrios.jasper";
    }
   public String obtenerEntreFechas() {
      return PATH+"reportVerNotasEntreFechasCompra.jasper";        
    }
   public String obtenerEntreFechasEntrega() {
       return PATH+"reportVerNotasEntreFechasEntrega.jasper";
   }
   public String obtenerPresupuesto() {
        return PATH+"reportPresuEnd.jasper";
   }
   public String obtenerView() {
       return PATH+"reportVerPresupuestos.jasper";
    }
   public Document obtenerDocumentoParseado(String xml){            
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
                                } catch (SAXException | IOException ex ) {
                                    Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
                                }   
   return doc;
   }
   public byte [] obtenerReporteJasper(Document doc, String pathReporte,String nombreReporteJasper){
       JRXmlDataSource xmlDataSource = null;
                            try {
                                xmlDataSource = new JRXmlDataSource(doc, pathReporte);
                            } catch (JRException ex) {
                                    Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);                                
                            }                            
                                byte[] bytes = null;                            
                             try {
                                    Map map = new HashMap();
                                    map.put("SUBREPORT_DIR","");
                                        bytes = JasperRunManager.runReportToPdf(nombreReporteJasper, map, xmlDataSource);                                        
                                } catch (JRException e) {                                 
                                        StringWriter stringWriter = new StringWriter();
                                        PrintWriter printWriter = new PrintWriter(stringWriter);
                                        e.printStackTrace(printWriter);                                        
                                }   
       return bytes;
   }
}
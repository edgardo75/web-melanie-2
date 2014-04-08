/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package resource;

import com.model.Detallesnotadepedido;
import com.model.Notadepedido;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.apache.commons.lang3.StringEscapeUtils;

/**
 * REST Web Service
 *
 * @author win7
 */
@Path("simple")
@RequestScoped
public class SimpleResource {

    @PersistenceContext
    EntityManager em;
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of SimpleResource
     */
    public SimpleResource() {
    }

    /**
     * Retrieves representation of an instance of resource.SimpleResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces({"application/xml","application/json"})
    public String getXml() {
        //TODO return proper representation object
         
        
        
        Query consulta = em.createNamedQuery("Notadepedido.findAll");
        List<com.model.Notadepedido>lista = consulta.getResultList();
        
        
        String notaJsonData="{"
                           + "\"lista\": [";
        int tamano = lista.size();
        int contador=0;        
            for (Iterator<Notadepedido> it = lista.iterator(); it.hasNext();) {
                contador++;
                   Notadepedido notadepedido = it.next();
                   
                           String item;            
                          
                        item = "{"             
                                    + "\"id\": \""+notadepedido.getId()+"\","+            
                                    "\"anticipo\": \""+notadepedido.getAnticipo()+"\","+
                                     "\"observaciones\": \'"+ notadepedido.getObservaciones()+"\',";            
                                    
                                   
                           
                           
                           
                           if(!notadepedido.getDetallesnotadepedidoList().isEmpty()){ 
                               int tamanoList=notadepedido.getDetallesnotadepedidoList().size();
                               int contadorList=0;
                               item+="\"detallesList\": [";
                                
                                                                
                               for(Detallesnotadepedido detalle:notadepedido.getDetallesnotadepedidoList()){
                                   contadorList++;
                                   String detalless;
                                   detalless="{";
                                       detalless+= "\"cantidad\": \""+detalle.getCantidad()+"\","
                                               + "\"producto\": \'"+detalle.getProductos().getDescripcion()+"\',"
                                               + "\"precio\": \""+detalle.getPrecio()+"\"";
                                       
                                       
                                       if(tamanoList==contadorList)
                                           detalless+="}";
                                       else
                                           detalless+="},";
                                       
                                       item+=detalless;
                                       
                               }
                               item+="],";
                               
                               
                               
                           }
                            item+= "\"cancelado\": \""+notadepedido.getCancelado()+"\","+            
                                      "\"fechadecompra\": \""+notadepedido.getFechadecompra()+"\"";
                            if(contador==tamano)
                               item+="}";
                           else
                               item+= "},";
                         
                           notaJsonData+=item;
                          
             }
            notaJsonData+="]}";
                           
            
        
        
        
        
        
        return notaJsonData;
    }

    /**
     * PUT method for updating or creating an instance of SimpleResource
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes({"application/xml","application/json"})
    public void putXml(String content) {
    }
}

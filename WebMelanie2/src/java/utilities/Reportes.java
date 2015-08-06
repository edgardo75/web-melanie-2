/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utilities;

import java.io.File;

/**
 *
 * @author win7
 */
public class Reportes {
    private static final String PATH = System.getProperty("user.dir")+File.separatorChar+"reports"+File.separatorChar;
    
   public static String obtenerNotaPedido() {
        
        return PATH+"reportNotaPedido.jasper";
    }

   public static String obtenerTodosBarrios() {
        
        return PATH+"reportAllBarrios.jasper";
    }

   public static String obtenerEntreFechas() {
      return PATH+"reportVerNotasEntreFechasCompra.jasper";
        
    }

   public static String obtenerEntreFechasEntrega() {
       return PATH+"reportVerNotasEntreFechasEntrega.jasper";
   }

   public static String obtenerPresupuesto() {
        return PATH+"reportPresuEnd.jasper";
   }

   public static String obtenerView() {
       return PATH+"reportVerPresupuestos.jasper";
    }
    
    
    
    
    
}

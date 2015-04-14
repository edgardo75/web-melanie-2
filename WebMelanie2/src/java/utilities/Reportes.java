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

    
   public static String obtenerNotaPedido() {
        StringBuilder strPath = new StringBuilder(100);
        return strPath.append(System.getProperty("user.dir")).append(File.separatorChar).append("reports").append(File.separatorChar).append("reportNotaPedido.jasper").toString();
    }

   public static String obtenerTodosBarrios() {
        StringBuilder strPath = new StringBuilder(100);
        return strPath.append(System.getProperty("user.dir")).append(File.separatorChar).append("reports").append(File.separatorChar).append("reportAllBarrios.jasper").toString();
    }

   public static String obtenerEntreFechas() {
        StringBuilder strPath = new StringBuilder(100);
        return strPath.append(System.getProperty("user.dir")).append(File.separatorChar).append("reports").append(File.separatorChar).append("reportVerNotasEntreFechasCompra.jasper").toString();
        
        
    }

   public static String obtenerEntreFechasEntrega() {
        StringBuilder strPath = new StringBuilder(100);
        return strPath.append(System.getProperty("user.dir")).append(File.separatorChar).append("reports").append(File.separatorChar).append("reportVerNotasEntreFechasEntrega.jasper").toString();
        
        
    }

   public static String obtenerPresupuesto() {
        StringBuilder strPath = new StringBuilder(100);
        return strPath.append(System.getProperty("user.dir")).append(File.separatorChar).append("reports").append(File.separatorChar).append("reportPresuEnd.jasper").toString();
        
        
    }

   public static String obtenerView() {
       StringBuilder strPath = new StringBuilder(100);
        return strPath.append(System.getProperty("user.dir")).append(File.separatorChar).append("reports").append(File.separatorChar).append("reportVerPresupuestos.jasper").toString();
        

    }
    
    
    
    
    
}

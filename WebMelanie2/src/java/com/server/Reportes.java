/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.server;

import java.io.File;

/**
 *
 * @author win7
 */
class Reportes {

    
    static String obtenerNotaPedido() {
        StringBuilder strPath = new StringBuilder(100);
        return strPath.append(System.getProperty("user.dir")).append(File.separatorChar).append("reports").append(File.separatorChar).append("reportNotaPedido.jasper").toString();
    }

    static String obtenerTodosBarrios() {
        StringBuilder strPath = new StringBuilder(100);
        return strPath.append(System.getProperty("user.dir")).append(File.separatorChar).append("reports").append(File.separatorChar).append("reportAllBarrios.jasper").toString();
    }

    static String obtenerEntreFechas() {
        StringBuilder strPath = new StringBuilder(100);
        return strPath.append(System.getProperty("user.dir")).append(File.separatorChar).append("reports").append(File.separatorChar).append("reportVerNotasEntreFechasCompra.jasper").toString();
        
        
    }

    static String obtenerEntreFechasEntrega() {
        StringBuilder strPath = new StringBuilder(100);
        return strPath.append(System.getProperty("user.dir")).append(File.separatorChar).append("reports").append(File.separatorChar).append("reportVerNotasEntreFechasEntrega.jasper").toString();
        
        
    }

    static String obtenerPresupuesto() {
        StringBuilder strPath = new StringBuilder(100);
        return strPath.append(System.getProperty("user.dir")).append(File.separatorChar).append("reports").append(File.separatorChar).append("reportPresuEnd.jasper").toString();
        
        
    }

    static String obtenerView() {
       StringBuilder strPath = new StringBuilder(100);
        return strPath.append(System.getProperty("user.dir")).append(File.separatorChar).append("reports").append(File.separatorChar).append("reportVerPresupuestos.jasper").toString();
        

    }
    
    
    
    
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejb;


import javax.ejb.Schedule;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author win7
 */
@Stateless
public class EJBTimmer {

    @PersistenceContext(unitName = "WebMelanie2PU")
    private EntityManager em;       
    @Schedule(persistent = false,timezone = "America/Argentina/San_Juan",second = "50",hour = "*",minute = "*")
    private void ventasDiarias(){
        System.out.println("me estoy ejecutando");
    }

}

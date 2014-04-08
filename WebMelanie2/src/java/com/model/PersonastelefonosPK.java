/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author win7
 */
@Embeddable
public class PersonastelefonosPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "PREFIJO")
    private int prefijo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUMEROTEL")
    private int numerotel;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PERSONA")
    private int idPersona;

    public PersonastelefonosPK() {
    }

    public PersonastelefonosPK(int prefijo, int numerotel, int idPersona) {
        this.prefijo = prefijo;
        this.numerotel = numerotel;
        this.idPersona = idPersona;
    }

    public int getPrefijo() {
        return prefijo;
    }

    public void setPrefijo(int prefijo) {
        this.prefijo = prefijo;
    }

    public int getNumerotel() {
        return numerotel;
    }

    public void setNumerotel(int numerotel) {
        this.numerotel = numerotel;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) prefijo;
        hash += (int) numerotel;
        hash += (int) idPersona;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersonastelefonosPK)) {
            return false;
        }
        PersonastelefonosPK other = (PersonastelefonosPK) object;
        if (this.prefijo != other.prefijo) {
            return false;
        }
        if (this.numerotel != other.numerotel) {
            return false;
        }
        if (this.idPersona != other.idPersona) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.PersonastelefonosPK[ prefijo=" + prefijo + ", numerotel=" + numerotel + ", idPersona=" + idPersona + " ]";
    }
    
}

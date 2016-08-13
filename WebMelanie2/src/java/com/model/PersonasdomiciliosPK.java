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
public class PersonasdomiciliosPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDOMICILIO")
    private int iddomicilio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PERSONA")
    private int idPersona;

    public PersonasdomiciliosPK() {
    }

    public PersonasdomiciliosPK(int iddomicilio, int idPersona) {
        this.iddomicilio = iddomicilio;
        this.idPersona = idPersona;
    }

    public int getIddomicilio() {
        return iddomicilio;
    }

    public void setIddomicilio(int iddomicilio) {
        this.iddomicilio = iddomicilio;
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
        hash += (int) iddomicilio;
        hash += (int) idPersona;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersonasdomiciliosPK)) {
            return false;
        }
        PersonasdomiciliosPK other = (PersonasdomiciliosPK) object;
        if (this.iddomicilio != other.iddomicilio) {
            return false;
        }
        if (this.idPersona != other.idPersona) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.PersonasdomiciliosPK[ iddomicilio=" + iddomicilio + ", idPersona=" + idPersona + " ]";
    }
    
}

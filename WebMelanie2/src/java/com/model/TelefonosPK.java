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
public class TelefonosPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PREFIJO")
    private int idPrefijo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUMERO")
    private int numero;

    public TelefonosPK() {
    }

    public TelefonosPK(int idPrefijo, int numero) {
        this.idPrefijo = idPrefijo;
        this.numero = numero;
    }

    public int getIdPrefijo() {
        return idPrefijo;
    }

    public void setIdPrefijo(int idPrefijo) {
        this.idPrefijo = idPrefijo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idPrefijo;
        hash += (int) numero;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TelefonosPK)) {
            return false;
        }
        TelefonosPK other = (TelefonosPK) object;
        if (this.idPrefijo != other.idPrefijo) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.TelefonosPK[ idPrefijo=" + idPrefijo + ", numero=" + numero + " ]";
    }
    
}

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
public class DetallespresupuestoPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "FK_PRODUCTO")
    private int fkProducto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_DP_FK")
    private int idDpFk;

    public DetallespresupuestoPK() {
    }

    public DetallespresupuestoPK(int fkProducto, int idDpFk) {
        this.fkProducto = fkProducto;
        this.idDpFk = idDpFk;
    }

    public int getFkProducto() {
        return fkProducto;
    }

    public void setFkProducto(int fkProducto) {
        this.fkProducto = fkProducto;
    }

    public int getIdDpFk() {
        return idDpFk;
    }

    public void setIdDpFk(int idDpFk) {
        this.idDpFk = idDpFk;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) fkProducto;
        hash += (int) idDpFk;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallespresupuestoPK)) {
            return false;
        }
        DetallespresupuestoPK other = (DetallespresupuestoPK) object;
        if (this.fkProducto != other.fkProducto) {
            return false;
        }
        if (this.idDpFk != other.idDpFk) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.DetallespresupuestoPK[ fkProducto=" + fkProducto + ", idDpFk=" + idDpFk + " ]";
    }
    
}

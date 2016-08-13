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
public class DetallesnotadepedidoPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "FK_IDPRODUCTO")
    private int fkIdproducto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FK_IDNOTA")
    private int fkIdnota;

    public DetallesnotadepedidoPK() {
    }

    public DetallesnotadepedidoPK(int fkIdproducto, int fkIdnota) {
        this.fkIdproducto = fkIdproducto;
        this.fkIdnota = fkIdnota;
    }

    public int getFkIdproducto() {
        return fkIdproducto;
    }

    public void setFkIdproducto(int fkIdproducto) {
        this.fkIdproducto = fkIdproducto;
    }

    public int getFkIdnota() {
        return fkIdnota;
    }

    public void setFkIdnota(int fkIdnota) {
        this.fkIdnota = fkIdnota;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) fkIdproducto;
        hash += (int) fkIdnota;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesnotadepedidoPK)) {
            return false;
        }
        DetallesnotadepedidoPK other = (DetallesnotadepedidoPK) object;
        if (this.fkIdproducto != other.fkIdproducto) {
            return false;
        }
        if (this.fkIdnota != other.fkIdnota) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.DetallesnotadepedidoPK[ fkIdproducto=" + fkIdproducto + ", fkIdnota=" + fkIdnota + " ]";
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author win7
 */
@Entity
@Table(name = "HISTPERSONASDOMICILIOS", catalog = "", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Histpersonasdomicilios.findAll", query = "SELECT h FROM Histpersonasdomicilios h"),
    @NamedQuery(name = "Histpersonasdomicilios.findByIdhistperdom", query = "SELECT h FROM Histpersonasdomicilios h WHERE h.idhistperdom = :idhistperdom"),
    @NamedQuery(name = "Histpersonasdomicilios.findByIdpersona", query = "SELECT h FROM Histpersonasdomicilios h WHERE h.idpersona = :idpersona"),
    @NamedQuery(name = "Histpersonasdomicilios.findByFechadecambio", query = "SELECT h FROM Histpersonasdomicilios h WHERE h.fechadecambio = :fechadecambio"),
    @NamedQuery(name = "Histpersonasdomicilios.findByIddomicilio", query = "SELECT h FROM Histpersonasdomicilios h WHERE h.iddomicilio = :iddomicilio"),
    @NamedQuery(name = "Histpersonasdomicilios.findByIdusuario", query = "SELECT h FROM Histpersonasdomicilios h WHERE h.idusuario = :idusuario")})
public class Histpersonasdomicilios implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDHISTPERDOM")
    private Integer idhistperdom;
    @Column(name = "IDPERSONA")
    private Integer idpersona;
    @Column(name = "FECHADECAMBIO")
    @Temporal(TemporalType.DATE)
    private Date fechadecambio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDOMICILIO")
    private int iddomicilio;
    @Column(name = "IDUSUARIO")
    private Integer idusuario;

    public Histpersonasdomicilios() {
    }

    public Histpersonasdomicilios(Integer idhistperdom) {
        this.idhistperdom = idhistperdom;
    }

    public Histpersonasdomicilios(Integer idhistperdom, int iddomicilio) {
        this.idhistperdom = idhistperdom;
        this.iddomicilio = iddomicilio;
    }

    public Integer getIdhistperdom() {
        return idhistperdom;
    }

    public void setIdhistperdom(Integer idhistperdom) {
        this.idhistperdom = idhistperdom;
    }

    public Integer getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(Integer idpersona) {
        this.idpersona = idpersona;
    }

    public Date getFechadecambio() {
        return fechadecambio;
    }

    public void setFechadecambio(Date fechadecambio) {
        this.fechadecambio = fechadecambio;
    }

    public int getIddomicilio() {
        return iddomicilio;
    }

    public void setIddomicilio(int iddomicilio) {
        this.iddomicilio = iddomicilio;
    }

    public Integer getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idhistperdom != null ? idhistperdom.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Histpersonasdomicilios)) {
            return false;
        }
        Histpersonasdomicilios other = (Histpersonasdomicilios) object;
        if ((this.idhistperdom == null && other.idhistperdom != null) || (this.idhistperdom != null && !this.idhistperdom.equals(other.idhistperdom))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.Histpersonasdomicilios[ idhistperdom=" + idhistperdom + " ]";
    }
    
}

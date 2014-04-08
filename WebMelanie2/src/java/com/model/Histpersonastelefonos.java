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
@Table(name = "HISTPERSONASTELEFONOS", catalog = "", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Histpersonastelefonos.findAll", query = "SELECT h FROM Histpersonastelefonos h"),
    @NamedQuery(name = "Histpersonastelefonos.findByIdhistperdom", query = "SELECT h FROM Histpersonastelefonos h WHERE h.idhistperdom = :idhistperdom"),
    @NamedQuery(name = "Histpersonastelefonos.findByPrefijo", query = "SELECT h FROM Histpersonastelefonos h WHERE h.prefijo = :prefijo"),
    @NamedQuery(name = "Histpersonastelefonos.findByIdpersona", query = "SELECT h FROM Histpersonastelefonos h WHERE h.idpersona = :idpersona"),
    @NamedQuery(name = "Histpersonastelefonos.findByNumerotel", query = "SELECT h FROM Histpersonastelefonos h WHERE h.numerotel = :numerotel"),
    @NamedQuery(name = "Histpersonastelefonos.findByFechacambio", query = "SELECT h FROM Histpersonastelefonos h WHERE h.fechacambio = :fechacambio"),
    @NamedQuery(name = "Histpersonastelefonos.findByIdusuario", query = "SELECT h FROM Histpersonastelefonos h WHERE h.idusuario = :idusuario")})
public class Histpersonastelefonos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDHISTPERDOM")
    private Integer idhistperdom;
    @Column(name = "PREFIJO")
    private Integer prefijo;
    @Column(name = "IDPERSONA")
    private Integer idpersona;
    @Column(name = "NUMEROTEL")
    private Integer numerotel;
    @Column(name = "FECHACAMBIO")
    @Temporal(TemporalType.DATE)
    private Date fechacambio;
    @Column(name = "IDUSUARIO")
    private Integer idusuario;

    public Histpersonastelefonos() {
    }

    public Histpersonastelefonos(Integer idhistperdom) {
        this.idhistperdom = idhistperdom;
    }

    public Integer getIdhistperdom() {
        return idhistperdom;
    }

    public void setIdhistperdom(Integer idhistperdom) {
        this.idhistperdom = idhistperdom;
    }

    public Integer getPrefijo() {
        return prefijo;
    }

    public void setPrefijo(Integer prefijo) {
        this.prefijo = prefijo;
    }

    public Integer getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(Integer idpersona) {
        this.idpersona = idpersona;
    }

    public Integer getNumerotel() {
        return numerotel;
    }

    public void setNumerotel(Integer numerotel) {
        this.numerotel = numerotel;
    }

    public Date getFechacambio() {
        return fechacambio;
    }

    public void setFechacambio(Date fechacambio) {
        this.fechacambio = fechacambio;
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
        if (!(object instanceof Histpersonastelefonos)) {
            return false;
        }
        Histpersonastelefonos other = (Histpersonastelefonos) object;
        if ((this.idhistperdom == null && other.idhistperdom != null) || (this.idhistperdom != null && !this.idhistperdom.equals(other.idhistperdom))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.Histpersonastelefonos[ idhistperdom=" + idhistperdom + " ]";
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
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
@Table(name = "CLIENTES", catalog = "", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clientes.findAll", query = "SELECT c FROM Clientes c"),
    @NamedQuery(name = "Clientes.findByIdPersona", query = "SELECT c FROM Clientes c WHERE c.idPersona = :idPersona"),
    @NamedQuery(name = "Clientes.findByTotalpuntos", query = "SELECT c FROM Clientes c WHERE c.totalpuntos = :totalpuntos"),
    @NamedQuery(name = "Clientes.findByFechacarga", query = "SELECT c FROM Clientes c WHERE c.fechacarga = :fechacarga"),
    @NamedQuery(name = "Clientes.findByTotalcompras", query = "SELECT c FROM Clientes c WHERE c.totalcompras = :totalcompras")})
public class Clientes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PERSONA")
    private Integer idPersona;
    @Column(name = "TOTALPUNTOS")
    private BigInteger totalpuntos;
    @Column(name = "FECHACARGA")
    @Temporal(TemporalType.DATE)
    private Date fechacarga;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TOTALCOMPRAS")
    private BigDecimal totalcompras;
    @JoinColumn(name = "ID_PERSONA", referencedColumnName = "ID_PERSONA", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Personas personas;

    public Clientes() {
    }

    public Clientes(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public BigInteger getTotalpuntos() {
        return totalpuntos;
    }

    public void setTotalpuntos(BigInteger totalpuntos) {
        this.totalpuntos = totalpuntos;
    }

    public Date getFechacarga() {
        return fechacarga;
    }

    public void setFechacarga(Date fechacarga) {
        this.fechacarga = fechacarga;
    }

    public BigDecimal getTotalcompras() {
        return totalcompras;
    }

    public void setTotalcompras(BigDecimal totalcompras) {
        this.totalcompras = totalcompras;
    }

    public Personas getPersonas() {
        return personas;
    }

    public void setPersonas(Personas personas) {
        this.personas = personas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPersona != null ? idPersona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clientes)) {
            return false;
        }
        Clientes other = (Clientes) object;
        if ((this.idPersona == null && other.idPersona != null) || (this.idPersona != null && !this.idPersona.equals(other.idPersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.Clientes[ idPersona=" + idPersona + " ]";
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author win7
 */
@Entity
@Table(name = "FULLTIMEEMPLEADO", catalog = "", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fulltimeempleado.findAll", query = "SELECT f FROM Fulltimeempleado f"),
    @NamedQuery(name = "Fulltimeempleado.findByIdPersona", query = "SELECT f FROM Fulltimeempleado f WHERE f.idPersona = :idPersona"),
    @NamedQuery(name = "Fulltimeempleado.findBySalario", query = "SELECT f FROM Fulltimeempleado f WHERE f.salario = :salario")})
public class Fulltimeempleado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PERSONA")
    private Integer idPersona;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SALARIO")
    private BigDecimal salario;
    @JoinColumn(name = "ID_PERSONA", referencedColumnName = "ID_PERSONA", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Personas personas;

    public Fulltimeempleado() {
    }

    public Fulltimeempleado(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
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
        if (!(object instanceof Fulltimeempleado)) {
            return false;
        }
        Fulltimeempleado other = (Fulltimeempleado) object;
        if ((this.idPersona == null && other.idPersona != null) || (this.idPersona != null && !this.idPersona.equals(other.idPersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.Fulltimeempleado[ idPersona=" + idPersona + " ]";
    }
    
}

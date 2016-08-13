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
@Table(name = "EMPLEADOPARTTIME", catalog = "", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empleadoparttime.findAll", query = "SELECT e FROM Empleadoparttime e"),
    @NamedQuery(name = "Empleadoparttime.findByIdPersona", query = "SELECT e FROM Empleadoparttime e WHERE e.idPersona = :idPersona"),
    @NamedQuery(name = "Empleadoparttime.findBySalarioPorHora", query = "SELECT e FROM Empleadoparttime e WHERE e.salarioPorHora = :salarioPorHora")})
public class Empleadoparttime implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PERSONA")
    private Integer idPersona;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SALARIO_POR_HORA")
    private BigDecimal salarioPorHora;
    @JoinColumn(name = "ID_PERSONA", referencedColumnName = "ID_PERSONA", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Personas personas;

    public Empleadoparttime() {
    }

    public Empleadoparttime(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public BigDecimal getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(BigDecimal salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
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
        if (!(object instanceof Empleadoparttime)) {
            return false;
        }
        Empleadoparttime other = (Empleadoparttime) object;
        if ((this.idPersona == null && other.idPersona != null) || (this.idPersona != null && !this.idPersona.equals(other.idPersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.Empleadoparttime[ idPersona=" + idPersona + " ]";
    }
    
}

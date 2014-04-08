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
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author win7
 */
@Entity
@Table(name = "EMPLEADOS", catalog = "", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empleados.findAll", query = "SELECT e FROM Empleados e"),
    @NamedQuery(name = "Empleados.findByIdPersona", query = "SELECT e FROM Empleados e WHERE e.idPersona = :idPersona"),
    @NamedQuery(name = "Empleados.findByPassword", query = "SELECT e FROM Empleados e WHERE e.password = :password"),
    @NamedQuery(name = "Empleados.findByFechacarga", query = "SELECT e FROM Empleados e WHERE e.fechacarga = :fechacarga"),
    @NamedQuery(name = "Empleados.findByEmptype", query = "SELECT e FROM Empleados e WHERE e.emptype = :emptype"),
    @NamedQuery(name = "Empleados.findByNameUser", query = "SELECT e FROM Empleados e WHERE e.nameUser = :nameUser"),
    @NamedQuery(name = "Empleados.findByEstado", query = "SELECT e FROM Empleados e WHERE e.estado = :estado")})
public class Empleados implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PERSONA")
    private Integer idPersona;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "FECHACARGA")
    @Temporal(TemporalType.DATE)
    private Date fechacarga;
    @Size(max = 10)
    @Column(name = "EMPTYPE")
    private String emptype;
    @Size(max = 10)
    @Column(name = "NAME_USER")
    private String nameUser;
    @Column(name = "ESTADO")
    private Short estado;
    @JoinColumn(name = "ID_PERSONA", referencedColumnName = "ID_PERSONA", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Personas personas;

    public Empleados() {
    }

    public Empleados(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public Empleados(Integer idPersona, String password) {
        this.idPersona = idPersona;
        this.password = password;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getFechacarga() {
        return fechacarga;
    }

    public void setFechacarga(Date fechacarga) {
        this.fechacarga = fechacarga;
    }

    public String getEmptype() {
        return emptype;
    }

    public void setEmptype(String emptype) {
        this.emptype = emptype;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public Short getEstado() {
        return estado;
    }

    public void setEstado(Short estado) {
        this.estado = estado;
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
        if (!(object instanceof Empleados)) {
            return false;
        }
        Empleados other = (Empleados) object;
        if ((this.idPersona == null && other.idPersona != null) || (this.idPersona != null && !this.idPersona.equals(other.idPersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.Empleados[ idPersona=" + idPersona + " ]";
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author win7
 */
@Entity
@Table(name = "EMPRESATELEFONIA", catalog = "", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empresatelefonia.findAll", query = "SELECT e FROM Empresatelefonia e"),
    @NamedQuery(name = "Empresatelefonia.findByIdEmpTelefonia", query = "SELECT e FROM Empresatelefonia e WHERE e.idEmpTelefonia = :idEmpTelefonia"),
    @NamedQuery(name = "Empresatelefonia.findByNombre", query = "SELECT e FROM Empresatelefonia e WHERE e.nombre = :nombre")})
public class Empresatelefonia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_EMP_TELEFONIA")
    private Short idEmpTelefonia;
    @Size(max = 30)
    @Column(name = "NOMBRE")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpresatelefonia")
    private List<Telefonos> telefonosList;

    public Empresatelefonia() {
    }

    public Empresatelefonia(Short idEmpTelefonia) {
        this.idEmpTelefonia = idEmpTelefonia;
    }

    public Short getIdEmpTelefonia() {
        return idEmpTelefonia;
    }

    public void setIdEmpTelefonia(Short idEmpTelefonia) {
        this.idEmpTelefonia = idEmpTelefonia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public List<Telefonos> getTelefonosList() {
        return telefonosList;
    }

    public void setTelefonosList(List<Telefonos> telefonosList) {
        this.telefonosList = telefonosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpTelefonia != null ? idEmpTelefonia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empresatelefonia)) {
            return false;
        }
        Empresatelefonia other = (Empresatelefonia) object;
        if ((this.idEmpTelefonia == null && other.idEmpTelefonia != null) || (this.idEmpTelefonia != null && !this.idEmpTelefonia.equals(other.idEmpTelefonia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.Empresatelefonia[ idEmpTelefonia=" + idEmpTelefonia + " ]";
    }
    
}

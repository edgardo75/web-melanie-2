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
@Table(name = "CALLES", catalog = "", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Calles.findAll", query = "SELECT c FROM Calles c"),
    @NamedQuery(name = "Calles.findByIdCalle", query = "SELECT c FROM Calles c WHERE c.idCalle = :idCalle"),
    @NamedQuery(name = "Calles.findByDescripcion", query = "SELECT c FROM Calles c WHERE c.descripcion = :descripcion")})
public class Calles implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_CALLE")
    private Integer idCalle;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCalle")
    private List<Domicilios> domiciliosList;

    public Calles() {
    }

    public Calles(Integer idCalle) {
        this.idCalle = idCalle;
    }

    public Calles(Integer idCalle, String descripcion) {
        this.idCalle = idCalle;
        this.descripcion = descripcion;
    }

    public Integer getIdCalle() {
        return idCalle;
    }

    public void setIdCalle(Integer idCalle) {
        this.idCalle = idCalle;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<Domicilios> getDomiciliosList() {
        return domiciliosList;
    }

    public void setDomiciliosList(List<Domicilios> domiciliosList) {
        this.domiciliosList = domiciliosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCalle != null ? idCalle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Calles)) {
            return false;
        }
        Calles other = (Calles) object;
        if ((this.idCalle == null && other.idCalle != null) || (this.idCalle != null && !this.idCalle.equals(other.idCalle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.Calles[ idCalle=" + idCalle + " ]";
    }
    
}

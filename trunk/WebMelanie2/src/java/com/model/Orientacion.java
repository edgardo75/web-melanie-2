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
@Table(name = "ORIENTACION", catalog = "", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Orientacion.findAll", query = "SELECT o FROM Orientacion o"),
    @NamedQuery(name = "Orientacion.findByIdOrientacion", query = "SELECT o FROM Orientacion o WHERE o.idOrientacion = :idOrientacion"),
    @NamedQuery(name = "Orientacion.findByDescripcion", query = "SELECT o FROM Orientacion o WHERE o.descripcion = :descripcion")})
public class Orientacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_ORIENTACION")
    private Integer idOrientacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idOrientacion")
    private List<Domicilios> domiciliosList;

    public Orientacion() {
    }

    public Orientacion(Integer idOrientacion) {
        this.idOrientacion = idOrientacion;
    }

    public Orientacion(Integer idOrientacion, String descripcion) {
        this.idOrientacion = idOrientacion;
        this.descripcion = descripcion;
    }

    public Integer getIdOrientacion() {
        return idOrientacion;
    }

    public void setIdOrientacion(Integer idOrientacion) {
        this.idOrientacion = idOrientacion;
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
        hash += (idOrientacion != null ? idOrientacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orientacion)) {
            return false;
        }
        Orientacion other = (Orientacion) object;
        if ((this.idOrientacion == null && other.idOrientacion != null) || (this.idOrientacion != null && !this.idOrientacion.equals(other.idOrientacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.Orientacion[ idOrientacion=" + idOrientacion + " ]";
    }
    
}

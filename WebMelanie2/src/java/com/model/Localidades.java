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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "LOCALIDADES", catalog = "", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Localidades.findAll", query = "SELECT l FROM Localidades l"),
    @NamedQuery(name = "Localidades.findByIdLocalidad", query = "SELECT l FROM Localidades l WHERE l.idLocalidad = :idLocalidad"),
    @NamedQuery(name = "Localidades.findByDescripcion", query = "SELECT l FROM Localidades l WHERE l.descripcion = :descripcion"),
    @NamedQuery(name = "Localidades.findByCodigopostal", query = "SELECT l FROM Localidades l WHERE l.codigopostal = :codigopostal")})
public class Localidades implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_LOCALIDAD")
    private Integer idLocalidad;
    @Size(max = 100)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "CODIGOPOSTAL")
    private Integer codigopostal;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idLocalidad")
    private List<Domicilios> domiciliosList;
    @JoinColumn(name = "ID_PROVINCIA", referencedColumnName = "ID_PROVINCIA")
    @ManyToOne
    private Provincias idProvincia;

    public Localidades() {
    }

    public Localidades(Integer idLocalidad) {
        this.idLocalidad = idLocalidad;
    }

    public Integer getIdLocalidad() {
        return idLocalidad;
    }

    public void setIdLocalidad(Integer idLocalidad) {
        this.idLocalidad = idLocalidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCodigopostal() {
        return codigopostal;
    }

    public void setCodigopostal(Integer codigopostal) {
        this.codigopostal = codigopostal;
    }

    @XmlTransient
    public List<Domicilios> getDomiciliosList() {
        return domiciliosList;
    }

    public void setDomiciliosList(List<Domicilios> domiciliosList) {
        this.domiciliosList = domiciliosList;
    }

    public Provincias getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(Provincias idProvincia) {
        this.idProvincia = idProvincia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLocalidad != null ? idLocalidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Localidades)) {
            return false;
        }
        Localidades other = (Localidades) object;
        if ((this.idLocalidad == null && other.idLocalidad != null) || (this.idLocalidad != null && !this.idLocalidad.equals(other.idLocalidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.Localidades[ idLocalidad=" + idLocalidad + " ]";
    }
    
}

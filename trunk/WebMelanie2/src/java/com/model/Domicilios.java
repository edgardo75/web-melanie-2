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
@Table(name = "DOMICILIOS", catalog = "", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Domicilios.findAll", query = "SELECT d FROM Domicilios d"),
    @NamedQuery(name = "Domicilios.findByIdDomicilio", query = "SELECT d FROM Domicilios d WHERE d.idDomicilio = :idDomicilio"),
    @NamedQuery(name = "Domicilios.findByEntrecalleycalle", query = "SELECT d FROM Domicilios d WHERE d.entrecalleycalle = :entrecalleycalle"),
    @NamedQuery(name = "Domicilios.findByManzana", query = "SELECT d FROM Domicilios d WHERE d.manzana = :manzana"),
    @NamedQuery(name = "Domicilios.findByNumero", query = "SELECT d FROM Domicilios d WHERE d.numero = :numero"),
    @NamedQuery(name = "Domicilios.findByObservaciones", query = "SELECT d FROM Domicilios d WHERE d.observaciones = :observaciones"),
    @NamedQuery(name = "Domicilios.findByArea", query = "SELECT d FROM Domicilios d WHERE d.area = :area"),
    @NamedQuery(name = "Domicilios.findByTorre", query = "SELECT d FROM Domicilios d WHERE d.torre = :torre"),
    @NamedQuery(name = "Domicilios.findByPiso", query = "SELECT d FROM Domicilios d WHERE d.piso = :piso"),
    @NamedQuery(name = "Domicilios.findBySector", query = "SELECT d FROM Domicilios d WHERE d.sector = :sector"),
    @NamedQuery(name = "Domicilios.findByMonoblock", query = "SELECT d FROM Domicilios d WHERE d.monoblock = :monoblock"),
    @NamedQuery(name = "Domicilios.findByNumdepto", query = "SELECT d FROM Domicilios d WHERE d.numdepto = :numdepto")})
public class Domicilios implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_DOMICILIO")
    private Integer idDomicilio;
    @Size(max = 255)
    @Column(name = "ENTRECALLEYCALLE")
    private String entrecalleycalle;
    @Size(max = 10)
    @Column(name = "MANZANA")
    private String manzana;
    @Column(name = "NUMERO")
    private Integer numero;
    @Size(max = 5000)
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Size(max = 10)
    @Column(name = "AREA")
    private String area;
    @Size(max = 10)
    @Column(name = "TORRE")
    private String torre;
    @Size(max = 10)
    @Column(name = "PISO")
    private String piso;
    @Size(max = 10)
    @Column(name = "SECTOR")
    private String sector;
    @Size(max = 10)
    @Column(name = "MONOBLOCK")
    private String monoblock;
    @Column(name = "NUMDEPTO")
    private Integer numdepto;
    @JoinColumn(name = "ID_ORIENTACION", referencedColumnName = "ID_ORIENTACION")
    @ManyToOne(optional = false)
    private Orientacion idOrientacion;
    @JoinColumn(name = "ID_LOCALIDAD", referencedColumnName = "ID_LOCALIDAD")
    @ManyToOne(optional = false)
    private Localidades idLocalidad;
    @JoinColumn(name = "ID_CALLE", referencedColumnName = "ID_CALLE")
    @ManyToOne(optional = false)
    private Calles idCalle;
    @JoinColumn(name = "ID_BARRIO", referencedColumnName = "ID_BARRIO")
    @ManyToOne(optional = false)
    private Barrios idBarrio;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "domicilios")
    private List<Personasdomicilios> personasdomiciliosList;

    public Domicilios() {
    }

    public Domicilios(Integer idDomicilio) {
        this.idDomicilio = idDomicilio;
    }

    public Integer getIdDomicilio() {
        return idDomicilio;
    }

    public void setIdDomicilio(Integer idDomicilio) {
        this.idDomicilio = idDomicilio;
    }

    public String getEntrecalleycalle() {
        return entrecalleycalle;
    }

    public void setEntrecalleycalle(String entrecalleycalle) {
        this.entrecalleycalle = entrecalleycalle;
    }

    public String getManzana() {
        return manzana;
    }

    public void setManzana(String manzana) {
        this.manzana = manzana;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getTorre() {
        return torre;
    }

    public void setTorre(String torre) {
        this.torre = torre;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getMonoblock() {
        return monoblock;
    }

    public void setMonoblock(String monoblock) {
        this.monoblock = monoblock;
    }

    public Integer getNumdepto() {
        return numdepto;
    }

    public void setNumdepto(Integer numdepto) {
        this.numdepto = numdepto;
    }

    public Orientacion getIdOrientacion() {
        return idOrientacion;
    }

    public void setIdOrientacion(Orientacion idOrientacion) {
        this.idOrientacion = idOrientacion;
    }

    public Localidades getIdLocalidad() {
        return idLocalidad;
    }

    public void setIdLocalidad(Localidades idLocalidad) {
        this.idLocalidad = idLocalidad;
    }

    public Calles getIdCalle() {
        return idCalle;
    }

    public void setIdCalle(Calles idCalle) {
        this.idCalle = idCalle;
    }

    public Barrios getIdBarrio() {
        return idBarrio;
    }

    public void setIdBarrio(Barrios idBarrio) {
        this.idBarrio = idBarrio;
    }

    @XmlTransient
    public List<Personasdomicilios> getPersonasdomiciliosList() {
        return personasdomiciliosList;
    }

    public void setPersonasdomiciliosList(List<Personasdomicilios> personasdomiciliosList) {
        this.personasdomiciliosList = personasdomiciliosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDomicilio != null ? idDomicilio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Domicilios)) {
            return false;
        }
        Domicilios other = (Domicilios) object;
        if ((this.idDomicilio == null && other.idDomicilio != null) || (this.idDomicilio != null && !this.idDomicilio.equals(other.idDomicilio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.Domicilios[ idDomicilio=" + idDomicilio + " ]";
    }
    
}

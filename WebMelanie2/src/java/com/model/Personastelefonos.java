/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author win7
 */
@Entity
@Table(name = "PERSONASTELEFONOS", catalog = "", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personastelefonos.findAll", query = "SELECT p FROM Personastelefonos p"),
    @NamedQuery(name = "Personastelefonos.findByDetalles", query = "SELECT p FROM Personastelefonos p WHERE p.detalles = :detalles"),
    @NamedQuery(name = "Personastelefonos.findByEstado", query = "SELECT p FROM Personastelefonos p WHERE p.estado = :estado"),
    @NamedQuery(name = "Personastelefonos.findByPrefijo", query = "SELECT p FROM Personastelefonos p WHERE p.personastelefonosPK.prefijo = :prefijo"),
    @NamedQuery(name = "Personastelefonos.findByNumerotel", query = "SELECT p FROM Personastelefonos p WHERE p.personastelefonosPK.numerotel = :numerotel"),
    @NamedQuery(name = "Personastelefonos.findByIdPersona", query = "SELECT p FROM Personastelefonos p WHERE p.personastelefonosPK.idPersona = :idPersona")})
public class Personastelefonos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PersonastelefonosPK personastelefonosPK;
    @Size(max = 60)
    @Column(name = "DETALLES")
    private String detalles;
    @Size(max = 50)
    @Column(name = "ESTADO")
    private String estado;
    @JoinColumns({
        @JoinColumn(name = "PREFIJO", referencedColumnName = "ID_PREFIJO", insertable = false, updatable = false),
        @JoinColumn(name = "NUMEROTEL", referencedColumnName = "NUMERO", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Telefonos telefonos;
    @JoinColumn(name = "ID_PERSONA", referencedColumnName = "ID_PERSONA", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Personas personas;

    public Personastelefonos() {
    }

    public Personastelefonos(PersonastelefonosPK personastelefonosPK) {
        this.personastelefonosPK = personastelefonosPK;
    }

    public Personastelefonos(int prefijo, int numerotel, int idPersona) {
        this.personastelefonosPK = new PersonastelefonosPK(prefijo, numerotel, idPersona);
    }

    public PersonastelefonosPK getPersonastelefonosPK() {
        return personastelefonosPK;
    }

    public void setPersonastelefonosPK(PersonastelefonosPK personastelefonosPK) {
        this.personastelefonosPK = personastelefonosPK;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Telefonos getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(Telefonos telefonos) {
        this.telefonos = telefonos;
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
        hash += (personastelefonosPK != null ? personastelefonosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personastelefonos)) {
            return false;
        }
        Personastelefonos other = (Personastelefonos) object;
        if ((this.personastelefonosPK == null && other.personastelefonosPK != null) || (this.personastelefonosPK != null && !this.personastelefonosPK.equals(other.personastelefonosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.Personastelefonos[ personastelefonosPK=" + personastelefonosPK + " ]";
    }
    
}

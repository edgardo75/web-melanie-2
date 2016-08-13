/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author win7
 */
@Entity
@Table(name = "PERSONASDOMICILIOS", catalog = "", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personasdomicilios.findAll", query = "SELECT p FROM Personasdomicilios p"),
    @NamedQuery(name = "Personasdomicilios.findByFechaingresovivienda", query = "SELECT p FROM Personasdomicilios p WHERE p.fechaingresovivienda = :fechaingresovivienda"),
    @NamedQuery(name = "Personasdomicilios.findByEstado", query = "SELECT p FROM Personasdomicilios p WHERE p.estado = :estado"),
    @NamedQuery(name = "Personasdomicilios.findByIddomicilio", query = "SELECT p FROM Personasdomicilios p WHERE p.personasdomiciliosPK.iddomicilio = :iddomicilio"),
    @NamedQuery(name = "Personasdomicilios.findByIdPersona", query = "SELECT p FROM Personasdomicilios p WHERE p.personasdomiciliosPK.idPersona = :idPersona")})
public class Personasdomicilios implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PersonasdomiciliosPK personasdomiciliosPK;
    @Column(name = "FECHAINGRESOVIVIENDA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaingresovivienda;
    @Size(max = 20)
    @Column(name = "ESTADO")
    private String estado;
    @JoinColumn(name = "ID_PERSONA", referencedColumnName = "ID_PERSONA", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Personas personas;
    @JoinColumn(name = "IDDOMICILIO", referencedColumnName = "ID_DOMICILIO", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Domicilios domicilios;

    public Personasdomicilios() {
    }

    public Personasdomicilios(PersonasdomiciliosPK personasdomiciliosPK) {
        this.personasdomiciliosPK = personasdomiciliosPK;
    }

    public Personasdomicilios(int iddomicilio, int idPersona) {
        this.personasdomiciliosPK = new PersonasdomiciliosPK(iddomicilio, idPersona);
    }

    public PersonasdomiciliosPK getPersonasdomiciliosPK() {
        return personasdomiciliosPK;
    }

    public void setPersonasdomiciliosPK(PersonasdomiciliosPK personasdomiciliosPK) {
        this.personasdomiciliosPK = personasdomiciliosPK;
    }

    public Date getFechaingresovivienda() {
        return fechaingresovivienda;
    }

    public void setFechaingresovivienda(Date fechaingresovivienda) {
        this.fechaingresovivienda = fechaingresovivienda;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Personas getPersonas() {
        return personas;
    }

    public void setPersonas(Personas personas) {
        this.personas = personas;
    }

    public Domicilios getDomicilios() {
        return domicilios;
    }

    public void setDomicilios(Domicilios domicilios) {
        this.domicilios = domicilios;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (personasdomiciliosPK != null ? personasdomiciliosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personasdomicilios)) {
            return false;
        }
        Personasdomicilios other = (Personasdomicilios) object;
        if ((this.personasdomiciliosPK == null && other.personasdomiciliosPK != null) || (this.personasdomiciliosPK != null && !this.personasdomiciliosPK.equals(other.personasdomiciliosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.Personasdomicilios[ personasdomiciliosPK=" + personasdomiciliosPK + " ]";
    }
    
}

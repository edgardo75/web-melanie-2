/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author win7
 */
@Entity
@Table(name = "TELEFONOS", catalog = "", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Telefonos.findAll", query = "SELECT t FROM Telefonos t"),
    @NamedQuery(name = "Telefonos.findByIdPrefijo", query = "SELECT t FROM Telefonos t WHERE t.telefonosPK.idPrefijo = :idPrefijo"),
    @NamedQuery(name = "Telefonos.findByNumero", query = "SELECT t FROM Telefonos t WHERE t.telefonosPK.numero = :numero")})
public class Telefonos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TelefonosPK telefonosPK;
    @JoinColumn(name = "ID_TIPOTELEFONO", referencedColumnName = "ID_TIPOTEL")
    @ManyToOne
    private Tipostelefono idTipotelefono;
    @JoinColumn(name = "ID_EMPRESATELEFONIA", referencedColumnName = "ID_EMP_TELEFONIA")
    @ManyToOne(optional = false)
    private Empresatelefonia idEmpresatelefonia;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "telefonos")
    private List<Personastelefonos> personastelefonosList;

    public Telefonos() {
    }

    public Telefonos(TelefonosPK telefonosPK) {
        this.telefonosPK = telefonosPK;
    }

    public Telefonos(int idPrefijo, int numero) {
        this.telefonosPK = new TelefonosPK(idPrefijo, numero);
    }

    public TelefonosPK getTelefonosPK() {
        return telefonosPK;
    }

    public void setTelefonosPK(TelefonosPK telefonosPK) {
        this.telefonosPK = telefonosPK;
    }

    public Tipostelefono getIdTipotelefono() {
        return idTipotelefono;
    }

    public void setIdTipotelefono(Tipostelefono idTipotelefono) {
        this.idTipotelefono = idTipotelefono;
    }

    public Empresatelefonia getIdEmpresatelefonia() {
        return idEmpresatelefonia;
    }

    public void setIdEmpresatelefonia(Empresatelefonia idEmpresatelefonia) {
        this.idEmpresatelefonia = idEmpresatelefonia;
    }

    @XmlTransient
    public List<Personastelefonos> getPersonastelefonosList() {
        return personastelefonosList;
    }

    public void setPersonastelefonosList(List<Personastelefonos> personastelefonosList) {
        this.personastelefonosList = personastelefonosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (telefonosPK != null ? telefonosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Telefonos)) {
            return false;
        }
        Telefonos other = (Telefonos) object;
        if ((this.telefonosPK == null && other.telefonosPK != null) || (this.telefonosPK != null && !this.telefonosPK.equals(other.telefonosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.Telefonos[ telefonosPK=" + telefonosPK + " ]";
    }
    
}

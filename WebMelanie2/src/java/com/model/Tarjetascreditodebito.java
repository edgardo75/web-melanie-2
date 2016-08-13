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
import javax.persistence.OneToOne;
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
@Table(name = "TARJETASCREDITODEBITO", catalog = "", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tarjetascreditodebito.findAll", query = "SELECT t FROM Tarjetascreditodebito t"),
    @NamedQuery(name = "Tarjetascreditodebito.findByIdtarjeta", query = "SELECT t FROM Tarjetascreditodebito t WHERE t.idtarjeta = :idtarjeta"),
    @NamedQuery(name = "Tarjetascreditodebito.findByDescripcion", query = "SELECT t FROM Tarjetascreditodebito t WHERE t.descripcion = :descripcion")})
public class Tarjetascreditodebito implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDTARJETA")
    private Integer idtarjeta;
    @Size(max = 50)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(mappedBy = "idtarjetafkIdtarjeta")
    private List<Notadepedido> notadepedidoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTarjetaFk")
    private List<Entradasysalidascaja> entradasysalidascajaList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "tarjetascreditodebito")
    private Entradasysalidascaja entradasysalidascaja;

    public Tarjetascreditodebito() {
    }

    public Tarjetascreditodebito(Integer idtarjeta) {
        this.idtarjeta = idtarjeta;
    }

    public Integer getIdtarjeta() {
        return idtarjeta;
    }

    public void setIdtarjeta(Integer idtarjeta) {
        this.idtarjeta = idtarjeta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<Notadepedido> getNotadepedidoList() {
        return notadepedidoList;
    }

    public void setNotadepedidoList(List<Notadepedido> notadepedidoList) {
        this.notadepedidoList = notadepedidoList;
    }

    @XmlTransient
    public List<Entradasysalidascaja> getEntradasysalidascajaList() {
        return entradasysalidascajaList;
    }

    public void setEntradasysalidascajaList(List<Entradasysalidascaja> entradasysalidascajaList) {
        this.entradasysalidascajaList = entradasysalidascajaList;
    }

    public Entradasysalidascaja getEntradasysalidascaja() {
        return entradasysalidascaja;
    }

    public void setEntradasysalidascaja(Entradasysalidascaja entradasysalidascaja) {
        this.entradasysalidascaja = entradasysalidascaja;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtarjeta != null ? idtarjeta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tarjetascreditodebito)) {
            return false;
        }
        Tarjetascreditodebito other = (Tarjetascreditodebito) object;
        if ((this.idtarjeta == null && other.idtarjeta != null) || (this.idtarjeta != null && !this.idtarjeta.equals(other.idtarjeta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.Tarjetascreditodebito[ idtarjeta=" + idtarjeta + " ]";
    }
    
}

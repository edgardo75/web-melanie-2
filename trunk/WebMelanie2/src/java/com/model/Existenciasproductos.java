/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author win7
 */
@Entity
@Table(name = "EXISTENCIASPRODUCTOS", catalog = "", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Existenciasproductos.findAll", query = "SELECT e FROM Existenciasproductos e"),
    @NamedQuery(name = "Existenciasproductos.findByIdExistencias", query = "SELECT e FROM Existenciasproductos e WHERE e.idExistencias = :idExistencias"),
    @NamedQuery(name = "Existenciasproductos.findByCantidadinicial", query = "SELECT e FROM Existenciasproductos e WHERE e.cantidadinicial = :cantidadinicial"),
    @NamedQuery(name = "Existenciasproductos.findByFechaagregado", query = "SELECT e FROM Existenciasproductos e WHERE e.fechaagregado = :fechaagregado"),
    @NamedQuery(name = "Existenciasproductos.findByCantidadactual", query = "SELECT e FROM Existenciasproductos e WHERE e.cantidadactual = :cantidadactual"),
    @NamedQuery(name = "Existenciasproductos.findByPreciounitario", query = "SELECT e FROM Existenciasproductos e WHERE e.preciounitario = :preciounitario"),
    @NamedQuery(name = "Existenciasproductos.findByIdUsuario", query = "SELECT e FROM Existenciasproductos e WHERE e.idUsuario = :idUsuario")})
public class Existenciasproductos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_EXISTENCIAS")
    private Integer idExistencias;
    @Column(name = "CANTIDADINICIAL")
    private Integer cantidadinicial;
    @Column(name = "FECHAAGREGADO")
    @Temporal(TemporalType.DATE)
    private Date fechaagregado;
    @Column(name = "CANTIDADACTUAL")
    private Integer cantidadactual;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRECIOUNITARIO")
    private BigDecimal preciounitario;
    @Column(name = "ID_USUARIO")
    private Integer idUsuario;
    @JoinColumn(name = "PRODUCTOS_SID", referencedColumnName = "SID")
    @ManyToOne
    private Productos productosSid;

    public Existenciasproductos() {
    }

    public Existenciasproductos(Integer idExistencias) {
        this.idExistencias = idExistencias;
    }

    public Integer getIdExistencias() {
        return idExistencias;
    }

    public void setIdExistencias(Integer idExistencias) {
        this.idExistencias = idExistencias;
    }

    public Integer getCantidadinicial() {
        return cantidadinicial;
    }

    public void setCantidadinicial(Integer cantidadinicial) {
        this.cantidadinicial = cantidadinicial;
    }

    public Date getFechaagregado() {
        return fechaagregado;
    }

    public void setFechaagregado(Date fechaagregado) {
        this.fechaagregado = fechaagregado;
    }

    public Integer getCantidadactual() {
        return cantidadactual;
    }

    public void setCantidadactual(Integer cantidadactual) {
        this.cantidadactual = cantidadactual;
    }

    public BigDecimal getPreciounitario() {
        return preciounitario;
    }

    public void setPreciounitario(BigDecimal preciounitario) {
        this.preciounitario = preciounitario;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Productos getProductosSid() {
        return productosSid;
    }

    public void setProductosSid(Productos productosSid) {
        this.productosSid = productosSid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idExistencias != null ? idExistencias.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Existenciasproductos)) {
            return false;
        }
        Existenciasproductos other = (Existenciasproductos) object;
        if ((this.idExistencias == null && other.idExistencias != null) || (this.idExistencias != null && !this.idExistencias.equals(other.idExistencias))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.Existenciasproductos[ idExistencias=" + idExistencias + " ]";
    }
    
}

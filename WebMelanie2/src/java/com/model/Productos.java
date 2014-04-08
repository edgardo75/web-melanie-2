/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author win7
 */
@Entity
@Table(name = "PRODUCTOS", catalog = "", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productos.findAll", query = "SELECT p FROM Productos p"),
    @NamedQuery(name = "Productos.findBySid", query = "SELECT p FROM Productos p WHERE p.sid = :sid"),
    @NamedQuery(name = "Productos.findByCantidaddisponible", query = "SELECT p FROM Productos p WHERE p.cantidaddisponible = :cantidaddisponible"),
    @NamedQuery(name = "Productos.findByFecha", query = "SELECT p FROM Productos p WHERE p.fecha = :fecha"),
    @NamedQuery(name = "Productos.findByCodproducto", query = "SELECT p FROM Productos p WHERE p.codproducto = :codproducto"),
    @NamedQuery(name = "Productos.findByCantidadinicial", query = "SELECT p FROM Productos p WHERE p.cantidadinicial = :cantidadinicial"),
    @NamedQuery(name = "Productos.findByDescripcion", query = "SELECT p FROM Productos p WHERE p.descripcion = :descripcion"),
    @NamedQuery(name = "Productos.findByPreciounitario", query = "SELECT p FROM Productos p WHERE p.preciounitario = :preciounitario")})
public class Productos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "SID")
    private Integer sid;
    @Column(name = "CANTIDADDISPONIBLE")
    private BigInteger cantidaddisponible;
    @Column(name = "FECHA")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Size(max = 100)
    @Column(name = "CODPRODUCTO")
    private String codproducto;
    @Lob
    @Column(name = "IMG")
    private byte[] img;
    @Column(name = "CANTIDADINICIAL")
    private BigInteger cantidadinicial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRECIOUNITARIO")
    private BigDecimal preciounitario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productos")
    private List<Detallesnotadepedido> detallesnotadepedidoList;
    @OneToMany(mappedBy = "productosSid")
    private List<Existenciasproductos> existenciasproductosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productos")
    private List<Detallespresupuesto> detallespresupuestoList;

    public Productos() {
    }

    public Productos(Integer sid) {
        this.sid = sid;
    }

    public Productos(Integer sid, String descripcion) {
        this.sid = sid;
        this.descripcion = descripcion;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public BigInteger getCantidaddisponible() {
        return cantidaddisponible;
    }

    public void setCantidaddisponible(BigInteger cantidaddisponible) {
        this.cantidaddisponible = cantidaddisponible;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCodproducto() {
        return codproducto;
    }

    public void setCodproducto(String codproducto) {
        this.codproducto = codproducto;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }

    public BigInteger getCantidadinicial() {
        return cantidadinicial;
    }

    public void setCantidadinicial(BigInteger cantidadinicial) {
        this.cantidadinicial = cantidadinicial;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getPreciounitario() {
        return preciounitario;
    }

    public void setPreciounitario(BigDecimal preciounitario) {
        this.preciounitario = preciounitario;
    }

    @XmlTransient
    public List<Detallesnotadepedido> getDetallesnotadepedidoList() {
        return detallesnotadepedidoList;
    }

    public void setDetallesnotadepedidoList(List<Detallesnotadepedido> detallesnotadepedidoList) {
        this.detallesnotadepedidoList = detallesnotadepedidoList;
    }

    @XmlTransient
    public List<Existenciasproductos> getExistenciasproductosList() {
        return existenciasproductosList;
    }

    public void setExistenciasproductosList(List<Existenciasproductos> existenciasproductosList) {
        this.existenciasproductosList = existenciasproductosList;
    }

    @XmlTransient
    public List<Detallespresupuesto> getDetallespresupuestoList() {
        return detallespresupuestoList;
    }

    public void setDetallespresupuestoList(List<Detallespresupuesto> detallespresupuestoList) {
        this.detallespresupuestoList = detallespresupuestoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sid != null ? sid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productos)) {
            return false;
        }
        Productos other = (Productos) object;
        if ((this.sid == null && other.sid != null) || (this.sid != null && !this.sid.equals(other.sid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.Productos[ sid=" + sid + " ]";
    }
    
}

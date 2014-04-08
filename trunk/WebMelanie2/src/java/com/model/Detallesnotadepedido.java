/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author win7
 */
@Entity
@Table(name = "DETALLESNOTADEPEDIDO", catalog = "", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detallesnotadepedido.findAll", query = "SELECT d FROM Detallesnotadepedido d"),
    @NamedQuery(name = "Detallesnotadepedido.findByPendiente", query = "SELECT d FROM Detallesnotadepedido d WHERE d.pendiente = :pendiente"),
    @NamedQuery(name = "Detallesnotadepedido.findByCancelado", query = "SELECT d FROM Detallesnotadepedido d WHERE d.cancelado = :cancelado"),
    @NamedQuery(name = "Detallesnotadepedido.findByPrecioDesc", query = "SELECT d FROM Detallesnotadepedido d WHERE d.precioDesc = :precioDesc"),
    @NamedQuery(name = "Detallesnotadepedido.findByCantidad", query = "SELECT d FROM Detallesnotadepedido d WHERE d.cantidad = :cantidad"),
    @NamedQuery(name = "Detallesnotadepedido.findBySubtotal", query = "SELECT d FROM Detallesnotadepedido d WHERE d.subtotal = :subtotal"),
    @NamedQuery(name = "Detallesnotadepedido.findByDescuento", query = "SELECT d FROM Detallesnotadepedido d WHERE d.descuento = :descuento"),
    @NamedQuery(name = "Detallesnotadepedido.findByPrecio", query = "SELECT d FROM Detallesnotadepedido d WHERE d.precio = :precio"),
    @NamedQuery(name = "Detallesnotadepedido.findByIva", query = "SELECT d FROM Detallesnotadepedido d WHERE d.iva = :iva"),
    @NamedQuery(name = "Detallesnotadepedido.findByEntregado", query = "SELECT d FROM Detallesnotadepedido d WHERE d.entregado = :entregado"),
    @NamedQuery(name = "Detallesnotadepedido.findByAnulado", query = "SELECT d FROM Detallesnotadepedido d WHERE d.anulado = :anulado"),
    @NamedQuery(name = "Detallesnotadepedido.findByFkIdproducto", query = "SELECT d FROM Detallesnotadepedido d WHERE d.detallesnotadepedidoPK.fkIdproducto = :fkIdproducto"),
    @NamedQuery(name = "Detallesnotadepedido.findByFkIdnota", query = "SELECT d FROM Detallesnotadepedido d WHERE d.detallesnotadepedidoPK.fkIdnota = :fkIdnota")})
public class Detallesnotadepedido implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetallesnotadepedidoPK detallesnotadepedidoPK;
    @Column(name = "PENDIENTE")
    private Character pendiente;
    @Column(name = "CANCELADO")
    private Character cancelado;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRECIO_DESC")
    private BigDecimal precioDesc;
    @Column(name = "CANTIDAD")
    private Integer cantidad;
    @Column(name = "SUBTOTAL")
    private BigDecimal subtotal;
    @Column(name = "DESCUENTO")
    private BigDecimal descuento;
    @Column(name = "PRECIO")
    private BigDecimal precio;
    @Column(name = "IVA")
    private Long iva;
    @Column(name = "ENTREGADO")
    private Character entregado;
    @Column(name = "ANULADO")
    private Character anulado;
    @JoinColumn(name = "FK_IDPRODUCTO", referencedColumnName = "SID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Productos productos;
    @JoinColumn(name = "FK_IDNOTA", referencedColumnName = "ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Notadepedido notadepedido;

    public Detallesnotadepedido() {
    }

    public Detallesnotadepedido(DetallesnotadepedidoPK detallesnotadepedidoPK) {
        this.detallesnotadepedidoPK = detallesnotadepedidoPK;
    }

    public Detallesnotadepedido(int fkIdproducto, int fkIdnota) {
        this.detallesnotadepedidoPK = new DetallesnotadepedidoPK(fkIdproducto, fkIdnota);
    }

    public DetallesnotadepedidoPK getDetallesnotadepedidoPK() {
        return detallesnotadepedidoPK;
    }

    public void setDetallesnotadepedidoPK(DetallesnotadepedidoPK detallesnotadepedidoPK) {
        this.detallesnotadepedidoPK = detallesnotadepedidoPK;
    }

    public Character getPendiente() {
        return pendiente;
    }

    public void setPendiente(Character pendiente) {
        this.pendiente = pendiente;
    }

    public Character getCancelado() {
        return cancelado;
    }

    public void setCancelado(Character cancelado) {
        this.cancelado = cancelado;
    }

    public BigDecimal getPrecioDesc() {
        return precioDesc;
    }

    public void setPrecioDesc(BigDecimal precioDesc) {
        this.precioDesc = precioDesc;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public BigDecimal getDescuento() {
        return descuento;
    }

    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Long getIva() {
        return iva;
    }

    public void setIva(Long iva) {
        this.iva = iva;
    }

    public Character getEntregado() {
        return entregado;
    }

    public void setEntregado(Character entregado) {
        this.entregado = entregado;
    }

    public Character getAnulado() {
        return anulado;
    }

    public void setAnulado(Character anulado) {
        this.anulado = anulado;
    }

    public Productos getProductos() {
        return productos;
    }

    public void setProductos(Productos productos) {
        this.productos = productos;
    }

    public Notadepedido getNotadepedido() {
        return notadepedido;
    }

    public void setNotadepedido(Notadepedido notadepedido) {
        this.notadepedido = notadepedido;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detallesnotadepedidoPK != null ? detallesnotadepedidoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detallesnotadepedido)) {
            return false;
        }
        Detallesnotadepedido other = (Detallesnotadepedido) object;
        if ((this.detallesnotadepedidoPK == null && other.detallesnotadepedidoPK != null) || (this.detallesnotadepedidoPK != null && !this.detallesnotadepedidoPK.equals(other.detallesnotadepedidoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.Detallesnotadepedido[ detallesnotadepedidoPK=" + detallesnotadepedidoPK + " ]";
    }
    
}

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
@Table(name = "DETALLESPRESUPUESTO", catalog = "", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detallespresupuesto.findAll", query = "SELECT d FROM Detallespresupuesto d"),
    @NamedQuery(name = "Detallespresupuesto.findByPrecio", query = "SELECT d FROM Detallespresupuesto d WHERE d.precio = :precio"),
    @NamedQuery(name = "Detallespresupuesto.findByPrecioDesc", query = "SELECT d FROM Detallespresupuesto d WHERE d.precioDesc = :precioDesc"),
    @NamedQuery(name = "Detallespresupuesto.findBySubtotal", query = "SELECT d FROM Detallespresupuesto d WHERE d.subtotal = :subtotal"),
    @NamedQuery(name = "Detallespresupuesto.findByCantidad", query = "SELECT d FROM Detallespresupuesto d WHERE d.cantidad = :cantidad"),
    @NamedQuery(name = "Detallespresupuesto.findByDescuento", query = "SELECT d FROM Detallespresupuesto d WHERE d.descuento = :descuento"),
    @NamedQuery(name = "Detallespresupuesto.findByFkProducto", query = "SELECT d FROM Detallespresupuesto d WHERE d.detallespresupuestoPK.fkProducto = :fkProducto"),
    @NamedQuery(name = "Detallespresupuesto.findByIdDpFk", query = "SELECT d FROM Detallespresupuesto d WHERE d.detallespresupuestoPK.idDpFk = :idDpFk")})
public class Detallespresupuesto implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetallespresupuestoPK detallespresupuestoPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRECIO")
    private BigDecimal precio;
    @Column(name = "PRECIO_DESC")
    private BigDecimal precioDesc;
    @Column(name = "SUBTOTAL")
    private BigDecimal subtotal;
    @Column(name = "CANTIDAD")
    private Short cantidad;
    @Column(name = "DESCUENTO")
    private BigDecimal descuento;
    @JoinColumn(name = "FK_PRODUCTO", referencedColumnName = "SID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Productos productos;
    @JoinColumn(name = "ID_DP_FK", referencedColumnName = "ID_PRESUPUESTO", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Presupuestos presupuestos;

    public Detallespresupuesto() {
    }

    public Detallespresupuesto(DetallespresupuestoPK detallespresupuestoPK) {
        this.detallespresupuestoPK = detallespresupuestoPK;
    }

    public Detallespresupuesto(int fkProducto, int idDpFk) {
        this.detallespresupuestoPK = new DetallespresupuestoPK(fkProducto, idDpFk);
    }

    public DetallespresupuestoPK getDetallespresupuestoPK() {
        return detallespresupuestoPK;
    }

    public void setDetallespresupuestoPK(DetallespresupuestoPK detallespresupuestoPK) {
        this.detallespresupuestoPK = detallespresupuestoPK;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public BigDecimal getPrecioDesc() {
        return precioDesc;
    }

    public void setPrecioDesc(BigDecimal precioDesc) {
        this.precioDesc = precioDesc;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public Short getCantidad() {
        return cantidad;
    }

    public void setCantidad(Short cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getDescuento() {
        return descuento;
    }

    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }

    public Productos getProductos() {
        return productos;
    }

    public void setProductos(Productos productos) {
        this.productos = productos;
    }

    public Presupuestos getPresupuestos() {
        return presupuestos;
    }

    public void setPresupuestos(Presupuestos presupuestos) {
        this.presupuestos = presupuestos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detallespresupuestoPK != null ? detallespresupuestoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detallespresupuesto)) {
            return false;
        }
        Detallespresupuesto other = (Detallespresupuesto) object;
        if ((this.detallespresupuestoPK == null && other.detallespresupuestoPK != null) || (this.detallespresupuestoPK != null && !this.detallespresupuestoPK.equals(other.detallespresupuestoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.Detallespresupuesto[ detallespresupuestoPK=" + detallespresupuestoPK + " ]";
    }
    
}

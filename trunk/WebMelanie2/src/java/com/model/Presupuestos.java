/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "PRESUPUESTOS", catalog = "", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Presupuestos.findAll", query = "SELECT p FROM Presupuestos p"),
    @NamedQuery(name = "Presupuestos.findByIdPresupuesto", query = "SELECT p FROM Presupuestos p WHERE p.idPresupuesto = :idPresupuesto"),
    @NamedQuery(name = "Presupuestos.findByIva", query = "SELECT p FROM Presupuestos p WHERE p.iva = :iva"),
    @NamedQuery(name = "Presupuestos.findByNombre", query = "SELECT p FROM Presupuestos p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Presupuestos.findByValidez", query = "SELECT p FROM Presupuestos p WHERE p.validez = :validez"),
    @NamedQuery(name = "Presupuestos.findByApellido", query = "SELECT p FROM Presupuestos p WHERE p.apellido = :apellido"),
    @NamedQuery(name = "Presupuestos.findByObservaciones", query = "SELECT p FROM Presupuestos p WHERE p.observaciones = :observaciones"),
    @NamedQuery(name = "Presupuestos.findByPorcDescTotal", query = "SELECT p FROM Presupuestos p WHERE p.porcDescTotal = :porcDescTotal"),
    @NamedQuery(name = "Presupuestos.findByTotalapagar", query = "SELECT p FROM Presupuestos p WHERE p.totalapagar = :totalapagar"),
    @NamedQuery(name = "Presupuestos.findByRecargototal", query = "SELECT p FROM Presupuestos p WHERE p.recargototal = :recargototal"),
    @NamedQuery(name = "Presupuestos.findByTotal", query = "SELECT p FROM Presupuestos p WHERE p.total = :total"),
    @NamedQuery(name = "Presupuestos.findByPorcentajerecargo", query = "SELECT p FROM Presupuestos p WHERE p.porcentajerecargo = :porcentajerecargo"),
    @NamedQuery(name = "Presupuestos.findByFechapresupuesto", query = "SELECT p FROM Presupuestos p WHERE p.fechapresupuesto = :fechapresupuesto"),
    @NamedQuery(name = "Presupuestos.findByDescuentoresto", query = "SELECT p FROM Presupuestos p WHERE p.descuentoresto = :descuentoresto"),
    @NamedQuery(name = "Presupuestos.findByIdUsuarioExpidioPresupuesto", query = "SELECT p FROM Presupuestos p WHERE p.idUsuarioExpidioPresupuesto = :idUsuarioExpidioPresupuesto")})
public class Presupuestos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PRESUPUESTO")
    private Integer idPresupuesto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "IVA")
    private BigDecimal iva;
    @Size(max = 40)
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "VALIDEZ")
    @Temporal(TemporalType.DATE)
    private Date validez;
    @Size(max = 20)
    @Column(name = "APELLIDO")
    private String apellido;
    @Size(max = 5000)
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "PORC_DESC_TOTAL")
    private BigDecimal porcDescTotal;
    @Column(name = "TOTALAPAGAR")
    private BigDecimal totalapagar;
    @Column(name = "RECARGOTOTAL")
    private BigDecimal recargototal;
    @Column(name = "TOTAL")
    private BigDecimal total;
    @Column(name = "PORCENTAJERECARGO")
    private BigDecimal porcentajerecargo;
    @Column(name = "FECHAPRESUPUESTO")
    @Temporal(TemporalType.DATE)
    private Date fechapresupuesto;
    @Column(name = "DESCUENTORESTO")
    private BigDecimal descuentoresto;
    @Column(name = "ID_USUARIO_EXPIDIO_PRESUPUESTO")
    private Integer idUsuarioExpidioPresupuesto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "presupuestos")
    private List<Detallespresupuesto> detallespresupuestoList;

    public Presupuestos() {
    }

    public Presupuestos(Integer idPresupuesto) {
        this.idPresupuesto = idPresupuesto;
    }

    public Integer getIdPresupuesto() {
        return idPresupuesto;
    }

    public void setIdPresupuesto(Integer idPresupuesto) {
        this.idPresupuesto = idPresupuesto;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getValidez() {
        return validez;
    }

    public void setValidez(Date validez) {
        this.validez = validez;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public BigDecimal getPorcDescTotal() {
        return porcDescTotal;
    }

    public void setPorcDescTotal(BigDecimal porcDescTotal) {
        this.porcDescTotal = porcDescTotal;
    }

    public BigDecimal getTotalapagar() {
        return totalapagar;
    }

    public void setTotalapagar(BigDecimal totalapagar) {
        this.totalapagar = totalapagar;
    }

    public BigDecimal getRecargototal() {
        return recargototal;
    }

    public void setRecargototal(BigDecimal recargototal) {
        this.recargototal = recargototal;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getPorcentajerecargo() {
        return porcentajerecargo;
    }

    public void setPorcentajerecargo(BigDecimal porcentajerecargo) {
        this.porcentajerecargo = porcentajerecargo;
    }

    public Date getFechapresupuesto() {
        return fechapresupuesto;
    }

    public void setFechapresupuesto(Date fechapresupuesto) {
        this.fechapresupuesto = fechapresupuesto;
    }

    public BigDecimal getDescuentoresto() {
        return descuentoresto;
    }

    public void setDescuentoresto(BigDecimal descuentoresto) {
        this.descuentoresto = descuentoresto;
    }

    public Integer getIdUsuarioExpidioPresupuesto() {
        return idUsuarioExpidioPresupuesto;
    }

    public void setIdUsuarioExpidioPresupuesto(Integer idUsuarioExpidioPresupuesto) {
        this.idUsuarioExpidioPresupuesto = idUsuarioExpidioPresupuesto;
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
        hash += (idPresupuesto != null ? idPresupuesto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Presupuestos)) {
            return false;
        }
        Presupuestos other = (Presupuestos) object;
        if ((this.idPresupuesto == null && other.idPresupuesto != null) || (this.idPresupuesto != null && !this.idPresupuesto.equals(other.idPresupuesto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.Presupuestos[ idPresupuesto=" + idPresupuesto + " ]";
    }
    
}

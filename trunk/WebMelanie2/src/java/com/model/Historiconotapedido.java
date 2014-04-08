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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author win7
 */
@Entity
@Table(name = "HISTORICONOTAPEDIDO", catalog = "", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Historiconotapedido.findAll", query = "SELECT h FROM Historiconotapedido h"),
    @NamedQuery(name = "Historiconotapedido.findByIdhistorico", query = "SELECT h FROM Historiconotapedido h WHERE h.idhistorico = :idhistorico"),
    @NamedQuery(name = "Historiconotapedido.findByObservaciones", query = "SELECT h FROM Historiconotapedido h WHERE h.observaciones = :observaciones"),
    @NamedQuery(name = "Historiconotapedido.findByPorcentajeaplicado", query = "SELECT h FROM Historiconotapedido h WHERE h.porcentajeaplicado = :porcentajeaplicado"),
    @NamedQuery(name = "Historiconotapedido.findByAnticipo", query = "SELECT h FROM Historiconotapedido h WHERE h.anticipo = :anticipo"),
    @NamedQuery(name = "Historiconotapedido.findByEntregado", query = "SELECT h FROM Historiconotapedido h WHERE h.entregado = :entregado"),
    @NamedQuery(name = "Historiconotapedido.findByIdusuariocancelo", query = "SELECT h FROM Historiconotapedido h WHERE h.idusuariocancelo = :idusuariocancelo"),
    @NamedQuery(name = "Historiconotapedido.findByAnulado", query = "SELECT h FROM Historiconotapedido h WHERE h.anulado = :anulado"),
    @NamedQuery(name = "Historiconotapedido.findByPorcdesc", query = "SELECT h FROM Historiconotapedido h WHERE h.porcdesc = :porcdesc"),
    @NamedQuery(name = "Historiconotapedido.findByIdusuarioanulo", query = "SELECT h FROM Historiconotapedido h WHERE h.idusuarioanulo = :idusuarioanulo"),
    @NamedQuery(name = "Historiconotapedido.findBySaldo", query = "SELECT h FROM Historiconotapedido h WHERE h.saldo = :saldo"),
    @NamedQuery(name = "Historiconotapedido.findByHoraregistro", query = "SELECT h FROM Historiconotapedido h WHERE h.horaregistro = :horaregistro"),
    @NamedQuery(name = "Historiconotapedido.findByFecharegistro", query = "SELECT h FROM Historiconotapedido h WHERE h.fecharegistro = :fecharegistro"),
    @NamedQuery(name = "Historiconotapedido.findByAccion", query = "SELECT h FROM Historiconotapedido h WHERE h.accion = :accion"),
    @NamedQuery(name = "Historiconotapedido.findByCancelado", query = "SELECT h FROM Historiconotapedido h WHERE h.cancelado = :cancelado"),
    @NamedQuery(name = "Historiconotapedido.findByDescuento", query = "SELECT h FROM Historiconotapedido h WHERE h.descuento = :descuento"),
    @NamedQuery(name = "Historiconotapedido.findByIdusuarioexpidio", query = "SELECT h FROM Historiconotapedido h WHERE h.idusuarioexpidio = :idusuarioexpidio"),
    @NamedQuery(name = "Historiconotapedido.findByTotalapagar", query = "SELECT h FROM Historiconotapedido h WHERE h.totalapagar = :totalapagar"),
    @NamedQuery(name = "Historiconotapedido.findByPendiente", query = "SELECT h FROM Historiconotapedido h WHERE h.pendiente = :pendiente"),
    @NamedQuery(name = "Historiconotapedido.findByRecargo", query = "SELECT h FROM Historiconotapedido h WHERE h.recargo = :recargo"),
    @NamedQuery(name = "Historiconotapedido.findByIdusuarioentrega", query = "SELECT h FROM Historiconotapedido h WHERE h.idusuarioentrega = :idusuarioentrega"),
    @NamedQuery(name = "Historiconotapedido.findByPorcrecargo", query = "SELECT h FROM Historiconotapedido h WHERE h.porcrecargo = :porcrecargo"),
    @NamedQuery(name = "Historiconotapedido.findByTotal", query = "SELECT h FROM Historiconotapedido h WHERE h.total = :total")})
public class Historiconotapedido implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDHISTORICO")
    private Integer idhistorico;
    @Size(max = 32000)
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "PORCENTAJEAPLICADO")
    private Short porcentajeaplicado;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ANTICIPO")
    private BigDecimal anticipo;
    @Column(name = "ENTREGADO")
    private Character entregado;
    @Column(name = "IDUSUARIOCANCELO")
    private Integer idusuariocancelo;
    @Column(name = "ANULADO")
    private Character anulado;
    @Column(name = "PORCDESC")
    private BigDecimal porcdesc;
    @Column(name = "IDUSUARIOANULO")
    private Integer idusuarioanulo;
    @Column(name = "SALDO")
    private BigDecimal saldo;
    @Column(name = "HORAREGISTRO")
    @Temporal(TemporalType.TIME)
    private Date horaregistro;
    @Column(name = "FECHAREGISTRO")
    @Temporal(TemporalType.DATE)
    private Date fecharegistro;
    @Size(max = 100)
    @Column(name = "ACCION")
    private String accion;
    @Column(name = "CANCELADO")
    private Character cancelado;
    @Column(name = "DESCUENTO")
    private BigDecimal descuento;
    @Column(name = "IDUSUARIOEXPIDIO")
    private Integer idusuarioexpidio;
    @Column(name = "TOTALAPAGAR")
    private BigDecimal totalapagar;
    @Column(name = "PENDIENTE")
    private Character pendiente;
    @Column(name = "RECARGO")
    private BigDecimal recargo;
    @Column(name = "IDUSUARIOENTREGA")
    private Integer idusuarioentrega;
    @Column(name = "PORCRECARGO")
    private BigDecimal porcrecargo;
    @Column(name = "TOTAL")
    private BigDecimal total;
    @JoinColumn(name = "FKIDNOTAPEDIDO_ID", referencedColumnName = "ID")
    @ManyToOne
    private Notadepedido fkidnotapedidoId;

    public Historiconotapedido() {
    }

    public Historiconotapedido(Integer idhistorico) {
        this.idhistorico = idhistorico;
    }

    public Integer getIdhistorico() {
        return idhistorico;
    }

    public void setIdhistorico(Integer idhistorico) {
        this.idhistorico = idhistorico;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Short getPorcentajeaplicado() {
        return porcentajeaplicado;
    }

    public void setPorcentajeaplicado(Short porcentajeaplicado) {
        this.porcentajeaplicado = porcentajeaplicado;
    }

    public BigDecimal getAnticipo() {
        return anticipo;
    }

    public void setAnticipo(BigDecimal anticipo) {
        this.anticipo = anticipo;
    }

    public Character getEntregado() {
        return entregado;
    }

    public void setEntregado(Character entregado) {
        this.entregado = entregado;
    }

    public Integer getIdusuariocancelo() {
        return idusuariocancelo;
    }

    public void setIdusuariocancelo(Integer idusuariocancelo) {
        this.idusuariocancelo = idusuariocancelo;
    }

    public Character getAnulado() {
        return anulado;
    }

    public void setAnulado(Character anulado) {
        this.anulado = anulado;
    }

    public BigDecimal getPorcdesc() {
        return porcdesc;
    }

    public void setPorcdesc(BigDecimal porcdesc) {
        this.porcdesc = porcdesc;
    }

    public Integer getIdusuarioanulo() {
        return idusuarioanulo;
    }

    public void setIdusuarioanulo(Integer idusuarioanulo) {
        this.idusuarioanulo = idusuarioanulo;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public Date getHoraregistro() {
        return horaregistro;
    }

    public void setHoraregistro(Date horaregistro) {
        this.horaregistro = horaregistro;
    }

    public Date getFecharegistro() {
        return fecharegistro;
    }

    public void setFecharegistro(Date fecharegistro) {
        this.fecharegistro = fecharegistro;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public Character getCancelado() {
        return cancelado;
    }

    public void setCancelado(Character cancelado) {
        this.cancelado = cancelado;
    }

    public BigDecimal getDescuento() {
        return descuento;
    }

    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }

    public Integer getIdusuarioexpidio() {
        return idusuarioexpidio;
    }

    public void setIdusuarioexpidio(Integer idusuarioexpidio) {
        this.idusuarioexpidio = idusuarioexpidio;
    }

    public BigDecimal getTotalapagar() {
        return totalapagar;
    }

    public void setTotalapagar(BigDecimal totalapagar) {
        this.totalapagar = totalapagar;
    }

    public Character getPendiente() {
        return pendiente;
    }

    public void setPendiente(Character pendiente) {
        this.pendiente = pendiente;
    }

    public BigDecimal getRecargo() {
        return recargo;
    }

    public void setRecargo(BigDecimal recargo) {
        this.recargo = recargo;
    }

    public Integer getIdusuarioentrega() {
        return idusuarioentrega;
    }

    public void setIdusuarioentrega(Integer idusuarioentrega) {
        this.idusuarioentrega = idusuarioentrega;
    }

    public BigDecimal getPorcrecargo() {
        return porcrecargo;
    }

    public void setPorcrecargo(BigDecimal porcrecargo) {
        this.porcrecargo = porcrecargo;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Notadepedido getFkidnotapedidoId() {
        return fkidnotapedidoId;
    }

    public void setFkidnotapedidoId(Notadepedido fkidnotapedidoId) {
        this.fkidnotapedidoId = fkidnotapedidoId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idhistorico != null ? idhistorico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Historiconotapedido)) {
            return false;
        }
        Historiconotapedido other = (Historiconotapedido) object;
        if ((this.idhistorico == null && other.idhistorico != null) || (this.idhistorico != null && !this.idhistorico.equals(other.idhistorico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.Historiconotapedido[ idhistorico=" + idhistorico + " ]";
    }
    
}

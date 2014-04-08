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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "NOTADEPEDIDO", catalog = "", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Notadepedido.findAll", query = "SELECT n FROM Notadepedido n"),
    @NamedQuery(name = "Notadepedido.findById", query = "SELECT n FROM Notadepedido n WHERE n.id = :id"),
    @NamedQuery(name = "Notadepedido.findByIdusuarioAnulado", query = "SELECT n FROM Notadepedido n WHERE n.idusuarioAnulado = :idusuarioAnulado"),
    @NamedQuery(name = "Notadepedido.findByTotal", query = "SELECT n FROM Notadepedido n WHERE n.total = :total"),
    @NamedQuery(name = "Notadepedido.findByAnticipo", query = "SELECT n FROM Notadepedido n WHERE n.anticipo = :anticipo"),
    @NamedQuery(name = "Notadepedido.findByNumerodecupon", query = "SELECT n FROM Notadepedido n WHERE n.numerodecupon = :numerodecupon"),
    @NamedQuery(name = "Notadepedido.findByHoracompra", query = "SELECT n FROM Notadepedido n WHERE n.horacompra = :horacompra"),
    @NamedQuery(name = "Notadepedido.findByEnefectivo", query = "SELECT n FROM Notadepedido n WHERE n.enefectivo = :enefectivo"),
    @NamedQuery(name = "Notadepedido.findByIdUsuarioExpidioNota", query = "SELECT n FROM Notadepedido n WHERE n.idUsuarioExpidioNota = :idUsuarioExpidioNota"),
    @NamedQuery(name = "Notadepedido.findByFechaentrega", query = "SELECT n FROM Notadepedido n WHERE n.fechaentrega = :fechaentrega"),
    @NamedQuery(name = "Notadepedido.findByFechaAnulado", query = "SELECT n FROM Notadepedido n WHERE n.fechaAnulado = :fechaAnulado"),
    @NamedQuery(name = "Notadepedido.findByCancelado", query = "SELECT n FROM Notadepedido n WHERE n.cancelado = :cancelado"),
    @NamedQuery(name = "Notadepedido.findByAnulado", query = "SELECT n FROM Notadepedido n WHERE n.anulado = :anulado"),
    @NamedQuery(name = "Notadepedido.findByFecancelado", query = "SELECT n FROM Notadepedido n WHERE n.fecancelado = :fecancelado"),
    @NamedQuery(name = "Notadepedido.findByObservaciones", query = "SELECT n FROM Notadepedido n WHERE n.observaciones = :observaciones"),
    @NamedQuery(name = "Notadepedido.findByIdUsuarioCancelo", query = "SELECT n FROM Notadepedido n WHERE n.idUsuarioCancelo = :idUsuarioCancelo"),
    @NamedQuery(name = "Notadepedido.findByMontoiva", query = "SELECT n FROM Notadepedido n WHERE n.montoiva = :montoiva"),
    @NamedQuery(name = "Notadepedido.findByDescuentoNota", query = "SELECT n FROM Notadepedido n WHERE n.descuentoNota = :descuentoNota"),
    @NamedQuery(name = "Notadepedido.findByMontototalapagar", query = "SELECT n FROM Notadepedido n WHERE n.montototalapagar = :montototalapagar"),
    @NamedQuery(name = "Notadepedido.findByEntregado", query = "SELECT n FROM Notadepedido n WHERE n.entregado = :entregado"),
    @NamedQuery(name = "Notadepedido.findByPorcdesctotal", query = "SELECT n FROM Notadepedido n WHERE n.porcdesctotal = :porcdesctotal"),
    @NamedQuery(name = "Notadepedido.findByIdusuarioEntregado", query = "SELECT n FROM Notadepedido n WHERE n.idusuarioEntregado = :idusuarioEntregado"),
    @NamedQuery(name = "Notadepedido.findByPorcrecargo", query = "SELECT n FROM Notadepedido n WHERE n.porcrecargo = :porcrecargo"),
    @NamedQuery(name = "Notadepedido.findByPendiente", query = "SELECT n FROM Notadepedido n WHERE n.pendiente = :pendiente"),
    @NamedQuery(name = "Notadepedido.findByStockfuturo", query = "SELECT n FROM Notadepedido n WHERE n.stockfuturo = :stockfuturo"),
    @NamedQuery(name = "Notadepedido.findByFechadecompra", query = "SELECT n FROM Notadepedido n WHERE n.fechadecompra = :fechadecompra"),
    @NamedQuery(name = "Notadepedido.findBySaldo", query = "SELECT n FROM Notadepedido n WHERE n.saldo = :saldo"),
    @NamedQuery(name = "Notadepedido.findByRecargo", query = "SELECT n FROM Notadepedido n WHERE n.recargo = :recargo"),
    @NamedQuery(name = "Notadepedido.findByDescuentoPesos", query = "SELECT n FROM Notadepedido n WHERE n.descuentoPesos = :descuentoPesos")})
public class Notadepedido implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Column(name = "IDUSUARIO_ANULADO")
    private Integer idusuarioAnulado;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TOTAL")
    private BigDecimal total;
    @Column(name = "ANTICIPO")
    private BigDecimal anticipo;
    @Size(max = 20)
    @Column(name = "NUMERODECUPON")
    private String numerodecupon;
    @Column(name = "HORACOMPRA")
    @Temporal(TemporalType.TIME)
    private Date horacompra;
    @Column(name = "ENEFECTIVO")
    private Character enefectivo;
    @Column(name = "ID_USUARIO_EXPIDIO_NOTA")
    private Integer idUsuarioExpidioNota;
    @Column(name = "FECHAENTREGA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaentrega;
    @Column(name = "FECHA_ANULADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAnulado;
    @Column(name = "CANCELADO")
    private Character cancelado;
    @Column(name = "ANULADO")
    private Character anulado;
    @Column(name = "FECANCELADO")
    @Temporal(TemporalType.DATE)
    private Date fecancelado;
    @Size(max = 32000)
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "ID_USUARIO_CANCELO")
    private Integer idUsuarioCancelo;
    @Column(name = "MONTOIVA")
    private BigDecimal montoiva;
    @Column(name = "DESCUENTO_NOTA")
    private BigDecimal descuentoNota;
    @Column(name = "MONTOTOTALAPAGAR")
    private BigDecimal montototalapagar;
    @Column(name = "ENTREGADO")
    private Character entregado;
    @Column(name = "PORCDESCTOTAL")
    private BigDecimal porcdesctotal;
    @Column(name = "IDUSUARIO_ENTREGADO")
    private Integer idusuarioEntregado;
    @Column(name = "PORCRECARGO")
    private BigDecimal porcrecargo;
    @Column(name = "PENDIENTE")
    private Character pendiente;
    @Column(name = "STOCKFUTURO")
    private Integer stockfuturo;
    @Column(name = "FECHADECOMPRA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechadecompra;
    @Column(name = "SALDO")
    private BigDecimal saldo;
    @Column(name = "RECARGO")
    private BigDecimal recargo;
    @Column(name = "DESCUENTO_PESOS")
    private BigDecimal descuentoPesos;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "notadepedido")
    private List<Detallesnotadepedido> detallesnotadepedidoList;
    @OneToMany(mappedBy = "fkidnotapedidoId")
    private List<Historiconotapedido> historiconotapedidoList;
    @JoinColumn(name = "IDTARJETAFK_IDTARJETA", referencedColumnName = "IDTARJETA")
    @ManyToOne
    private Tarjetascreditodebito idtarjetafkIdtarjeta;
    @JoinColumn(name = "FKIDPORCENTAJENOTA_ID", referencedColumnName = "ID_PORCENTAJES")
    @ManyToOne
    private Porcentajes fkidporcentajenotaId;
    @JoinColumn(name = "FK_IDCLIENTE", referencedColumnName = "ID_PERSONA")
    @ManyToOne
    private Personas fkIdcliente;

    public Notadepedido() {
    }

    public Notadepedido(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdusuarioAnulado() {
        return idusuarioAnulado;
    }

    public void setIdusuarioAnulado(Integer idusuarioAnulado) {
        this.idusuarioAnulado = idusuarioAnulado;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getAnticipo() {
        return anticipo;
    }

    public void setAnticipo(BigDecimal anticipo) {
        this.anticipo = anticipo;
    }

    public String getNumerodecupon() {
        return numerodecupon;
    }

    public void setNumerodecupon(String numerodecupon) {
        this.numerodecupon = numerodecupon;
    }

    public Date getHoracompra() {
        return horacompra;
    }

    public void setHoracompra(Date horacompra) {
        this.horacompra = horacompra;
    }

    public Character getEnefectivo() {
        return enefectivo;
    }

    public void setEnefectivo(Character enefectivo) {
        this.enefectivo = enefectivo;
    }

    public Integer getIdUsuarioExpidioNota() {
        return idUsuarioExpidioNota;
    }

    public void setIdUsuarioExpidioNota(Integer idUsuarioExpidioNota) {
        this.idUsuarioExpidioNota = idUsuarioExpidioNota;
    }

    public Date getFechaentrega() {
        return fechaentrega;
    }

    public void setFechaentrega(Date fechaentrega) {
        this.fechaentrega = fechaentrega;
    }

    public Date getFechaAnulado() {
        return fechaAnulado;
    }

    public void setFechaAnulado(Date fechaAnulado) {
        this.fechaAnulado = fechaAnulado;
    }

    public Character getCancelado() {
        return cancelado;
    }

    public void setCancelado(Character cancelado) {
        this.cancelado = cancelado;
    }

    public Character getAnulado() {
        return anulado;
    }

    public void setAnulado(Character anulado) {
        this.anulado = anulado;
    }

    public Date getFecancelado() {
        return fecancelado;
    }

    public void setFecancelado(Date fecancelado) {
        this.fecancelado = fecancelado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Integer getIdUsuarioCancelo() {
        return idUsuarioCancelo;
    }

    public void setIdUsuarioCancelo(Integer idUsuarioCancelo) {
        this.idUsuarioCancelo = idUsuarioCancelo;
    }

    public BigDecimal getMontoiva() {
        return montoiva;
    }

    public void setMontoiva(BigDecimal montoiva) {
        this.montoiva = montoiva;
    }

    public BigDecimal getDescuentoNota() {
        return descuentoNota;
    }

    public void setDescuentoNota(BigDecimal descuentoNota) {
        this.descuentoNota = descuentoNota;
    }

    public BigDecimal getMontototalapagar() {
        return montototalapagar;
    }

    public void setMontototalapagar(BigDecimal montototalapagar) {
        this.montototalapagar = montototalapagar;
    }

    public Character getEntregado() {
        return entregado;
    }

    public void setEntregado(Character entregado) {
        this.entregado = entregado;
    }

    public BigDecimal getPorcdesctotal() {
        return porcdesctotal;
    }

    public void setPorcdesctotal(BigDecimal porcdesctotal) {
        this.porcdesctotal = porcdesctotal;
    }

    public Integer getIdusuarioEntregado() {
        return idusuarioEntregado;
    }

    public void setIdusuarioEntregado(Integer idusuarioEntregado) {
        this.idusuarioEntregado = idusuarioEntregado;
    }

    public BigDecimal getPorcrecargo() {
        return porcrecargo;
    }

    public void setPorcrecargo(BigDecimal porcrecargo) {
        this.porcrecargo = porcrecargo;
    }

    public Character getPendiente() {
        return pendiente;
    }

    public void setPendiente(Character pendiente) {
        this.pendiente = pendiente;
    }

    public Integer getStockfuturo() {
        return stockfuturo;
    }

    public void setStockfuturo(Integer stockfuturo) {
        this.stockfuturo = stockfuturo;
    }

    public Date getFechadecompra() {
        return fechadecompra;
    }

    public void setFechadecompra(Date fechadecompra) {
        this.fechadecompra = fechadecompra;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public BigDecimal getRecargo() {
        return recargo;
    }

    public void setRecargo(BigDecimal recargo) {
        this.recargo = recargo;
    }

    public BigDecimal getDescuentoPesos() {
        return descuentoPesos;
    }

    public void setDescuentoPesos(BigDecimal descuentoPesos) {
        this.descuentoPesos = descuentoPesos;
    }

    @XmlTransient
    public List<Detallesnotadepedido> getDetallesnotadepedidoList() {
        return detallesnotadepedidoList;
    }

    public void setDetallesnotadepedidoList(List<Detallesnotadepedido> detallesnotadepedidoList) {
        this.detallesnotadepedidoList = detallesnotadepedidoList;
    }

    @XmlTransient
    public List<Historiconotapedido> getHistoriconotapedidoList() {
        return historiconotapedidoList;
    }

    public void setHistoriconotapedidoList(List<Historiconotapedido> historiconotapedidoList) {
        this.historiconotapedidoList = historiconotapedidoList;
    }

    public Tarjetascreditodebito getIdtarjetafkIdtarjeta() {
        return idtarjetafkIdtarjeta;
    }

    public void setIdtarjetafkIdtarjeta(Tarjetascreditodebito idtarjetafkIdtarjeta) {
        this.idtarjetafkIdtarjeta = idtarjetafkIdtarjeta;
    }

    public Porcentajes getFkidporcentajenotaId() {
        return fkidporcentajenotaId;
    }

    public void setFkidporcentajenotaId(Porcentajes fkidporcentajenotaId) {
        this.fkidporcentajenotaId = fkidporcentajenotaId;
    }

    public Personas getFkIdcliente() {
        return fkIdcliente;
    }

    public void setFkIdcliente(Personas fkIdcliente) {
        this.fkIdcliente = fkIdcliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Notadepedido)) {
            return false;
        }
        Notadepedido other = (Notadepedido) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.Notadepedido[ id=" + id + " ]";
    }
    
}

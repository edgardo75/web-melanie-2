/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
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
@Table(name = "ENTRADASYSALIDASCAJA", catalog = "", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Entradasysalidascaja.findAll", query = "SELECT e FROM Entradasysalidascaja e"),
    @NamedQuery(name = "Entradasysalidascaja.findById", query = "SELECT e FROM Entradasysalidascaja e WHERE e.id = :id"),
    @NamedQuery(name = "Entradasysalidascaja.findByDetalles", query = "SELECT e FROM Entradasysalidascaja e WHERE e.detalles = :detalles"),
    @NamedQuery(name = "Entradasysalidascaja.findByFecha", query = "SELECT e FROM Entradasysalidascaja e WHERE e.fecha = :fecha"),
    @NamedQuery(name = "Entradasysalidascaja.findByEntradas", query = "SELECT e FROM Entradasysalidascaja e WHERE e.entradas = :entradas"),
    @NamedQuery(name = "Entradasysalidascaja.findBySalidas", query = "SELECT e FROM Entradasysalidascaja e WHERE e.salidas = :salidas"),
    @NamedQuery(name = "Entradasysalidascaja.findByIdUsuario", query = "SELECT e FROM Entradasysalidascaja e WHERE e.idUsuario = :idUsuario"),
    @NamedQuery(name = "Entradasysalidascaja.findByNumerocupon", query = "SELECT e FROM Entradasysalidascaja e WHERE e.numerocupon = :numerocupon"),
    @NamedQuery(name = "Entradasysalidascaja.findByEnefectivo", query = "SELECT e FROM Entradasysalidascaja e WHERE e.enefectivo = :enefectivo"),
    @NamedQuery(name = "Entradasysalidascaja.findByHora", query = "SELECT e FROM Entradasysalidascaja e WHERE e.hora = :hora")})
public class Entradasysalidascaja implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 255)
    @Column(name = "DETALLES")
    private String detalles;
    @Column(name = "FECHA")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "ENTRADAS")
    private Long entradas;
    @Column(name = "SALIDAS")
    private Long salidas;
    @Column(name = "ID_USUARIO")
    private Integer idUsuario;
    @Size(max = 20)
    @Column(name = "NUMEROCUPON")
    private String numerocupon;
    @Column(name = "ENEFECTIVO")
    private Character enefectivo;
    @Column(name = "HORA")
    @Temporal(TemporalType.TIME)
    private Date hora;
    @JoinColumn(name = "ID_TARJETA_FK", referencedColumnName = "IDTARJETA")
    @ManyToOne(optional = false)
    private Tarjetascreditodebito idTarjetaFk;
    @JoinColumn(name = "ID", referencedColumnName = "IDTARJETA", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Tarjetascreditodebito tarjetascreditodebito;

    public Entradasysalidascaja() {
    }

    public Entradasysalidascaja(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Long getEntradas() {
        return entradas;
    }

    public void setEntradas(Long entradas) {
        this.entradas = entradas;
    }

    public Long getSalidas() {
        return salidas;
    }

    public void setSalidas(Long salidas) {
        this.salidas = salidas;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNumerocupon() {
        return numerocupon;
    }

    public void setNumerocupon(String numerocupon) {
        this.numerocupon = numerocupon;
    }

    public Character getEnefectivo() {
        return enefectivo;
    }

    public void setEnefectivo(Character enefectivo) {
        this.enefectivo = enefectivo;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public Tarjetascreditodebito getIdTarjetaFk() {
        return idTarjetaFk;
    }

    public void setIdTarjetaFk(Tarjetascreditodebito idTarjetaFk) {
        this.idTarjetaFk = idTarjetaFk;
    }

    public Tarjetascreditodebito getTarjetascreditodebito() {
        return tarjetascreditodebito;
    }

    public void setTarjetascreditodebito(Tarjetascreditodebito tarjetascreditodebito) {
        this.tarjetascreditodebito = tarjetascreditodebito;
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
        if (!(object instanceof Entradasysalidascaja)) {
            return false;
        }
        Entradasysalidascaja other = (Entradasysalidascaja) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.Entradasysalidascaja[ id=" + id + " ]";
    }
    
}

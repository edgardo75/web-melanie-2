/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
@Table(name = "PORCENTAJES", catalog = "", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Porcentajes.findAll", query = "SELECT p FROM Porcentajes p"),
    @NamedQuery(name = "Porcentajes.findByIdPorcentajes", query = "SELECT p FROM Porcentajes p WHERE p.idPorcentajes = :idPorcentajes"),
    @NamedQuery(name = "Porcentajes.findByDescripcion", query = "SELECT p FROM Porcentajes p WHERE p.descripcion = :descripcion"),
    @NamedQuery(name = "Porcentajes.findByValor", query = "SELECT p FROM Porcentajes p WHERE p.valor = :valor")})
public class Porcentajes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PORCENTAJES")
    private Short idPorcentajes;
    @Size(max = 100)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR")
    private Double valor;
    @OneToMany(mappedBy = "fkidporcentajenotaId")
    private List<Notadepedido> notadepedidoList;

    public Porcentajes() {
    }

    public Porcentajes(Short idPorcentajes) {
        this.idPorcentajes = idPorcentajes;
    }

    public Short getIdPorcentajes() {
        return idPorcentajes;
    }

    public void setIdPorcentajes(Short idPorcentajes) {
        this.idPorcentajes = idPorcentajes;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @XmlTransient
    public List<Notadepedido> getNotadepedidoList() {
        return notadepedidoList;
    }

    public void setNotadepedidoList(List<Notadepedido> notadepedidoList) {
        this.notadepedidoList = notadepedidoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPorcentajes != null ? idPorcentajes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Porcentajes)) {
            return false;
        }
        Porcentajes other = (Porcentajes) object;
        if ((this.idPorcentajes == null && other.idPorcentajes != null) || (this.idPorcentajes != null && !this.idPorcentajes.equals(other.idPorcentajes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.Porcentajes[ idPorcentajes=" + idPorcentajes + " ]";
    }
    
}

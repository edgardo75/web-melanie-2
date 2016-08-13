/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author win7
 */
@Entity
@Table(name = "HISTORICODATOSCLIENTE", catalog = "", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Historicodatoscliente.findAll", query = "SELECT h FROM Historicodatoscliente h"),
    @NamedQuery(name = "Historicodatoscliente.findById", query = "SELECT h FROM Historicodatoscliente h WHERE h.id = :id"),
    @NamedQuery(name = "Historicodatoscliente.findByIdgenero", query = "SELECT h FROM Historicodatoscliente h WHERE h.idgenero = :idgenero"),
    @NamedQuery(name = "Historicodatoscliente.findByNombre", query = "SELECT h FROM Historicodatoscliente h WHERE h.nombre = :nombre"),
    @NamedQuery(name = "Historicodatoscliente.findByEmail", query = "SELECT h FROM Historicodatoscliente h WHERE h.email = :email"),
    @NamedQuery(name = "Historicodatoscliente.findByApellido", query = "SELECT h FROM Historicodatoscliente h WHERE h.apellido = :apellido"),
    @NamedQuery(name = "Historicodatoscliente.findByIdCli", query = "SELECT h FROM Historicodatoscliente h WHERE h.idCli = :idCli"),
    @NamedQuery(name = "Historicodatoscliente.findByTotalcompras", query = "SELECT h FROM Historicodatoscliente h WHERE h.totalcompras = :totalcompras"),
    @NamedQuery(name = "Historicodatoscliente.findByObservaciones", query = "SELECT h FROM Historicodatoscliente h WHERE h.observaciones = :observaciones"),
    @NamedQuery(name = "Historicodatoscliente.findByTotalpuntos", query = "SELECT h FROM Historicodatoscliente h WHERE h.totalpuntos = :totalpuntos")})
public class Historicodatoscliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Column(name = "IDGENERO")
    private Short idgenero;
    @Size(max = 30)
    @Column(name = "NOMBRE")
    private String nombre;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 50)
    @Column(name = "EMAIL")
    private String email;
    @Size(max = 30)
    @Column(name = "APELLIDO")
    private String apellido;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_CLI")
    private int idCli;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TOTALCOMPRAS")
    private BigDecimal totalcompras;
    @Size(max = 32000)
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "TOTALPUNTOS")
    private BigInteger totalpuntos;

    public Historicodatoscliente() {
    }

    public Historicodatoscliente(Integer id) {
        this.id = id;
    }

    public Historicodatoscliente(Integer id, int idCli) {
        this.id = id;
        this.idCli = idCli;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Short getIdgenero() {
        return idgenero;
    }

    public void setIdgenero(Short idgenero) {
        this.idgenero = idgenero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
    }

    public BigDecimal getTotalcompras() {
        return totalcompras;
    }

    public void setTotalcompras(BigDecimal totalcompras) {
        this.totalcompras = totalcompras;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public BigInteger getTotalpuntos() {
        return totalpuntos;
    }

    public void setTotalpuntos(BigInteger totalpuntos) {
        this.totalpuntos = totalpuntos;
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
        if (!(object instanceof Historicodatoscliente)) {
            return false;
        }
        Historicodatoscliente other = (Historicodatoscliente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.Historicodatoscliente[ id=" + id + " ]";
    }
    
}

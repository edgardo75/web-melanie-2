/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.io.Serializable;
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
import javax.persistence.OneToOne;
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
@Table(name = "PERSONAS", catalog = "", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personas.findAll", query = "SELECT p FROM Personas p"),
    @NamedQuery(name = "Personas.findByIdPersona", query = "SELECT p FROM Personas p WHERE p.idPersona = :idPersona"),
    @NamedQuery(name = "Personas.findByPertype", query = "SELECT p FROM Personas p WHERE p.pertype = :pertype"),
    @NamedQuery(name = "Personas.findByObservaciones", query = "SELECT p FROM Personas p WHERE p.observaciones = :observaciones"),
    @NamedQuery(name = "Personas.findByNrodocumento", query = "SELECT p FROM Personas p WHERE p.nrodocumento = :nrodocumento"),
    @NamedQuery(name = "Personas.findByApellido", query = "SELECT p FROM Personas p WHERE p.apellido = :apellido"),
    @NamedQuery(name = "Personas.findByNombre", query = "SELECT p FROM Personas p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Personas.findByEmail", query = "SELECT p FROM Personas p WHERE p.email = :email")})
public class Personas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PERSONA")
    private Integer idPersona;
    @Size(max = 31)
    @Column(name = "PERTYPE")
    private String pertype;
    @Size(max = 32000)
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NRODOCUMENTO")
    private int nrodocumento;
    @Size(max = 30)
    @Column(name = "APELLIDO")
    private String apellido;
    @Size(max = 30)
    @Column(name = "NOMBRE")
    private String nombre;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 50)
    @Column(name = "EMAIL")
    private String email;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "personas")
    private Empleadoparttime empleadoparttime;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "personas")
    private List<Personastelefonos> personastelefonosList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "personas")
    private Empleados empleados;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "personas")
    private Fulltimeempleado fulltimeempleado;
    @OneToMany(mappedBy = "fkIdcliente")
    private List<Notadepedido> notadepedidoList;
    @JoinColumn(name = "ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Tiposdocumento id;
    @JoinColumn(name = "ID_GENERO", referencedColumnName = "ID_GENERO")
    @ManyToOne
    private Generos idGenero;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "personas")
    private Clientes clientes;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "personas")
    private List<Personasdomicilios> personasdomiciliosList;

    public Personas() {
    }

    public Personas(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public Personas(Integer idPersona, int nrodocumento) {
        this.idPersona = idPersona;
        this.nrodocumento = nrodocumento;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public String getPertype() {
        return pertype;
    }

    public void setPertype(String pertype) {
        this.pertype = pertype;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getNrodocumento() {
        return nrodocumento;
    }

    public void setNrodocumento(int nrodocumento) {
        this.nrodocumento = nrodocumento;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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

    public Empleadoparttime getEmpleadoparttime() {
        return empleadoparttime;
    }

    public void setEmpleadoparttime(Empleadoparttime empleadoparttime) {
        this.empleadoparttime = empleadoparttime;
    }

    @XmlTransient
    public List<Personastelefonos> getPersonastelefonosList() {
        return personastelefonosList;
    }

    public void setPersonastelefonosList(List<Personastelefonos> personastelefonosList) {
        this.personastelefonosList = personastelefonosList;
    }

    public Empleados getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleados empleados) {
        this.empleados = empleados;
    }

    public Fulltimeempleado getFulltimeempleado() {
        return fulltimeempleado;
    }

    public void setFulltimeempleado(Fulltimeempleado fulltimeempleado) {
        this.fulltimeempleado = fulltimeempleado;
    }

    @XmlTransient
    public List<Notadepedido> getNotadepedidoList() {
        return notadepedidoList;
    }

    public void setNotadepedidoList(List<Notadepedido> notadepedidoList) {
        this.notadepedidoList = notadepedidoList;
    }

    public Tiposdocumento getId() {
        return id;
    }

    public void setId(Tiposdocumento id) {
        this.id = id;
    }

    public Generos getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(Generos idGenero) {
        this.idGenero = idGenero;
    }

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    @XmlTransient
    public List<Personasdomicilios> getPersonasdomiciliosList() {
        return personasdomiciliosList;
    }

    public void setPersonasdomiciliosList(List<Personasdomicilios> personasdomiciliosList) {
        this.personasdomiciliosList = personasdomiciliosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPersona != null ? idPersona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personas)) {
            return false;
        }
        Personas other = (Personas) object;
        if ((this.idPersona == null && other.idPersona != null) || (this.idPersona != null && !this.idPersona.equals(other.idPersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.Personas[ idPersona=" + idPersona + " ]";
    }
    
}

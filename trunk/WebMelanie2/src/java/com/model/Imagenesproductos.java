/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.io.Serializable;
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
@Table(name = "IMAGENESPRODUCTOS", catalog = "", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Imagenesproductos.findAll", query = "SELECT i FROM Imagenesproductos i"),
    @NamedQuery(name = "Imagenesproductos.findByIdImage", query = "SELECT i FROM Imagenesproductos i WHERE i.idImage = :idImage"),
    @NamedQuery(name = "Imagenesproductos.findByExtension", query = "SELECT i FROM Imagenesproductos i WHERE i.extension = :extension"),
    @NamedQuery(name = "Imagenesproductos.findByMagnitud", query = "SELECT i FROM Imagenesproductos i WHERE i.magnitud = :magnitud"),
    @NamedQuery(name = "Imagenesproductos.findByNombreImagen", query = "SELECT i FROM Imagenesproductos i WHERE i.nombreImagen = :nombreImagen"),
    @NamedQuery(name = "Imagenesproductos.findByPathimagen", query = "SELECT i FROM Imagenesproductos i WHERE i.pathimagen = :pathimagen"),
    @NamedQuery(name = "Imagenesproductos.findByProductosSid", query = "SELECT i FROM Imagenesproductos i WHERE i.productosSid = :productosSid")})
public class Imagenesproductos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_IMAGE")
    private Long idImage;
    @Size(max = 255)
    @Column(name = "EXTENSION")
    private String extension;
    @Size(max = 255)
    @Column(name = "MAGNITUD")
    private String magnitud;
    @Size(max = 255)
    @Column(name = "NOMBRE_IMAGEN")
    private String nombreImagen;
    @Size(max = 255)
    @Column(name = "PATHIMAGEN")
    private String pathimagen;
    @Column(name = "PRODUCTOS_SID")
    private Long productosSid;

    public Imagenesproductos() {
    }

    public Imagenesproductos(Long idImage) {
        this.idImage = idImage;
    }

    public Long getIdImage() {
        return idImage;
    }

    public void setIdImage(Long idImage) {
        this.idImage = idImage;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getMagnitud() {
        return magnitud;
    }

    public void setMagnitud(String magnitud) {
        this.magnitud = magnitud;
    }

    public String getNombreImagen() {
        return nombreImagen;
    }

    public void setNombreImagen(String nombreImagen) {
        this.nombreImagen = nombreImagen;
    }

    public String getPathimagen() {
        return pathimagen;
    }

    public void setPathimagen(String pathimagen) {
        this.pathimagen = pathimagen;
    }

    public Long getProductosSid() {
        return productosSid;
    }

    public void setProductosSid(Long productosSid) {
        this.productosSid = productosSid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idImage != null ? idImage.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Imagenesproductos)) {
            return false;
        }
        Imagenesproductos other = (Imagenesproductos) object;
        if ((this.idImage == null && other.idImage != null) || (this.idImage != null && !this.idImage.equals(other.idImage))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.Imagenesproductos[ idImage=" + idImage + " ]";
    }
    
}

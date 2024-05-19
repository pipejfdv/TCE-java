/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.funny_mind.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
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
 * @author Juamp
 */
@Entity
@Table(name = "juegos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Juegos.findAll", query = "SELECT j FROM Juegos j"),
    @NamedQuery(name = "Juegos.findById", query = "SELECT j FROM Juegos j WHERE j.id = :id"),
    @NamedQuery(name = "Juegos.findByNombre", query = "SELECT j FROM Juegos j WHERE j.nombre = :nombre"),
    @NamedQuery(name = "Juegos.findByFechaCreacion", query = "SELECT j FROM Juegos j WHERE j.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "Juegos.findByFechaModificacion", query = "SELECT j FROM Juegos j WHERE j.fechaModificacion = :fechaModificacion")})
public class Juegos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Lob
    @Size(max = 65535)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_modificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaModificacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "juegosId", fetch = FetchType.LAZY)
    private List<CategoriaJuegos> categoriaJuegosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "juegosId", fetch = FetchType.LAZY)
    private List<JuegosAsignados> juegosAsignadosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "juegosId", fetch = FetchType.LAZY)
    private List<PuntajesActividades> puntajesActividadesList;

    public Juegos() {
    }

    public Juegos(Integer id) {
        this.id = id;
    }

    public Juegos(Integer id, String nombre, Date fechaCreacion, Date fechaModificacion) {
        this.id = id;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    @XmlTransient
    public List<CategoriaJuegos> getCategoriaJuegosList() {
        return categoriaJuegosList;
    }

    public void setCategoriaJuegosList(List<CategoriaJuegos> categoriaJuegosList) {
        this.categoriaJuegosList = categoriaJuegosList;
    }

    @XmlTransient
    public List<JuegosAsignados> getJuegosAsignadosList() {
        return juegosAsignadosList;
    }

    public void setJuegosAsignadosList(List<JuegosAsignados> juegosAsignadosList) {
        this.juegosAsignadosList = juegosAsignadosList;
    }

    @XmlTransient
    public List<PuntajesActividades> getPuntajesActividadesList() {
        return puntajesActividadesList;
    }

    public void setPuntajesActividadesList(List<PuntajesActividades> puntajesActividadesList) {
        this.puntajesActividadesList = puntajesActividadesList;
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
        if (!(object instanceof Juegos)) {
            return false;
        }
        Juegos other = (Juegos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.funny_mind.entidades.Juegos[ id=" + id + " ]";
    }
    
}

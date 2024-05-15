/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.funny_mind_jsf.entidades;

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
@Table(name = "ejercicios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ejercicios.findAll", query = "SELECT e FROM Ejercicios e"),
    @NamedQuery(name = "Ejercicios.findById", query = "SELECT e FROM Ejercicios e WHERE e.id = :id"),
    @NamedQuery(name = "Ejercicios.findByNombre", query = "SELECT e FROM Ejercicios e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Ejercicios.findByFechaCreacion", query = "SELECT e FROM Ejercicios e WHERE e.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "Ejercicios.findByFechaModificacion", query = "SELECT e FROM Ejercicios e WHERE e.fechaModificacion = :fechaModificacion")})
public class Ejercicios implements Serializable {

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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ejercicioId", fetch = FetchType.LAZY)
    private List<EjerciciosAsignados> ejerciciosAsignadosList;

    public Ejercicios() {
    }

    public Ejercicios(Integer id) {
        this.id = id;
    }

    public Ejercicios(Integer id, String nombre, Date fechaCreacion, Date fechaModificacion) {
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
    public List<EjerciciosAsignados> getEjerciciosAsignadosList() {
        return ejerciciosAsignadosList;
    }

    public void setEjerciciosAsignadosList(List<EjerciciosAsignados> ejerciciosAsignadosList) {
        this.ejerciciosAsignadosList = ejerciciosAsignadosList;
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
        if (!(object instanceof Ejercicios)) {
            return false;
        }
        Ejercicios other = (Ejercicios) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.funny_mind_jsf.entidades.Ejercicios[ id=" + id + " ]";
    }
    
}

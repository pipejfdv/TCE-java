/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.funny_mind.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Juamp
 */
@Entity
@Table(name = "puntajes_actividades")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PuntajesActividades.findAll", query = "SELECT p FROM PuntajesActividades p"),
    @NamedQuery(name = "PuntajesActividades.findById", query = "SELECT p FROM PuntajesActividades p WHERE p.id = :id"),
    @NamedQuery(name = "PuntajesActividades.findByFechaRealizacion", query = "SELECT p FROM PuntajesActividades p WHERE p.fechaRealizacion = :fechaRealizacion"),
    @NamedQuery(name = "PuntajesActividades.findByPuntaje", query = "SELECT p FROM PuntajesActividades p WHERE p.puntaje = :puntaje")})
public class PuntajesActividades implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_realizacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRealizacion;
    @Column(name = "puntaje")
    private Integer puntaje;
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuarios usuarioId;
    @JoinColumn(name = "categoria_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private CategoriaJuegos categoriaId;
    @JoinColumn(name = "juegos_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Juegos juegosId;

    public PuntajesActividades() {
    }

    public PuntajesActividades(Integer id) {
        this.id = id;
    }

    public PuntajesActividades(Integer id, Date fechaRealizacion) {
        this.id = id;
        this.fechaRealizacion = fechaRealizacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(Date fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public Integer getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Integer puntaje) {
        this.puntaje = puntaje;
    }

    public Usuarios getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Usuarios usuarioId) {
        this.usuarioId = usuarioId;
    }

    public CategoriaJuegos getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(CategoriaJuegos categoriaId) {
        this.categoriaId = categoriaId;
    }

    public Juegos getJuegosId() {
        return juegosId;
    }

    public void setJuegosId(Juegos juegosId) {
        this.juegosId = juegosId;
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
        if (!(object instanceof PuntajesActividades)) {
            return false;
        }
        PuntajesActividades other = (PuntajesActividades) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.funny_mind.entidades.PuntajesActividades[ id=" + id + " ]";
    }
    
}

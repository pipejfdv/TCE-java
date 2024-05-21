/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ultima2.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
    @NamedQuery(name = "PuntajesActividades.findByUsuarioId", query = "SELECT p FROM PuntajesActividades p WHERE p.usuarioId = :usuarioId"),
    @NamedQuery(name = "PuntajesActividades.findByJuegosId", query = "SELECT p FROM PuntajesActividades p WHERE p.juegosId = :juegosId"),
    @NamedQuery(name = "PuntajesActividades.findByCategoriaId", query = "SELECT p FROM PuntajesActividades p WHERE p.categoriaId = :categoriaId"),
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
    @Column(name = "usuario_id")
    private int usuarioId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "juegos_id")
    private int juegosId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "categoria_id")
    private int categoriaId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_realizacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRealizacion;
    @Column(name = "puntaje")
    private Integer puntaje;

    public PuntajesActividades() {
    }

    public PuntajesActividades(Integer id) {
        this.id = id;
    }

    public PuntajesActividades(Integer id, int usuarioId, int juegosId, int categoriaId, Date fechaRealizacion) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.juegosId = juegosId;
        this.categoriaId = categoriaId;
        this.fechaRealizacion = fechaRealizacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public int getJuegosId() {
        return juegosId;
    }

    public void setJuegosId(int juegosId) {
        this.juegosId = juegosId;
    }

    public int getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(int categoriaId) {
        this.categoriaId = categoriaId;
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
        return "com.mycompany.ultima2.entidades.PuntajesActividades[ id=" + id + " ]";
    }
    
}

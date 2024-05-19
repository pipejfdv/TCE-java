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
@Table(name = "sesiones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sesiones.findAll", query = "SELECT s FROM Sesiones s"),
    @NamedQuery(name = "Sesiones.findById", query = "SELECT s FROM Sesiones s WHERE s.id = :id"),
    @NamedQuery(name = "Sesiones.findByFechaSesion", query = "SELECT s FROM Sesiones s WHERE s.fechaSesion = :fechaSesion"),
    @NamedQuery(name = "Sesiones.findByDuracion", query = "SELECT s FROM Sesiones s WHERE s.duracion = :duracion")})
public class Sesiones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_sesion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSesion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "duracion")
    private int duracion;
    @JoinColumn(name = "avance_id", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Avance avanceId;
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuarios usuarioId;
    @JoinColumn(name = "perfil_terapeuta_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private PerfilTerapeuta perfilTerapeutaId;

    public Sesiones() {
    }

    public Sesiones(Integer id) {
        this.id = id;
    }

    public Sesiones(Integer id, Date fechaSesion, int duracion) {
        this.id = id;
        this.fechaSesion = fechaSesion;
        this.duracion = duracion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaSesion() {
        return fechaSesion;
    }

    public void setFechaSesion(Date fechaSesion) {
        this.fechaSesion = fechaSesion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Avance getAvanceId() {
        return avanceId;
    }

    public void setAvanceId(Avance avanceId) {
        this.avanceId = avanceId;
    }

    public Usuarios getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Usuarios usuarioId) {
        this.usuarioId = usuarioId;
    }

    public PerfilTerapeuta getPerfilTerapeutaId() {
        return perfilTerapeutaId;
    }

    public void setPerfilTerapeutaId(PerfilTerapeuta perfilTerapeutaId) {
        this.perfilTerapeutaId = perfilTerapeutaId;
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
        if (!(object instanceof Sesiones)) {
            return false;
        }
        Sesiones other = (Sesiones) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.funny_mind.entidades.Sesiones[ id=" + id + " ]";
    }
    
}

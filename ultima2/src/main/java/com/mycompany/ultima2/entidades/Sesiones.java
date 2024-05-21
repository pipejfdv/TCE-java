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
@Table(name = "sesiones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sesiones.findAll", query = "SELECT s FROM Sesiones s"),
    @NamedQuery(name = "Sesiones.findById", query = "SELECT s FROM Sesiones s WHERE s.id = :id"),
    @NamedQuery(name = "Sesiones.findByUsuarioId", query = "SELECT s FROM Sesiones s WHERE s.usuarioId = :usuarioId"),
    @NamedQuery(name = "Sesiones.findByPerfilTerapeutaId", query = "SELECT s FROM Sesiones s WHERE s.perfilTerapeutaId = :perfilTerapeutaId"),
    @NamedQuery(name = "Sesiones.findByFechaSesion", query = "SELECT s FROM Sesiones s WHERE s.fechaSesion = :fechaSesion"),
    @NamedQuery(name = "Sesiones.findByDuracion", query = "SELECT s FROM Sesiones s WHERE s.duracion = :duracion"),
    @NamedQuery(name = "Sesiones.findByAvanceId", query = "SELECT s FROM Sesiones s WHERE s.avanceId = :avanceId")})
public class Sesiones implements Serializable {

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
    @Column(name = "perfil_terapeuta_id")
    private int perfilTerapeutaId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_sesion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSesion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "duracion")
    private int duracion;
    @Column(name = "avance_id")
    private Integer avanceId;

    public Sesiones() {
    }

    public Sesiones(Integer id) {
        this.id = id;
    }

    public Sesiones(Integer id, int usuarioId, int perfilTerapeutaId, Date fechaSesion, int duracion) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.perfilTerapeutaId = perfilTerapeutaId;
        this.fechaSesion = fechaSesion;
        this.duracion = duracion;
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

    public int getPerfilTerapeutaId() {
        return perfilTerapeutaId;
    }

    public void setPerfilTerapeutaId(int perfilTerapeutaId) {
        this.perfilTerapeutaId = perfilTerapeutaId;
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

    public Integer getAvanceId() {
        return avanceId;
    }

    public void setAvanceId(Integer avanceId) {
        this.avanceId = avanceId;
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
        return "com.mycompany.ultima2.entidades.Sesiones[ id=" + id + " ]";
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.funny_mind_jsf.entidades;

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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
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
    @Lob
    @Size(max = 65535)
    @Column(name = "observaciones")
    private String observaciones;
    @JoinColumn(name = "paciente_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Pacientes pacienteId;
    @JoinColumn(name = "terapeuta_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Terapeutas terapeutaId;

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

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Pacientes getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(Pacientes pacienteId) {
        this.pacienteId = pacienteId;
    }

    public Terapeutas getTerapeutaId() {
        return terapeutaId;
    }

    public void setTerapeutaId(Terapeutas terapeutaId) {
        this.terapeutaId = terapeutaId;
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
        return "com.mycompany.funny_mind_jsf.entidades.Sesiones[ id=" + id + " ]";
    }
    
}

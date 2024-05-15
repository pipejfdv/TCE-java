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
@Table(name = "ejercicios_asignados")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EjerciciosAsignados.findAll", query = "SELECT e FROM EjerciciosAsignados e"),
    @NamedQuery(name = "EjerciciosAsignados.findById", query = "SELECT e FROM EjerciciosAsignados e WHERE e.id = :id"),
    @NamedQuery(name = "EjerciciosAsignados.findByFechaAsignacion", query = "SELECT e FROM EjerciciosAsignados e WHERE e.fechaAsignacion = :fechaAsignacion")})
public class EjerciciosAsignados implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_asignacion")
    @Temporal(TemporalType.DATE)
    private Date fechaAsignacion;
    @JoinColumn(name = "paciente_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Pacientes pacienteId;
    @JoinColumn(name = "ejercicio_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Ejercicios ejercicioId;

    public EjerciciosAsignados() {
    }

    public EjerciciosAsignados(Integer id) {
        this.id = id;
    }

    public EjerciciosAsignados(Integer id, Date fechaAsignacion) {
        this.id = id;
        this.fechaAsignacion = fechaAsignacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(Date fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    public Pacientes getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(Pacientes pacienteId) {
        this.pacienteId = pacienteId;
    }

    public Ejercicios getEjercicioId() {
        return ejercicioId;
    }

    public void setEjercicioId(Ejercicios ejercicioId) {
        this.ejercicioId = ejercicioId;
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
        if (!(object instanceof EjerciciosAsignados)) {
            return false;
        }
        EjerciciosAsignados other = (EjerciciosAsignados) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.funny_mind_jsf.entidades.EjerciciosAsignados[ id=" + id + " ]";
    }
    
}

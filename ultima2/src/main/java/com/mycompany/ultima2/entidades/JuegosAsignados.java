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
@Table(name = "juegos_asignados")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "JuegosAsignados.findAll", query = "SELECT j FROM JuegosAsignados j"),
    @NamedQuery(name = "JuegosAsignados.findById", query = "SELECT j FROM JuegosAsignados j WHERE j.id = :id"),
    @NamedQuery(name = "JuegosAsignados.findByJuegosId", query = "SELECT j FROM JuegosAsignados j WHERE j.juegosId = :juegosId"),
    @NamedQuery(name = "JuegosAsignados.findByFechaAsignacion", query = "SELECT j FROM JuegosAsignados j WHERE j.fechaAsignacion = :fechaAsignacion")})
public class JuegosAsignados implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "juegos_id")
    private int juegosId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_asignacion")
    @Temporal(TemporalType.DATE)
    private Date fechaAsignacion;

    public JuegosAsignados() {
    }

    public JuegosAsignados(Integer id) {
        this.id = id;
    }

    public JuegosAsignados(Integer id, int juegosId, Date fechaAsignacion) {
        this.id = id;
        this.juegosId = juegosId;
        this.fechaAsignacion = fechaAsignacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getJuegosId() {
        return juegosId;
    }

    public void setJuegosId(int juegosId) {
        this.juegosId = juegosId;
    }

    public Date getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(Date fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
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
        if (!(object instanceof JuegosAsignados)) {
            return false;
        }
        JuegosAsignados other = (JuegosAsignados) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ultima2.entidades.JuegosAsignados[ id=" + id + " ]";
    }
    
}

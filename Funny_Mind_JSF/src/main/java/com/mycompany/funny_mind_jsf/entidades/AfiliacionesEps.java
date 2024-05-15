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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Juamp
 */
@Entity
@Table(name = "afiliaciones_eps")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AfiliacionesEps.findAll", query = "SELECT a FROM AfiliacionesEps a"),
    @NamedQuery(name = "AfiliacionesEps.findById", query = "SELECT a FROM AfiliacionesEps a WHERE a.id = :id"),
    @NamedQuery(name = "AfiliacionesEps.findByEpsAfiliada", query = "SELECT a FROM AfiliacionesEps a WHERE a.epsAfiliada = :epsAfiliada"),
    @NamedQuery(name = "AfiliacionesEps.findByFechaAfiliacion", query = "SELECT a FROM AfiliacionesEps a WHERE a.fechaAfiliacion = :fechaAfiliacion"),
    @NamedQuery(name = "AfiliacionesEps.findByActivo", query = "SELECT a FROM AfiliacionesEps a WHERE a.activo = :activo"),
    @NamedQuery(name = "AfiliacionesEps.findByFechaRegistro", query = "SELECT a FROM AfiliacionesEps a WHERE a.fechaRegistro = :fechaRegistro")})
public class AfiliacionesEps implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "eps_afiliada")
    private String epsAfiliada;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_afiliacion")
    @Temporal(TemporalType.DATE)
    private Date fechaAfiliacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "activo")
    private short activo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @JoinColumn(name = "paciente_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Pacientes pacienteId;

    public AfiliacionesEps() {
    }

    public AfiliacionesEps(Integer id) {
        this.id = id;
    }

    public AfiliacionesEps(Integer id, String epsAfiliada, Date fechaAfiliacion, short activo, Date fechaRegistro) {
        this.id = id;
        this.epsAfiliada = epsAfiliada;
        this.fechaAfiliacion = fechaAfiliacion;
        this.activo = activo;
        this.fechaRegistro = fechaRegistro;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEpsAfiliada() {
        return epsAfiliada;
    }

    public void setEpsAfiliada(String epsAfiliada) {
        this.epsAfiliada = epsAfiliada;
    }

    public Date getFechaAfiliacion() {
        return fechaAfiliacion;
    }

    public void setFechaAfiliacion(Date fechaAfiliacion) {
        this.fechaAfiliacion = fechaAfiliacion;
    }

    public short getActivo() {
        return activo;
    }

    public void setActivo(short activo) {
        this.activo = activo;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Pacientes getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(Pacientes pacienteId) {
        this.pacienteId = pacienteId;
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
        if (!(object instanceof AfiliacionesEps)) {
            return false;
        }
        AfiliacionesEps other = (AfiliacionesEps) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.funny_mind_jsf.entidades.AfiliacionesEps[ id=" + id + " ]";
    }
    
}

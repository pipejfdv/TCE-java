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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "pacientes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pacientes.findAll", query = "SELECT p FROM Pacientes p"),
    @NamedQuery(name = "Pacientes.findById", query = "SELECT p FROM Pacientes p WHERE p.id = :id"),
    @NamedQuery(name = "Pacientes.findByFechaDiagnostico", query = "SELECT p FROM Pacientes p WHERE p.fechaDiagnostico = :fechaDiagnostico"),
    @NamedQuery(name = "Pacientes.findByTipoTrauma", query = "SELECT p FROM Pacientes p WHERE p.tipoTrauma = :tipoTrauma"),
    @NamedQuery(name = "Pacientes.findByFechaRegistro", query = "SELECT p FROM Pacientes p WHERE p.fechaRegistro = :fechaRegistro")})
public class Pacientes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_diagnostico")
    @Temporal(TemporalType.DATE)
    private Date fechaDiagnostico;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 37)
    @Column(name = "tipo_trauma")
    private String tipoTrauma;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pacienteId", fetch = FetchType.LAZY)
    private List<Sesiones> sesionesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pacienteId", fetch = FetchType.LAZY)
    private List<EjerciciosAsignados> ejerciciosAsignadosList;
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuarios usuarioId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pacienteId", fetch = FetchType.LAZY)
    private List<AfiliacionesEps> afiliacionesEpsList;

    public Pacientes() {
    }

    public Pacientes(Integer id) {
        this.id = id;
    }

    public Pacientes(Integer id, Date fechaDiagnostico, String tipoTrauma, Date fechaRegistro) {
        this.id = id;
        this.fechaDiagnostico = fechaDiagnostico;
        this.tipoTrauma = tipoTrauma;
        this.fechaRegistro = fechaRegistro;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaDiagnostico() {
        return fechaDiagnostico;
    }

    public void setFechaDiagnostico(Date fechaDiagnostico) {
        this.fechaDiagnostico = fechaDiagnostico;
    }

    public String getTipoTrauma() {
        return tipoTrauma;
    }

    public void setTipoTrauma(String tipoTrauma) {
        this.tipoTrauma = tipoTrauma;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @XmlTransient
    public List<Sesiones> getSesionesList() {
        return sesionesList;
    }

    public void setSesionesList(List<Sesiones> sesionesList) {
        this.sesionesList = sesionesList;
    }

    @XmlTransient
    public List<EjerciciosAsignados> getEjerciciosAsignadosList() {
        return ejerciciosAsignadosList;
    }

    public void setEjerciciosAsignadosList(List<EjerciciosAsignados> ejerciciosAsignadosList) {
        this.ejerciciosAsignadosList = ejerciciosAsignadosList;
    }

    public Usuarios getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Usuarios usuarioId) {
        this.usuarioId = usuarioId;
    }

    @XmlTransient
    public List<AfiliacionesEps> getAfiliacionesEpsList() {
        return afiliacionesEpsList;
    }

    public void setAfiliacionesEpsList(List<AfiliacionesEps> afiliacionesEpsList) {
        this.afiliacionesEpsList = afiliacionesEpsList;
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
        if (!(object instanceof Pacientes)) {
            return false;
        }
        Pacientes other = (Pacientes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.funny_mind_jsf.entidades.Pacientes[ id=" + id + " ]";
    }
    
}

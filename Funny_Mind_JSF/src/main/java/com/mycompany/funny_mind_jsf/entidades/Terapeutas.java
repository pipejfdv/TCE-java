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
@Table(name = "terapeutas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Terapeutas.findAll", query = "SELECT t FROM Terapeutas t"),
    @NamedQuery(name = "Terapeutas.findById", query = "SELECT t FROM Terapeutas t WHERE t.id = :id"),
    @NamedQuery(name = "Terapeutas.findByEspecialidad", query = "SELECT t FROM Terapeutas t WHERE t.especialidad = :especialidad"),
    @NamedQuery(name = "Terapeutas.findByFechaRegistro", query = "SELECT t FROM Terapeutas t WHERE t.fechaRegistro = :fechaRegistro")})
public class Terapeutas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "especialidad")
    private String especialidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "terapeutaId", fetch = FetchType.LAZY)
    private List<Sesiones> sesionesList;
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuarios usuarioId;

    public Terapeutas() {
    }

    public Terapeutas(Integer id) {
        this.id = id;
    }

    public Terapeutas(Integer id, String especialidad, Date fechaRegistro) {
        this.id = id;
        this.especialidad = especialidad;
        this.fechaRegistro = fechaRegistro;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
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

    public Usuarios getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Usuarios usuarioId) {
        this.usuarioId = usuarioId;
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
        if (!(object instanceof Terapeutas)) {
            return false;
        }
        Terapeutas other = (Terapeutas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.funny_mind_jsf.entidades.Terapeutas[ id=" + id + " ]";
    }
    
}

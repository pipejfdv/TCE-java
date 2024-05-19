/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.funny_mind.entidades;

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
@Table(name = "perfil_terapeuta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PerfilTerapeuta.findAll", query = "SELECT p FROM PerfilTerapeuta p"),
    @NamedQuery(name = "PerfilTerapeuta.findById", query = "SELECT p FROM PerfilTerapeuta p WHERE p.id = :id"),
    @NamedQuery(name = "PerfilTerapeuta.findByPrimerNombre", query = "SELECT p FROM PerfilTerapeuta p WHERE p.primerNombre = :primerNombre"),
    @NamedQuery(name = "PerfilTerapeuta.findBySegundoNombre", query = "SELECT p FROM PerfilTerapeuta p WHERE p.segundoNombre = :segundoNombre"),
    @NamedQuery(name = "PerfilTerapeuta.findByPrimerApellido", query = "SELECT p FROM PerfilTerapeuta p WHERE p.primerApellido = :primerApellido"),
    @NamedQuery(name = "PerfilTerapeuta.findBySegundoApellido", query = "SELECT p FROM PerfilTerapeuta p WHERE p.segundoApellido = :segundoApellido"),
    @NamedQuery(name = "PerfilTerapeuta.findByEspecialidadId", query = "SELECT p FROM PerfilTerapeuta p WHERE p.especialidadId = :especialidadId"),
    @NamedQuery(name = "PerfilTerapeuta.findByFechaNacimiento", query = "SELECT p FROM PerfilTerapeuta p WHERE p.fechaNacimiento = :fechaNacimiento"),
    @NamedQuery(name = "PerfilTerapeuta.findByCorreo", query = "SELECT p FROM PerfilTerapeuta p WHERE p.correo = :correo"),
    @NamedQuery(name = "PerfilTerapeuta.findByContrasena", query = "SELECT p FROM PerfilTerapeuta p WHERE p.contrasena = :contrasena"),
    @NamedQuery(name = "PerfilTerapeuta.findByFechaRegistro", query = "SELECT p FROM PerfilTerapeuta p WHERE p.fechaRegistro = :fechaRegistro")})
public class PerfilTerapeuta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "primer_nombre")
    private String primerNombre;
    @Size(max = 50)
    @Column(name = "segundo_nombre")
    private String segundoNombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "primer_apellido")
    private String primerApellido;
    @Size(max = 50)
    @Column(name = "segundo_apellido")
    private String segundoApellido;
    @Basic(optional = false)
    @NotNull
    @Column(name = "especialidad_id")
    private int especialidadId;
    @Column(name = "fecha_nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "correo")
    private String correo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "contrasena")
    private String contrasena;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "perfilTerapeutaId", fetch = FetchType.LAZY)
    private List<Sesiones> sesionesList;
    @JoinColumn(name = "genero_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Generos generoId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "terapeutaId", fetch = FetchType.LAZY)
    private List<Especialidad> especialidadList;

    public PerfilTerapeuta() {
    }

    public PerfilTerapeuta(Integer id) {
        this.id = id;
    }

    public PerfilTerapeuta(Integer id, String primerNombre, String primerApellido, int especialidadId, String correo, String contrasena, Date fechaRegistro) {
        this.id = id;
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.especialidadId = especialidadId;
        this.correo = correo;
        this.contrasena = contrasena;
        this.fechaRegistro = fechaRegistro;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public int getEspecialidadId() {
        return especialidadId;
    }

    public void setEspecialidadId(int especialidadId) {
        this.especialidadId = especialidadId;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
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

    public Generos getGeneroId() {
        return generoId;
    }

    public void setGeneroId(Generos generoId) {
        this.generoId = generoId;
    }

    @XmlTransient
    public List<Especialidad> getEspecialidadList() {
        return especialidadList;
    }

    public void setEspecialidadList(List<Especialidad> especialidadList) {
        this.especialidadList = especialidadList;
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
        if (!(object instanceof PerfilTerapeuta)) {
            return false;
        }
        PerfilTerapeuta other = (PerfilTerapeuta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.funny_mind.entidades.PerfilTerapeuta[ id=" + id + " ]";
    }
    
}

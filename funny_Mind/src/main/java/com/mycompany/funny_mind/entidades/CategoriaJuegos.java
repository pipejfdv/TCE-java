/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.funny_mind.entidades;

import java.io.Serializable;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Juamp
 */
@Entity
@Table(name = "categoria_juegos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CategoriaJuegos.findAll", query = "SELECT c FROM CategoriaJuegos c"),
    @NamedQuery(name = "CategoriaJuegos.findById", query = "SELECT c FROM CategoriaJuegos c WHERE c.id = :id"),
    @NamedQuery(name = "CategoriaJuegos.findByCategoria", query = "SELECT c FROM CategoriaJuegos c WHERE c.categoria = :categoria")})
public class CategoriaJuegos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 8)
    @Column(name = "categoria")
    private String categoria;
    @JoinColumn(name = "juegos_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Juegos juegosId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "categoriaId", fetch = FetchType.LAZY)
    private List<PuntajesActividades> puntajesActividadesList;

    public CategoriaJuegos() {
    }

    public CategoriaJuegos(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Juegos getJuegosId() {
        return juegosId;
    }

    public void setJuegosId(Juegos juegosId) {
        this.juegosId = juegosId;
    }

    @XmlTransient
    public List<PuntajesActividades> getPuntajesActividadesList() {
        return puntajesActividadesList;
    }

    public void setPuntajesActividadesList(List<PuntajesActividades> puntajesActividadesList) {
        this.puntajesActividadesList = puntajesActividadesList;
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
        if (!(object instanceof CategoriaJuegos)) {
            return false;
        }
        CategoriaJuegos other = (CategoriaJuegos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.funny_mind.entidades.CategoriaJuegos[ id=" + id + " ]";
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ultima2.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

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
    @NamedQuery(name = "CategoriaJuegos.findByCategoria", query = "SELECT c FROM CategoriaJuegos c WHERE c.categoria = :categoria"),
    @NamedQuery(name = "CategoriaJuegos.findByJuegosId", query = "SELECT c FROM CategoriaJuegos c WHERE c.juegosId = :juegosId")})
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "juegos_id")
    private int juegosId;

    public CategoriaJuegos() {
    }

    public CategoriaJuegos(Integer id) {
        this.id = id;
    }

    public CategoriaJuegos(Integer id, int juegosId) {
        this.id = id;
        this.juegosId = juegosId;
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

    public int getJuegosId() {
        return juegosId;
    }

    public void setJuegosId(int juegosId) {
        this.juegosId = juegosId;
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
        return "com.mycompany.ultima2.entidades.CategoriaJuegos[ id=" + id + " ]";
    }
    
}

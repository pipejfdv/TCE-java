/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.mycompany.ultima2.controlador;

import com.mycompany.ultima2.entidades.Generos;
import com.mycompany.ultima2.entidades.Usuarios;
import com.mycompany.ultima2.modelo.GenerosFacadeLocal;
import com.mycompany.ultima2.modelo.UsuariosFacadeLocal;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

/**
 *
 * @author Juamp
 */
@Named(value = "c_usuario")
@SessionScoped
public class c_usuario implements Serializable {

    Usuarios user = new Usuarios();
Generos sex = new Generos();
FacesContext Contexto;
FacesMessage mensaje;
@EJB
UsuariosFacadeLocal ufl;
@EJB
GenerosFacadeLocal sfl;
List<SelectItem> lista_Generos = new ArrayList<>();
    public c_usuario() {
    }

    public Usuarios getUser() {
        return user;
    }

    public void setUser(Usuarios user) {
        this.user = user;
    }

    public Generos getSex() {
        return sex;
    }

    public void setSex(Generos sex) {
        this.sex = sex;
    }

    public List<SelectItem> getLista_Generos() {
        try {
            for(Generos sexo : this.sfl.findAll()){
                SelectItem item = new SelectItem(sexo.getId(), sexo.getGenero());
                this.lista_Generos.add(item);
            }
            return this.lista_Generos;
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return null;
    }

    public void setLista_Generos(List<SelectItem> lista_Generos) {
        this.lista_Generos = lista_Generos;
    }
    
     public void crear_Usuario(){
        Contexto = FacesContext.getCurrentInstance();
        try {
            /*agregar genero*/
            
            this.user.setGeneroId(sex);
            
            this.ufl.create(user);
            
            mensaje = new FacesMessage(FacesMessage.SEVERITY_INFO, "Registro exitoso", "MSG_INFO");
        } catch (Exception e) {
            mensaje = new FacesMessage(FacesMessage.SEVERITY_ERROR, "No se completo el registro", "MSG_ERROR");
        }
        Contexto.addMessage(null, mensaje);
    }
    
     public List<Generos> lista(){
        try {
            return this.sfl.findAll();
        } catch (Exception e) {
        }
        return null;
    }
}

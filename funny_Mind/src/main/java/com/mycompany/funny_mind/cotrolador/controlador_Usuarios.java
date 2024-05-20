/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.mycompany.funny_mind.cotrolador;

import com.mycompany.funny_mind.entidades.Avance;
import com.mycompany.funny_mind.entidades.Generos;
import com.mycompany.funny_mind.entidades.PuntajesActividades;
import com.mycompany.funny_mind.entidades.Sesiones;
import com.mycompany.funny_mind.entidades.Usuarios;
import com.mycompany.funny_mind.modelo.AvanceFacadeLocal;
import com.mycompany.funny_mind.modelo.GenerosFacadeLocal;
import com.mycompany.funny_mind.modelo.PuntajesActividadesFacadeLocal;
import com.mycompany.funny_mind.modelo.SesionesFacadeLocal;
import com.mycompany.funny_mind.modelo.UsuariosFacadeLocal;
import com.sun.javafx.scene.control.skin.VirtualFlow.ArrayLinkedList;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

/**
 *
 * @author Juamp
 */
@Named(value = "controlador_Usuarios")
@Dependent
public class controlador_Usuarios {

/*entidades*/
Usuarios user = new Usuarios();
Generos sex = new Generos();
FacesContext Contexto;
FacesMessage mensaje;
@EJB
UsuariosFacadeLocal ufl;
@EJB
GenerosFacadeLocal sfl;
@EJB
AvanceFacadeLocal afl;
@EJB
SesionesFacadeLocal sesionesfl;
@EJB
PuntajesActividadesFacadeLocal pfl;
List<SelectItem> lista_Generos = new ArrayList<>();
    public controlador_Usuarios() {
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
            this.user.setPuntajesActividadesList(new ArrayList<PuntajesActividades>());
            this.user.setSesionesList(new ArrayLinkedList<Sesiones>());
            this.user.setAvanceList(new ArrayList<Avance>());
            this.user.setGeneroId(sex);
            this.user.setFechaRegistro(new Date());
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

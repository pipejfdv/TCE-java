/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.mycompany.funny_mind_jsf.controlador;

import com.mycompany.funny_mind_jsf.entidades.Usuarios;
import com.mycompany.funny_mind_jsf.modelo.UsuariosFacadeLocal;
import java.text.SimpleDateFormat;
import javafx.scene.control.Alert;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Juamp
 */
@Named(value = "controlar_Registro")
@Dependent
public class Controlar_Registro {

Usuarios user ;
@EJB
UsuariosFacadeLocal ufl;

    public Controlar_Registro() {
    }

    public Usuarios getUser() {
        return user;
    }

    public void setUser(Usuarios user) {
        this.user = user;
    }
    
    public void registro_Usuario(){
        user = new Usuarios();
        try {
            if(user.getNombre() == null || user.getApellido() == null || user.getFechaNacimiento() == null || user.getCorreo() == null || user.getContrasena()== null ){
                System.out.println("Faltan campos");
            }
        } catch (Exception e) {
            this.ufl.create(user);
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
            System.out.println("registrado");
            user = new Usuarios();
        }
    }


}

package com.FunnyMind.SpringFunyMind.config;

import com.FunnyMind.SpringFunyMind.Entitys.Usuarios;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;
//clase con "UsuarioDetails" con palabra reservada que implementa datos de "UserDetails"
public class UsuarioDetails implements UserDetails {
    //objeto de tipo "Usuarios" a "usuario"
    private Usuarios usuario;

    public UsuarioDetails(Usuarios usuario) {
        //al contructor se le asigna el objeto
        this.usuario = usuario;
    }

    @Override
    //Este método es público y devuelve una colección de objetos que implementan la interfaz GrantedAuthority.
    //Esta interfaz es utilizada por Spring Security para representar los roles y permisos de un usuario.
    public Collection<? extends GrantedAuthority> getAuthorities() {//Collection debido a que es un dato con diferentes tipos de datos
        //"singleto": Envuelve el SimpleGrantedAuthority en una colección inmutable que contiene un solo elemento.
        // Esto es necesario porque el método getAuthorities() debe devolver una colección de autoridades.
        return Collections.singleton(new SimpleGrantedAuthority(usuario.getRole().getRol()));//del usuario trae el rol
    }
    //trae del usuario la contraseña
    @Override
    public String getPassword() {
        return usuario.getContrasena();
    }
    //trae del usuario el correo - equivale al usuario
    @Override
    public String getUsername() {
        return usuario.getCorreo();
    }
    //Métodos de estado de la cuenta:
    // Estos métodos (isAccountNonExpired, isAccountNonLocked, isCredentialsNonExpired, isEnabled)
    // devuelven true para indicar que la cuenta del usuario está en buen estado.
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}

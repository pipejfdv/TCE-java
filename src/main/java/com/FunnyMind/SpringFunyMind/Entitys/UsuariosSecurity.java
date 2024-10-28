package com.FunnyMind.SpringFunyMind.Entitys;

import com.FunnyMind.SpringFunyMind.config.MapeoTipoUsuario;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;
import java.util.Optional;

@AllArgsConstructor
@NoArgsConstructor

public class UsuariosSecurity implements UserDetails {

    //toma la entidad de los usuarios
    private Usuarios usuario;

    public UsuariosSecurity(Optional<Usuarios> user) {
    }

    //devolver las autoridades y roles del usuario
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        String rol = MapeoTipoUsuario.mapRole(usuario.getRole());
        return Collections.singletonList(new SimpleGrantedAuthority(rol));
    }

    @Override
    public String getPassword() {
        //tomar la contraseña del usuairo
        return usuario.getContrasena();
    }

    @Override
    public String getUsername() {
        //tomar el usuario que es el correo
        return usuario.getCorreo();
    }


}

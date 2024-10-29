package com.FunnyMind.SpringFunyMind.Entitys;

import com.FunnyMind.SpringFunyMind.Config.TipoUsuarioRol;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class UsuariosSecurity implements UserDetails {
    //entidad usuario para usar sus componentes
    private Usuarios usuario;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        String rol = TipoUsuarioRol.tipoUsuarioRol(usuario.getId_rol());
        return Collections.singleton(new SimpleGrantedAuthority(rol));
    }

    @Override
    public String getPassword() {
        return usuario.getContrasena();
    }

    @Override
    public String getUsername() {
        return usuario.getCorreo();
    }
}

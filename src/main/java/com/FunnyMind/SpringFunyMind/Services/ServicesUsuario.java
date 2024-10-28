package com.FunnyMind.SpringFunyMind.Services;

import com.FunnyMind.SpringFunyMind.Entitys.Usuarios;
import com.FunnyMind.SpringFunyMind.Entitys.UsuariosSecurity;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ServicesUsuario implements UserDetailsService {
    @Autowired
    private com.FunnyMind.SpringFunyMind.Repository.MetodoUsuario metodoUsuario;

    //método para invocar todos los datos de los usuarios en una tabla, solo para (ADMIN & PSICOLOGO)
    public List<com.FunnyMind.SpringFunyMind.Entitys.Usuarios> listarUsuarios() {
        return metodoUsuario.findAll();
    }

    public Optional<com.FunnyMind.SpringFunyMind.Entitys.Usuarios> getUsuario(int id) {
        return metodoUsuario.findById(id);
    }

    //métodos que de los usuarios crear cuenta y actualizar datos
    public void crearActualizarUsuario(com.FunnyMind.SpringFunyMind.Entitys.Usuarios usuario) {
        metodoUsuario.save(usuario);
    }

    public void eliminarUsuario(int id) {
        //Es recomendable crear un registro de las personas que se van para tener feedback
        metodoUsuario.deleteById(id);
    }
    //-------------------metodos de UserDetails-------------------------


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Usuarios> user = metodoUsuario.findByCorreo(username);
        if (user == null) {
            throw new UsernameNotFoundException("Usuario no encontrado");
        }
        return new UsuariosSecurity(user);
    }
}

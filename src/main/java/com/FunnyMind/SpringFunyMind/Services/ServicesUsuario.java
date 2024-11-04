package com.FunnyMind.SpringFunyMind.Services;

import com.FunnyMind.SpringFunyMind.Entitys.Usuarios;
import com.FunnyMind.SpringFunyMind.Entitys.UsuariosSecurity;
import com.FunnyMind.SpringFunyMind.Repository.RepositoryUsuario;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ServicesUsuario implements UserDetailsService {
    @Autowired
    private RepositoryUsuario repositoryUsuario;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    //método para invocar todos los datos de los usuarios en una tabla, solo para (ADMIN & PSICOLOGO)
    public List<com.FunnyMind.SpringFunyMind.Entitys.Usuarios> listarUsuarios() {
        return repositoryUsuario.findAll();
    }

    public Optional<com.FunnyMind.SpringFunyMind.Entitys.Usuarios> getUsuario(int id) {
        return repositoryUsuario.findById(id);
    }

    //métodos que de los usuarios crear cuenta y actualizar datos
    public void crearActualizarUsuario(com.FunnyMind.SpringFunyMind.Entitys.Usuarios usuario) {
        String encriptacion = passwordEncoder.encode(usuario.getPassword());
        usuario.setPassword(encriptacion);
        repositoryUsuario.save(usuario);
    }

    public void eliminarUsuario(int id) {
        //Es recomendable crear un registro de las personas que se van para tener feedback
        repositoryUsuario.deleteById(id);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuarios usuario = repositoryUsuario.findByUsername(username);
        if (usuario == null) {
            throw new UsernameNotFoundException("Usuario no encontrado");
        }
        return new UsuariosSecurity(usuario);
    }
}

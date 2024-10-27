package com.FunnyMind.SpringFunyMind.Services;

import com.FunnyMind.SpringFunyMind.Entitys.Usuarios;
import com.FunnyMind.SpringFunyMind.config.UsuarioDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicesUsuario {
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

    //Acceso al usuario
    //"UserDetails" palabra reservada que maneja datos del usuario, al igual que "UsernameNotFoundException" que permite el manejo de la excepción
    public UserDetails AccesoUsuario(String correo) throws UsernameNotFoundException{
        //se crea un objeto de tipo "Usuarios"
        //maneja una consulta lambda para llamando el repositorio de usuario y bucar el correo, con ello trae el objeto o arroja la excepcion
        Usuarios usuario = metodoUsuario.findByEmail(correo).orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado con ese correo"));
        //retorna con la palabra reservada "UsuarioDetails" el objeto creado con sus detalles.
        //esto llama a la clase "UsuarioDetails" en config con su objeto.
        return new UsuarioDetails(usuario);
    }
}

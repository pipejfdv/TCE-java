package com.FunnyMind.SpringFunyMind.Controllers;

import com.FunnyMind.SpringFunyMind.Entitys.Usuarios;
import com.FunnyMind.SpringFunyMind.Services.ServicesGeneros;
import com.FunnyMind.SpringFunyMind.Services.ServicesUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControllerLogin {
    //importar servicios de usuario
    @Autowired
    private ServicesUsuario servicesUsuario;
    private ServicesGeneros servicesGeneros;
    @PostMapping("/registrar")
    public String registrar(@ModelAttribute("usuario") Usuarios usuario) {
        servicesUsuario.crearActualizarUsuario(usuario);
        return "interfazUsuarios/usuarios";
    }
}

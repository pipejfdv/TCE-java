package com.FunnyMind.SpringFunyMind.Controllers;

import com.FunnyMind.SpringFunyMind.Entitys.Usuarios;
import com.FunnyMind.SpringFunyMind.Services.ServicesGeneros;
import com.FunnyMind.SpringFunyMind.Services.ServicesUsuario;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControllerLogin {
    //importar servicios de usuario
    @Autowired
    private ServicesUsuario servicesUsuario;
    @Autowired
    private ServicesGeneros servicesGeneros;
    @PostMapping("/registrar")
    public String registrar(@Valid @ModelAttribute("usuario") Usuarios usuario, Errors errors, Model model) {
        if (errors.hasErrors()) {
            //permite cargar de nuevo la lista de generos
            model.addAttribute("generos", servicesGeneros.listaGeneros());
            return "logeo/login";
        }
        servicesUsuario.crearActualizarUsuario(usuario);
        return "interfazUsuarios/usuarios";
    }

    @PostMapping("/ingreso")
    public String ingresoUsuario(@Valid @ModelAttribute("usuario") Usuarios usuario, Errors errors) {
        if (errors.hasErrors()) {
            return "logeo/login";
        }
        return "interfazUsuarios/usuarios";
    }
}

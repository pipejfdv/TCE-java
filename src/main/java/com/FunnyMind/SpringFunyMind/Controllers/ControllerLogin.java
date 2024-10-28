package com.FunnyMind.SpringFunyMind.Controllers;

import com.FunnyMind.SpringFunyMind.Entitys.Usuarios;
import com.FunnyMind.SpringFunyMind.Services.ServicesGeneros;
import com.FunnyMind.SpringFunyMind.Services.ServicesUsuario;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Slf4j
@Controller
@RequestMapping("/v1")
@AllArgsConstructor
public class ControllerLogin {
    //importar servicios de usuario
    @Autowired
    private ServicesUsuario servicesUsuario;
    @Autowired
    private ServicesGeneros servicesGeneros;
    //controlador para regitrar a un usuario
    @PostMapping("/registrar")
    public String registrar(@Valid @ModelAttribute("usuario") Usuarios usuario, Errors errors, Model model) {
        if (errors.hasErrors()) {
            //permite cargar de nuevo la lista de generos
            model.addAttribute("generos", servicesGeneros.listaGeneros());
            return "logeo/login";
        }
        servicesUsuario.crearActualizarUsuario(usuario);
        log.info("REGISTRADO");
        return "interfazUsuarios/usuarios";
    }

    @GetMapping("/ingresoUsuario")
    //roles que tendran acceso para ingresar a la plataforma 'PACIENTE', 'MEDIC' Y 'ADMIN'
    //USER solo podra ingresar despues de cambiar su rol en la solicitud que llega al admin
    @PreAuthorize("hasAuthority('PACIENTE')or hasAuthority('MEDIC')or hasAuthority('ADMIN')")
    public String ingresoUsuario(@Valid @ModelAttribute("usuario") Usuarios usuario, Errors errors) {
        return "interfazUsuarios/usuarios";
    }
}

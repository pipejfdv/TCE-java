package com.FunnyMind.SpringFunyMind.Controllers;

import com.FunnyMind.SpringFunyMind.ApiTerapeutaNews.ApiMediastack;
import com.FunnyMind.SpringFunyMind.Entitys.ApiResponseNews;
import com.FunnyMind.SpringFunyMind.Entitys.Usuarios;
import com.FunnyMind.SpringFunyMind.Services.ServicesGeneros;
import com.FunnyMind.SpringFunyMind.Services.ServicesUsuario;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/v1/Plataforma")//rutas privadas
@RequiredArgsConstructor
public class ControllerPlataforma {
    @Autowired
    private ServicesUsuario servicesUsuario;
    @Autowired
    private ServicesGeneros servicesGeneros;

    @GetMapping("/home")
    @PreAuthorize("hasAuthority('PACIENTE') or hasAuthority('USUARIO')")
    public String home(Model model) {
        //esto retorna una lista y se debe sacar el elemento deseado "servicesUsuario.getUsuario();
        Optional<Usuarios> usuarioLogueado = servicesUsuario.getUsuario();
        //si esta presente el usuario logueado retorna sus elementos
        if (usuarioLogueado.isPresent()) {
            //se le asigna a la vista "datosUsuario" y se le extrae sus componentes
            model.addAttribute("datosUsuario", usuarioLogueado.get());
            //permite traer el valor de genero y asignarlo para mostrar al usuario
            model.addAttribute("genero", servicesGeneros.asignarGenero(usuarioLogueado.get()));
        }
        else {
            return "redirect:/login";
        }
        return "interfazUsuarios/usuarios";
    }
}

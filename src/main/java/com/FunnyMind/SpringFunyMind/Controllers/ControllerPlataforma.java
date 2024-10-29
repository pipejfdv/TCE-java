package com.FunnyMind.SpringFunyMind.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v1/Plataforma")//rutas privadas
@RequiredArgsConstructor
public class ControllerPlataforma {

    @GetMapping("/home")
    public String home() {
        return "interfazUsuarios/usuarios";
    }

    @GetMapping("/Admin")
    @PreAuthorize("hasAuthority('ADIMINISTRADOR') or hasAuthority('PACIENTE') or hasAuthority('TERAPEUTA')" )//Roles que pueden entrar
    public String plataformaAdmin() {
        return "interfazUsuarios/usuarios";
    }
}

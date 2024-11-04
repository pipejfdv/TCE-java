package com.FunnyMind.SpringFunyMind.Controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v1/PlataformaDoctor")
public class ControllerDoctores {
    @GetMapping("/home")
    @PreAuthorize("hasAuthority('TERAPEUTA')")
    public String homeDoctor() {
        return "interfazDoctores/doctores";
    }
}

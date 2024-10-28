package com.FunnyMind.SpringFunyMind.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v1/Medic")
@RequiredArgsConstructor
public class ControllerMedico {
    //controlador medico
    @GetMapping("/interfaz")
    public String interfazMedico() {
        return "interfaz de medicos";
    }
}

package com.FunnyMind.SpringFunyMind.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v1/paciente")
@RequiredArgsConstructor
public class ControllerPaciente {
    //Paciente
    @GetMapping("/interfaz")
    public String interfazPaciente() {
        return "interfaz de paciente";
    }
}

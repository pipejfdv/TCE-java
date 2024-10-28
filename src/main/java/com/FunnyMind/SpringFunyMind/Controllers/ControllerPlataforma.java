package com.FunnyMind.SpringFunyMind.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v1/Plataforma")
@RequiredArgsConstructor
public class ControllerPlataforma {
    //controler admin
    @GetMapping("/interfaz")
    public String interfazAdmin() {
        return "interfaz de administrador";
    }
}

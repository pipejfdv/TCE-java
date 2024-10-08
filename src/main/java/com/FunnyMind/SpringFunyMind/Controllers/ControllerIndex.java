package com.FunnyMind.SpringFunyMind.Controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j //(permite realizar log en la ejecución métodos)
public class ControllerIndex {
    @GetMapping("/")
    public String index() {
        log.info("modelo mvc");
        return "index";
    }

    @GetMapping("/logeo")
    public String login() {
        log.info("entrando login");
        return "login";
    }
}

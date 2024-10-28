package com.FunnyMind.SpringFunyMind.Controllers;

import com.FunnyMind.SpringFunyMind.Entitys.Usuarios;
import com.FunnyMind.SpringFunyMind.Services.ServicesGeneros;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j //(permite realizar log en la ejecución métodos)
@RequestMapping("/FunnyMind")
public class ControllerIndex {
    @Autowired
    private ServicesGeneros servicesgeneros;
    //pagina principal
    @GetMapping("/index")
    public String index() {
        log.info("modelo mvc");
        return "index";
    }
    //pagina de logeo redirección
    @GetMapping("/logeo")
    public String login(Model model) {
        log.info("entrando login");
        //crear objeto tipo usuario
        model.addAttribute("usuario", new Usuarios());
        //crear objeto de generos
        model.addAttribute("generos", servicesgeneros.listaGeneros());
        return "logeo/login";
    }
}

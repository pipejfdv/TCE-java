package com.FunnyMind.SpringFunyMind.Controllers;

import com.FunnyMind.SpringFunyMind.Entitys.ApiResponseNews;
import com.FunnyMind.SpringFunyMind.Services.ServicesApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/v1/PlataformaDoctor")
public class ControllerDoctores {
    @Autowired
    private ServicesApi servicesApi;

    @GetMapping("/home")
    @PreAuthorize("hasAuthority('TERAPEUTA')")
    public String homeDoctor() {
        return "interfazDoctores/doctores";
    }

    @GetMapping("/noticias")
    @PreAuthorize("hasAuthority('TERAPEUTA') or hasAuthority('ADMINISTRADOR')")
    public List<ApiResponseNews> noticiasDoctor() {
        return servicesApi.getObjetoApiResponseNews();
    }
}

package com.FunnyMind.SpringFunyMind.Controllers;

import com.FunnyMind.SpringFunyMind.Entitys.PuntajeActividades;
import com.FunnyMind.SpringFunyMind.Entitys.Usuarios;
import com.FunnyMind.SpringFunyMind.Services.ServicesPuntajeActividades;
import com.FunnyMind.SpringFunyMind.Services.ServicesUsuario;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.sql.Timestamp;
import java.util.Map;
import java.util.Optional;

@Controller
@RequestMapping("/v1/Plataforma/juegos")
@Slf4j
public class ControllerTorresHanoi {
    int identificador;
    @Autowired
    private ServicesPuntajeActividades servicesPuntajeActividades;
    @Autowired
    private ServicesUsuario servicesUsuario;

    @GetMapping("/torresHanoi/{id}")
    public String torresHanoi(@PathVariable int id, Model model) {
        Optional<Usuarios> usuario = servicesUsuario.getUsario(id);
        identificador = usuario.get().getId_usuario();
        return "Juegos/torreHanoi";
    }

    @PostMapping("/guardarPuntaje")
    //retornar consulta del json enviado de "torres2.js" el puntaje del jugador
    //Map se usa para el diccionario de clave y valor del tipo json y guardaro en "datos"
    public ResponseEntity<String> guardarPuntaje(@RequestBody Map<String,Integer> datos) {
        //definir variable que almacene el puntaje obtenido
        int puntaje = datos.get("puntaje");
        //fecha actual
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        //lista objetos de la entidada "PuntajeActividades" buscando por ID
        Optional<PuntajeActividades> registroExistente = servicesPuntajeActividades.puntajeActividadesUsuario(identificador);
        System.out.println(registroExistente.isPresent()+"registro existente");
        //condición que evalua el registro para no crear doble puntaje
        if(registroExistente.isPresent()) {
            PuntajeActividades puntajeActividades = registroExistente.get();//trae el registro existente con id
            if(puntajeActividades.getIdUsuario() == identificador) {
                puntajeActividades.setPuntaje_juego(puntajeActividades.getPuntaje_juego() + puntaje);//suma los puntajes del juego
                puntajeActividades.setFecha_realizacion(timestamp);//asigna la nueva fecha de juagado
                puntajeActividades.setPuntaje_categoria(puntajeActividades.getPuntaje_categoria() + puntaje);//suma los puntajes en la categoria
                servicesPuntajeActividades.actualizarPuntaje(puntajeActividades);//actualiza la entidad
            }

        }
        else {
            //crear el objeto entidad PuntajeActividades
            PuntajeActividades nuevoPuntaje = new PuntajeActividades(
                    0,//el constructor pide el id de puntaje, pero como se genera de manera automatica se usa el valor 0
                    identificador,//id del usuario obtenido al ingresar al juego
                    1,//identificador del juego
                    1,//categoria del juego
                    timestamp,//fecha actual
                    puntaje,//puntaje extraido del json
                    puntaje//valor del puntaje en la categoria de juegos
            );
            servicesPuntajeActividades.actualizarPuntaje(nuevoPuntaje);
        }
        return ResponseEntity.ok("puntaje guardado");
    }
}

package com.FunnyMind.SpringFunyMind.Services;

import com.FunnyMind.SpringFunyMind.Entitys.PuntajeActividades;
import com.FunnyMind.SpringFunyMind.Repository.MetodoPuntajeActividades;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicesPuntajeActividades {
    @Autowired
    private com.FunnyMind.SpringFunyMind.Repository.MetodoPuntajeActividades metodoPuntajeActividades;

    public List<com.FunnyMind.SpringFunyMind.Entitys.PuntajeActividades> listaPuntajeActividades(){
        return metodoPuntajeActividades.findAll();
    }

    public Optional<com.FunnyMind.SpringFunyMind.Entitys.PuntajeActividades> puntajeActividadesUsuario(int id){
        return metodoPuntajeActividades.findById(id);
    }

    public void actualizarPuntaje (com.FunnyMind.SpringFunyMind.Entitys.PuntajeActividades puntajeActividades){
        metodoPuntajeActividades.save(puntajeActividades);
    }

}

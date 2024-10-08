package com.FunnyMind.SpringFunyMind.Services;

import com.FunnyMind.SpringFunyMind.Entitys.JuegosAsignados;
import com.FunnyMind.SpringFunyMind.Repository.MetodoJuegosAsignados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicesJuegosAsignados {
    @Autowired
    private com.FunnyMind.SpringFunyMind.Repository.MetodoJuegosAsignados metodoJuegosAsignados;

    //Acceso a registro para los (PSICOLOGOS & ADMIN)
    public List<com.FunnyMind.SpringFunyMind.Entitys.JuegosAsignados> listaJuegosAsignados() {
        return metodoJuegosAsignados.findAll();
    }

    public Optional<com.FunnyMind.SpringFunyMind.Entitys.JuegosAsignados> juegosAsignadosUsuario(int id){
        return metodoJuegosAsignados.findById(id);
    }

    public void crearActualizarJuegoAsignado (com.FunnyMind.SpringFunyMind.Entitys.JuegosAsignados juegoAsignado){
        metodoJuegosAsignados.save(juegoAsignado);
    }
    //no se relaciona el método eliminar para perder registros
}

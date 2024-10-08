package com.FunnyMind.SpringFunyMind.Services;

import com.FunnyMind.SpringFunyMind.Entitys.Sesiones;
import com.FunnyMind.SpringFunyMind.Repository.MetodoSesiones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicesSesiones {
    @Autowired
    private com.FunnyMind.SpringFunyMind.Repository.MetodoSesiones metodoSesiones;

    private List<com.FunnyMind.SpringFunyMind.Entitys.Sesiones> sesionesList(){
        return metodoSesiones.findAll();
    }
    public Optional<com.FunnyMind.SpringFunyMind.Entitys.Sesiones> SesionesUsuario(int id){
        return metodoSesiones.findById(id);
    }
    public void crearActualizar(com.FunnyMind.SpringFunyMind.Entitys.Sesiones sesiones){
        metodoSesiones.save(sesiones);
    }
    public void eliminarSesion(int id){
        metodoSesiones.findById(id);
    }
}

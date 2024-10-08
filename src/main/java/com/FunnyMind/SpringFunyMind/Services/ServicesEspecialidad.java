package com.FunnyMind.SpringFunyMind.Services;

import com.FunnyMind.SpringFunyMind.Entitys.Especialidad;
import com.FunnyMind.SpringFunyMind.Repository.MetodoEspecialidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicesEspecialidad {
    @Autowired
    private com.FunnyMind.SpringFunyMind.Repository.MetodoEspecialidad metodoEspecialidad;

    //metodo para clasificar los medicos especialistas para (ADMIN)
    public List<com.FunnyMind.SpringFunyMind.Entitys.Especialidad> listaEspecialidad(){
        return metodoEspecialidad.findAll();
    }

    public void crearActualicarEspecialidad(Especialidad especialidad){
        metodoEspecialidad.save(especialidad);
    }
    public void eliminarEspecialidad(int id){
        metodoEspecialidad.deleteById(id);
    }
}

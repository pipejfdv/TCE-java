package com.FunnyMind.SpringFunyMind.Services;

import com.FunnyMind.SpringFunyMind.Entitys.Generos;
import com.FunnyMind.SpringFunyMind.Repository.MetodoGeneros;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicesGeneros {
    @Autowired
    private com.FunnyMind.SpringFunyMind.Repository.MetodoGeneros metodoGeneros;

    public List<com.FunnyMind.SpringFunyMind.Entitys.Generos> listaGeneros() {
        return metodoGeneros.findAll();
    }

    public void crearActualizarGeneros (Generos genero) {
        metodoGeneros.save(genero);
    }
    public void eliminarGeneros (int id) {
        metodoGeneros.deleteById(id);
    }
}

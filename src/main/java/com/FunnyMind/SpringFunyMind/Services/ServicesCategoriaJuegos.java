package com.FunnyMind.SpringFunyMind.Services;

import com.FunnyMind.SpringFunyMind.Entitys.CategoriaJuegos;
import com.FunnyMind.SpringFunyMind.Repository.MetodoCategoriaJuegos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicesCategoriaJuegos {
    @Autowired
    private com.FunnyMind.SpringFunyMind.Repository.MetodoCategoriaJuegos metodoCategoriaJuegos;

    public List<com.FunnyMind.SpringFunyMind.Entitys.CategoriaJuegos> categoriaJuegos() {
        return metodoCategoriaJuegos.findAll();
    }

    //crear categoria de juegos (ADMIN)
    public void crearActualizarJuegos (CategoriaJuegos categoriaJuegos) {
        metodoCategoriaJuegos.save(categoriaJuegos);
    }
    public void eliminarCategoriaJuegos (int id) {
        metodoCategoriaJuegos.deleteById(id);
    }
}

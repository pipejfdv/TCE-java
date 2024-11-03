package com.FunnyMind.SpringFunyMind.Services;

import com.FunnyMind.SpringFunyMind.Entitys.Generos;
import com.FunnyMind.SpringFunyMind.Repository.RepositoryGeneros;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServicesGeneros {
    //lista
    private List<Generos> generos;
    @Autowired
    private RepositoryGeneros repositoryGeneros;

    public List<com.FunnyMind.SpringFunyMind.Entitys.Generos> listaGeneros() {
        //variable que contiene la lista
        generos = new ArrayList<>(repositoryGeneros.findAll());
        return generos;
    }

    public void crearActualizarGeneros (Generos genero) {
        repositoryGeneros.save(genero);
    }
    public void eliminarGeneros (int id) {
        repositoryGeneros.deleteById(id);
    }
}

package com.FunnyMind.SpringFunyMind.Services;

import com.FunnyMind.SpringFunyMind.Repository.RepositoryPuntajeActividades;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicesPuntajeActividades {
    @Autowired
    private RepositoryPuntajeActividades repositoryPuntajeActividades;

    public List<com.FunnyMind.SpringFunyMind.Entitys.PuntajeActividades> listaPuntajeActividades(){
        return repositoryPuntajeActividades.findAll();
    }

    public Optional<com.FunnyMind.SpringFunyMind.Entitys.PuntajeActividades> puntajeActividadesUsuario(int idUsuario){
        return repositoryPuntajeActividades.findByIdUsuario(idUsuario);
    }

    public void actualizarPuntaje (com.FunnyMind.SpringFunyMind.Entitys.PuntajeActividades puntajeActividades){
        repositoryPuntajeActividades.save(puntajeActividades);
    }

}

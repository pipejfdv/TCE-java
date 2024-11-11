package com.FunnyMind.SpringFunyMind.Repository;

import com.FunnyMind.SpringFunyMind.Entitys.PuntajeActividades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RepositoryPuntajeActividades extends JpaRepository<com.FunnyMind.SpringFunyMind.Entitys.PuntajeActividades, Integer> {
    //permite busar el id del usuario para agregar puntaje
    Optional<PuntajeActividades> findByIdUsuario(int idUsuario);
}

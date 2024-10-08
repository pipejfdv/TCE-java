package com.FunnyMind.SpringFunyMind.Repository;

import com.FunnyMind.SpringFunyMind.Entitys.PuntajeActividades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetodoPuntajeActividades extends JpaRepository<com.FunnyMind.SpringFunyMind.Entitys.PuntajeActividades, Integer> {
}

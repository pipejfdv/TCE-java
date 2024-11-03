package com.FunnyMind.SpringFunyMind.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryPuntajeActividades extends JpaRepository<com.FunnyMind.SpringFunyMind.Entitys.PuntajeActividades, Integer> {
}

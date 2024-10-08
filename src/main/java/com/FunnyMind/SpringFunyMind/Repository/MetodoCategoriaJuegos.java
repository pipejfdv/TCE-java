package com.FunnyMind.SpringFunyMind.Repository;

import com.FunnyMind.SpringFunyMind.Entitys.CategoriaJuegos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetodoCategoriaJuegos extends JpaRepository<com.FunnyMind.SpringFunyMind.Entitys.CategoriaJuegos, Integer> {
}

package com.FunnyMind.SpringFunyMind.Repository;

import com.FunnyMind.SpringFunyMind.Entitys.Juegos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetodoJuegos extends JpaRepository<com.FunnyMind.SpringFunyMind.Entitys.Juegos, Integer> {
}

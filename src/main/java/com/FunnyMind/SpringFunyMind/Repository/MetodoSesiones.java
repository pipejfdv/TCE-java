package com.FunnyMind.SpringFunyMind.Repository;

import com.FunnyMind.SpringFunyMind.Entitys.Sesiones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetodoSesiones extends JpaRepository<com.FunnyMind.SpringFunyMind.Entitys.Sesiones, Integer> {
}
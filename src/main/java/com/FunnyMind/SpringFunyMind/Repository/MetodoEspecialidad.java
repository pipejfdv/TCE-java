package com.FunnyMind.SpringFunyMind.Repository;

import com.FunnyMind.SpringFunyMind.Entitys.Especialidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetodoEspecialidad extends JpaRepository<com.FunnyMind.SpringFunyMind.Entitys.Especialidad, Integer> {
}

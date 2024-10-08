package com.FunnyMind.SpringFunyMind.Repository;

import com.FunnyMind.SpringFunyMind.Entitys.JuegosAsignados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetodoJuegosAsignados extends JpaRepository<com.FunnyMind.SpringFunyMind.Entitys.JuegosAsignados, Integer> {
}

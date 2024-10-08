package com.FunnyMind.SpringFunyMind.Repository;

import com.FunnyMind.SpringFunyMind.Entitys.Generos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetodoGeneros extends JpaRepository<com.FunnyMind.SpringFunyMind.Entitys.Generos, Integer> {
}

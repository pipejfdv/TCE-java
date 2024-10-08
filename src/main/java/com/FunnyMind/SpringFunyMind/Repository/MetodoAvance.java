package com.FunnyMind.SpringFunyMind.Repository;

import com.FunnyMind.SpringFunyMind.Entitys.Avance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetodoAvance extends JpaRepository<com.FunnyMind.SpringFunyMind.Entitys.Avance, Integer> {
}

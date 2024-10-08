package com.FunnyMind.SpringFunyMind.Entitys;

import jakarta.persistence.*;
import lombok.Data;

import java.security.Timestamp;

@Entity
@Data
@Table(name = "puntajes_actividades")
public class PuntajeActividades {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_puntaje;
    private int id_usuario;
    private int id_juego;
    private int id_categoria;
    @Column(name = "fecha_realizacion", nullable = false, updatable = false)
    private Timestamp fecha_realización;
    private int puntaje_juego;
    private int puntaje_categoria;
}

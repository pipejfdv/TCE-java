package com.FunnyMind.SpringFunyMind.Entitys;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "puntajes_actividades")
public class PuntajeActividades {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPuntaje;
    private int idUsuario;
    private int idJuego;
    private int idCategoria;
    @Column(name = "fecha_realizacion", nullable = false, updatable = false)
    private Timestamp fecha_realizacion;
    private int puntaje_juego;
    private int puntaje_categoria;
}

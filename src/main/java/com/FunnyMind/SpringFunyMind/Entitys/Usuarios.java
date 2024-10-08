package com.FunnyMind.SpringFunyMind.Entitys;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDate;

//evita métodos get & set
@Data
//Es una clase entidad de tabla usuarios
@Entity
//nombre de la tabla a la que hace referencia
@Table(name = "usuarios")
public class Usuarios {
    //mantener la compatibilidad con los elementos del remitente y receptor
    private static final long serialVersionUID = 1L;

    //datos de la tabla
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_usuario;
    @NotBlank
    private String primer_nombre;
    private String segundo_nombre;
    @NotBlank
    private String primer_apellido;
    private String segundo_apellido;
    @NotBlank
    private LocalDate fecha_nacimiento;
    private int genero_id;
    //valor por defecto de usuario en su registro
    private int id_rol = 1;
    private String correo;
    private String contrasena;
    @Column(name = "fecha_registro", nullable = false, updatable = false)
    private Timestamp fecha_registro;
    //valor por defecto de usuario en su registro
    private int id_especialidad = 1;
}

package com.FunnyMind.SpringFunyMind.Entitys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//objeto de las noticias, se realiza para tomar el objeto.
public class ApiResponseNews {
    private String titulo;
    private String descripcion;
    private String fuente;
    private String pais;
}

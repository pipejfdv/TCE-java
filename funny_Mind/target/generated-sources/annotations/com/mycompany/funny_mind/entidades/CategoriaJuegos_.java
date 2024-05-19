package com.mycompany.funny_mind.entidades;

import com.mycompany.funny_mind.entidades.Juegos;
import com.mycompany.funny_mind.entidades.PuntajesActividades;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-05-19T17:18:40")
@StaticMetamodel(CategoriaJuegos.class)
public class CategoriaJuegos_ { 

    public static volatile SingularAttribute<CategoriaJuegos, Juegos> juegosId;
    public static volatile ListAttribute<CategoriaJuegos, PuntajesActividades> puntajesActividadesList;
    public static volatile SingularAttribute<CategoriaJuegos, String> categoria;
    public static volatile SingularAttribute<CategoriaJuegos, Integer> id;

}
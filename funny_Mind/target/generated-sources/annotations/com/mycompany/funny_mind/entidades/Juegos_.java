package com.mycompany.funny_mind.entidades;

import com.mycompany.funny_mind.entidades.CategoriaJuegos;
import com.mycompany.funny_mind.entidades.JuegosAsignados;
import com.mycompany.funny_mind.entidades.PuntajesActividades;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-05-19T17:18:40")
@StaticMetamodel(Juegos.class)
public class Juegos_ { 

    public static volatile SingularAttribute<Juegos, String> descripcion;
    public static volatile SingularAttribute<Juegos, Date> fechaModificacion;
    public static volatile ListAttribute<Juegos, PuntajesActividades> puntajesActividadesList;
    public static volatile SingularAttribute<Juegos, Date> fechaCreacion;
    public static volatile ListAttribute<Juegos, CategoriaJuegos> categoriaJuegosList;
    public static volatile SingularAttribute<Juegos, Integer> id;
    public static volatile ListAttribute<Juegos, JuegosAsignados> juegosAsignadosList;
    public static volatile SingularAttribute<Juegos, String> nombre;

}
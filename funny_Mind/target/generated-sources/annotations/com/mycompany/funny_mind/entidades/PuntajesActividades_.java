package com.mycompany.funny_mind.entidades;

import com.mycompany.funny_mind.entidades.CategoriaJuegos;
import com.mycompany.funny_mind.entidades.Juegos;
import com.mycompany.funny_mind.entidades.Usuarios;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-05-20T18:58:31")
@StaticMetamodel(PuntajesActividades.class)
public class PuntajesActividades_ { 

    public static volatile SingularAttribute<PuntajesActividades, Juegos> juegosId;
    public static volatile SingularAttribute<PuntajesActividades, Date> fechaRealizacion;
    public static volatile SingularAttribute<PuntajesActividades, Integer> puntaje;
    public static volatile SingularAttribute<PuntajesActividades, Integer> id;
    public static volatile SingularAttribute<PuntajesActividades, Usuarios> usuarioId;
    public static volatile SingularAttribute<PuntajesActividades, CategoriaJuegos> categoriaId;

}
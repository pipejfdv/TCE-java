package com.mycompany.funny_mind.entidades;

import com.mycompany.funny_mind.entidades.Sesiones;
import com.mycompany.funny_mind.entidades.Usuarios;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-05-19T18:42:16")
@StaticMetamodel(Avance.class)
public class Avance_ { 

    public static volatile SingularAttribute<Avance, String> descripcion;
    public static volatile ListAttribute<Avance, Sesiones> sesionesList;
    public static volatile SingularAttribute<Avance, Integer> id;
    public static volatile SingularAttribute<Avance, Usuarios> usuarioId;

}
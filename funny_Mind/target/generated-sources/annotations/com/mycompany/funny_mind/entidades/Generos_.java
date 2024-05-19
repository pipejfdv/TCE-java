package com.mycompany.funny_mind.entidades;

import com.mycompany.funny_mind.entidades.PerfilTerapeuta;
import com.mycompany.funny_mind.entidades.Usuarios;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-05-19T17:18:40")
@StaticMetamodel(Generos.class)
public class Generos_ { 

    public static volatile ListAttribute<Generos, Usuarios> usuariosList;
    public static volatile ListAttribute<Generos, PerfilTerapeuta> perfilTerapeutaList;
    public static volatile SingularAttribute<Generos, String> genero;
    public static volatile SingularAttribute<Generos, Integer> id;

}
package com.mycompany.funny_mind.entidades;

import com.mycompany.funny_mind.entidades.Avance;
import com.mycompany.funny_mind.entidades.PerfilTerapeuta;
import com.mycompany.funny_mind.entidades.Usuarios;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-05-19T18:42:16")
@StaticMetamodel(Sesiones.class)
public class Sesiones_ { 

    public static volatile SingularAttribute<Sesiones, PerfilTerapeuta> perfilTerapeutaId;
    public static volatile SingularAttribute<Sesiones, Date> fechaSesion;
    public static volatile SingularAttribute<Sesiones, Integer> duracion;
    public static volatile SingularAttribute<Sesiones, Integer> id;
    public static volatile SingularAttribute<Sesiones, Avance> avanceId;
    public static volatile SingularAttribute<Sesiones, Usuarios> usuarioId;

}
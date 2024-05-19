package com.mycompany.funny_mind.entidades;

import com.mycompany.funny_mind.entidades.Especialidad;
import com.mycompany.funny_mind.entidades.Generos;
import com.mycompany.funny_mind.entidades.Sesiones;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-05-19T17:18:40")
@StaticMetamodel(PerfilTerapeuta.class)
public class PerfilTerapeuta_ { 

    public static volatile SingularAttribute<PerfilTerapeuta, String> segundoNombre;
    public static volatile SingularAttribute<PerfilTerapeuta, String> primerNombre;
    public static volatile SingularAttribute<PerfilTerapeuta, String> primerApellido;
    public static volatile SingularAttribute<PerfilTerapeuta, Date> fechaNacimiento;
    public static volatile SingularAttribute<PerfilTerapeuta, Generos> generoId;
    public static volatile SingularAttribute<PerfilTerapeuta, Date> fechaRegistro;
    public static volatile SingularAttribute<PerfilTerapeuta, String> segundoApellido;
    public static volatile ListAttribute<PerfilTerapeuta, Sesiones> sesionesList;
    public static volatile ListAttribute<PerfilTerapeuta, Especialidad> especialidadList;
    public static volatile SingularAttribute<PerfilTerapeuta, String> correo;
    public static volatile SingularAttribute<PerfilTerapeuta, String> contrasena;
    public static volatile SingularAttribute<PerfilTerapeuta, Integer> id;
    public static volatile SingularAttribute<PerfilTerapeuta, Integer> especialidadId;

}
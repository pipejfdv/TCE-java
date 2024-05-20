package com.mycompany.funny_mind.entidades;

import com.mycompany.funny_mind.entidades.Avance;
import com.mycompany.funny_mind.entidades.Generos;
import com.mycompany.funny_mind.entidades.PuntajesActividades;
import com.mycompany.funny_mind.entidades.Sesiones;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-05-19T18:42:16")
@StaticMetamodel(Usuarios.class)
public class Usuarios_ { 

    public static volatile SingularAttribute<Usuarios, String> segundoNombre;
    public static volatile ListAttribute<Usuarios, Avance> avanceList;
    public static volatile SingularAttribute<Usuarios, String> primerNombre;
    public static volatile SingularAttribute<Usuarios, String> primerApellido;
    public static volatile SingularAttribute<Usuarios, Date> fechaNacimiento;
    public static volatile SingularAttribute<Usuarios, Generos> generoId;
    public static volatile SingularAttribute<Usuarios, Date> fechaRegistro;
    public static volatile SingularAttribute<Usuarios, String> segundoApellido;
    public static volatile ListAttribute<Usuarios, Sesiones> sesionesList;
    public static volatile ListAttribute<Usuarios, PuntajesActividades> puntajesActividadesList;
    public static volatile SingularAttribute<Usuarios, String> correo;
    public static volatile SingularAttribute<Usuarios, String> contrasena;
    public static volatile SingularAttribute<Usuarios, Integer> id;

}
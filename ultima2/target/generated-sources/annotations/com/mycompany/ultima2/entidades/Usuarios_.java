package com.mycompany.ultima2.entidades;

import com.mycompany.ultima2.entidades.Generos;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-05-21T19:26:50")
@StaticMetamodel(Usuarios.class)
public class Usuarios_ { 

    public static volatile SingularAttribute<Usuarios, String> segundoNombre;
    public static volatile SingularAttribute<Usuarios, String> primerNombre;
    public static volatile SingularAttribute<Usuarios, String> primerApellido;
    public static volatile SingularAttribute<Usuarios, Date> fechaNacimiento;
    public static volatile SingularAttribute<Usuarios, Generos> generoId;
    public static volatile SingularAttribute<Usuarios, String> correo;
    public static volatile SingularAttribute<Usuarios, String> segundoApellido;
    public static volatile SingularAttribute<Usuarios, String> contrasena;
    public static volatile SingularAttribute<Usuarios, Integer> id;

}
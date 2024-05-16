package com.mycompany.funny_mind_jsf.entidades;

import com.mycompany.funny_mind_jsf.entidades.Sesiones;
import com.mycompany.funny_mind_jsf.entidades.Usuarios;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-05-15T22:40:33")
=======
@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-05-15T21:28:44")
>>>>>>> c20c4daed00c58168dd3e88edbabe062ec2a7ad9
@StaticMetamodel(Terapeutas.class)
public class Terapeutas_ { 

    public static volatile SingularAttribute<Terapeutas, Date> fechaRegistro;
    public static volatile ListAttribute<Terapeutas, Sesiones> sesionesList;
    public static volatile SingularAttribute<Terapeutas, Integer> id;
    public static volatile SingularAttribute<Terapeutas, String> especialidad;
    public static volatile SingularAttribute<Terapeutas, Usuarios> usuarioId;

}
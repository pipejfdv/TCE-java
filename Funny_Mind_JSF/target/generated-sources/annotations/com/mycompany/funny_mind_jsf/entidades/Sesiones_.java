package com.mycompany.funny_mind_jsf.entidades;

import com.mycompany.funny_mind_jsf.entidades.Pacientes;
import com.mycompany.funny_mind_jsf.entidades.Terapeutas;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-05-15T22:40:33")
=======
@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-05-15T21:28:44")
>>>>>>> c20c4daed00c58168dd3e88edbabe062ec2a7ad9
@StaticMetamodel(Sesiones.class)
public class Sesiones_ { 

    public static volatile SingularAttribute<Sesiones, String> observaciones;
    public static volatile SingularAttribute<Sesiones, Terapeutas> terapeutaId;
    public static volatile SingularAttribute<Sesiones, Date> fechaSesion;
    public static volatile SingularAttribute<Sesiones, Integer> duracion;
    public static volatile SingularAttribute<Sesiones, Integer> id;
    public static volatile SingularAttribute<Sesiones, Pacientes> pacienteId;

}
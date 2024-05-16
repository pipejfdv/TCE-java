package com.mycompany.funny_mind_jsf.entidades;

import com.mycompany.funny_mind_jsf.entidades.AfiliacionesEps;
import com.mycompany.funny_mind_jsf.entidades.EjerciciosAsignados;
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
@StaticMetamodel(Pacientes.class)
public class Pacientes_ { 

    public static volatile SingularAttribute<Pacientes, String> tipoTrauma;
    public static volatile ListAttribute<Pacientes, EjerciciosAsignados> ejerciciosAsignadosList;
    public static volatile SingularAttribute<Pacientes, Date> fechaRegistro;
    public static volatile ListAttribute<Pacientes, Sesiones> sesionesList;
    public static volatile ListAttribute<Pacientes, AfiliacionesEps> afiliacionesEpsList;
    public static volatile SingularAttribute<Pacientes, Integer> id;
    public static volatile SingularAttribute<Pacientes, Date> fechaDiagnostico;
    public static volatile SingularAttribute<Pacientes, Usuarios> usuarioId;

}
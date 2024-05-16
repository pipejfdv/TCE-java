package com.mycompany.funny_mind_jsf.entidades;

import com.mycompany.funny_mind_jsf.entidades.Ejercicios;
import com.mycompany.funny_mind_jsf.entidades.Pacientes;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-05-15T20:20:43")
@StaticMetamodel(EjerciciosAsignados.class)
public class EjerciciosAsignados_ { 

    public static volatile SingularAttribute<EjerciciosAsignados, Date> fechaAsignacion;
    public static volatile SingularAttribute<EjerciciosAsignados, Integer> id;
    public static volatile SingularAttribute<EjerciciosAsignados, Pacientes> pacienteId;
    public static volatile SingularAttribute<EjerciciosAsignados, Ejercicios> ejercicioId;

}
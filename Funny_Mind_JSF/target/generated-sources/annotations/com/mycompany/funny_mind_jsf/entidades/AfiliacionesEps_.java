package com.mycompany.funny_mind_jsf.entidades;

import com.mycompany.funny_mind_jsf.entidades.Pacientes;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-05-14T22:51:50")
@StaticMetamodel(AfiliacionesEps.class)
public class AfiliacionesEps_ { 

    public static volatile SingularAttribute<AfiliacionesEps, String> epsAfiliada;
    public static volatile SingularAttribute<AfiliacionesEps, Date> fechaAfiliacion;
    public static volatile SingularAttribute<AfiliacionesEps, Date> fechaRegistro;
    public static volatile SingularAttribute<AfiliacionesEps, Integer> id;
    public static volatile SingularAttribute<AfiliacionesEps, Pacientes> pacienteId;
    public static volatile SingularAttribute<AfiliacionesEps, Short> activo;

}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.funny_mind_jsf.modelo;

import com.mycompany.funny_mind_jsf.entidades.Pacientes;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Juamp
 */
@Local
public interface PacientesFacadeLocal {

    void create(Pacientes pacientes);

    void edit(Pacientes pacientes);

    void remove(Pacientes pacientes);

    Pacientes find(Object id);

    List<Pacientes> findAll();

    List<Pacientes> findRange(int[] range);

    int count();
    
}

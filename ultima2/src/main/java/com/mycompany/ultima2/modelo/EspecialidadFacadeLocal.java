/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.ultima2.modelo;

import com.mycompany.ultima2.entidades.Especialidad;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Juamp
 */
@Local
public interface EspecialidadFacadeLocal {

    void create(Especialidad especialidad);

    void edit(Especialidad especialidad);

    void remove(Especialidad especialidad);

    Especialidad find(Object id);

    List<Especialidad> findAll();

    List<Especialidad> findRange(int[] range);

    int count();
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.funny_mind.modelo;

import com.mycompany.funny_mind.entidades.JuegosAsignados;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Juamp
 */
@Local
public interface JuegosAsignadosFacadeLocal {

    void create(JuegosAsignados juegosAsignados);

    void edit(JuegosAsignados juegosAsignados);

    void remove(JuegosAsignados juegosAsignados);

    JuegosAsignados find(Object id);

    List<JuegosAsignados> findAll();

    List<JuegosAsignados> findRange(int[] range);

    int count();
    
}

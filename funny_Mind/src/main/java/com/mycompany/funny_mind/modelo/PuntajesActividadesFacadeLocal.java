/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.funny_mind.modelo;

import com.mycompany.funny_mind.entidades.PuntajesActividades;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Juamp
 */
@Local
public interface PuntajesActividadesFacadeLocal {

    void create(PuntajesActividades puntajesActividades);

    void edit(PuntajesActividades puntajesActividades);

    void remove(PuntajesActividades puntajesActividades);

    PuntajesActividades find(Object id);

    List<PuntajesActividades> findAll();

    List<PuntajesActividades> findRange(int[] range);

    int count();
    
}

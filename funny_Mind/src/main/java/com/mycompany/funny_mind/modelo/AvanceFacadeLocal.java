/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.funny_mind.modelo;

import com.mycompany.funny_mind.entidades.Avance;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Juamp
 */
@Local
public interface AvanceFacadeLocal {

    void create(Avance avance);

    void edit(Avance avance);

    void remove(Avance avance);

    Avance find(Object id);

    List<Avance> findAll();

    List<Avance> findRange(int[] range);

    int count();
    
}

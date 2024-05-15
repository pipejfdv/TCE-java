/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.funny_mind_jsf.modelo;

import com.mycompany.funny_mind_jsf.entidades.Sesiones;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Juamp
 */
@Local
public interface SesionesFacadeLocal {

    void create(Sesiones sesiones);

    void edit(Sesiones sesiones);

    void remove(Sesiones sesiones);

    Sesiones find(Object id);

    List<Sesiones> findAll();

    List<Sesiones> findRange(int[] range);

    int count();
    
}

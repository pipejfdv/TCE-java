/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.funny_mind.modelo;

import com.mycompany.funny_mind.entidades.Generos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Juamp
 */
@Local
public interface GenerosFacadeLocal {

    void create(Generos generos);

    void edit(Generos generos);

    void remove(Generos generos);

    Generos find(Object id);

    List<Generos> findAll();

    List<Generos> findRange(int[] range);

    int count();
    
}

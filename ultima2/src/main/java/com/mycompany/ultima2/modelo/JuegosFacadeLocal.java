/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.ultima2.modelo;

import com.mycompany.ultima2.entidades.Juegos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Juamp
 */
@Local
public interface JuegosFacadeLocal {

    void create(Juegos juegos);

    void edit(Juegos juegos);

    void remove(Juegos juegos);

    Juegos find(Object id);

    List<Juegos> findAll();

    List<Juegos> findRange(int[] range);

    int count();
    
}

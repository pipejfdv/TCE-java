/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.funny_mind.modelo;

import com.mycompany.funny_mind.entidades.CategoriaJuegos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Juamp
 */
@Local
public interface CategoriaJuegosFacadeLocal {

    void create(CategoriaJuegos categoriaJuegos);

    void edit(CategoriaJuegos categoriaJuegos);

    void remove(CategoriaJuegos categoriaJuegos);

    CategoriaJuegos find(Object id);

    List<CategoriaJuegos> findAll();

    List<CategoriaJuegos> findRange(int[] range);

    int count();
    
}

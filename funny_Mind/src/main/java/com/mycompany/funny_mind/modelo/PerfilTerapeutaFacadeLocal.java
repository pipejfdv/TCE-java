/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.funny_mind.modelo;

import com.mycompany.funny_mind.entidades.PerfilTerapeuta;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Juamp
 */
@Local
public interface PerfilTerapeutaFacadeLocal {

    void create(PerfilTerapeuta perfilTerapeuta);

    void edit(PerfilTerapeuta perfilTerapeuta);

    void remove(PerfilTerapeuta perfilTerapeuta);

    PerfilTerapeuta find(Object id);

    List<PerfilTerapeuta> findAll();

    List<PerfilTerapeuta> findRange(int[] range);

    int count();
    
}

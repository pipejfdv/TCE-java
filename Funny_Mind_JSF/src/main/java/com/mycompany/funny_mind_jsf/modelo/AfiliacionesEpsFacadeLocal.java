/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.funny_mind_jsf.modelo;

import com.mycompany.funny_mind_jsf.entidades.AfiliacionesEps;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Juamp
 */
@Local
public interface AfiliacionesEpsFacadeLocal {

    void create(AfiliacionesEps afiliacionesEps);

    void edit(AfiliacionesEps afiliacionesEps);

    void remove(AfiliacionesEps afiliacionesEps);

    AfiliacionesEps find(Object id);

    List<AfiliacionesEps> findAll();

    List<AfiliacionesEps> findRange(int[] range);

    int count();
    
}

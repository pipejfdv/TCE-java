/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.funny_mind.modelo;

import com.mycompany.funny_mind.entidades.PerfilTerapeuta;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Juamp
 */
@Stateless
public class PerfilTerapeutaFacade extends AbstractFacade<PerfilTerapeuta> implements PerfilTerapeutaFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_funny_Mind_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PerfilTerapeutaFacade() {
        super(PerfilTerapeuta.class);
    }
    
}

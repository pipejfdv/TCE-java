/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ultima2.modelo;

import com.mycompany.ultima2.entidades.JuegosAsignados;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Juamp
 */
@Stateless
public class JuegosAsignadosFacade extends AbstractFacade<JuegosAsignados> implements JuegosAsignadosFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_ultima2_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public JuegosAsignadosFacade() {
        super(JuegosAsignados.class);
    }
    
}

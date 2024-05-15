/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.funny_mind_jsf.modelo;

import com.mycompany.funny_mind_jsf.entidades.AfiliacionesEps;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Juamp
 */
@Stateless
public class AfiliacionesEpsFacade extends AbstractFacade<AfiliacionesEps> implements AfiliacionesEpsFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_Funny_Mind_JSF_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AfiliacionesEpsFacade() {
        super(AfiliacionesEps.class);
    }
    
}

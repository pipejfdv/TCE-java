/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.funny_mind_jsf.modelo;

import com.mycompany.funny_mind_jsf.entidades.Pacientes;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Juamp
 */
@Stateless
public class PacientesFacade extends AbstractFacade<Pacientes> implements PacientesFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_Funny_Mind_JSF_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PacientesFacade() {
        super(Pacientes.class);
    }
    
}

package com.FunnyMind.SpringFunyMind.Services;

import com.FunnyMind.SpringFunyMind.Entitys.Roles;
import com.FunnyMind.SpringFunyMind.Repository.MetodoRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicesRoles {
    @Autowired
    private com.FunnyMind.SpringFunyMind.Repository.MetodoRoles metodoRoles;

    public List<com.FunnyMind.SpringFunyMind.Entitys.Roles> listaRoles() {
        return metodoRoles.findAll();
    }
    public Optional<com.FunnyMind.SpringFunyMind.Entitys.Roles> Rol(int id) {
        return metodoRoles.findById(id);
    }

    public void crearActualizar(com.FunnyMind.SpringFunyMind.Entitys.Roles roles) {
        metodoRoles.save(roles);
    }
    public void eliminarActualizar(int id) {
        metodoRoles.deleteById(id);
    }
}

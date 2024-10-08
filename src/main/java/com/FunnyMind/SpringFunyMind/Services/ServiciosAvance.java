package com.FunnyMind.SpringFunyMind.Services;

import com.FunnyMind.SpringFunyMind.Entitys.Avance;
import com.FunnyMind.SpringFunyMind.Repository.MetodoAvance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiciosAvance {
    @Autowired
    private com.FunnyMind.SpringFunyMind.Repository.MetodoAvance metodoAvanceavance;

    //método que solo estará habilitado para (ADMIN)
    public List<com.FunnyMind.SpringFunyMind.Entitys.Avance> RegistrosAvances() {
        return metodoAvanceavance.findAll();
    }
    //método que solo usuara cada (PSICOLOGO) en su cuenta propia
    public Optional<com.FunnyMind.SpringFunyMind.Entitys.Avance> RegistroAvance(int id) {
        return metodoAvanceavance.findById(id);
    }
    //método que tendran solo los (PSICOLOGO)
    public void crearActualizarAvance(com.FunnyMind.SpringFunyMind.Entitys.Avance avance) {
        metodoAvanceavance.save(avance);
    }
}

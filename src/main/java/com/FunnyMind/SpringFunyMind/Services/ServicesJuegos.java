package com.FunnyMind.SpringFunyMind.Services;

import com.FunnyMind.SpringFunyMind.Entitys.Juegos;
import com.FunnyMind.SpringFunyMind.Repository.MetodoJuegos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicesJuegos {
    @Autowired
    private com.FunnyMind.SpringFunyMind.Repository.MetodoJuegos metodoJuegos;

    public List<com.FunnyMind.SpringFunyMind.Entitys.Juegos> listaJuegos() {
        return metodoJuegos.findAll();
    }
    public void crearActualizarJuegos(Juegos juego) {
        metodoJuegos.save(juego);
    }
    public void eliminarJuegos(int id) {
        metodoJuegos.deleteById(id);
    }
}

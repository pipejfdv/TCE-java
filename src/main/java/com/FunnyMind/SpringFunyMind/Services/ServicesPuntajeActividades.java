package com.FunnyMind.SpringFunyMind.Services;

import com.FunnyMind.SpringFunyMind.Entitys.CategoriaJuegos;
import com.FunnyMind.SpringFunyMind.Entitys.Juegos;
import com.FunnyMind.SpringFunyMind.Entitys.PuntajeActividades;
import com.FunnyMind.SpringFunyMind.Repository.RepositoryCategoriaJuegos;
import com.FunnyMind.SpringFunyMind.Repository.RepositoryJuegos;
import com.FunnyMind.SpringFunyMind.Repository.RepositoryPuntajeActividades;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class ServicesPuntajeActividades {
    @Autowired
    private RepositoryPuntajeActividades repositoryPuntajeActividades;
    @Autowired
    private RepositoryJuegos repositoryJuegos;
    @Autowired
    private RepositoryCategoriaJuegos repositoryCategoriaJuegos;

    public List<com.FunnyMind.SpringFunyMind.Entitys.PuntajeActividades> listaPuntajeActividades(){
        return repositoryPuntajeActividades.findAll();
    }

    public Map<String, Object> datosEstadisticas(int identificador) {
        Optional<PuntajeActividades> puntaje = repositoryPuntajeActividades.findById_usuario(identificador);
        Map<String, Object> respuesta = new HashMap<>();

        if (puntaje.isPresent()) {
            Optional<Juegos> nombreJuego = repositoryJuegos.findByIdJuego(puntaje.get().getId_juego());

            respuesta.put("puntajeJuego", puntaje.get().getPuntaje_juego());
            respuesta.put("puntajeCategoria", puntaje.get().getPuntaje_categoria());

            if (nombreJuego.isPresent()) {
                Optional<CategoriaJuegos> categoriaJuegos = repositoryCategoriaJuegos.findByIdCategoriJuego(puntaje.get().getId_categoria());
                respuesta.put("nombreJuego", nombreJuego.get().getNombre());
                if (categoriaJuegos.isPresent()) {
                    respuesta.put("nombreCategori", categoriaJuegos.get().getCategoria());
                }
                else {
                    respuesta.put("nombreCategori", "");
                }
            } else {
                respuesta.put("nombreJuego", "Juego no encontrado"); // o algún valor por defecto
            }
        } else {
            respuesta.put("puntajeJuego", 0);
            respuesta.put("puntajeCategoria", 0); // o algún valor por defecto para la categoría
            respuesta.put("nombreJuego", "Usuario no encontrado"); // o algún valor por defecto
        }

        return respuesta;
    }



    //clasificación de juegos con su respectivo puntaje y categoria
    //"datos" - registro de datos del JSON que envia cada juego
    //"identificador" es el id de usuario recuperado cuando este entra al juego, lo cual permite identidificarlo
    public void guardarPuntaje(Map<String,Integer> datos, int identificador){
        //definir variable que almacene el puntaje obtenido
        int puntaje = datos.get("puntaje");
        //definir la categoria del juego
        int categoria = datos.get("categoria");
        //definir el id del juego
        int Idjuego = datos.get("IdJuego");
        //fecha actual
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        //lista objetos de la entidada "PuntajeActividades" buscando por ID del jugador y el juego
        Optional<PuntajeActividades> registroExistente = repositoryPuntajeActividades.findById_usuarioAndIdJuego(identificador, Idjuego);
        //condición que evalua el registro del usuario y ese juego existe
        if(registroExistente.isPresent()){
            //del registro existente se crea el objeto "registroPuntaje" de la entidad "PuntajeActividades"
            PuntajeActividades registroPuntaje = registroExistente.get();
            if (registroPuntaje.getId_categoria() == categoria){
                // Actualizar el puntaje del juego y de la categoría
                registroPuntaje.setPuntaje_juego(registroPuntaje.getPuntaje_juego() + puntaje);
                registroPuntaje.setPuntaje_categoria(registroPuntaje.getPuntaje_categoria() + puntaje);
                registroPuntaje.setFecha_realizacion(timestamp);
                repositoryPuntajeActividades.save(registroPuntaje);
            }
        }
        // Si no hay un registro para este juego específico pero la categoría es la misma
        else {
            Optional<PuntajeActividades> registroCategoriaExistente = repositoryPuntajeActividades.findById_usuarioAndId_Categoria(identificador, categoria);
            if(registroCategoriaExistente.isPresent()){
                PuntajeActividades puntajeCategoriaExistente = registroCategoriaExistente.get();
                // Crear un nuevo registro para el nuevo juego, sumando el puntaje en la categoría existente
                PuntajeActividades nuevoPuntaje = new PuntajeActividades(
                        0,
                        identificador,
                        categoria,
                        Idjuego,
                        timestamp,
                        puntaje,
                        puntajeCategoriaExistente.getPuntaje_categoria()+puntaje
                );
                repositoryPuntajeActividades.save(nuevoPuntaje);
            }
            // Si no hay ningún registro en la categoría, crear uno nuevo para la categoría y el juego
            else {
                PuntajeActividades nuevoPuntaje = new PuntajeActividades(
                        0,
                        identificador,
                        categoria,
                        Idjuego,
                        timestamp,
                        puntaje,
                        puntaje
                );
                repositoryPuntajeActividades.save(nuevoPuntaje);
            }
        }
    }

}

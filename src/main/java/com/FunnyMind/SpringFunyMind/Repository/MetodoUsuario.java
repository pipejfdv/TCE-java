package com.FunnyMind.SpringFunyMind.Repository;

import com.FunnyMind.SpringFunyMind.Entitys.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MetodoUsuario extends JpaRepository<com.FunnyMind.SpringFunyMind.Entitys.Usuarios, Integer> {
    //se podra agregar los otros métodos que requiera el usuario

    //se agrega este método en la interfaz para que traiga el correo del usuario para el logeo
    Optional<Usuarios> findByEmail(String email);
}

package com.FunnyMind.SpringFunyMind.config;
//esta clase fue hecha para que tome el valor de Id usuario y lo pase a String para Secutiry rol
public class MapeoTipoUsuario {
    public static String mapRole(int role) {
        switch (role) {
            case 1:
                return "ROLE_ADMIN";
            case 2:
                return "ROLE_PACIENTE";
            case 3:
                return "ROLE_MEDIC";
            default:
                return "ROLE_USER";
        }
    }
}

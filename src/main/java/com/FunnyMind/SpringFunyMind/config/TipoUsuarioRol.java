package com.FunnyMind.SpringFunyMind.Config;

public class TipoUsuarioRol {
    public static String tipoUsuarioRol(int role) {
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

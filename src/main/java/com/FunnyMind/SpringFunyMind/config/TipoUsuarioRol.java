package com.FunnyMind.SpringFunyMind.Config;
//Esta clase fue diseña para que identificar y asignar rol de acuerdo al id que tenga
public class TipoUsuarioRol {
    public static String tipoUsuarioRol(int role) {
        switch (role) {
            case 1:
                return "PACIENTE";
            case 2:
                return "ADIMINISTRADOR";
            case 3:
                return "TERAPEUTA";
            default:
                return "PACIENTE";
        }
    }
}

package com.FunnyMind.SpringFunyMind.Config;
//permite cambiar el id de rol a su string para Spring Security
public class TipoUsuarioRol {
    public static String tipoUsuarioRol(int role){
        switch(role){
            case 1:
                return "USUARIO";
                case 2:
                    return "PACIENTE";
                    case 3:
                        return "TERAPEUTA";
                        default:
                            return "ADIMINISTRADOR";
        }
    }
}

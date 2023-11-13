package com.mycompany.login.Logica;

import com.mycompany.login.Persistencia.ControladoraPers;
import java.util.ArrayList;
import java.util.List;

public class Controladora {

    ControladoraPers controlper = new ControladoraPers();

    public String EnviarMensaje(String user, String pass) {

        String mensaje = " ";

        List<Usuario> listaUser = controlper.TraerListaUsuarios();

        for (Usuario e : listaUser) {
         
            if (user.equalsIgnoreCase(e.getUsuario())) {
                if (e.getContraseña().equalsIgnoreCase(pass)) {
                    mensaje = "Se ingreso correctamente";
                    return mensaje;
                } else {
                    mensaje = "Contraseña incorrecta";
                    return mensaje;
                }
            } else {
                
                mensaje = "Usuario incorrecto";
                return mensaje;
            }
     
        }return mensaje;
        
    }

}

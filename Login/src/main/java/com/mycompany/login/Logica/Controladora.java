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
                    mensaje = e.getTipo();
                    return mensaje;
                } else {
                    mensaje = "Contraseña incorrecta";
                    return mensaje;
                }
            } else {
                
                mensaje = "Usuario incorrecto";
               
            }
     
        }return mensaje;
        
    }

    public List<Usuario> TraerUsuarios() {
        
        return controlper.TraerListaUsuarios();
        
    }


    public Usuario TraerUsuario(int num_user) {
       return controlper.TraerUsuario(num_user);
    }

    public void EditarUsuario(Usuario user, String usuario, String tipo) {
  
        user.setTipo(tipo);
        user.setUsuario(usuario);
        
        controlper.EditarUsuario(user);
        
    }

    public void EliminarUsuario(int num_user) {
    
        controlper.EliminarUser(num_user);
    }

}

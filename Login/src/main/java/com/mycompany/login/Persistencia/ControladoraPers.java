package com.mycompany.login.Persistencia;

import com.mycompany.login.Logica.Usuario;
import java.util.List;


public class ControladoraPers {

    UsuarioJpaController usuariojpa = new UsuarioJpaController();
    
    
    public List<Usuario> TraerListaUsuarios() {
  
       return usuariojpa.findUsuarioEntities();
    
    }
    
    
    
    
}

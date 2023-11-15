package com.mycompany.login.Persistencia;

import com.mycompany.login.Logica.Usuario;
import com.mycompany.login.Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPers {

    UsuarioJpaController usuariojpa = new UsuarioJpaController();
    
    
    public List<Usuario> TraerListaUsuarios() {
  
       return usuariojpa.findUsuarioEntities();
    
    }

    public void EditarUsuario(Usuario user) {
  
        try {
            usuariojpa.edit(user);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario TraerUsuario(int num_user) {
   
       return usuariojpa.findUsuario(num_user);
    }

    public void EliminarUser(int num_user) {
    
        try {
            usuariojpa.destroy(num_user);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPers.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
    
}

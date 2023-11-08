package com.mycompany.peluqueriacanina.Persistencia;

import com.mycompany.peluqueriacanina.Logica.Duenio;
import com.mycompany.peluqueriacanina.Logica.Mascota;
import com.mycompany.peluqueriacanina.Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    DuenioJpaController dueniojpa = new DuenioJpaController();
    MascotaJpaController mascotajpa = new MascotaJpaController();

    public void guardar(Mascota masco, Duenio duenio) {
   
        
        dueniojpa.create(duenio);
        mascotajpa.create(masco);
    
    }

    public List<Mascota> TraerDatos() {
   
        List<Mascota> listamasco = mascotajpa.findMascotaEntities();
        return listamasco;
        
    }

    public void borrarMascota(int num_cliente) {
        try {
            mascotajpa.destroy(num_cliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

    public void EditarMascota(Mascota masco) {
   
        try {
            mascotajpa.edit(masco);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

    public Duenio BuscarDuenio(int id_duenio) {
       return dueniojpa.findDuenio(id_duenio);
   }

    public Mascota TraerMascota(int num_cliente) {
        return mascotajpa.findMascota(num_cliente);
    }

    public void EditarDuenio(Duenio dueno) {
   
        try {
            dueniojpa.edit(dueno);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

  

   

   

  

   

   
        
    
    }

  

   

  
   

   

  

   
    
    
    
    


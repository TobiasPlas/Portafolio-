package com.mycompany.concesionariaautos.Persistencia;

import com.mycompany.concesionariaautos.Logica.Autos;
import com.mycompany.concesionariaautos.Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    AutosJpaController autojpa = new AutosJpaController();
    
    public void GuardarAuto(Autos auto) {
        
        autojpa.create(auto);
    }

    public List<Autos> TraerAutos() {
       
        return autojpa.findAutosEntities();
    }

    public Autos TraerAuto(int num) {
    
       return autojpa.findAutos(num);
    
    }


    public void EditarAuto(Autos auto) {
   
        try {
            autojpa.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void EliminarAuto(int num) {
        try {
            autojpa.destroy(num);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

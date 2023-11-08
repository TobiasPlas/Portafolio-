package com.mycompany.concesionariaautos.Persistencia;

import com.mycompany.concesionariaautos.Logica.Autos;
import java.util.List;

public class ControladoraPersistencia {

    AutosJpaController autojpa = new AutosJpaController();
    
    public void GuardarAuto(Autos auto) {
        
        autojpa.create(auto);
    }

    public List<Autos> TraerAutos() {
       
        return autojpa.findAutosEntities();
    }
    
}

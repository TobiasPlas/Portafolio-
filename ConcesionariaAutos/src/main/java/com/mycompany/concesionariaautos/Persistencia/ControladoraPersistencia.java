package com.mycompany.concesionariaautos.Persistencia;

import com.mycompany.concesionariaautos.Logica.Autos;

public class ControladoraPersistencia {

    AutosJpaController autojpa = new AutosJpaController();
    
    public void GuardarAuto(Autos auto) {
        
        autojpa.create(auto);
    }
    
}

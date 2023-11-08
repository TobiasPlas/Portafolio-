package com.mycompany.concesionariaautos.Logica;

import com.mycompany.concesionariaautos.Persistencia.ControladoraPersistencia;


public class Controladora {
    
        ControladoraPersistencia controlpers = new ControladoraPersistencia();

    public void GuardarDatos(String modelo, String marca, String color, String patente, String cantPuert, String estado, String km) {
   
        Autos auto = new Autos();
        
        auto.setCantPuerta(cantPuert);
        auto.setColor(color);
        auto.setEstado(estado);
        auto.setKm(km);
        auto.setMarca(marca);
        auto.setModelo(modelo);
        auto.setPatente(patente);
        
        controlpers.GuardarAuto(auto);
    }
    
}

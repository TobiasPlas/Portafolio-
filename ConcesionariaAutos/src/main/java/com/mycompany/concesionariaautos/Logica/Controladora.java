package com.mycompany.concesionariaautos.Logica;

import com.mycompany.concesionariaautos.Persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    
        ControladoraPersistencia controlpers = new ControladoraPersistencia();

    public void GuardarDatos(String modelo, String marca,String precio, String color, String patente, String cantPuert, String estado, String km) {
   
        Autos auto = new Autos();
        
        auto.setCantPuerta(cantPuert);
        auto.setColor(color);
        auto.setEstado(estado);
        auto.setKm(km);
        auto.setMarca(marca);
        auto.setModelo(modelo);
        auto.setPatente(patente);
        auto.setPrecio(precio);
        
        controlpers.GuardarAuto(auto);
    }

    public List<Autos> TraerAutos() {
        
        return controlpers.TraerAutos();
    
    }

    public Autos TraerAuto(int num) {
   
       return controlpers.TraerAuto(num);
    }

   

    public void EditarAuto(Autos auto,String modelo, String marca, String precio, String color, String patente, String cantPuert, String estado, String km) {
        
        
        auto.setCantPuerta(cantPuert);
        auto.setColor(color);
        auto.setEstado(estado);
        auto.setKm(km);
        auto.setMarca(marca);
        auto.setModelo(modelo);
        auto.setPatente(patente);
        auto.setPrecio(precio);
        
        controlpers.EditarAuto(auto);
    }

    public void EliminarAuto(int num) {
 
    controlpers.EliminarAuto(num);
    }

    
    
}

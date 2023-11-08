package com.mycompany.peluqueriacanina.Logica;

import com.mycompany.peluqueriacanina.Persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String color, String nombre, String nomduenio, String observacion, String raza, String telefono, String alergico, String atencion) {

        Duenio duenio = new Duenio();
        duenio.setNombre(nomduenio);
        duenio.setTelefono(telefono);

        Mascota masco = new Mascota();
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atencion);
        masco.setColor(color);
        masco.setDuenio(duenio);
        masco.setNombre(nombre);
        masco.setObservaciones(observacion);
        masco.setRaza(raza);

        controlPersis.guardar(masco, duenio);
    }

    public List<Mascota> TraerDatos() {
        List<Mascota> listamasco = controlPersis.TraerDatos();
        return listamasco;
    }

    public void borrarMascota(int num_cliente) {

        controlPersis.borrarMascota(num_cliente);
    }

    public Mascota TraerMacota(int num_cliente) {

        return controlPersis.TraerMascota(num_cliente);

    }

    public void EditarMascota(Mascota masco, String color, String nombre, String observacion, String raza, String alergico, String atencion, String nomduenio, String telefono) {
   
    masco.setAlergico(alergico);
    masco.setAtencion_especial(atencion);
    masco.setColor(color);
    masco.setNombre(nombre);
    masco.setObservaciones(observacion);
    masco.setRaza(raza);
    masco.getDuenio().setNombre(nombre);
    masco.getDuenio().setTelefono(telefono);
    
    
    
    Duenio dueno = this.BuscarDuenio(masco.getDuenio().getId_duenio());
        
    dueno.setNombre(nomduenio);
    dueno.setTelefono(telefono);
    
   this.EditarDuenio(dueno);
    
    
    controlPersis.EditarMascota(masco);
    }

    private Duenio BuscarDuenio(int id_duenio) {
   
    return  controlPersis.BuscarDuenio(id_duenio);
        
    }

    private void EditarDuenio(Duenio dueno) {
        controlPersis.EditarDuenio(dueno);
    }

    

   
  

}

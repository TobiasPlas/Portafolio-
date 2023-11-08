
package com.mycompany.peluqueriacanina.Logica;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Duenio implements Serializable {
    @Id
    @GeneratedValue(strategy =GenerationType.SEQUENCE)
    private int id_duenio;
    private String nombre;
    private String telefono;

    public Duenio() {
    }

    public Duenio(int id_duenio, String nombre, String telefono) {
        this.id_duenio = id_duenio;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getId_duenio() {
        return id_duenio;
    }

    public void setId_duenio(int id_duenio) {
        this.id_duenio = id_duenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
}

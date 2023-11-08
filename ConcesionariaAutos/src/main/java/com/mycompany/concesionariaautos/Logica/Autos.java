package com.mycompany.concesionariaautos.Logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Autos implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String modelo;
    private String marca;
    private String color;
    private String patente;
    private String cantPuerta;
    private String estado;
    private String km;
    private String precio;
    
    public Autos() {
    }

    public Autos(int id, String modelo, String marca, String color, String patente, String cantPuerta, String estado, String km, String precio) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.patente = patente;
        this.cantPuerta = cantPuerta;
        this.estado = estado;
        this.km = km;
        this.precio = precio;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

  
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getCantPuerta() {
        return cantPuerta;
    }

    public void setCantPuerta(String cantPuerta) {
        this.cantPuerta = cantPuerta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getKm() {
        return km;
    }

    public void setKm(String km) {
        this.km = km;
    }

  
    
    
}

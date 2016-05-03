/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.aerolineas;

/**
 *
 * @author kaajavi
 */
class Destino {
    private String lugar;
    private float precio;

    public Destino(String lugar, float precio) {
        this.lugar = lugar;
        this.precio = precio;
    }
        

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
}

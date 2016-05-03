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
public class Vuelo {
    private int numero; 
    private int asientosVendidos = 0;
    private int asientosDePrimera = 0;
    private Destino destino;

    public Vuelo(int numero, Destino destino) {
        this.numero = numero;
        this.destino = destino;
    }  

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAsientosVendidos() {
        return asientosVendidos;
    }

    public void setAsientosVendidos(int asientosVendidos) {
        this.asientosVendidos = asientosVendidos;
    }

    public int getAsientosDePrimera() {
        return asientosDePrimera;
    }

    public void setAsientosDePrimera(int asientosDePrimera) {
        this.asientosDePrimera = asientosDePrimera;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }
    
    
    
    public float getGanancia(){
        float ganancia = 0.0f;
            ganancia = this.destino.getPrecio() * asientosVendidos;
            ganancia = ganancia + this.destino.getPrecio() * getAsientosDePrimera() *  0.3f;        
        return ganancia;
    }
    
}

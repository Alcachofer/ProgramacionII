/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package holamundo2016;

/**
 *
 * @author kaajavi
 */
public class Alumno {
    private String nombre;
    private int edad;
    private int[] notas = new int[3];
    
    public void setNombre(String name){
        this.nombre = name; //Igual que en python: self.nombre = name        
    }
    
    public void setEdad(int age){
        this.edad = age;            
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public void setNota(int nota, int pos){
        this.notas[pos]=nota;        
    }
    
    public float getPromedio(){
        float aux=0.0f;
        int count = 0;
        for (int i=0; i<notas.length; i++){
            if (notas[i]>0){
                aux+=notas[i];
                count++;
            }
        }
        if (count>0){
            return aux/count;
        }else{
            return -1;
        }
    }
    
    public void saludar(){
        System.out.println("Hola, yo soy " + this.nombre + " y tengo " + this.edad + " años.");        
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultora;

/**
 *
 * @author kaajavi
 */
public class Persona {

    /**
     * ATRIBUTOS
     *
     */
    private String nombre = "";
    private String direccion = "";
    private int telefono = 0;
    private float sueldo = 0.0f;

    /**
     * METODO CONSTRUCTOR N° 1 No es necesario el paso de parámetros
     */
    public Persona() {

    }

    /**
     * METODO CONSTRUCTOR N° 2 Necesitamos construir completamente la persona.
     * Es indistinto si se usa uno u otro método.
     */
    public Persona(String nombre, String direccion, int telefono, float sueldo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.sueldo = sueldo;
    }

    /**
     * Métodos Seter y Getter Podemos usarlos o no.
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * Metodo toString() Nos permíte devolver un texto cuando ponemos el objeto
     * sin utilizar un método para mostrarlo.
     *
     * @return
     */
    @Override
    public String toString() {
        return "Seleccionada la persona " + this.nombre;
    }

}

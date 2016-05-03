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
public class Consultora {
    private Persona[] personas = new Persona[50];
    
    
    
    /**
     * Add Persona
     * Código para cargar la persona a la listas de personas.
     * @param persona - La persona a agregar en la lista
     * @return  true - Si se puede cargar la persona
     *          false - Si no se puede cargar la persona
     */
    public boolean addPersona(Persona persona){
        for (int i=0; i<personas.length; i++){
            if (personas[i]== null){
                personas[i] = persona;
                return true;
            }
        }
        return false;
    }
    /**
     * cantidadCargada()
     * Me sireve para saber cuantas personas están cargadas en el array.
     * Busca todas las posiciones del vector que sean distintas a "null"
     * @return la cantida de personas que tiene cargada
     */
    public int cantidadCargada(){
        int count = 0;
        for (int i=0; i<personas.length; i++){
            if (personas[i]!= null){
                count++;
            }
        }
        return count;
    }
    
    /**
     * findByNumber
     * Busca una persona con ese número de teléfono y la devuelve
     * @param numeroABuscar - 
     * @return Una Persona con ese telefono o NULL si no encuentra.
     */
    public Persona findByNumber(int numeroABuscar){
        for (int i=0; i<personas.length; i++){
            if (personas[i].getTelefono()==numeroABuscar){                
                return personas[i];
            }
        }
        return null;
    }
    
}

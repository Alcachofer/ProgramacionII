/*
 * Implementación de una clase para generar una calculadora
 */
package calc;

import leerteclado.LeerTeclado;
/**
 * Desarrollado para programación 2
 * @author Profes de Programación
 */
public class Calculadora {

    private int resultado = 0;
    
    /**
     * Método constructor
     */
    public Calculadora() {
    
    }

    /**
     * Retorna el resultado de una operación
     * @return
     */
    public int getResultado() {
        return resultado;
    }

    /**
     * Setea el resultado de la operación
     * @param resultado
     */
    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    
    
    
    
    /**
     * Método que suma dos operadores
     */
    public void suma() {
        System.out.println("Ingrese el primero operador");
        int op1 = Integer.parseInt(LeerTeclado.leerEntrada());
        System.out.println("Ingrese el segundo operador");
        int op2 = Integer.parseInt(LeerTeclado.leerEntrada());                
        resultado = op1 + op2;
        
    }

    /**
     * Método que resta dos operadores
     */
    public void resta() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /**
     * Método que multiplica dos operadores
     */
    public void multiplica() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /**
     * Método que divide dos operadores
     */
    public void divide() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    
}

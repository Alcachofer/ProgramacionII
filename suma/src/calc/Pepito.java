/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import java.util.regex.Pattern;
import leerteclado.LeerTeclado;

/**
 * Desarrollado para programación 2
 * @author Profes de Programación
 */
public class Pepito {

    private static String calculo = "";

    /**
     * Constructor de la clase principal.
     */
    public Pepito() {
        Calculadora calculadora = new Calculadora();

        System.out.println("Bienvenidos al sistema de calculadora");        
        System.out.println("Ingrese el cálculo que desea realizar");
        System.out.println("Para Sumar: s");
        System.out.println("Para Restar: r");
        System.out.println("Para Multiplicar: m");
        System.out.println("Para Dividir: d");
        calculo = LeerTeclado.leerEntrada();
        System.out.println(calculo);
        if (Pattern.matches("[srmd]", calculo)) {
            byte[] calc = calculo.getBytes();
            switch (calc[0]) {
                case 's':
                    calculo = "Suma";
                    calculadora.suma();
                    break;
                case 'r':
                    calculo = "Resta";
                    calculadora.resta();
                    break;
                case 'm':
                    calculo = "Multiplicación";
                    calculadora.multiplica();
                    break;
                case 'd':
                    calculo = "Divición";
                    calculadora.divide();
                    break;
            }

            System.out.println("La " + calculo + " tiene como resultado: " + calculadora.getResultado());
            
        } else {

            System.out.println("Usted ingreso algo diferente a lo pedido");
        }
    }

    /**
     * Método Runeable
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        new Pepito();

    }
}

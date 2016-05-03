package consultora;

import java.util.Scanner;

/**
 *
 * @author kaajavi
 */
public class Main {

    /**
     * Metodo main, este es el metodo que se ejecuta
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Creo un objeto de la clase consultora, la cual tiene el conjunto de personas.
        //Desde la consultora vamos a cargar empleados (Personas), vamos a buscar, listar, etc.
        Consultora consultora = new Consultora();
        //Operación del menú que voy a realizar. Utilizo =1 para que entre al while.
        int operacion = 1;
        System.out.println("Bienvenido al sistema de registro de personal");
        while (operacion != 0) {
            //Muestro menú
            System.out.println("¿Qué operación desea realizar?");
            System.out.println("\t 0 - Salir");
            System.out.println("\t 1 - Cargar Persona");
            System.out.println("\t 2 - Buscar Teléfono");
            System.out.println("\t 3 - Para Alumnos");
            operacion = entrada.nextInt();
            //Selección según operación
            switch (operacion) {
                //Salgo del sistema
                case 0:
                    System.out.println("Adiós!");
                    //Comando para cerrar el programa
                    System.exit(0);
                    break;
                //Cargamos una persona. Decimos si se cargó o no.
                case 1:
                    Persona aux1Persona = new Persona();
                    System.out.println("Ingrese el nombre de la " + (consultora.cantidadCargada()+1) + "° persona (Sin espacios)");
                    aux1Persona.setNombre(entrada.next());
                    System.out.println("Ingrese la dirección (Sin espacios)");
                    aux1Persona.setDireccion(entrada.next());
                    System.out.println("Ingrese el teléfono (Número entero)");
                    aux1Persona.setTelefono(entrada.nextInt());
                    System.out.println("Ingrese el sueldo (Número con decimales)");
                    aux1Persona.setSueldo(entrada.nextFloat());
                    if (consultora.addPersona(aux1Persona)){
                        System.out.println("Persona cargada con éxito");
                    }else{
                        System.out.println("Ya no se pueden cargar mas personas");
                    }
                    break;
                //Buscamos un teléfono
                case 2:
                    System.out.println("Digite el teléfono a buscar");
                    int tel = entrada.nextInt();
                    Persona aux2Persona= consultora.findByNumber(tel);
                    if (aux2Persona!=null){
                        System.out.println("La persona " + aux2Persona.getNombre() + "\n"
                                + "tiene el número de teléfono buscado.");
                    }else{
                        System.out.println("No existe ninguna persona con ese número de teléfono");
                    }
                    break;  
                //Sigan ustedes, ta todo echo.
                case 3:
                        System.out.println("Sigan ustedes el ejercicio");
                    break;
                default:
                        System.out.println("Error en el ingreso");
            }

        }
    }

}

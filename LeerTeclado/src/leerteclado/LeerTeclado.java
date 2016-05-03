
package leerteclado;

/**
 * Clase que implementa la lectura del teclados.
 * Desarrollado para programación 2
 * @author Profes de Programación
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Lee un String por el teclado y lo devuelve. La clase es muy sencilla, tiene
 * un método static <i>LeerTeclado()</i>, por lo que no necesita instanciar un
 * objeto.<P><H2>Ejemplo de uso</h2>
 * <pre>
 * System.out.println("Cual es su nombre?");
 * persona1.nombre=LeerTeclado.leerEntrada();
 * </pre>
 *
 * @throws En caso de exepciones, las captura y devuelve "Error + el error
 * capturado".
 */
public class LeerTeclado {

    /**
     * @return Devuelve un String con la cadena introducida por teclado.
     */
    public static String leerEntrada() {

        String salida = "";
        try {
// Definimos un flujo de caracteres de entrada: leerEntrada
            BufferedReader leerEntrada = new BufferedReader(new InputStreamReader(System.in));
// Leemos la entrada, finaliza al pulsar la tecla Entrar
            salida = leerEntrada.readLine();
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
        return salida; // Devuelve el dato tecleado
    }
        
}

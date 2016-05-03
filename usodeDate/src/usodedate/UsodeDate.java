/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package usodedate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kaajavi
 */
public class UsodeDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");
        try {
            cal.setTime(sdf.parse("45 00 1985"));
            System.out.println(cal.get(Calendar.DATE));
            System.out.println(cal.get(Calendar.MONTH));
            System.out.println(cal.get(Calendar.YEAR));
        } catch (ParseException ex) {
            System.out.println("ERROR");
        }
        
        Date fechaDehoy = new Date();
        System.out.println(fechaDehoy.toString());
        //a la fecha de hoy le cargo la fecha del viernes y la muestro en pantalla
        fechaDehoy.setDate(21);
        fechaDehoy.setMonth(5); //El mes -1, va de enero=0 a diciembre=11
        fechaDehoy.setYear(113);
        System.out.println(fechaDehoy);
        System.out.println("Listo!");
    }
}

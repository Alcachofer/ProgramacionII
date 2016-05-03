/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo2016;

import java.util.Scanner;

/**
 *
 * @author kaajavi
 */
public class HolaMundo2016 {

    public static void main(String[] args) {
        System.out.println("Inicializando la aplicación...");
        Scanner sc = new Scanner(System.in);
        Curso curso = new Curso();
        String salir = "no";
        do{
        Alumno a1 = new Alumno();
        System.out.println("Ingrese un alumno");
        a1.setNombre(sc.next());        
        System.out.println("Ingrese una nota o 'No' para saltear.");
        for (int i=0;i<3;i++){
            System.out.println("Ingrese la nota " + (i+1));
            String nota = sc.next();
            if (!nota.equals("No")){
                try{
                    a1.setNota(Integer.parseInt(nota),i);
                }
                catch (NumberFormatException e){
                    System.out.println("Ingrese una nota");
                    i--;
                }
            }
            
        }
        if (curso.addAlumno(a1)){
            System.out.println("Se guardo el alumno");
            System.out.println("Desea salir? 'no' para continuar.");
            salir=sc.next();
        }else{
            System.out.println("Está lleno el curso");
            salir="si";
        }
         }while(salir.equals("no"));
        
        curso.mostrarPromedios();
        
        
    }

}

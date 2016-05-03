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
public class Curso {
    private Alumno[] alumnos = new Alumno[2];

    public Curso() {
    }
    
    public boolean addAlumno(Alumno a){
        for (int i=0; i<alumnos.length; i++){
            if (alumnos[i]==null){
                alumnos[i]=a;
                return true;
            }
        }
        return false;
        
    }
    
    public void mostrarPromedios(){
        for (int i=0; i<alumnos.length; i++){
            if (alumnos[i]!=null){                
                System.out.println("El promedio del alumno N° " + i + " es " + alumnos[i].getPromedio());
            }
        }
    }
}

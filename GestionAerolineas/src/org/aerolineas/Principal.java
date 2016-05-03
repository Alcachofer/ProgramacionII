/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.aerolineas;

import java.util.Scanner;

/**
 *
 * @author kaajavi
 */
public class Principal {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        Destino argentina = new Destino("Argentina", 300f);
        Destino america = new Destino("America", 2000f);
        Destino europa = new Destino("Europa", 6000f);
        
        System.out.println("Ingrese la cantidad de vuelos");
        int n_vuelos = teclado.nextInt();
        Vuelo[] vuelos = new Vuelo[n_vuelos];
        int i;
        for (i=0;i<vuelos.length;i++ ){
            System.out.println("Ingrese el " + (i+1) + "° vuelo");
            System.out.println("Ingrese el número de vuelo");
            int num_vuelo = teclado.nextInt();
            System.out.println("Ingrese el número asientos vendidos");
            int num_asientos = teclado.nextInt();
            System.out.println("Ingrese la cantidad vendida de asientos de primera");
            int num_asientos_primera = teclado.nextInt();
            System.out.println("Ingrese el destino:\n"
                    + "\t Argentina -> 0\n"
                    + "\t America -> 1\n"
                    + "\t Europa -> 2\n"
            );
            int num_des = teclado.nextInt();
            Destino aux=null;
            if (num_des==0){
                aux=argentina;
            }else if(num_des==1){
                aux=america;
            }else if (num_des == 2){
                aux=europa;
            }
            
            vuelos[i] = new Vuelo(num_vuelo, aux);
            vuelos[i].setAsientosVendidos(num_asientos);
            vuelos[i].setAsientosDePrimera(num_asientos_primera);
            System.out.println("La ganacia es: $" + vuelos[i].getGanancia());
        }
        float ganancia = 0.0f;
        for (i=0;i<vuelos.length;i++ ){
            ganancia = ganancia + vuelos[i].getGanancia();
        }
        System.out.println("Ganancia total de la compañia es: $" + ganancia);
        
        boolean existe = false;
        for (i=0;i<vuelos.length;i++ ){
            if (vuelos[i].getNumero()==1507){
                existe = true;
            }
        }
        if (existe) {
            System.out.println("Existe el vuelo");
        }else{
            System.out.println("NO Existe el vuelo");
        }
        
        
    }             
    
}

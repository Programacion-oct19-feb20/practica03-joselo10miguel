/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios03;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Ejercicios06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in); // un objeto tipo Scanner
        String nombre;
        String univercidad;
        System.out.println("Ingrese su nombre por favor:");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su univercidad");
        univercidad = entrada.nextLine();
        
        System.out.println("Mi nombre es\n\t"+ nombre +"\n" +
                "Mi univercidad es\n\t" + univercidad);
        
    }
    
}

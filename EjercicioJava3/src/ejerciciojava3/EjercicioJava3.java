/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciojava3;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EjercicioJava3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        String phrase;
        String Mayus;
        String Min;
      
        System.out.println("Escriba una ffrase cualquiera");
        phrase = Scan.nextLine();
        Mayus = phrase.toUpperCase();
        Min = phrase.toLowerCase();
       System.out.println(Mayus);
       System.out.println(Min);
       
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciojava8;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EjercicioJava8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        String palabra;
        System.out.print("Escribe una palabra de 8 de letras ");
        palabra = Scan.nextLine();
        if (palabra.length() == 8){
            System.out.print("CORRECTO");
        }
        else
            System.out.print("INCORRECTO");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciojava7;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EjercicioJava7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        String frase;
        System.out.print("Escriba la frase o palabra secreta: ");
        frase = Scan.nextLine();
        if (frase.equals("eureka")){
            System.out.print("Correcto");
    }
    else
            System.out.print("Incorrecto");
}
}
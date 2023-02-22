/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciojava6;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EjercicioJava6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero entero: ");
        num = Scan.nextInt();
        if (num % 2 == 0) {
        System.out.println(num + " Es un numero par");
        }
        else
            System.out.println(num + " No es un numero par");
    
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciojava5;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EjercicioJava5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int num;
        int doble;
        int triple;
        double raiz;
        System.out.println("Escriba un numero entero");
        num = Scan.nextInt();
        doble = num * 2;
        triple = num * 3;
        raiz = Math.sqrt(num);
        System.out.println("El doble del numero es: " + doble);
        System.out.println("El gtriple del numero es: " + triple);
        System.out.println("La raiz cuadrada del numero es: " + raiz);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EjerciciosJava1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int num1;
        int num2;
        int resultado;
        System.out.println("Introduzca un número entero: ");
        num1 = Scan.nextInt();
        System.out.println("introduzca otro numero entero: ");
        num2 = Scan.nextInt();
        resultado = num1 + num2;
        System.out.println("La suma de los dos numeros es: " + resultado);
    }
    
}

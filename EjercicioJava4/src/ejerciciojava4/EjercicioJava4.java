/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciojava4;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EjercicioJava4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int centigrados;
        int resultado;
        int fahrenheit;
        Scanner Scan = new Scanner(System.in);
        System.out.println("Escriba aqui los grados centigrados");
        centigrados = Scan.nextInt();
        resultado = 32 + (9 * centigrados / 5);
        System.out.print("El equivalente de " + centigrados); System.out.print(" grados centigrados en grados fahrenheit es " + resultado);
    }
    
}

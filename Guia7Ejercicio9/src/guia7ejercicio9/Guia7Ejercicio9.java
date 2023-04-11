/*
9. Realizar una clase llamada Matemática que tenga como atributos dos números reales con 
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un 
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el 
Math.random para generar los dos números y se guardaran en el objeto con su 
respectivos set. Deberá además implementar los siguientes métodos: 
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor 
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase 
elevado al menor número. Previamente se deben redondear ambos valores. 
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores. 
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número. 

 */
package guia7ejercicio9;

import Materias.Matematicas;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Guia7Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matematicas m1 = new Matematicas();
        Scanner leer = new Scanner(System.in);

        m1.setNum1(Math.random() * 1000);
        m1.setNum2(Math.random() * 1000);
        System.out.println("El primer numero es: " + m1.getNum1());
        System.out.println("El segundo numero es: " + m1.getNum2());
        System.out.println("El mayor de los dos numeros aleatorios es: " + DevolverMayor(m1));
        System.out.println("El resultado de la potencia del mayor numero elevado al menor numero es: " + CalcularPotencia(m1));
        System.out.println("La raiz cuadrada del menor de los numderos es: " + CalcularRaiz(m1));
    }

    public static double DevolverMayor(Matematicas m1) {
        double num = Math.max(m1.getNum1(), m1.getNum2());

        return num;

    }

    public static int CalcularPotencia(Matematicas m1) {
        int resultado = 0;
        int num1 = (int) Math.ceil(m1.getNum1());
        int num2 = (int) Math.ceil(m1.getNum2());
        if (num1 > num2) {
        resultado = (int) Math.pow(num1, num2);
        } else
            if (num2 > num1) {
             resultado = (int) Math.pow(num2, num1);
                     }
        return resultado;
    }

    public static double CalcularRaiz(Matematicas m1) {
        double menor = Math.min(m1.getNum1(), m1.getNum2());
        double absoluto = Math.abs(menor);
        double raizCuadrada = Math.sqrt(absoluto);
        return raizCuadrada;

    }
}

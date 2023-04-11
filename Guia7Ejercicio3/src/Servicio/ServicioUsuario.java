/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Operacion.Operacion;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ServicioUsuario {

    public Operacion CrearOperacion() {

        //Instancia del Objeto Operacion
        Operacion Op1 = new Operacion();

        //LLenar atributos
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor del Primer Numero: ");
        Op1.setNum1(leer.nextDouble());
        System.out.println("Ingrese el valor del Segundo Numero: ");
        Op1.setNum2(leer.nextDouble());

        return Op1;
    }

    public void Sumar(Operacion Op1) {
        double suma = (Op1.getNum1() + Op1.getNum2());
        System.out.println("La suma del Primer Numero mas el Segundo Numero es: " + suma);
    }

    public void Resta(Operacion Op1) {
        double resta = (Op1.getNum1() - Op1.getNum2());
        System.out.println("La resta del Primer Numero menos el Segundo Numero es: " + resta);
    }

    public void Multiplicar(Operacion Op1) {
        Scanner leer = new Scanner(System.in);
        while (Op1.getNum2() == 0) {
            System.out.println("Error el resultado de la multiplicacion es: 0 \n"
                    + "Ingrese el Segundo numero de nuevo");
            Op1.setNum2(leer.nextDouble());
            break;
        }
        
        if (Op1.getNum2() != 0) {
            double multiplicacion = (Op1.getNum1() * Op1.getNum2());
            System.out.println("La multiplicacion del Primer Numero por el Segundo Numero es: " + multiplicacion);
        }

    }

    public void Dividir(Operacion Op1) {
        
        Scanner leer = new Scanner(System.in);
        while (Op1.getNum2() == 0) {
            System.out.println(" Error el resultado de la divicion es: 0 \n"
                    + "Ingrese el segundo numero de nuevo");
            Op1.setNum2(leer.nextDouble());
            break;
        }
        
        
        
        
        if (Op1.getNum2() != 0) {
            double divicion = (Op1.getNum1() / Op1.getNum2());
            System.out.println("La divicion del Primer Numero y el Segundo Numero es: " + divicion);
        }

    }
}

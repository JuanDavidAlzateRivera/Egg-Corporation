/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario;

import Circunferencias.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ServicioUsuario {

    private Scanner leer = new Scanner(System.in);

    public Circunferencia NuevaCircunferencia() {

        //Instancia de Objeto Circunferencia
        System.out.println("Ingrese el tamaño del Radio de la circunferencia");
        double Radio = leer.nextDouble();
        Circunferencia c1 = new Circunferencia(Radio);
        
        return c1;

    }

   
       public void Area(Circunferencia c1){
          double area = 3.14 + (c1.getRadio()*c1.getRadio());
          System.out.println("El area de la circunferencia es: " + area);
           
   }
       public void Perimetro(Circunferencia c1){
           double perimetro = (2 * 3.14 * c1.getRadio());
           System.out.println("El perimetro de la circunferencia es: " + perimetro);
       }
}


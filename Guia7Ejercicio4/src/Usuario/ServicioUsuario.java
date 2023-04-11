/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario;

import Rectangulo.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ServicioUsuario {

    public Rectangulo CrearRectangulo() {

        //Instancia del Objeto Rectangulo
        Rectangulo Rec1 = new Rectangulo();

        //Llenar Atributos
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la base del Rectangulo: ");
        Rec1.setBase(leer.nextDouble());
        System.out.println("Ingrese la altura del Rectangulo: ");
        Rec1.setAltura(leer.nextDouble());

        return Rec1;

    }

    public void Superficie(Rectangulo Rec) {
        double superficie = Rec.getBase() * Rec.getAltura();
        System.out.println("La superficie del rectangulo es: " + superficie);
    }

    public void Perimetro(Rectangulo Rec) {
        double perimetro = (Rec.getBase() + Rec.getAltura()) * 2;
        System.out.println("El perimetro del rectangulo es: " + perimetro);
    }

    public void DibujoRectangulo(Rectangulo Rec) {
        for (int i = 1; i <= Rec.getAltura(); i++) {
            for (int j = 1; j <= Rec.getBase(); j++) {
                if ((i == 1) || (i == Rec.getAltura()) || (j == 1) || (j == Rec.getBase())) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println("");
        }

    }

}

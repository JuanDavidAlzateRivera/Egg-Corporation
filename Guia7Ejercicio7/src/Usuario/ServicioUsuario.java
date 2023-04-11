/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario;

import Datos.Persona;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ServicioUsuario {

    public Persona CrearPersona() {

        Persona p1 = new Persona();

        Scanner leer = new Scanner(System.in);
        System.out.println("Digite su Nombre");
        p1.setNombre(leer.next());
        System.out.println("Digite su Edad");
        p1.setEdad(leer.nextInt());

        do {
            System.out.println("Digite su Sexo \n"
                    + "H si es hombre. \n"
                    + "M si es mujer. \n"
                    + "O si es de otro Genero.");
            String sexo = leer.next();
            p1.setSexo(sexo);

        } while (!p1.getSexo().equals("H") && (!p1.getSexo().equals("M") && (!p1.getSexo().equals("O"))));

        System.out.println("Digite su Peso en Kilos");
        p1.setPeso(leer.nextInt());
        System.out.println("Digite su Altura en Metros");
        p1.setAltura(leer.nextDouble());
        return p1;
    }

    public double CalcularIMC(Persona p1) {

        double PesoIdeal = p1.getPeso() / (p1.getAltura() * p1.getAltura());
        if (PesoIdeal < 20) {
            PesoIdeal = -1;
        } else if ((PesoIdeal >= 20) && (PesoIdeal <= 25)) {
            PesoIdeal = 0;
        } else if (PesoIdeal > 25) {
            PesoIdeal = 1;
        }
        return PesoIdeal;
    }

    public boolean esMayorDeEdad(Persona p1) {

        boolean MayorDeEdad = false;
        if (p1.getEdad() >= 18) {
            MayorDeEdad = true;
        } else if (p1.getEdad() < 18) {
            MayorDeEdad = false;
        }

        return MayorDeEdad;
    }

}

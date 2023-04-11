/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import NesPresso.Cafetera;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ServicioUsuario {

    public Cafetera CrearCafetera() {

        Cafetera c1 = new Cafetera();
        c1.setCapacidadMaxima(1000);
        c1.setCantidadActual(1000);

        return c1;
    }
    
    public void LlenarCafetera(Cafetera c1) {

        c1.setCantidadActual(c1.getCapacidadMaxima());

    }

    public void ServirTaza(Cafetera c1) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Digite el Tamaño de la taza que desea que le Sirva \n"
                + "200 ml \n"
                + "300 ml \n"
                + "500 ml");
        int tamaño = leer.nextInt();
        
        if (tamaño == 200 || tamaño == 300 || tamaño == 500){
        if (tamaño <= c1.getCantidadActual()) {
            c1.setCantidadActual(c1.getCantidadActual() - tamaño);
            System.out.println(c1.getCantidadActual());
            System.out.println("Su taza esta llena Gracias por su pedido");
        } else {
            
            System.out.println("Su taza se lleno con: " + c1.getCantidadActual() + " ml Lo Sentimos se Agoto El Cafe");
            c1.setCantidadActual(0);
        }
        }else 
            System.out.println("Lo sentimos Elija una opcion Valida");
    }
    
    public void VaciarCafetera (Cafetera c1) {
        c1.setCantidadActual(0);
    }
    
    
    public void AgregarCafe (Cafetera c1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Que Cantidad desea Devolver a la Cafetera");
        int devolver = leer.nextInt();
        c1.setCantidadActual( c1.getCantidadActual() + devolver);
    
    }
}


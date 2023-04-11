/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la 
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes 
métodos: 
 Constructor predeterminado o vacío 
 Constructor con la capacidad máxima y la cantidad actual 
 Métodos getters y setters. 
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad 
máxima. 
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el 
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la 
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El 
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en 
cuanto quedó la taza. 
 Método vaciarCafetera(): pone la cantidad de café actual en cero. 
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo 
recibe y se añade a la cafetera la cantidad de café indicada. 

 */
package guia7ejercicio6;

import NesPresso.Cafetera;
import Servicio.ServicioUsuario;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Guia7Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioUsuario su = new ServicioUsuario();
        Cafetera c1 = su.CrearCafetera();

        int opcion;

        do {
            Scanner leer = new Scanner(System.in);
            System.out.println("Que opcion desea elejir: \n"
                    + "1. Llenar Cafetera. \n"
                    + "2. Servir una taza de Cafe. \n"
                    + "3. Vaciar Cafetera. \n"
                    + "4. Agregar Cafe a la Cafetera. \n"
                    + "5. Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    su.LlenarCafetera(c1);
                    System.out.println("---------------------------------------------------");
                    break;
                case 2:
                    su.ServirTaza(c1);
                    System.out.println("---------------------------------------------------");
                    break;
                case 3:
                    su.VaciarCafetera(c1);
                    System.out.println("---------------------------------------------------");
                    break;
                case 4:
                    su.AgregarCafe(c1);
                    System.out.println("---------------------------------------------------");
                    break;
            }
        } while (opcion < 5);
        System.out.println("Has salido con Exito Gracias");
    }

}

/*
. Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, 
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro 
atributo, puede hacerlo. Los métodos que se implementarán son: 
 Un constructor por defecto. 
 Un constructor con todos los atributos como parámetro. 
 Métodos getters y setters de cada atributo. 
 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos 
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto 
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o 
O. Si no es correcto se deberá mostrar un mensaje 
 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en 
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, 
significa que la persona está por debajo de su peso ideal y la función devuelve un -1. 
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la 
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado 
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la 
función devuelve un 1. 
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función 
devuelve un booleano. 
A continuación, en la clase main hacer lo siguiente: 
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos 
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, 
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la 
persona es mayor de edad. 
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en 
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas 
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y 
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores 

 */
package guia7ejercicio7;

import Datos.Persona;
import Usuario.ServicioUsuario;

/**
 *
 * @author user
 */
public class Guia7Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioUsuario su = new ServicioUsuario();

        int DebajoPeso = 0;
        int pesoIdeal = 0;
        int EncimaPeso = 0;
        int MayorEdad = 0;
        int MenorEdad = 0;

        System.out.println("Digite los Datos para el Usuario 1: ");
        Persona p1 = su.CrearPersona();
        su.CalcularIMC(p1);
        su.esMayorDeEdad(p1);

        if (su.CalcularIMC(p1) == -1) {

            DebajoPeso = DebajoPeso + 1;
        } else if (su.CalcularIMC(p1) == 0) {

            pesoIdeal = pesoIdeal + 1;
        } else if (su.CalcularIMC(p1) == 1) {

            EncimaPeso = EncimaPeso + 1;
        }

        if (su.esMayorDeEdad(p1) == true) {
            MayorEdad++;
        } else if (su.esMayorDeEdad(p1) == false) {
            MenorEdad++;
        }
        System.out.println("-------------------------------------------------------------------------------");

        System.out.println("Digite los Datos para el Usuario 2: ");
        Persona p2 = su.CrearPersona();
        su.CalcularIMC(p2);
        su.esMayorDeEdad(p2);

        if (su.CalcularIMC(p2) == -1) {

            DebajoPeso = DebajoPeso + 1;
        } else if (su.CalcularIMC(p2) == 0) {

            pesoIdeal = pesoIdeal + 1;
        } else if (su.CalcularIMC(p2) == 1) {

            EncimaPeso = EncimaPeso + 1;
        }

        if (su.esMayorDeEdad(p2) == true) {
            MayorEdad++;
        } else if (su.esMayorDeEdad(p2) == false) {
            MenorEdad++;
        }
        System.out.println("-------------------------------------------------------------------------------");

        System.out.println("Digite los Datos para el Usuario 3: ");
        Persona p3 = su.CrearPersona();
        su.CalcularIMC(p3);
        su.esMayorDeEdad(p3);

        if (su.CalcularIMC(p3) == -1) {

            DebajoPeso = DebajoPeso + 1;
        } else if (su.CalcularIMC(p3) == 0) {

            pesoIdeal = pesoIdeal + 1;
        } else if (su.CalcularIMC(p3) == 1) {

            EncimaPeso = EncimaPeso + 1;
        }

        if (su.esMayorDeEdad(p3) == true) {
            MayorEdad++;
        } else if (su.esMayorDeEdad(p3) == false) {
            MenorEdad++;
        }
        System.out.println("-------------------------------------------------------------------------------");

        System.out.println("Digite los Datos para el Usuario 4: ");
        Persona p4 = su.CrearPersona();
        su.CalcularIMC(p4);
        su.esMayorDeEdad(p4);

        if (su.CalcularIMC(p4) == -1) {

            DebajoPeso = DebajoPeso + 1;
        } else if (su.CalcularIMC(p4) == 0) {

            pesoIdeal = pesoIdeal + 1;
        } else if (su.CalcularIMC(p4) == 1) {

            EncimaPeso = EncimaPeso + 1;
        }

        if (su.esMayorDeEdad(p4) == true) {
            MayorEdad++;
        } else if (su.esMayorDeEdad(p4) == false) {
            MenorEdad++;
        }
        System.out.println("-------------------------------------------------------------------------------");

        System.out.println("La cantidad de Personas que estan por debajo del peso promedio son: " + DebajoPeso + "\n"
                + "La cantidad de personas que estan en el peso ideal son: " + pesoIdeal + "\n"
                + "La cantidad de personas que estan por encima del peso ideal son: " + EncimaPeso);
        
        System.out.println("----------------------------------------------------------------------------------");
        
        System.out.println("La cantidad de personas mayores de edad son: " + MayorEdad + "\n"
                + "La cantidad de personas menores de edad son: " + MenorEdad);

    }

}

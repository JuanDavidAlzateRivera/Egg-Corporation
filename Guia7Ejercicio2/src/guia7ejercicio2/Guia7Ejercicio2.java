/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package guia7ejercicio2;

import Circunferencias.Circunferencia;
import Usuario.ServicioUsuario;

/**
 *
 * @author user
 */
public class Guia7Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioUsuario su = new ServicioUsuario();
        Circunferencia c1 = su.NuevaCircunferencia();
        su.Area(c1);
        su.Perimetro(c1);
    }
    
}

/*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
*/
package guia7ejercicio1;

import Libreria.Libro;
import Usuario.ServicioUsuario;

/**
 *
 * @author user
 */
public class Guia7Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Instancia de Objeto tipo Servicio
        
        ServicioUsuario su = new ServicioUsuario();
        
        //Instancia del Objeto creado en Servicio>Usuario.java
        
        System.out.println(su.NuevoLibro());
        
    }
    
}

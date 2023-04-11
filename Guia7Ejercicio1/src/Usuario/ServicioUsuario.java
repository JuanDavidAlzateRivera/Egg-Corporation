/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario;

import Libreria.Libro;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ServicioUsuario {

    public Libro NuevoLibro() {

        //Instancia de Objeto tipo Libro
        Libro Libro1 = new Libro();

        //LLenar Atributos
        Scanner Leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el ISBN del Libro: ");
        Libro1.setISBN(Leer.nextInt());
        System.out.println("Ingrese el Titulo del Libro");
        Libro1.setTitulo(Leer.next());
        System.out.println("Ingrese el nombre del Autor del Libro");
        Libro1.setAutor(Leer.next());
        System.out.println("Ingrese el numero de Paginas que contiene el Libro");
        Libro1.setNumPaginas(Leer.nextInt());

        return Libro1;
    }
}

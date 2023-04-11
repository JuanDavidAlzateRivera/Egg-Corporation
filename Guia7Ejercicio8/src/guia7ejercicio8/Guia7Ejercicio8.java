/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de 
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese 
una frase que puede ser una palabra o varias palabras separadas por un espacio en 
blanco y a través de los métodos set, se guardará la frase y la longitud de manera 
automática según la longitud de la frase ingresada. Deberá además implementar los 
siguientes métodos: 
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la 
frase ingresada. 
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por 
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac". 
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y 
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo: 
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces. 
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que 
compone la clase con otra nueva frase ingresada por el usuario. 
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena 
con una nueva frase ingresada por el usuario y mostrar la frase resultante. 
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se 
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar 
la frase resultante. 
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que 
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package guia7ejercicio8;

import Frases.Cadena;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Guia7Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Cadena c1 = new Cadena();

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Digite una frase, ya sea una palabra, o, varias palabras: ");
        c1.setFrase(leer.next());

        c1.setLongitud(c1.getFrase().length());

        MostrarVocales(c1);
        System.out.println("La frase Invertida seria asi: ");
        InvertirFrase(c1);
        System.out.println(" ");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        VecesRepetido(c1);
        CompararLongitud(c1);
        UnirFrase(c1);
        ReemplazarLetra(c1);
        System.out.println(Contiene(c1));

    }

    public static void MostrarVocales(Cadena c1) {
        char[] vocales = {'a', 'e', 'i', 'o', 'u'};

        int voc = 0;

        for (int i = 0; i < c1.getFrase().length(); i++) {
            for (int j = 0; j < vocales.length - 1; j++) {
                if (c1.getFrase().charAt(i) == vocales[j]) {
                    voc++;
                }
            }
        }

        System.out.println("El numero de vocales que tiene la frase es: " + voc);
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
    }

    public static void InvertirFrase(Cadena c1) {

        String frase = c1.getFrase();

        for (int i = frase.length() - 1; i >= 0; i--) {
            System.out.print(frase.charAt(i));

        }

    }

    public static void VecesRepetido(Cadena c1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite la letra o vocal que desea ver cuantas veces se repite en la frase: ");
        String letra = leer.nextLine();
        char[] Letra = letra.toCharArray();

        int contador = 0;

        for (int i = 0; i < c1.getFrase().length(); i++) {
            for (int j = 0; j < Letra.length; j++) {
                if (c1.getFrase().charAt(i) == Letra[j]) {
                    contador++;
                }
            }
        }
        System.out.println("Las veces que se repite su letra son: " + contador);
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
    }

    public static void CompararLongitud(Cadena c1) {
        Scanner leer = new Scanner(System.in);
        boolean correcto;
        System.out.println("Digite la frase que desea comparar con la longitud de la frase inicial: ");
        String frase = leer.nextLine();

        if (c1.getFrase().length() == frase.length()) {
            correcto = true;
            System.out.println("La frase que ingreso es igual a la longitud de la frase inicial");
        } else {
            correcto = false;
            System.out.println("La frase que ingreso no es igual a la longitud de la frase inicial");
        }
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
    }

    public static void UnirFrase(Cadena c1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite una frase que desee juntarla con la primera: ");
        String frase = leer.nextLine();
        System.out.println("La frase que obtenemos al juntar la frase inicial con la frase que acabba de ingresar seria: \n"
                + "" + c1.getFrase() + " " + frase);
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
    }

    public static void ReemplazarLetra(Cadena c1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite la  letra por la cual quiere reemplazar todas las a de la frase inicial: ");
        String letra = leer.nextLine();
        System.out.println(c1.getFrase().replace("a", letra));
    }

    public static boolean Contiene(Cadena c1) {
        Scanner leer = new Scanner(System.in);
        boolean Contiene = false;
        System.out.println("Digite la letra que desea para ver si la frase la contiene");
        String letra = leer.nextLine();
        char[] Letra = letra.toCharArray();
        int contador = 0;

        for (int i = 0; i < c1.getFrase().length(); i++) {
            for (int j = 0; j < Letra.length; j++) {
                if (c1.getFrase().charAt(i) == Letra[j]) {
                    contador++;
                    if (contador > 0) {
                        Contiene = true;
                    } else {
                        Contiene = false;
                    }
                }

            }

        }
        return Contiene;
    }

}

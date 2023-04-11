/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frases;

/**
 *
 * @author user
 */
public class Cadena {
    
    private String frase;
    private int longitud;
    
    //Constructor por defecto

    public Cadena() {
    }
    
    //Constructor por Parametros

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }
    
    //Getter && Setter

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", longitud=" + longitud + '}';
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rectangulo;

/**
 *
 * @author user
 */
public class Rectangulo {
    
    private double base;
    private double altura;
    
    //Constructor por defecto

    public Rectangulo() {
    }
    
    //Constructor por parametros

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    //Getter & Setter

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Circunferencias;



/**
 *
 * @author user
 */
public class Circunferencia {
    
    private double Radio;
    
    //Constructor por parametro

    public Circunferencia(double Radio) {
        this.Radio = Radio;
    }
    
    //Getter & Setter

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double Radio) {
        this.Radio = Radio;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "Radio=" + Radio + '}';
    }
 
    
}



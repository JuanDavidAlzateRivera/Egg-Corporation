/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Materias;

/**
 *
 * @author user
 */
public class Matematicas {

    private double num1;
    private double num2;

    //Constructor por defecto
    public Matematicas() {

    }

    //Constructor por parametros
    public Matematicas(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    //Getter && Setter
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "Matematicas{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }

}

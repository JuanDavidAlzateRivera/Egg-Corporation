/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operacion;

/**
 *
 * @author user
 */
public class Operacion {

    private double num1;
    private double num2;

    //Constructor Por Defecto
    public Operacion() {
    }

    //Constructor Por Parametros
    public Operacion(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    //Getter & Setter

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
        return "Operacion{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }

}

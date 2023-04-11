/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuentas;

/**
 *
 * @author user
 */
public class CuentaBancaria {

    private double NumeroCuenta;
    private double DNI;
    private double SaldoActual;

    //Constructor por Defecto
    public CuentaBancaria() {
    }

    //Constructor por parametros
    public CuentaBancaria(double NumeroCuenta, double DNI, double SaldoActual) {
        this.NumeroCuenta = NumeroCuenta;
        this.DNI = DNI;
        this.SaldoActual = SaldoActual;
    }

    //Getter & Setter
    public double getNumeroCuenta() {
        return NumeroCuenta;
    }

    public void setNumeroCuenta(double NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
    }

    public double getDNI() {
        return DNI;
    }

    public void setDNI(double DNI) {
        this.DNI = DNI;
    }

    public double getSaldoActual() {
        return SaldoActual;
    }

    public void setSaldoActual(double SaldoActual) {
        this.SaldoActual = SaldoActual;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "NumeroCuenta=" + NumeroCuenta + ", DNI=" + DNI + ", SaldoActual=" + SaldoActual + '}';
    }

}

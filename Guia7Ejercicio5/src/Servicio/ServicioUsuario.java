/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Cuentas.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ServicioUsuario {

    public CuentaBancaria CrearCuenta() {

        //Instancia de Objeto CuentaBancaria
        CuentaBancaria Cuenta1 = new CuentaBancaria();

        //Llenar Atributos
        Scanner leer = new Scanner(System.in);

        System.out.println("Digite su Numero de Cuenta: ");
        Cuenta1.setNumeroCuenta(leer.nextDouble());
        System.out.println("Digite su DNI: ");
        Cuenta1.setDNI(leer.nextDouble());
        System.out.println("Digite su Saldo Actual: ");
        Cuenta1.setSaldoActual(leer.nextDouble());

        return Cuenta1;

    }

    public void ingresar(CuentaBancaria Cuenta1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite la cantidad de dinero a consignar: ");
        double ingreso = leer.nextDouble();
        Cuenta1.setSaldoActual(ingreso + Cuenta1.getSaldoActual());

    }

    public void retirar(CuentaBancaria Cuenta1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite la Cantidad de dinero que Desea Retirar: ");
        double retiro = leer.nextDouble();
        Cuenta1.setSaldoActual(Cuenta1.getSaldoActual() - retiro);
        if (Cuenta1.getSaldoActual() < 0) {
            Cuenta1.setSaldoActual(0);

        }

    }

    public void extraccionRapida(CuentaBancaria Cuenta1) {
        double extraccion = (Cuenta1.getSaldoActual() * 0.20);
        Cuenta1.setSaldoActual(Cuenta1.getSaldoActual() - extraccion);

    }

    public void consultarSaldo(CuentaBancaria Cuenta1) {
        System.out.println("Su saldo actual es de: $ " + Cuenta1.getSaldoActual());

    }

    public void consultarDatos(CuentaBancaria Cuenta1) {
        System.out.println("Numero de Cuenta: " + Cuenta1.getNumeroCuenta());
        System.out.println("DNI: " + Cuenta1.getDNI());
        System.out.println("Saldo Actual: " + Cuenta1.getSaldoActual());
    }

}

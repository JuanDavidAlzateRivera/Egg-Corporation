/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package guia7ejercicio5;

import Cuentas.CuentaBancaria;
import Servicio.ServicioUsuario;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Guia7Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ServicioUsuario su = new ServicioUsuario();

        CuentaBancaria Cuenta1 = su.CrearCuenta();

        Scanner leer = new Scanner(System.in);
        int opcion;
        do {

            System.out.println("Que Transacción va a realizar \n"
                    + "1. Consignar Dinero \n"
                    + "2. Retirar Dinero \n"
                    + "3. Extracción Rapida de Dinero (20%) \n"
                    + "4. Consultar Saldo \n"
                    + "5. Consultar Datos de la cuenta \n"
                    + "6. Salir \n"
                    + "--------------------------------------------------------------------");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    su.ingresar(Cuenta1);
                    System.out.println("--------------------------------------------------------");
                    break;
                case 2:
                    su.retirar(Cuenta1);
                    System.out.println("-----------------------------------------------------------");
                    break;
                case 3:
                    su.extraccionRapida(Cuenta1);
                    System.out.println("-----------------------------------------------------------");
                    break;
                case 4:
                    su.consultarSaldo(Cuenta1);
                    System.out.println("-----------------------------------------------------------");
                    break;
                case 5:
                    su.consultarDatos(Cuenta1);
                    System.out.println("-----------------------------------------------------------");
                    break;
            }

        } while (opcion < 6);
        System.out.println("Has Salido con Exito Gracias por usar Nuestros Servicios");
    }

}

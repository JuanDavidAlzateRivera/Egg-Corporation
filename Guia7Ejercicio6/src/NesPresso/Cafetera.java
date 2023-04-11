/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NesPresso;

/**
 *
 * @author user
 */
public class Cafetera {

    private int CapacidadMaxima;
    private int CantidadActual;

    //Constructor por Defecto
    public Cafetera() {
    }

    //Constructor por Parametros
    public Cafetera(int CapacidadMaxima, int CantidadActual) {
        this.CapacidadMaxima = CapacidadMaxima;
        this.CantidadActual = CantidadActual;
    }

    //Getter & Setter
    public int getCapacidadMaxima() {
        return CapacidadMaxima;
    }

    public void setCapacidadMaxima(int CapacidadMaxima) {
        this.CapacidadMaxima = CapacidadMaxima;
    }

    public int getCantidadActual() {
        return CantidadActual;
    }

    public void setCantidadActual(int CantidadActual) {
        this.CantidadActual = CantidadActual;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "CapacidadMaxima=" + CapacidadMaxima + ", CantidadActual=" + CantidadActual + '}';
    }

}

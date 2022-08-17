/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author Abigail
 */
public class clsPrestamo implements Serializable {

    private double cuota;
    private double cantidadCuotas;
    private double cantidadCuotasPendientes;

    public clsPrestamo(double cuota, double cantidadCuotas, double pendientes) {
        this.cuota = cuota;
        this.cantidadCuotas = cantidadCuotas;
        this.cantidadCuotasPendientes = pendientes;
    }

    public double getCantidadCuotasPendientes() {
        return cantidadCuotasPendientes;
    }

    public void setCantidadCuotasPendientes(double cantidadCuotasPendientes) {
        this.cantidadCuotasPendientes = cantidadCuotasPendientes;
    }

    public double getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(double cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }
}

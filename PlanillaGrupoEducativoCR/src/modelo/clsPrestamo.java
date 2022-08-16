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
    private int cuota;
    int cantidadCuotas;
    int cantidadCuotasPendientes;
    
    
   public clsPrestamo(int cuota, int cantidadCuotas) {
        this.cuota = cuota;
        this.cantidadCuotas = cantidadCuotas;
        this.cantidadCuotasPendientes=this.cantidadCuotas;
    }
    public int getCantidadCuotasPendientes() {
        return cantidadCuotasPendientes;
    }

    public void setCantidadCuotasPendientes(int cantidadCuotasPendientes) {
        this.cantidadCuotasPendientes = cantidadCuotasPendientes;
    }

    

    public int getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(int cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public int getCuota() {
        if(cantidadCuotas>0){
            return cuota;
        }else{
        return 0;
        }
    }

    public void setCuota(int cuota) {
        this.cuota = cuota;
    }
}

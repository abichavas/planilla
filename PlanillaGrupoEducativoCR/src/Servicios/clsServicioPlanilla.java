/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import java.util.ArrayList;
import modelo.clsEmpleado;
import modelo.clsPlanilla;
import modelo.clsPrestamo;

/**
 *
 * @author Abigail
 */
public class clsServicioPlanilla {

    public ArrayList<clsPlanilla> calcularPlanilla(ArrayList<clsEmpleado> empleados, clsServicioArchivo archivo) {
        
        ArrayList<clsPlanilla> planilla = new ArrayList<>();
        for (int i = 0; i < empleados.size(); i++) {
            clsEmpleado empleado = empleados.get(i);
            clsPlanilla planillaPersonal = new clsPlanilla(empleado);
            //actualizando la cantidad de cuotas pendientes para cada prestamo del empleado
            ArrayList<clsPrestamo> prestamos = empleado.getPrestamos();
            for (int j = 0; j < prestamos.size(); j++) {
                clsPrestamo prestamo = prestamos.get(j);
                prestamo.setCantidadCuotasPendientes(prestamo.getCantidadCuotasPendientes() - 1);
            }
            planilla.add(planillaPersonal);
        }
        archivo.guardarEmpleados(empleados);
        return planilla;
    }
}

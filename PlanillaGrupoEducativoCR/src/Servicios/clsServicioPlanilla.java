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

    private clsServicioArchivo archivo;
    private ArrayList<clsPlanilla> planillas;
    private clsServicioEmpleado servicioEmpleado;

    public clsServicioPlanilla(clsServicioArchivo archivo, clsServicioEmpleado servicioEmpleado) {
        this.archivo = archivo;
        this.servicioEmpleado = servicioEmpleado;
        this.planillas = archivo.obtenerPlanillas();
    }

    public ArrayList<clsPlanilla> getPlanillas() {
        return planillas;
    }

    public clsPlanilla crear(String anno, String mes) throws Exception {
        for (clsPlanilla planilla : planillas) {
            if(planilla.getAnno().equals(anno) && planilla.getMes().equals(mes)){
                throw new Exception("No se puede generar dos veces la misma planilla");
            }
        }
        ArrayList<clsEmpleado> empleados = this.servicioEmpleado.getEmpleados();
        clsPlanilla planilla = new clsPlanilla(mes, anno, empleados);
        planillas.add(planilla);
        // guarda empleados para guardar los pagos de los prestamos
        archivo.guardarEmpleados(empleados);
        archivo.guardarPlanillas(this.planillas);
        return planilla;
    }
}

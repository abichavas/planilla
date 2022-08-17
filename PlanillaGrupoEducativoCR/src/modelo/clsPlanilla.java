/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Abigail
 */
public class clsPlanilla implements Serializable {

    private String mes;
    private String anno;
    private ArrayList<clsPlanillaEmpleado> detalle;

    public clsPlanilla(String mes, String anno, ArrayList<clsEmpleado> empleados) {
        this.mes = mes;
        this.anno = anno;
        this.detalle = new ArrayList<>();
        for (int i = 0; i < empleados.size(); i++) {
            clsEmpleado empleado = empleados.get(i);
            clsPlanillaEmpleado planillaPersonal = new clsPlanillaEmpleado(empleado);
            detalle.add(planillaPersonal);
        }
    }

    public ArrayList<clsPlanillaEmpleado> getDetalle() {
        return detalle;
    }

    public void setPlanillas(ArrayList<clsPlanillaEmpleado> detalle) {
        this.detalle = detalle;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAnno() {
        return anno;
    }

    public void setAnno(String anno) {
        this.anno = anno;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import java.util.ArrayList;
import modelo.Grado;
import modelo.TipoTitulo;
import modelo.clsCarreraProfesional;
import modelo.clsEmpleado;
import modelo.clsPrestamo;
import modelo.clsPuesto;
import modelo.clsTitulo;

/**
 *
 * @author Abigail
 */
public class clsServicioEmpleado {

    private clsServicioArchivo archivo;
    private ArrayList<clsEmpleado> empleados;

    public clsServicioEmpleado(clsServicioArchivo archivo) {
        this.archivo = archivo;
        this.empleados = this.archivo.obtenerEmpleados();
    }

    public void agregarTitulo(clsEmpleado empleado, TipoTitulo tipo, int horas, String nombre) {
        empleado.getCarreraProfesional().getTitulos().add(new clsTitulo(tipo, horas, nombre));
        guardarEmpleados();
    }

    public boolean eliminarTitulo(clsEmpleado empleado, clsTitulo titulo) {
        boolean eliminado = empleado.getCarreraProfesional().getTitulos().remove(titulo);
        guardarEmpleados();
        return eliminado;
    }

    public clsEmpleado crear(String nombre, String apellido, String cedula, int edad, clsPuesto puesto,
     int cantidadPensiones, Grado grado) {
        clsEmpleado empleado = new clsEmpleado(nombre, apellido, cedula, edad, puesto, cantidadPensiones, grado);
        this.empleados.add(empleado);
        guardarEmpleados();
        return empleado;
    }

    public void guardarEmpleados() {
        this.archivo.guardarEmpleados(this.empleados);
    }

    public boolean eliminar(clsEmpleado empleado) {
        boolean eliminado = this.empleados.remove(empleado);
        guardarEmpleados();
        return eliminado;
    }

    public ArrayList<clsEmpleado> getEmpleados() {
        return empleados;
    }

}

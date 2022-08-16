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
public class clsEmpleado implements Serializable  {

    private String nombre;
    private String apellido;
    private String cedula;
    private int edad;
    private clsPuesto puesto;
    private ArrayList<clsPrestamo> prestamos;
    private int cantidadPensiones;
    private Grado grado;
    private clsCarreraProfesional carreraProfesional;

    public clsEmpleado(String nombre, String apellido, String cedula, int edad, clsPuesto puesto, int cantidadPensiones, Grado grado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
        this.puesto = puesto;
        this.prestamos = new ArrayList<>();
        this.cantidadPensiones = cantidadPensiones;
        this.grado = grado;
        this.carreraProfesional= new clsCarreraProfesional();
    }

    public clsCarreraProfesional getCarreraProfesional() {
        return carreraProfesional;
    }

    public void setCarreraProfesional(clsCarreraProfesional carreraProfesional) {
        this.carreraProfesional = carreraProfesional;
    }

    public Grado getGrado() {
        return grado;
    }

    public void setGrado(Grado grado) {
        this.grado = grado;
    }  

    public ArrayList<clsPrestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(ArrayList<clsPrestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public int getCantidadPensiones() {
        return cantidadPensiones;
    }

    public void setCantidadPensiones(int cantidadPensiones) {
        this.cantidadPensiones = cantidadPensiones;
    }

    public clsPuesto getPuesto() {
        return puesto;
    }

    public void setPuesto(clsPuesto puesto) throws Exception {
        if(puesto.getCategoria()==2&&this.grado!=Grado.Universitario){
            throw new Exception("Solamente los empleados con Grado Universitario pueden tener puestos categoría 2");
        }
        this.puesto = puesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}

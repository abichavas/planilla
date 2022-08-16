/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import java.util.ArrayList;
import modelo.clsEmpleado;
import modelo.clsPuesto;

/**
 *
 * @author Abigail
 */
public class clsServicioPuesto {
   

    private clsServicioArchivo archivo;
    private ArrayList<clsPuesto> puestos;

    public clsServicioPuesto(clsServicioArchivo archivo) {
        this.archivo = archivo;
        this.puestos= this.archivo.obtenerPuestos();
        this.validarPuestos();
    }
    public clsPuesto crear (String nombre, int categoria, double salario){
        clsPuesto puesto=new clsPuesto(nombre, categoria, salario);
        this.puestos.add(puesto);
        this.archivo.guardarPuestos(this.puestos);
        return puesto;
    }
    public void guardarPuestos (){
        this.archivo.guardarPuestos(this.puestos);
    }
    public boolean eliminar(clsPuesto puesto){
        boolean eliminado= this.puestos.remove(puesto);
        this.archivo.guardarPuestos(this.puestos);
        return eliminado;
    }

    public ArrayList<clsPuesto> getPuestos() {
        return puestos;
    }
    public void validarPuestos(){
        if(this.puestos.size()==0){
            this.puestos.add(new clsPuesto("Personal de Apoyo",1,250000));
            this.puestos.add(new clsPuesto("Administrativo 1",1,320000));
            this.puestos.add(new clsPuesto("Técnico especializado",1,415000));
            this.puestos.add(new clsPuesto("Administrativo 2",2,500000));
            this.puestos.add(new clsPuesto("Profesional de apoyo",2,580000));
            this.puestos.add(new clsPuesto("Docente Licenciado",2,620000));
            this.puestos.add(new clsPuesto("Docente Máster",2,750000));
            this.puestos.add(new clsPuesto("Jefe 1",2,800000));
            this.puestos.add(new clsPuesto("Jefe 2",2,950000));
            this.puestos.add(new clsPuesto("Director",2,1500000));
            this.guardarPuestos();
        }
    }
    
}

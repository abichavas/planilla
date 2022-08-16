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
    private clsEmpleado empleado;
    private double salarioBase;
    private double salarioBruto;
    private double salarioNeto;
    private double anualidad;
    private double escalafon;
    private double dedicacionExclusiva;
    private double regimenPension;
    private double bancoPopular;
    private double CCSS;
    private double polizaVida;
    private double renta;
    private double colegioProfesional;
    private double pension;
    private double prestamos;
    private double carreraProfesional;
                
    public clsPlanilla(clsEmpleado empleado) {
        this.empleado=empleado;
        //pagos
     this.salarioBase= this.empleado.getPuesto().getSalario();
     this.anualidad=calcularAnualidad();
     this.escalafon= calcularEscalafon();
     this.dedicacionExclusiva= calcularDedicacionExclusiva();
     this.carreraProfesional= calcularCarreraProfesional();
     this.salarioBruto= this.salarioBase+this.anualidad+this.escalafon+this.dedicacionExclusiva+this.carreraProfesional;
      //deducciones
      this.regimenPension= calcularRegimenPensionMagistrado();
      this.bancoPopular= calcularBancoPopular();
      this.CCSS= calcularCCSS();
      this.polizaVida=calcularPolizaVida();
      this.renta= calcularRenta();
      this.colegioProfesional= calcularColegioProfesional();
      this.pension= calcularPension();
      this.prestamos= calcularPrestamos();
      this.salarioNeto= this.salarioBruto-(this.regimenPension+this.bancoPopular+this.CCSS+this.polizaVida+this.renta+this.colegioProfesional+this.pension+this.prestamos);
    }
    
    public double calcularAnualidad() {
        return this.salarioBase *0.02;
    }

    public double calcularEscalafon() {
        if(this.empleado.getPuesto().getCategoria()==1){
            return this.salarioBase*0.03;
        }else{
            return salarioBase*0.01;
        }
        
    }

    public double calcularDedicacionExclusiva() {
        if(this.empleado.getPuesto().getCategoria()==2){
            return this.salarioBase*0.30;
        }
        return 0;
    }

    public double calcularRegimenPensionMagistrado() {
        return this.salarioBruto*0.08;
    }

    public double calcularBancoPopular() {
        return this.salarioBruto*0.01;
    }

    public double calcularCCSS() {
        return this.salarioBruto*0.03;
    }

    public double calcularPolizaVida() {
        return 13450;
    }

    public double calcularRenta() {
    double salario=this.salarioBruto;
    if(salario<792000){
        return 0;
    }else if(salario<1188000){
        double excedente=salario-792000;
        return excedente*0.10;
    }else{
       double excedente15=salario-1188000;
       double excedente10=(excedente15)-792000;
         return (excedente10*0.10)+(excedente15*0.15);
    }
    }

    public double calcularColegioProfesional() {
       if(this.empleado.getPuesto().getCategoria()==2){
           return 5000;
       }else{
           return 0;
       }
    }

    public double calcularPension() {
      return this.empleado.getCantidadPensiones()*80000;
        
    }

    public double calcularPrestamos() {
        double total=0;
        ArrayList<clsPrestamo> prestamos=this.empleado.getPrestamos();
        for(int i=0; i<prestamos.size();i++){
        total+=prestamos.get(i).getCuota();
    }
        return total;
                
    } public double calcularCarreraProfesional(){
       return this.empleado.getCarreraProfesional().getPuntos()*(2000);
    }


}

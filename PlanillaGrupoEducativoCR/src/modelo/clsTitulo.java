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
public class clsTitulo implements Serializable {
    private TipoTitulo tipo;
    private int horas;
    private String nombre;

    public clsTitulo(TipoTitulo tipo, int horas,String nombre) {
        this.tipo = tipo;
        this.horas = horas;
        this.nombre= nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getPuntos(){
        if(tipo==TipoTitulo.Aprovechamiento){
            return (int)Math.floor (horas/40);
        }else{
        return (int)Math.floor (horas/80);
    }
    }

    public TipoTitulo getTipo() {
        return tipo;
    }

    public void setTipo(TipoTitulo tipo) {
        this.tipo = tipo;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
}

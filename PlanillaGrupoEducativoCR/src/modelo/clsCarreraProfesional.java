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
public class clsCarreraProfesional implements Serializable {

    private ArrayList<clsTitulo> titulos;

    public clsCarreraProfesional() {
        titulos = new ArrayList<>();

    }

    public int getPuntos() {
        int totalAprovechamiento = 0;
        int totalParticipacion = 0;
        for (int i = 0; i < titulos.size(); i++) {
            clsTitulo titulo = titulos.get(i);
            if (titulo.getTipo() == TipoTitulo.Aprovechamiento) {
                totalAprovechamiento += titulo.getHoras();
            } else {
                totalParticipacion += titulo.getHoras();
            }
        }
        return (int)(Math.floor(totalAprovechamiento / 40) + Math.floor(totalParticipacion / 80));
    
    }

    public ArrayList<clsTitulo> getTitulos() {
        return titulos;
    }

    public void setTitulos(ArrayList<clsTitulo> titulos) {
        this.titulos = titulos;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.clsEmpleado;
import modelo.clsPlanilla;
import modelo.clsPuesto;
import modelo.clsUsuario;

/**
 *
 * @author Abigail
 */
public class clsServicioArchivo {

    private static final String URLEmpleados = "src\\archivos\\bdEmpleados.dat";
    private static final String URLPuestos = "src\\archivos\\bdPuestos.dat";
    private static final String URLUsuario = "src\\archivos\\bdUsuarios.dat";
    private static final String URLPlanillas = "src\\archivos\\bdPlanillas.dat";

    public static File validarArchivo(String URL) {
        File bd = new File(URL);
        if (!bd.exists()) {
            try {
                bd.createNewFile();
            } catch (IOException e) {
                System.out.println("Error inesperado al abrir el archivo");
            } catch (Exception e) {
                System.out.println("Error inesperado");
            }
        }
        return bd;
    }

    public ArrayList<clsEmpleado> obtenerEmpleados() {
        File bd = validarArchivo(URLEmpleados);
        ArrayList<clsEmpleado> empleados = new ArrayList<clsEmpleado>();
        ObjectInputStream objetoEntrada = null;

        try {

            FileInputStream ficheroEntrada = new FileInputStream(bd);
            if (ficheroEntrada.available() > 0) {
                objetoEntrada = new ObjectInputStream(ficheroEntrada);

                empleados = (ArrayList<clsEmpleado>) objetoEntrada.readObject();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(clsEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error, No Existe el archivo");
        } catch (IOException ex) {
            Logger.getLogger(clsEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error No se puede acceder el archivo");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(clsEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (objetoEntrada != null) {
                    objetoEntrada.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(clsEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return empleados;
    }

    public ArrayList<clsPuesto> obtenerPuestos() {
        File bd = validarArchivo(URLPuestos);
        ArrayList<clsPuesto> puestos = new ArrayList<clsPuesto>();
        ObjectInputStream objetoEntrada = null;

        try {

            FileInputStream ficheroEntrada = new FileInputStream(bd);
            if (ficheroEntrada.available() > 0) {
                objetoEntrada = new ObjectInputStream(ficheroEntrada);

                puestos = (ArrayList<clsPuesto>) objetoEntrada.readObject();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(clsPuesto.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error, No Existe el archivo");
        } catch (IOException ex) {
            Logger.getLogger(clsPuesto.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error No se puede acceder el archivo");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(clsPuesto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (objetoEntrada != null) {
                    objetoEntrada.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(clsPuesto.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return puestos;
    }

    public void guardarEmpleados(ArrayList<clsEmpleado> empleados) {
        File bd = validarArchivo(URLEmpleados);
        try {
            FileOutputStream ficheroSalida = new FileOutputStream(bd, false);
            ObjectOutputStream objetoSalida = new ObjectOutputStream(ficheroSalida);
            objetoSalida.writeObject(empleados);
            objetoSalida.close();
            

        } catch (FileNotFoundException ex) {
            Logger.getLogger(clsEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error, No Existe el archivo");
        } catch (IOException ex) {
            Logger.getLogger(clsEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error No se puede acceder el archivo");
        }

    }

    public void guardarPuestos(ArrayList<clsPuesto> puestos) {
        File bd = validarArchivo(URLPuestos);
        try {
            FileOutputStream ficheroSalida = new FileOutputStream(bd, false);
            ObjectOutputStream objetoSalida = new ObjectOutputStream(ficheroSalida);
            objetoSalida.writeObject(puestos);
            objetoSalida.close();
          

        } catch (FileNotFoundException ex) {
            Logger.getLogger(clsPuesto.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error, No Existe el archivo");
        } catch (IOException ex) {
            Logger.getLogger(clsPuesto.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error No se puede acceder el archivo");
        }
    }

    public ArrayList<clsUsuario> obtenerUsuarios() {
        File bd = validarArchivo(URLUsuario);
        ArrayList<clsUsuario> usuarios = new ArrayList<clsUsuario>();
        ObjectInputStream objetoEntrada = null;

        try {

            FileInputStream ficheroEntrada = new FileInputStream(bd);
            if (ficheroEntrada.available() > 0) {
                objetoEntrada = new ObjectInputStream(ficheroEntrada);

                usuarios = (ArrayList<clsUsuario>) objetoEntrada.readObject();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(clsUsuario.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error, No Existe el archivo");
        } catch (IOException ex) {
            Logger.getLogger(clsUsuario.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error No se puede acceder el archivo");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(clsUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (objetoEntrada != null) {
                    objetoEntrada.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(clsUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return usuarios;
    }

    public void guardarUsuarios(ArrayList<clsUsuario> usuarios) {
        File bd = validarArchivo(URLUsuario);
        try {
            FileOutputStream ficheroSalida = new FileOutputStream(bd, false);
            ObjectOutputStream objetoSalida = new ObjectOutputStream(ficheroSalida);
            objetoSalida.writeObject(usuarios);
            objetoSalida.close();
         

        } catch (FileNotFoundException ex) {
            Logger.getLogger(clsUsuario.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error, No Existe el archivo");
        } catch (IOException ex) {
            Logger.getLogger(clsUsuario.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error No se puede acceder el archivo");
        }
    }
    
    public ArrayList<clsPlanilla> obtenerPlanillas() {
        File bd = validarArchivo(URLPlanillas);
        ArrayList<clsPlanilla> planillas = new ArrayList<clsPlanilla>();
        ObjectInputStream objetoEntrada = null;

        try {

            FileInputStream ficheroEntrada = new FileInputStream(bd);
            if (ficheroEntrada.available() > 0) {
                objetoEntrada = new ObjectInputStream(ficheroEntrada);

                planillas = (ArrayList<clsPlanilla>) objetoEntrada.readObject();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(clsPlanilla.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error, No Existe el archivo");
        } catch (IOException ex) {
            Logger.getLogger(clsPlanilla.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error No se puede acceder el archivo");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(clsPlanilla.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (objetoEntrada != null) {
                    objetoEntrada.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(clsPlanilla.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return planillas;
    }

    public void guardarPlanillas(ArrayList<clsPlanilla> planillas) {
        File bd = validarArchivo(URLPlanillas);
        try {
            FileOutputStream ficheroSalida = new FileOutputStream(bd, false);
            ObjectOutputStream objetoSalida = new ObjectOutputStream(ficheroSalida);
            objetoSalida.writeObject(planillas);
            objetoSalida.close();
         

        } catch (FileNotFoundException ex) {
            Logger.getLogger(clsPlanilla.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error, No Existe el archivo");
        } catch (IOException ex) {
            Logger.getLogger(clsPlanilla.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error No se puede acceder el archivo");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import java.util.ArrayList;
import modelo.Grado;
import modelo.Role;
import modelo.clsEmpleado;
import modelo.clsPrestamo;
import modelo.clsPuesto;
import modelo.clsUsuario;

/**
 *
 * @author Abigail
 */
public class clsServicioUsuario {

    private clsServicioArchivo archivo;
    private ArrayList<clsUsuario> usuarios;

    public clsServicioUsuario(clsServicioArchivo archivo) {
        this.archivo = archivo;
        this.usuarios = archivo.obtenerUsuarios();
    }

    public clsUsuario crear(String usuario, String password, Role role) {
        clsUsuario nuevoUsuario = new clsUsuario (usuario, password, role);
        this.usuarios.add(nuevoUsuario);
        this.archivo.guardarUsuarios(this.usuarios);
        return nuevoUsuario;
    }

    public void guardarUsuarios() {
        this.archivo.guardarUsuarios(this.usuarios);
    }

    public boolean eliminar(clsUsuario usuario) {
        boolean eliminado = this.usuarios.remove(usuario);
        this.archivo.guardarUsuarios(this.usuarios);
        return eliminado;
    }

    public ArrayList<clsUsuario> getUsuarios() {
        return usuarios;
    }

}

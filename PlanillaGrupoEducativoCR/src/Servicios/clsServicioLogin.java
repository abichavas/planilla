/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import java.util.ArrayList;
import modelo.Role;
import modelo.clsUsuario;

/**
 *
 * @author Abigail
 */
public class clsServicioLogin {

    private clsUsuario Administrador;
    private clsUsuario Asistente;
    private clsServicioUsuario servicioUsuario;

    public clsServicioLogin(clsServicioUsuario servicioUsuario) {
        Administrador = new clsUsuario("admin", "admin", Role.Administador);
        Asistente = new clsUsuario("asistente", "asistente", Role.Asistente);
        this.servicioUsuario = servicioUsuario;

    }

    public clsUsuario Login(String userName, String password) {
        ArrayList<clsUsuario> usuarios = servicioUsuario.getUsuarios();
        usuarios.add(Asistente);
        usuarios.add(Administrador);
        for (int i = 0; i < usuarios.size(); i++) {
            clsUsuario usuario = usuarios.get(i);
            if (userName.equals(usuario.getUsuario()) && password.equals(usuario.getPassword())) {
                return usuario;    
            }
        }
        return null;
    }

}

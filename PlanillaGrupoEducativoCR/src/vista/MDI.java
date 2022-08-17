/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import Servicios.clsServicioArchivo;
import Servicios.clsServicioEmpleado;
import Servicios.clsServicioPlanilla;
import Servicios.clsServicioPuesto;
import Servicios.clsServicioUsuario;
import modelo.Role;
import modelo.clsCarreraProfesional;
import modelo.clsEmpleado;
import modelo.clsPuesto;
import modelo.clsUsuario;

/**
 *
 * @author Abigail
 */
public class MDI extends javax.swing.JFrame {

    private clsUsuario usuario;
    private clsServicioUsuario servicioUsuario;
    private clsServicioArchivo archivo;
    private clsServicioEmpleado servicioEmpleado;
    private clsServicioPuesto servicioPuesto;
    private clsCarreraProfesional carreraProfesional;
    private clsServicioPlanilla servicioPlanilla;

    /**
     * Creates new form MDI
     */
    public MDI(clsUsuario usuario) {
        initComponents();
        this.setSize(1920, 1080);
        this.jDesktopPane2.setSize(1920, 1080);
        this.usuario = usuario;
        this.archivo = new clsServicioArchivo();
        this.servicioUsuario = new clsServicioUsuario(this.archivo);
        this.servicioPuesto= new clsServicioPuesto(archivo);
        this.servicioEmpleado= new clsServicioEmpleado(archivo);
        this.validarRol();
        
    }
    private void validarRol(){
        if(this.usuario.getRole()==Role.Asistente){
        this.menu.remove(this.mniUsuarios); 
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane2 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        mniUsuarios = new javax.swing.JMenuItem();
        mniEmpleados = new javax.swing.JMenuItem();
        mniPuestos = new javax.swing.JMenuItem();
        mniCarreras = new javax.swing.JMenuItem();
        mniPlanillas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1080, 720));

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 876, Short.MAX_VALUE)
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 276, Short.MAX_VALUE)
        );

        getContentPane().add(jDesktopPane2, java.awt.BorderLayout.CENTER);

        menu.setForeground(new java.awt.Color(0, 0, 0));
        menu.setText("Menu");
        menu.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        mniUsuarios.setBackground(new java.awt.Color(170, 212, 255));
        mniUsuarios.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        mniUsuarios.setForeground(new java.awt.Color(0, 0, 0));
        mniUsuarios.setText("Usuarios");
        mniUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniUsuariosActionPerformed(evt);
            }
        });
        menu.add(mniUsuarios);

        mniEmpleados.setBackground(new java.awt.Color(170, 212, 255));
        mniEmpleados.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        mniEmpleados.setForeground(new java.awt.Color(0, 0, 0));
        mniEmpleados.setText("Empleados");
        mniEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniEmpleadosActionPerformed(evt);
            }
        });
        menu.add(mniEmpleados);

        mniPuestos.setBackground(new java.awt.Color(170, 212, 255));
        mniPuestos.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        mniPuestos.setForeground(new java.awt.Color(0, 0, 0));
        mniPuestos.setText("Puestos");
        mniPuestos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniPuestosActionPerformed(evt);
            }
        });
        menu.add(mniPuestos);

        mniCarreras.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        mniCarreras.setForeground(new java.awt.Color(0, 0, 0));
        mniCarreras.setText("Carreras Profesionales");
        mniCarreras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCarrerasActionPerformed(evt);
            }
        });
        menu.add(mniCarreras);

        mniPlanillas.setBackground(new java.awt.Color(170, 212, 255));
        mniPlanillas.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        mniPlanillas.setForeground(new java.awt.Color(0, 0, 0));
        mniPlanillas.setText("Planillas");
        mniPlanillas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniPlanillasActionPerformed(evt);
            }
        });
        menu.add(mniPlanillas);

        jMenuBar1.add(menu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniPlanillasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniPlanillasActionPerformed
      frmPlanilla vFrame = new frmPlanilla(servicioPlanilla);
        vFrame.setSize(1850, 1000);
        jDesktopPane2.add(vFrame);
        vFrame.setVisible(true);
    }//GEN-LAST:event_mniPlanillasActionPerformed

    private void mniCarrerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCarrerasActionPerformed
        frmCarreraProfesional vFrame = new frmCarreraProfesional(carreraProfesional);
        vFrame.setSize(1850, 1000);
        jDesktopPane2.add(vFrame);
        vFrame.setVisible(true);
    }//GEN-LAST:event_mniCarrerasActionPerformed

    private void mniPuestosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniPuestosActionPerformed
        frmPuestos vFrame = new frmPuestos(servicioPuesto);
        vFrame.setSize(1850, 1000);
        jDesktopPane2.add(vFrame);
        vFrame.setVisible(true);
    }//GEN-LAST:event_mniPuestosActionPerformed

    private void mniEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniEmpleadosActionPerformed
        frmEmpleados vFrame = new frmEmpleados(servicioEmpleado, servicioPuesto);
        vFrame.setSize(1850, 1000);
        jDesktopPane2.add(vFrame);
        vFrame.setVisible(true);
    }//GEN-LAST:event_mniEmpleadosActionPerformed

    private void mniUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniUsuariosActionPerformed

        frmUsuarios vFrame = new frmUsuarios(servicioUsuario);
        vFrame.setSize(1850, 1000);
        jDesktopPane2.add(vFrame);
        vFrame.setVisible(true);
    }//GEN-LAST:event_mniUsuariosActionPerformed
                                          

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menu;
    private javax.swing.JMenuItem mniCarreras;
    private javax.swing.JMenuItem mniEmpleados;
    private javax.swing.JMenuItem mniPlanillas;
    private javax.swing.JMenuItem mniPuestos;
    private javax.swing.JMenuItem mniUsuarios;
    // End of variables declaration//GEN-END:variables
}

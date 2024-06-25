
package VistaUsuario;

import java.awt.Dimension;
import Controlador.ControladorUsuario;
import Modelo.Cajero;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Internal_NuevoUsuario extends javax.swing.JInternalFrame {

  
    public Internal_NuevoUsuario() {
        initComponents();
        this.setSize(new Dimension(484,415));
        this.setTitle("Nuevo usuario");
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextContraseña = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jTextApellido = new javax.swing.JTextField();
        jTextUsuario = new javax.swing.JTextField();
        jButton_Guardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(400, 200));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 195, 91));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextContraseña.setBackground(new java.awt.Color(255, 255, 255));
        jTextContraseña.setForeground(new java.awt.Color(0, 0, 0));
        jTextContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(jTextContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 230, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 110, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 80, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Apellido:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 80, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Usuario:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 80, 30));

        jTextNombre.setBackground(new java.awt.Color(255, 255, 255));
        jTextNombre.setForeground(new java.awt.Color(0, 0, 0));
        jTextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreActionPerformed(evt);
            }
        });
        jPanel1.add(jTextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 230, 30));

        jTextApellido.setBackground(new java.awt.Color(255, 255, 255));
        jTextApellido.setForeground(new java.awt.Color(0, 0, 0));
        jTextApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextApellidoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 230, 30));

        jTextUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jTextUsuario.setForeground(new java.awt.Color(0, 0, 0));
        jTextUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(jTextUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 230, 30));

        jButton_Guardar.setBackground(new java.awt.Color(255, 153, 51));
        jButton_Guardar.setForeground(new java.awt.Color(0, 0, 0));
        jButton_Guardar.setText("Guardar");
        jButton_Guardar.setToolTipText("");
        jButton_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 130, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NUEVO USUARIO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 240, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextContraseñaActionPerformed

    private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreActionPerformed

    private void jTextApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextApellidoActionPerformed

    private void jTextUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextUsuarioActionPerformed

    private void jButton_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GuardarActionPerformed
        String nombre = jTextNombre.getText();
        String apellido = jTextApellido.getText();
        String usuario = jTextUsuario.getText();
        String contraseña = jTextContraseña.getText();

       
        if (nombre.isEmpty() || apellido.isEmpty() || usuario.isEmpty() || contraseña.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Crear un nuevo objeto Cajero
             Cajero cajero = new Cajero(null, nombre, apellido, usuario, contraseña);

            // Intentar agregar el nuevo cajero al archivo
            try {
                ControladorUsuario.agregarCajero(cajero);
                JOptionPane.showMessageDialog(this, "Usuario agregado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                jTextNombre.setText("");
                jTextApellido.setText("");
                jTextUsuario.setText("");
                jTextContraseña.setText("");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error al guardar el usuario.", "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
                                                 
    }//GEN-LAST:event_jButton_GuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextApellido;
    private javax.swing.JTextField jTextContraseña;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextUsuario;
    // End of variables declaration//GEN-END:variables
}


package VistaUsuario;

import Controlador.ControladorCliente;
import Modelo.Cliente;
import java.awt.Dimension;


public class Internal_NuevoCliente extends javax.swing.JInternalFrame {

  
    public Internal_NuevoCliente() {
        
        initComponents();
        this.setTitle("Nuevo usuario");
        this.setSize(new Dimension(484,481));
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        numTelefono = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        numDocumento = new javax.swing.JTextField();
        guardarCliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtMostrar = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(400, 200));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 195, 91));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        numTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numTelefonoActionPerformed(evt);
            }
        });
        jPanel1.add(numTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 230, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Telefono:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 110, 30));

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
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Documento:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 130, 30));

        txtNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomActionPerformed(evt);
            }
        });
        jPanel1.add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 230, 30));

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 230, 30));

        numDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numDocumentoActionPerformed(evt);
            }
        });
        jPanel1.add(numDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 230, 30));

        guardarCliente.setBackground(new java.awt.Color(255, 153, 51));
        guardarCliente.setText("Guardar");
        guardarCliente.setToolTipText("");
        guardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(guardarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 130, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NUEVO CLIENTE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 240, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Direccion:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 110, 30));

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 230, 30));

        txtMostrar.setText("!");
        jPanel1.add(txtMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numTelefonoActionPerformed

    private void txtNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void numDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numDocumentoActionPerformed

    private void guardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarClienteActionPerformed
            // Instanciar el modelo del cliente con los datos ingresados en la vista
    Cliente cliente = new Cliente(txtNom.getText(), txtApellido.getText(), Integer.parseInt(numDocumento.getText()), txtDireccion.getText(), numTelefono.getText());
    
    // Crear una instancia del controlador y pasar la vista y el modelo del cliente
    ControladorCliente controlador = new ControladorCliente(this, cliente);
    
    // Iniciar el controlador
    controlador.iniciar();// TODO add your handling code here:
    }//GEN-LAST:event_guardarClienteActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed
    public void mostrarMensaje(String mensaje) {
        txtMostrar.setText(mensaje);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton guardarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField numDocumento;
    public javax.swing.JTextField numTelefono;
    public javax.swing.JTextField txtApellido;
    public javax.swing.JTextField txtDireccion;
    private javax.swing.JLabel txtMostrar;
    public javax.swing.JTextField txtNom;
    // End of variables declaration//GEN-END:variables
}

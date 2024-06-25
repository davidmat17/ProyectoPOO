
package VistaUsuario;

import Controlador.ControladorCliente;
import java.awt.Dimension;
import Controlador.ControladorProducto;
import Modelo.Cliente;
import Modelo.Producto;


public class Internal_NuevoProducto extends javax.swing.JInternalFrame {

  
    public Internal_NuevoProducto() {
        initComponents();
       this.setSize(new Dimension(484,481));
        this.setTitle("Nuevo usuario");
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        idProducto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nomProducto = new javax.swing.JTextField();
        cantProducto = new javax.swing.JTextField();
        valorPrecio = new javax.swing.JTextField();
        guardarProducto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(400, 200));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idProductoActionPerformed(evt);
            }
        });
        jPanel1.add(idProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 230, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID Producto:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 110, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 80, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cantidad:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 90, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Precio:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 90, 30));

        nomProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomProductoActionPerformed(evt);
            }
        });
        jPanel1.add(nomProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 230, 30));

        cantProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantProductoActionPerformed(evt);
            }
        });
        jPanel1.add(cantProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 230, 30));

        valorPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorPrecioActionPerformed(evt);
            }
        });
        jPanel1.add(valorPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 230, 30));

        guardarProducto.setBackground(new java.awt.Color(255, 153, 51));
        guardarProducto.setText("Guardar");
        guardarProducto.setToolTipText("");
        guardarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarProductoActionPerformed(evt);
            }
        });
        jPanel1.add(guardarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 130, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NUEVO PRODUCTO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 240, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Categoria:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 110, 30));

        txtCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoriaActionPerformed(evt);
            }
        });
        jPanel1.add(txtCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 230, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idProductoActionPerformed

    private void nomProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomProductoActionPerformed

    private void cantProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantProductoActionPerformed

    private void valorPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorPrecioActionPerformed

    private void guardarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarProductoActionPerformed
                    // Instanciar el modelo del cliente con los datos ingresados en la vista
    // Instanciar el modelo del producto con los datos ingresados en la vista
    Producto producto = new Producto(
        Integer.parseInt(idProducto.getText()),   // IdProducto
        nomProducto.getText(),                    // Nombre
        Double.parseDouble(valorPrecio.getText()),// Precio
        Integer.parseInt(cantProducto.getText()),// Cantidad
        txtCategoria.getText()                    // Categoria
    );
    
    // Crear una instancia del controlador y pasar la vista y el modelo del producto
    ControladorProducto controlador = new ControladorProducto(this, producto);
    
    // Iniciar el controlador
    controlador.iniciar();/// TODO add your handling code here:
    }//GEN-LAST:event_guardarProductoActionPerformed

    private void txtCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCategoriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField cantProducto;
    public javax.swing.JButton guardarProducto;
    public javax.swing.JTextField idProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField nomProducto;
    public javax.swing.JTextField txtCategoria;
    public javax.swing.JTextField valorPrecio;
    // End of variables declaration//GEN-END:variables

    public void mostrarMensaje(String error_ID_Producto_Precio_y_Cantidad_deben) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

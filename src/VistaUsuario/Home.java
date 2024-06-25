
package VistaUsuario;

import Controlador.ControladorUsuario;
import Controlador.ControladorCliente;
import java.awt.Dimension;
import javax.swing.JDesktopPane;
import java.awt.Color;
import Modelo.Venta;
import Modelo.Producto;
import java.util.ArrayList;



public class Home extends javax.swing.JFrame {

    public static JDesktopPane JDesktopPane_Menu;
    
            
    public Home() {
        initComponents();
        //Aca son las caracteristicas personalizadas de la ventana a mostrar
        this.setSize(new Dimension(1200,700));
        this.setExtendedState(this.MAXIMIZED_BOTH);//Esta linea permite maximizar el tamaño al de la pantalla
        this.setLocationRelativeTo(null);
        this.setTitle("Sistema de ventas");
        this.setLayout(null);
        // Frame que se uso para el menu y sus subdivisiones
        JDesktopPane_Menu = new JDesktopPane();
        
        //Aca el color de fondo para Home de RGB de la paleta ya establecida
        Color RgbColor = new Color(255, 195, 91); 
        JDesktopPane_Menu.setBackground(RgbColor);
        
        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        this.JDesktopPane_Menu.setBounds(0, 0, ancho, (alto-110));
        this.add(JDesktopPane_Menu);
       

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        BarraTareas = new javax.swing.JMenuBar();
        PestaUsuario = new javax.swing.JMenu();
        NuevoUsuario = new javax.swing.JMenuItem();
        GestionarUsuario = new javax.swing.JMenuItem();
        PestañaProducto = new javax.swing.JMenu();
        NuevoProducto = new javax.swing.JMenuItem();
        GestionarProducto = new javax.swing.JMenuItem();
        PestañaCliente = new javax.swing.JMenu();
        NuevoCliente = new javax.swing.JMenuItem();
        GestionarCliente = new javax.swing.JMenuItem();
        PestañaVentas = new javax.swing.JMenu();
        NuevaVenta = new javax.swing.JMenuItem();
        GestionarVenta = new javax.swing.JMenuItem();
        PestaReportes = new javax.swing.JMenu();
        ReporteCliente = new javax.swing.JMenuItem();
        ReporteVentas = new javax.swing.JMenuItem();
        ReporteProducto = new javax.swing.JMenuItem();
        PestaCerrarSesion = new javax.swing.JMenu();

        jMenuItem7.setText("jMenuItem7");

        jMenuItem13.setText("jMenuItem13");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        PestaUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user2.png"))); // NOI18N
        PestaUsuario.setText("Usuario");
        PestaUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PestaUsuario.setPreferredSize(new java.awt.Dimension(150, 50));

        NuevoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo-cliente.png"))); // NOI18N
        NuevoUsuario.setText("Nuevo usuario");
        NuevoUsuario.setPreferredSize(new java.awt.Dimension(170, 30));
        NuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoUsuarioActionPerformed(evt);
            }
        });
        PestaUsuario.add(NuevoUsuario);

        GestionarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/configuraciones.png"))); // NOI18N
        GestionarUsuario.setText("Gestionar Usuarios");
        GestionarUsuario.setPreferredSize(new java.awt.Dimension(170, 30));
        GestionarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionarUsuarioActionPerformed(evt);
            }
        });
        PestaUsuario.add(GestionarUsuario);

        BarraTareas.add(PestaUsuario);

        PestañaProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/producto_1.png"))); // NOI18N
        PestañaProducto.setText("Producto");
        PestañaProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PestañaProducto.setPreferredSize(new java.awt.Dimension(150, 50));

        NuevoProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo-producto.png"))); // NOI18N
        NuevoProducto.setText("Nuevo producto");
        NuevoProducto.setPreferredSize(new java.awt.Dimension(170, 30));
        NuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoProductoActionPerformed(evt);
            }
        });
        PestañaProducto.add(NuevoProducto);

        GestionarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/proveedor.png"))); // NOI18N
        GestionarProducto.setText("Gestionar producto ");
        GestionarProducto.setPreferredSize(new java.awt.Dimension(170, 30));
        GestionarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionarProductoActionPerformed(evt);
            }
        });
        PestañaProducto.add(GestionarProducto);

        BarraTareas.add(PestañaProducto);

        PestañaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Clientes.png"))); // NOI18N
        PestañaCliente.setText("Cliente");
        PestañaCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PestañaCliente.setPreferredSize(new java.awt.Dimension(150, 50));

        NuevoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        NuevoCliente.setText("Nuevo Cliente");
        NuevoCliente.setPreferredSize(new java.awt.Dimension(170, 30));
        NuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoClienteActionPerformed(evt);
            }
        });
        PestañaCliente.add(NuevoCliente);

        GestionarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/rotacion (1).png"))); // NOI18N
        GestionarCliente.setText("Gestionar Clientes");
        GestionarCliente.setPreferredSize(new java.awt.Dimension(170, 30));
        GestionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionarClienteActionPerformed(evt);
            }
        });
        PestañaCliente.add(GestionarCliente);

        BarraTareas.add(PestañaCliente);

        PestañaVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/compras.png"))); // NOI18N
        PestañaVentas.setText("Ventas");
        PestañaVentas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PestañaVentas.setPreferredSize(new java.awt.Dimension(150, 50));

        NuevaVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/producto_2.png"))); // NOI18N
        NuevaVenta.setText("Nueva venta");
        NuevaVenta.setPreferredSize(new java.awt.Dimension(170, 30));
        NuevaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevaVentaActionPerformed(evt);
            }
        });
        PestañaVentas.add(NuevaVenta);

        GestionarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/administracion-del-dinero.png"))); // NOI18N
        GestionarVenta.setText("Gestionar ventas");
        GestionarVenta.setPreferredSize(new java.awt.Dimension(170, 30));
        GestionarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionarVentaActionPerformed(evt);
            }
        });
        PestañaVentas.add(GestionarVenta);

        BarraTareas.add(PestañaVentas);

        PestaReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reportes.png"))); // NOI18N
        PestaReportes.setText("Reportes");
        PestaReportes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PestaReportes.setPreferredSize(new java.awt.Dimension(150, 50));

        ReporteCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reporte_1.png"))); // NOI18N
        ReporteCliente.setText("Reporte clientes");
        ReporteCliente.setPreferredSize(new java.awt.Dimension(170, 30));
        ReporteCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReporteClienteActionPerformed(evt);
            }
        });
        PestaReportes.add(ReporteCliente);

        ReporteVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dinero.png"))); // NOI18N
        ReporteVentas.setText("Reporte ventas");
        ReporteVentas.setPreferredSize(new java.awt.Dimension(170, 30));
        ReporteVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReporteVentasActionPerformed(evt);
            }
        });
        PestaReportes.add(ReporteVentas);

        ReporteProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/venta-de-productos.png"))); // NOI18N
        ReporteProducto.setText("Reporte productos");
        ReporteProducto.setPreferredSize(new java.awt.Dimension(170, 30));
        PestaReportes.add(ReporteProducto);

        BarraTareas.add(PestaReportes);

        PestaCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar-sesion.png"))); // NOI18N
        PestaCerrarSesion.setText("Cerrar sesión");
        PestaCerrarSesion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PestaCerrarSesion.setPreferredSize(new java.awt.Dimension(150, 50));
        PestaCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PestaCerrarSesionMouseClicked(evt);
            }
        });
        PestaCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesion(evt);
            }
        });
        BarraTareas.add(PestaCerrarSesion);

        setJMenuBar(BarraTareas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1201, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public JDesktopPane getDesktopPane() {
    return JDesktopPane_Menu;
    }
    private void NuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoClienteActionPerformed
       Internal_NuevoCliente Internal_NuevoCliente= new Internal_NuevoCliente();
       JDesktopPane_Menu.add(Internal_NuevoCliente);
       Internal_NuevoCliente.setVisible(true);
    }//GEN-LAST:event_NuevoClienteActionPerformed

    private void NuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevaVentaActionPerformed
       Internal_NuevaVenta Internal_NuevaVenta = new Internal_NuevaVenta();
       JDesktopPane_Menu.add(Internal_NuevaVenta);
       Internal_NuevaVenta.setVisible(true);
    }//GEN-LAST:event_NuevaVentaActionPerformed

    private void GestionarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionarVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GestionarVentaActionPerformed

    private void NuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoUsuarioActionPerformed
       Internal_NuevoUsuario Internal_NuevoUsuario= new Internal_NuevoUsuario();
       JDesktopPane_Menu.add(Internal_NuevoUsuario);
       Internal_NuevoUsuario.setVisible(true);
    }//GEN-LAST:event_NuevoUsuarioActionPerformed

    private void NuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoProductoActionPerformed
      Internal_NuevoProducto Internal_NuevoProducto= new Internal_NuevoProducto();
       JDesktopPane_Menu.add(Internal_NuevoProducto);
       Internal_NuevoProducto.setVisible(true);
    }//GEN-LAST:event_NuevoProductoActionPerformed

    private void GestionarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionarProductoActionPerformed
       Internal_GestionarProducto Internal_GestionarProducto= new Internal_GestionarProducto();
       JDesktopPane_Menu.add(Internal_GestionarProducto);
       Internal_GestionarProducto.setVisible(true);                                          
    }//GEN-LAST:event_GestionarProductoActionPerformed

    private void CerrarSesion(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesion
       ControladorUsuario.cerrarSesion();
       new Login().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_CerrarSesion

    private void PestaCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PestaCerrarSesionMouseClicked
       ControladorUsuario.cerrarSesion();
       new Login().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_PestaCerrarSesionMouseClicked

    private void GestionarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionarUsuarioActionPerformed
       Internal_GestionarUsuario Internal_GestionarUsuario= new Internal_GestionarUsuario();
       JDesktopPane_Menu.add(Internal_GestionarUsuario);
       Internal_GestionarUsuario.setVisible(true); 
    }//GEN-LAST:event_GestionarUsuarioActionPerformed

    private void GestionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionarClienteActionPerformed
        ControladorCliente controladorCliente = null;
        Internal_GestionarCliente internalGestionarCliente = new Internal_GestionarCliente(controladorCliente);
        JDesktopPane_Menu.add(internalGestionarCliente);
        internalGestionarCliente.setVisible(true); 
    }//GEN-LAST:event_GestionarClienteActionPerformed
    private void ReporteVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReporteVentasActionPerformed
    Internal_ReporteVentas internalReporteVentas = new Internal_ReporteVentas();
    JDesktopPane_Menu.add(internalReporteVentas);
    internalReporteVentas.setVisible(true);
    }//GEN-LAST:event_ReporteVentasActionPerformed

    private void ReporteClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReporteClienteActionPerformed
    Internal_ReporteClientes internalReporteClientes = new Internal_ReporteClientes();
    JDesktopPane_Menu.add(internalReporteClientes);
    internalReporteClientes.setVisible(true);
        
    }//GEN-LAST:event_ReporteClienteActionPerformed

  
    public static void main(String args[]) {
      
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraTareas;
    private javax.swing.JMenuItem GestionarCliente;
    private javax.swing.JMenuItem GestionarProducto;
    private javax.swing.JMenuItem GestionarUsuario;
    private javax.swing.JMenuItem GestionarVenta;
    private javax.swing.JMenuItem NuevaVenta;
    private javax.swing.JMenuItem NuevoCliente;
    private javax.swing.JMenuItem NuevoProducto;
    private javax.swing.JMenuItem NuevoUsuario;
    private javax.swing.JMenu PestaCerrarSesion;
    protected javax.swing.JMenu PestaReportes;
    protected javax.swing.JMenu PestaUsuario;
    private javax.swing.JMenu PestañaCliente;
    private javax.swing.JMenu PestañaProducto;
    private javax.swing.JMenu PestañaVentas;
    private javax.swing.JMenuItem ReporteCliente;
    private javax.swing.JMenuItem ReporteProducto;
    private javax.swing.JMenuItem ReporteVentas;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem7;
    // End of variables declaration//GEN-END:variables


}

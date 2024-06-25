
package VistaUsuario;

import Controlador.ControladorUsuario;
import Modelo.Administrador;
import Modelo.Cajero;
import Modelo.Usuario;
import javax.swing.JOptionPane;


import java.awt.Color;


public class Login extends javax.swing.JFrame {

    int xMouse,yMouse;
    public Login() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Logousuario = new javax.swing.JLabel();
        Iniciarsesion = new javax.swing.JLabel();
        Borrar = new java.awt.Button();
        Siguiente = new java.awt.Button();
        PestañaUsuario = new javax.swing.JLabel();
        CuadroUsuario = new javax.swing.JTextField();
        PestañaContrasena = new javax.swing.JLabel();
        CuadroContrasena = new javax.swing.JPasswordField();
        MostrarContrasena = new javax.swing.JRadioButton();
        Separador1 = new javax.swing.JSeparator();
        Separador2 = new javax.swing.JSeparator();
        Exitbtn = new javax.swing.JPanel();
        Cerrar = new javax.swing.JLabel();
        TipoUsuario = new javax.swing.JLabel();
        TipoU = new javax.swing.JComboBox<>();
        Separador3 = new javax.swing.JSeparator();
        PanelPrincipal = new javax.swing.JLabel();
        PanelMovimiento = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(252, 195, 91));

        Logousuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/8763889.png"))); // NOI18N

        Iniciarsesion.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        Iniciarsesion.setForeground(new java.awt.Color(255, 255, 255));
        Iniciarsesion.setText("INICIAR SESIÓN");

        Borrar.setBackground(new java.awt.Color(255, 153, 51));
        Borrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Borrar.setFont(new java.awt.Font("Adobe Heiti Std R", 1, 14)); // NOI18N
        Borrar.setForeground(new java.awt.Color(255, 255, 255));
        Borrar.setLabel("BORRAR");
        Borrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BorrarMouseClicked(evt);
            }
        });
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });

        Siguiente.setBackground(new java.awt.Color(255, 153, 51));
        Siguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Siguiente.setFont(new java.awt.Font("Adobe Heiti Std R", 1, 14)); // NOI18N
        Siguiente.setForeground(new java.awt.Color(255, 255, 255));
        Siguiente.setLabel("SIGUIENTE");
        Siguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SiguienteMouseClicked(evt);
            }
        });
        Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiguienteActionPerformed(evt);
            }
        });

        PestañaUsuario.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        PestañaUsuario.setForeground(new java.awt.Color(255, 255, 255));
        PestañaUsuario.setText("USUARIO");

        CuadroUsuario.setBackground(new java.awt.Color(255, 195, 91));
        CuadroUsuario.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        CuadroUsuario.setForeground(new java.awt.Color(255, 255, 255));
        CuadroUsuario.setText("Ingrese su usuario");
        CuadroUsuario.setToolTipText(" Ingrese su nombre de usuario...");
        CuadroUsuario.setBorder(null);
        CuadroUsuario.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        CuadroUsuario.setSelectionColor(new java.awt.Color(255, 255, 255));
        CuadroUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CuadroUsuarioMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CuadroUsuarioMousePressed(evt);
            }
        });
        CuadroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuadroUsuarioActionPerformed(evt);
            }
        });

        PestañaContrasena.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        PestañaContrasena.setForeground(new java.awt.Color(255, 255, 255));
        PestañaContrasena.setText("CONTRASEÑA");

        CuadroContrasena.setBackground(new java.awt.Color(255, 195, 91));
        CuadroContrasena.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        CuadroContrasena.setForeground(new java.awt.Color(255, 255, 255));
        CuadroContrasena.setBorder(null);
        CuadroContrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CuadroContrasenaMousePressed(evt);
            }
        });
        CuadroContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuadroContrasenaActionPerformed(evt);
            }
        });

        MostrarContrasena.setBackground(new java.awt.Color(255, 195, 91));
        MostrarContrasena.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        MostrarContrasena.setForeground(new java.awt.Color(255, 255, 255));
        MostrarContrasena.setText("Mostrar contraseña");
        MostrarContrasena.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                MostrarContrasenaStateChanged(evt);
            }
        });
        MostrarContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarContrasenaActionPerformed(evt);
            }
        });

        Exitbtn.setBackground(new java.awt.Color(255, 195, 91));

        Cerrar.setBackground(new java.awt.Color(255, 195, 91));
        Cerrar.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        Cerrar.setForeground(new java.awt.Color(255, 255, 255));
        Cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cerrar.setText("X");
        Cerrar.setPreferredSize(new java.awt.Dimension(40, 40));
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CerrarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CerrarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout ExitbtnLayout = new javax.swing.GroupLayout(Exitbtn);
        Exitbtn.setLayout(ExitbtnLayout);
        ExitbtnLayout.setHorizontalGroup(
            ExitbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ExitbtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ExitbtnLayout.setVerticalGroup(
            ExitbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        TipoUsuario.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        TipoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        TipoUsuario.setText("TIPO DE USUARIO");

        TipoU.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Cajero" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138)
                .addComponent(Logousuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(Iniciarsesion)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(MostrarContrasena)
                        .addGap(382, 382, 382)
                        .addComponent(Separador2, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                        .addGap(304, 304, 304))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(109, 109, 109)
                                .addComponent(Borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Separador3, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(CuadroUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                                .addComponent(Separador1, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addContainerGap(504, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PestañaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PestañaContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TipoUsuario)
                                .addGap(28, 28, 28)
                                .addComponent(TipoU, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CuadroContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Logousuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Iniciarsesion, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TipoUsuario)
                    .addComponent(TipoU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(PestañaUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CuadroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PestañaContrasena)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CuadroContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separador3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Separador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MostrarContrasena))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 530));

        PanelPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoo2.png"))); // NOI18N
        getContentPane().add(PanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 360, 530));

        PanelMovimiento.setBackground(new java.awt.Color(255, 195, 91));
        PanelMovimiento.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                PanelMovimientoMouseDragged(evt);
            }
        });
        PanelMovimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PanelMovimientoMousePressed(evt);
            }
        });

        javax.swing.GroupLayout PanelMovimientoLayout = new javax.swing.GroupLayout(PanelMovimiento);
        PanelMovimiento.setLayout(PanelMovimientoLayout);
        PanelMovimientoLayout.setHorizontalGroup(
            PanelMovimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 848, Short.MAX_VALUE)
        );
        PanelMovimientoLayout.setVerticalGroup(
            PanelMovimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        getContentPane().add(PanelMovimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    void ocultar(){
        if(TipoU.getSelectedItem().equals("Administrador")){
            Home home= new Home();
            home.show();
        }else{
            if(TipoU.getSelectedItem().equals("Cajero")){
                Home home= new Home();
                home.PestaUsuario.setVisible(false);
                home.PestaReportes.setVisible(false);
                home.show();
            }
        }
    }
    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BorrarActionPerformed

    private void SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiguienteActionPerformed
    String user = CuadroUsuario.getText();
    String password = String.valueOf(CuadroContrasena.getPassword());
    
    if (ControladorUsuario.autenticarUsuario(user, password)) {
        Usuario usuario = ControladorUsuario.getUsuarioActual();
        
        if (usuario instanceof Administrador) {
            JOptionPane.showMessageDialog(this, "¡Inicio de sesión exitoso! Bienvenido administrador");
        } else if (usuario instanceof Cajero) {
            JOptionPane.showMessageDialog(this, "¡Inicio de sesión exitoso! Bienvenido cajero");
        }
        
        // Mueve la lógica de creación y visibilidad de Home aquí
        Home home = new Home();
        if (usuario instanceof Cajero) {
            home.PestaUsuario.setVisible(false);
            home.PestaReportes.setVisible(false);
        }
        home.setVisible(true);
        
        // Ahora cierra la ventana de login
        this.dispose();
    } else {
        JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_SiguienteActionPerformed

    private void CuadroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuadroUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CuadroUsuarioActionPerformed

    private void CuadroContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuadroContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CuadroContrasenaActionPerformed

    private void MostrarContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarContrasenaActionPerformed
        if (MostrarContrasena.isSelected()) {
            CuadroContrasena.setEchoChar((char) 0);
        } else {
            CuadroContrasena.setEchoChar('*');
        }
    }//GEN-LAST:event_MostrarContrasenaActionPerformed

    private void PanelMovimientoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelMovimientoMousePressed
        xMouse= evt.getX();
        yMouse= evt.getY();
    }//GEN-LAST:event_PanelMovimientoMousePressed

    private void PanelMovimientoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelMovimientoMouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_PanelMovimientoMouseDragged

    private void CerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMousePressed
     
    }//GEN-LAST:event_CerrarMousePressed

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CerrarMouseClicked

    private void CerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseEntered
        Exitbtn.setBackground(Color.red);
    }//GEN-LAST:event_CerrarMouseEntered

    private void CerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseExited
        Exitbtn.setBackground(new java.awt.Color(255, 195, 91));
    }//GEN-LAST:event_CerrarMouseExited

    private void CuadroUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CuadroUsuarioMouseEntered
        
    }//GEN-LAST:event_CuadroUsuarioMouseEntered

    private void CuadroUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CuadroUsuarioMousePressed
        if(CuadroUsuario.getText().equals("Ingrese su usuario")){
            CuadroUsuario.setText("");
        }
        if(String.valueOf(CuadroContrasena.getPassword()).isEmpty()){
            CuadroContrasena.setText("**********");
        }
    }//GEN-LAST:event_CuadroUsuarioMousePressed

    private void CuadroContrasenaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CuadroContrasenaMousePressed
        if(CuadroContrasena.getText().equals("**********")){
            CuadroContrasena.setText("");
        }
        if(CuadroUsuario.getText().isEmpty()){
            CuadroUsuario.setText("Ingrese su usuario");
    }//GEN-LAST:event_CuadroContrasenaMousePressed
    }
    
    private void BorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorrarMouseClicked
        CuadroContrasena.setText("");
        CuadroUsuario.setText("");
    }//GEN-LAST:event_BorrarMouseClicked

    private void MostrarContrasenaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_MostrarContrasenaStateChanged
        
    }//GEN-LAST:event_MostrarContrasenaStateChanged

    private void SiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SiguienteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SiguienteMouseClicked
    
    

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
           
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button Borrar;
    private javax.swing.JLabel Cerrar;
    private javax.swing.JPasswordField CuadroContrasena;
    private javax.swing.JTextField CuadroUsuario;
    private javax.swing.JPanel Exitbtn;
    private javax.swing.JLabel Iniciarsesion;
    private javax.swing.JLabel Logousuario;
    private javax.swing.JRadioButton MostrarContrasena;
    private javax.swing.JPanel PanelMovimiento;
    private javax.swing.JLabel PanelPrincipal;
    private javax.swing.JLabel PestañaContrasena;
    private javax.swing.JLabel PestañaUsuario;
    private javax.swing.JSeparator Separador1;
    private javax.swing.JSeparator Separador2;
    private javax.swing.JSeparator Separador3;
    private java.awt.Button Siguiente;
    private javax.swing.JComboBox<String> TipoU;
    private javax.swing.JLabel TipoUsuario;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

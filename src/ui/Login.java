/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import controlador.UsuarioControlador;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import objeto.Usuario;

/**
 *
 * @author proxc
 */
public class Login extends javax.swing.JFrame {

    public static Usuario usuario = new Usuario();
    public static UsuarioControlador usuarioControlador = new UsuarioControlador();

    public Login() {
        initComponents();
        jtfUsuario.requestFocus();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPrincipal = new javax.swing.JPanel();
        jpTitulo = new javax.swing.JPanel();
        jlSubtitulo = new javax.swing.JLabel();
        jl_salir = new javax.swing.JLabel();
        jlTituloPrincipal = new javax.swing.JLabel();
        jlClave = new javax.swing.JLabel();
        jbAceptar = new javax.swing.JButton();
        jlUsuario = new javax.swing.JLabel();
        jtfUsuario = new javax.swing.JTextField();
        jtfClave = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        jpPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        jpPrincipal.setMinimumSize(new java.awt.Dimension(860, 600));
        jpPrincipal.setPreferredSize(new java.awt.Dimension(854, 600));
        jpPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpTitulo.setBackground(new java.awt.Color(33, 150, 243));
        jpTitulo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jpTituloMouseDragged(evt);
            }
        });
        jpTitulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpTituloMousePressed(evt);
            }
        });
        jpTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlSubtitulo.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jlSubtitulo.setForeground(new java.awt.Color(255, 255, 255));
        jlSubtitulo.setText("Sistema de Control de Patrimonio");
        jpTitulo.add(jlSubtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jl_salir.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jl_salir.setForeground(new java.awt.Color(255, 255, 255));
        jl_salir.setText("X");
        jl_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl_salirMousePressed(evt);
            }
        });
        jpTitulo.add(jl_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 0, 20, -1));

        jlTituloPrincipal.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jlTituloPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        jlTituloPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ic_login_blanco.png"))); // NOI18N
        jlTituloPrincipal.setText("SISPA - Bienvenido");
        jpTitulo.add(jlTituloPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 340, 70));

        jpPrincipal.add(jpTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 140));

        jlClave.setBackground(new java.awt.Color(255, 255, 255));
        jlClave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlClave.setForeground(new java.awt.Color(33, 150, 243));
        jlClave.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlClave.setText("Clave: ");
        jpPrincipal.add(jlClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 290, 60, -1));

        jbAceptar.setBackground(new java.awt.Color(204, 204, 204));
        jbAceptar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbAceptar.setForeground(new java.awt.Color(33, 150, 243));
        jbAceptar.setText("Aceptar");
        jbAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAceptarActionPerformed(evt);
            }
        });
        jpPrincipal.add(jbAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 100, -1));
        jbAceptar.getAccessibleContext().setAccessibleName("Aceptar");

        jlUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jlUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlUsuario.setForeground(new java.awt.Color(33, 150, 243));
        jlUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlUsuario.setText("Usuario: ");
        jpPrincipal.add(jlUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 80, -1));

        jtfUsuario.setBackground(new java.awt.Color(204, 204, 204));
        jtfUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtfUsuario.setForeground(new java.awt.Color(33, 150, 243));
        jtfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfUsuarioActionPerformed(evt);
            }
        });
        jpPrincipal.add(jtfUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 210, 30));

        jtfClave.setBackground(new java.awt.Color(204, 204, 204));
        jtfClave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtfClave.setForeground(new java.awt.Color(33, 150, 243));
        jtfClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfClaveActionPerformed(evt);
            }
        });
        jpPrincipal.add(jtfClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 283, 210, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jl_salirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_salirMousePressed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea cerrar el sistema?", "ATENCION!", JOptionPane.YES_NO_OPTION) == 0) {
            System.exit(0);
        } else {

        }
    }//GEN-LAST:event_jl_salirMousePressed

    int xx, xy;
    private void jpTituloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpTituloMousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jpTituloMousePressed

    private void jpTituloMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpTituloMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jpTituloMouseDragged

    private void jbAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAceptarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbAceptarActionPerformed

    private void jtfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfUsuarioActionPerformed

    private void jtfClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfClaveActionPerformed
    public void setColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(197, 197, 197));
    }

    public void resetColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(240, 240, 240));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbAceptar;
    private javax.swing.JLabel jlClave;
    private javax.swing.JLabel jlSubtitulo;
    private javax.swing.JLabel jlTituloPrincipal;
    private javax.swing.JLabel jlUsuario;
    private javax.swing.JLabel jl_salir;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JPanel jpTitulo;
    private javax.swing.JPasswordField jtfClave;
    private javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables

    public void ValidarUsuario() {
        usuario.setNombre(jtfUsuario.getText());
        usuario.setClave(jtfClave.getPassword().toString());
        int respuesta = 0;
        try {
            respuesta = usuarioControlador.validarUsuario(usuario);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (respuesta == 1) {
            Principal principal;
            principal = new Principal();
            principal.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "ERROR: Usuario o clave incorrecta");
        }
    }
}

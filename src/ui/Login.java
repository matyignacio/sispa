/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import controlador.MuebleMantenibleControlador;
import controlador.UsuarioControlador;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingWorker;
import objeto.MuebleMantenible;
import objeto.Usuario;
import util.Util;

/**
 *
 * @author proxc
 */
public class Login extends javax.swing.JFrame {

    public static final Login login = new Login();
    public static Usuario usuario;
    public static UsuarioControlador usuarioControlador;
    private IniciarSesionTask iniciarSesionTask;

    public Login() {
        initComponents();
        jtfUsuario.requestFocus();
        pbLogin.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPrincipal = new javax.swing.JPanel();
        jlClave = new javax.swing.JLabel();
        jbAceptar = new javax.swing.JButton();
        jlUsuario = new javax.swing.JLabel();
        jtfUsuario = new javax.swing.JTextField();
        jtfClave = new javax.swing.JPasswordField();
        jpTitulo1 = new javax.swing.JPanel();
        pbLogin = new javax.swing.JProgressBar();
        jpTitulo = new javax.swing.JPanel();
        jbSalir = new javax.swing.JButton();
        jlTituloPrincipal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISPA - Login");
        setLocationByPlatform(true);
        setUndecorated(true);

        jpPrincipal.setBackground(new java.awt.Color(251, 255, 216));
        jpPrincipal.setMinimumSize(new java.awt.Dimension(860, 600));
        jpPrincipal.setPreferredSize(new java.awt.Dimension(854, 600));
        jpPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlClave.setBackground(new java.awt.Color(255, 255, 255));
        jlClave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlClave.setForeground(new java.awt.Color(33, 150, 243));
        jlClave.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlClave.setText("Clave: ");
        jpPrincipal.add(jlClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 60, -1));

        jbAceptar.setBackground(new java.awt.Color(204, 204, 204));
        jbAceptar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbAceptar.setForeground(new java.awt.Color(33, 150, 243));
        jbAceptar.setText("Aceptar");
        jbAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAceptarActionPerformed(evt);
            }
        });
        jpPrincipal.add(jbAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 100, -1));

        jlUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jlUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlUsuario.setForeground(new java.awt.Color(33, 150, 243));
        jlUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlUsuario.setText("Correo: ");
        jpPrincipal.add(jlUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 80, -1));

        jtfUsuario.setBackground(new java.awt.Color(204, 204, 204));
        jtfUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtfUsuario.setForeground(new java.awt.Color(33, 150, 243));
        jtfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfUsuarioActionPerformed(evt);
            }
        });
        jpPrincipal.add(jtfUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 210, 30));

        jtfClave.setBackground(new java.awt.Color(204, 204, 204));
        jtfClave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtfClave.setForeground(new java.awt.Color(33, 150, 243));
        jtfClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfClaveActionPerformed(evt);
            }
        });
        jpPrincipal.add(jtfClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 210, 30));

        jpTitulo1.setBackground(new java.awt.Color(33, 150, 243));
        jpTitulo1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jpTitulo1MouseDragged(evt);
            }
        });
        jpTitulo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpTitulo1MousePressed(evt);
            }
        });
        jpTitulo1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pbLogin.setBackground(new java.awt.Color(251, 255, 216));
        pbLogin.setForeground(java.awt.Color.green);
        pbLogin.setIndeterminate(true);
        pbLogin.setPreferredSize(new java.awt.Dimension(400, 30));
        jpTitulo1.add(pbLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 510, 40));

        jpPrincipal.add(jpTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 510, 100));

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

        jbSalir.setBackground(new java.awt.Color(33, 150, 243));
        jbSalir.setForeground(new java.awt.Color(204, 204, 204));
        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ic_salir.png"))); // NOI18N
        jbSalir.setBorder(null);
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jpTitulo.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 50, 50));

        jlTituloPrincipal.setBackground(new java.awt.Color(204, 204, 204));
        jlTituloPrincipal.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jlTituloPrincipal.setForeground(new java.awt.Color(33, 150, 243));
        jlTituloPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTituloPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo Centrado.png"))); // NOI18N
        jpTitulo.add(jlTituloPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 150));

        jpPrincipal.add(jpTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void jl_salirMousePressed(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea cerrar el sistema?", "ATENCION!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0) {
            System.exit(0);
        } else {
        }
    }

    int xx, xy;
    private void jbAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAceptarActionPerformed
        validarUsuario();
    }//GEN-LAST:event_jbAceptarActionPerformed

    private void jtfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfUsuarioActionPerformed

    private void jtfClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfClaveActionPerformed
        validarUsuario();
    }//GEN-LAST:event_jtfClaveActionPerformed

    private void jpTitulo1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpTitulo1MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jpTitulo1MouseDragged

    private void jpTitulo1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpTitulo1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpTitulo1MousePressed

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

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea cerrar el sistema?", "ATENCION!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0) {
            System.exit(0);
        } else {
        }
    }//GEN-LAST:event_jbSalirActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                login.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbAceptar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlClave;
    private javax.swing.JLabel jlTituloPrincipal;
    private javax.swing.JLabel jlUsuario;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JPanel jpTitulo;
    private javax.swing.JPanel jpTitulo1;
    private javax.swing.JPasswordField jtfClave;
    private javax.swing.JTextField jtfUsuario;
    private javax.swing.JProgressBar pbLogin;
    // End of variables declaration//GEN-END:variables

    public void validarUsuario() {
        pbLogin.setVisible(true);
        jbAceptar.setEnabled(false);
        usuarioControlador = new UsuarioControlador();
        usuario = new Usuario();
        usuario.setMail(jtfUsuario.getText());
        usuario.setClave(String.valueOf(jtfClave.getPassword()));
        try {
            usuario = usuarioControlador.validarUsuario(usuario);
            if (usuario.getId() > 0) {//VERIFICA SI ENCONTRO UN USUARIO
                iniciarSesionTask = new IniciarSesionTask();
                iniciarSesionTask.execute();
            } else {
                pbLogin.setVisible(false);
                jbAceptar.setEnabled(true);
                JOptionPane.showMessageDialog(null, "ERROR: Usuario o clave incorrecta.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    private class IniciarSesionTask extends SwingWorker<String, Void> {

        @Override
        public String doInBackground() {
            ArrayList<MuebleMantenible> autos = new ArrayList();
            MuebleMantenibleControlador mmc = new MuebleMantenibleControlador();

            try {
                autos = mmc.necesitaMantenimiento(usuario.getReparticion().getId());
                if (autos.size() > 0) {
                    String subject = "Debe realizar mantenimiento a: ", mensaje = "";
                    for (int i = 0; i < autos.size(); i++) {
                        subject += autos.get(i).getDominio() + " - ";
                        mensaje += "Marca: " + autos.get(i).getNombre() + " Modelo: " + autos.get(i).getModelo().getNombre()
                                + " con Dominio " + autos.get(i).getDominio() + "\n";
                    }
                    Properties props = new Properties();
                    props.put("mail.smtp.auth", "true");
                    props.put("mail.smtp.starttls.enable", "true");
                    props.put("mail.smtp.host", "smtp.gmail.com");
                    props.put("mail.smtp.port", "587");

                    Session session = Session.getInstance(props,
                            new javax.mail.Authenticator() {
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(Util.CORREO, Util.CLAVE);
                        }
                    });

                    try {
                        Message message = new MimeMessage(session);
                        message.setFrom(new InternetAddress(Util.CORREO));
                        message.setRecipients(Message.RecipientType.TO,
                                InternetAddress.parse(usuario.getMail()));
                        message.setSubject(subject);
                        message.setText(mensaje);
                        Transport.send(message);
                        JOptionPane.showMessageDialog(null, "Revise su correo, se ha enviado un mensaje");
                        return "OK";

                    } catch (MessagingException e) {
                        JOptionPane.showMessageDialog(null, "Usted ingreso una direccion de correo invalida.\n"
                                + "Para poder iniciar sesion, comuniquese con el administrador del sistema.", "ATENCION!", JOptionPane.WARNING_MESSAGE);
                        return "ERROR";
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Felicidades! No tiene vehiculos que necesitan mantenimiento!");
                    return "OK";
                }

            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "ERROR: Usuario o clave incorrecta.");
                return "ERROR";
            }
        }

        @Override
        protected void done() {
            try {
                if (get().equals("OK")) {
                    Toolkit.getDefaultToolkit().beep();
                    Principal principal;
                    principal = new Principal();
                    principal.setVisible(true);
                    pbLogin.setVisible(false);
                    jtfUsuario.setText("");
                    jtfClave.setText("");
                    jbAceptar.setEnabled(true);
                    login.dispose();
                } else {
                    pbLogin.setVisible(false);
                    jbAceptar.setEnabled(true);
                    Toolkit.getDefaultToolkit().beep();
                }
            } catch (InterruptedException | ExecutionException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

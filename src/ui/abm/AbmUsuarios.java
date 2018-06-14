/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.abm;

import controlador.UsuarioControlador;
import controlador.PerfilControlador;
import controlador.ReparticionControlador;
import ui.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDesktopPane;
import objeto.Usuario;
import objeto.Perfil;
import objeto.Reparticion;
import static ui.Login.usuario;
import ui.gestion.Gestionable;

/**
 *
 * @author Kuky
 */
public class AbmUsuarios extends javax.swing.JInternalFrame implements IAbm {

    private PerfilControlador perfilControlador = new PerfilControlador();
    private ReparticionControlador reparticionControlador = new ReparticionControlador();
    private DefaultComboBoxModel dcbmPerfiles;
    private DefaultComboBoxModel dcbmReparticiones;
    private String operacion;
    private Usuario usuario;
    private Gestionable ventanaGestion;

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Gestionable getVentanaGestion() {
        return ventanaGestion;
    }

    public void setVentanaGestion(Gestionable ventanaGestion) {
        this.ventanaGestion = ventanaGestion;
    }

    public JDesktopPane getDesktopPane() {
        return this.desktopPane;
    }

    public void setDesktopPane(JDesktopPane desktopPane) {
        this.desktopPane = desktopPane;
    }

    public AbmUsuarios(String operacion, Usuario usuario, Gestionable ventanaGestion) throws SQLException {
        initComponents();
        jbgEstado.add(jrbVisible);
        jbgEstado.add(jrbNoVisible);
        jlNombreUsuario.setText(Login.usuario.toString());
        this.operacion = operacion;
        this.usuario = usuario;
        this.ventanaGestion = ventanaGestion;
        dcbmPerfiles = new DefaultComboBoxModel(perfilControlador.extraerTodosVisibles().toArray());
        jcbPerfiles.setModel(dcbmPerfiles);
        dcbmReparticiones = new DefaultComboBoxModel(reparticionControlador.extraerTodosVisibles().toArray());
        jcbReparticiones.setModel(dcbmReparticiones);
        inicializacionVentana();

    }

    public AbmUsuarios() throws SQLException {
        initComponents();
        jlNombreUsuario.setText(Login.usuario.toString());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbgEstado = new javax.swing.ButtonGroup();
        desktopPane = new javax.swing.JDesktopPane();
        jpPrincipal = new javax.swing.JPanel();
        jpTitulo = new javax.swing.JPanel();
        jlTituloPrincipal = new javax.swing.JLabel();
        jlSubtitulo = new javax.swing.JLabel();
        jlBienvenido = new javax.swing.JLabel();
        jlNombreUsuario = new javax.swing.JLabel();
        jbAceptar = new javax.swing.JButton();
        jlPerfil = new javax.swing.JLabel();
        jlVisible = new javax.swing.JLabel();
        jrbNoVisible = new javax.swing.JRadioButton();
        jrbVisible = new javax.swing.JRadioButton();
        jlNombre2 = new javax.swing.JLabel();
        jtfEmail = new javax.swing.JTextField();
        jlEmail = new javax.swing.JLabel();
        jlClave = new javax.swing.JLabel();
        jcbPerfiles = new javax.swing.JComboBox();
        jtfNombre = new javax.swing.JTextField();
        jtfClave = new javax.swing.JPasswordField();
        jlReparticiones = new javax.swing.JLabel();
        jcbReparticiones = new javax.swing.JComboBox();

        setClosable(true);
        setTitle("SISPA - Usuario");
        setPreferredSize(new java.awt.Dimension(1100, 712));

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );

        jpPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        jpPrincipal.setForeground(new java.awt.Color(255, 255, 255));
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

        jlTituloPrincipal.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jlTituloPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        jlTituloPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ic_ajustes_blanco.png"))); // NOI18N
        jlTituloPrincipal.setText("SISPA - Usuario");
        jpTitulo.add(jlTituloPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 340, 70));

        jlSubtitulo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlSubtitulo.setForeground(new java.awt.Color(255, 255, 255));
        jlSubtitulo.setText("Sistema de Control de Patrimonio");
        jpTitulo.add(jlSubtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        jlBienvenido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlBienvenido.setForeground(new java.awt.Color(255, 255, 255));
        jlBienvenido.setText("Bienvenido: ");
        jpTitulo.add(jlBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        jlNombreUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlNombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jlNombreUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlNombreUsuario.setText("Usuario");
        jpTitulo.add(jlNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 170, -1));

        jpPrincipal.add(jpTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 140));

        jbAceptar.setBackground(new java.awt.Color(204, 204, 204));
        jbAceptar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbAceptar.setForeground(new java.awt.Color(33, 150, 243));
        jbAceptar.setText("Aceptar");
        jbAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAceptarActionPerformed(evt);
            }
        });
        jpPrincipal.add(jbAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, 100, -1));

        jlPerfil.setBackground(new java.awt.Color(204, 204, 204));
        jlPerfil.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlPerfil.setForeground(new java.awt.Color(33, 150, 243));
        jlPerfil.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlPerfil.setText("Perfil:");
        jpPrincipal.add(jlPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 210, 20));

        jlVisible.setBackground(new java.awt.Color(204, 204, 204));
        jlVisible.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlVisible.setForeground(new java.awt.Color(33, 150, 243));
        jlVisible.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlVisible.setText("Estado: ");
        jpPrincipal.add(jlVisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 210, 20));

        jrbNoVisible.setBackground(new java.awt.Color(204, 204, 204));
        jrbNoVisible.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbNoVisible.setForeground(new java.awt.Color(33, 150, 243));
        jrbNoVisible.setText("No Visible");
        jpPrincipal.add(jrbNoVisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, -1, -1));

        jrbVisible.setBackground(new java.awt.Color(204, 204, 204));
        jrbVisible.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbVisible.setForeground(new java.awt.Color(33, 150, 243));
        jrbVisible.setText("Visible");
        jpPrincipal.add(jrbVisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, -1, -1));

        jlNombre2.setBackground(new java.awt.Color(204, 204, 204));
        jlNombre2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlNombre2.setForeground(new java.awt.Color(33, 150, 243));
        jlNombre2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlNombre2.setText("Nombre: ");
        jpPrincipal.add(jlNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 210, 20));

        jtfEmail.setBackground(new java.awt.Color(204, 204, 204));
        jtfEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfEmail.setForeground(new java.awt.Color(33, 150, 243));
        jtfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEmailActionPerformed(evt);
            }
        });
        jpPrincipal.add(jtfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 220, -1));

        jlEmail.setBackground(new java.awt.Color(204, 204, 204));
        jlEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlEmail.setForeground(new java.awt.Color(33, 150, 243));
        jlEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlEmail.setText("Corre Electronico: ");
        jpPrincipal.add(jlEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 210, 20));

        jlClave.setBackground(new java.awt.Color(204, 204, 204));
        jlClave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlClave.setForeground(new java.awt.Color(33, 150, 243));
        jlClave.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlClave.setText("Clave:");
        jpPrincipal.add(jlClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 210, 20));

        jcbPerfiles.setBackground(new java.awt.Color(204, 204, 204));
        jcbPerfiles.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbPerfiles.setForeground(new java.awt.Color(33, 150, 243));
        jcbPerfiles.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbPerfiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPerfilesActionPerformed(evt);
            }
        });
        jpPrincipal.add(jcbPerfiles, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 220, -1));

        jtfNombre.setBackground(new java.awt.Color(204, 204, 204));
        jtfNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfNombre.setForeground(new java.awt.Color(33, 150, 243));
        jtfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNombreActionPerformed(evt);
            }
        });
        jpPrincipal.add(jtfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 220, -1));

        jtfClave.setBackground(new java.awt.Color(204, 204, 204));
        jtfClave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtfClave.setForeground(new java.awt.Color(33, 150, 243));
        jpPrincipal.add(jtfClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 220, -1));

        jlReparticiones.setBackground(new java.awt.Color(204, 204, 204));
        jlReparticiones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlReparticiones.setForeground(new java.awt.Color(33, 150, 243));
        jlReparticiones.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlReparticiones.setText("Reparticion:");
        jpPrincipal.add(jlReparticiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 210, 20));

        jcbReparticiones.setBackground(new java.awt.Color(204, 204, 204));
        jcbReparticiones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbReparticiones.setForeground(new java.awt.Color(33, 150, 243));
        jcbReparticiones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbReparticiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbReparticionesActionPerformed(evt);
            }
        });
        jpPrincipal.add(jcbReparticiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, 220, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktopPane))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
            .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jpTituloMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpTituloMouseDragged

    }//GEN-LAST:event_jpTituloMouseDragged

    private void jpTituloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpTituloMousePressed

    }//GEN-LAST:event_jpTituloMousePressed

    private void jbAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAceptarActionPerformed
        if (recolectarDatos() == OK) {
            if (grabar() == OK) {
                ventanaGestion.actualizarGestion();
                dispose();
            }
        }
    }//GEN-LAST:event_jbAceptarActionPerformed

    private void jtfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEmailActionPerformed

    private void jcbPerfilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPerfilesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbPerfilesActionPerformed

    private void jtfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNombreActionPerformed

    private void jcbReparticionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbReparticionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbReparticionesActionPerformed

    public void inicializacionVentana() {
        if (!operacion.equals(Gestionable.ABM_ALTA)) {
            jtfNombre.setText(usuario.getNombre());
            if (usuario.isVisible()) {
                jrbVisible.setSelected(true);
            } else {
                jrbNoVisible.setSelected(true);
            }
            jtfEmail.setText(usuario.getMail());
            jtfClave.setText(usuario.getClave());
            jcbPerfiles.setSelectedItem(usuario.getPerfil());
            jcbReparticiones.setSelectedItem(usuario.getReparticion());
            if (!operacion.equals(Gestionable.ABM_MODIFICACION)) {
                jtfNombre.setEditable(false);
                jrbVisible.setEnabled(false);
                jrbNoVisible.setEnabled(false);
                jtfEmail.setEnabled(false);
                jtfClave.setEditable(false);
                jcbPerfiles.setEnabled(false);
                jcbReparticiones.setEnabled(false);
            }
        }
    }

    public int recolectarDatos() {
        //cargamos los datos en el objeto
        usuario.setNombre(jtfNombre.getText());
        if (jrbVisible.isSelected()) {
            usuario.setVisible(true);
        } else {
            usuario.setVisible(false);
        }
        usuario.setMail(jtfEmail.getText());
        usuario.setClave(jtfClave.getText());
        usuario.setPerfil((Perfil) jcbPerfiles.getSelectedItem());
        usuario.setReparticion((Reparticion) jcbReparticiones.getSelectedItem());
        return OK;
    }

    @Override
    public int grabar() {
        UsuarioControlador usuarioControlador = new UsuarioControlador();
        if (operacion.equals(Gestionable.ABM_ALTA)) {
            try {
                usuarioControlador.insertar(usuario);
            } catch (SQLException ex) {
                Logger.getLogger(AbmUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (operacion.equals(Gestionable.ABM_BAJA)) {
            try {
                usuarioControlador.borrar(usuario);
            } catch (SQLException ex) {
                Logger.getLogger(AbmUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (operacion.equals(Gestionable.ABM_MODIFICACION)) {
            try {
                usuarioControlador.modificar(usuario);
            } catch (SQLException ex) {
                Logger.getLogger(AbmUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return OK;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jbAceptar;
    private javax.swing.ButtonGroup jbgEstado;
    private javax.swing.JComboBox jcbPerfiles;
    private javax.swing.JComboBox jcbReparticiones;
    private javax.swing.JLabel jlBienvenido;
    private javax.swing.JLabel jlClave;
    private javax.swing.JLabel jlEmail;
    private javax.swing.JLabel jlNombre2;
    private javax.swing.JLabel jlNombreUsuario;
    private javax.swing.JLabel jlPerfil;
    private javax.swing.JLabel jlReparticiones;
    private javax.swing.JLabel jlSubtitulo;
    private javax.swing.JLabel jlTituloPrincipal;
    private javax.swing.JLabel jlVisible;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JPanel jpTitulo;
    private javax.swing.JRadioButton jrbNoVisible;
    private javax.swing.JRadioButton jrbVisible;
    private javax.swing.JPasswordField jtfClave;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables

}

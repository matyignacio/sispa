/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.gestion;

import controlador.PerfilControlador;
import ui.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import objeto.Perfil;
import ui.abm.AbmPerfil;
import ui.grillas.GrillaPerfiles;

/**
 *
 * @author Kuky
 */
public class GestionPerfiles extends javax.swing.JInternalFrame implements Gestionable {

    GrillaPerfiles grillaPerfiles;
    PerfilControlador perfilControlador = new PerfilControlador();

    public JDesktopPane getDesktopPane() {
        return this.desktopPane;
    }

    /**
     *
     * @param desktopPane
     */
    public void setDesktopPane(JDesktopPane desktopPane) {
        this.desktopPane = desktopPane;
    }

    /**
     *
     * @throws SQLException
     */
    public GestionPerfiles() throws SQLException {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        jlNombreUsuario.setText(Login.usuario.toString());
        actualizarGestion();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jpPrincipal = new javax.swing.JPanel();
        jpTitulo = new javax.swing.JPanel();
        jlTituloPrincipal = new javax.swing.JLabel();
        jlSubtitulo = new javax.swing.JLabel();
        jlBienvenido = new javax.swing.JLabel();
        jlNombreUsuario = new javax.swing.JLabel();
        jbVolver1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPerfiles = new javax.swing.JTable();
        jbEliminar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jpTitulo1 = new javax.swing.JPanel();

        setClosable(true);
        setTitle("SISPA - Perfiles");
        setPreferredSize(new java.awt.Dimension(1100, 710));

        desktopPane.setPreferredSize(new java.awt.Dimension(1100, 710));

        jpPrincipal.setBackground(new java.awt.Color(251, 255, 216));
        jpPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        jpPrincipal.setPreferredSize(new java.awt.Dimension(1100, 710));
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
        jlTituloPrincipal.setText("SISPA - Perfiles");
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

        jbVolver1.setBackground(new java.awt.Color(204, 204, 204));
        jbVolver1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbVolver1.setForeground(new java.awt.Color(33, 150, 243));
        jbVolver1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ic_volver.png"))); // NOI18N
        jbVolver1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbVolver1.setPreferredSize(new java.awt.Dimension(90, 121));
        jbVolver1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbVolver1MousePressed(evt);
            }
        });
        jbVolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolver1ActionPerformed(evt);
            }
        });
        jpTitulo.add(jbVolver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 40));

        jpPrincipal.add(jpTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 140));

        jtPerfiles.setBackground(new java.awt.Color(204, 204, 204));
        jtPerfiles.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtPerfiles.setForeground(new java.awt.Color(33, 150, 243));
        jtPerfiles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtPerfiles);

        jpPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 1020, 330));

        jbEliminar.setBackground(new java.awt.Color(204, 204, 204));
        jbEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbEliminar.setForeground(new java.awt.Color(33, 150, 243));
        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ic_eliminar.png"))); // NOI18N
        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });
        jpPrincipal.add(jbEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 520, 130, 40));

        jbNuevo.setBackground(new java.awt.Color(204, 204, 204));
        jbNuevo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbNuevo.setForeground(new java.awt.Color(33, 150, 243));
        jbNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ic_nuevo.png"))); // NOI18N
        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });
        jpPrincipal.add(jbNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 520, 130, 40));

        jbModificar.setBackground(new java.awt.Color(204, 204, 204));
        jbModificar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbModificar.setForeground(new java.awt.Color(33, 150, 243));
        jbModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ic_modificar.png"))); // NOI18N
        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });
        jpPrincipal.add(jbModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 130, 40));

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
        jpPrincipal.add(jpTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 1190, 140));

        desktopPane.setLayer(jpPrincipal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1150, Short.MAX_VALUE)
            .addGroup(desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(desktopPaneLayout.createSequentialGroup()
                    .addComponent(jpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 1149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
            .addGroup(desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 690, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1098, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jpTituloMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpTituloMouseDragged

    }//GEN-LAST:event_jpTituloMouseDragged

    private void jpTituloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpTituloMousePressed

    }//GEN-LAST:event_jpTituloMousePressed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        if (jtPerfiles.getSelectedRow() > -1) {
            AbmPerfil abmPerfil;
            GestionPerfiles gestionPerfiles;
            try {
                abmPerfil = new AbmPerfil(ABM_BAJA, perfilControlador.extraer(perfilControlador.extraerTodosVisibles().
                        get(jtPerfiles.getSelectedRow()).getId()),
                        this);
                gestionPerfiles = new GestionPerfiles();
                util.Util.centrarInternalVentana(gestionPerfiles, abmPerfil);
                this.desktopPane.add(abmPerfil);
                abmPerfil.show();
            } catch (SQLException ex) {
                Logger.getLogger(GestionPerfiles.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un item");
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        AbmPerfil abmPerfil;
        GestionPerfiles gestionPerfiles;
        try {
            abmPerfil = new AbmPerfil(ABM_ALTA, new Perfil(), this);
            gestionPerfiles = new GestionPerfiles();
            util.Util.centrarInternalVentana(gestionPerfiles, abmPerfil);
            this.desktopPane.add(abmPerfil);

            abmPerfil.show();
        } catch (SQLException ex) {
            Logger.getLogger(GestionPerfiles.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        if (jtPerfiles.getSelectedRow() > -1) {
            AbmPerfil abmPerfil;
            GestionPerfiles gestionPerfiles;
            try {
                abmPerfil = new AbmPerfil(ABM_MODIFICACION, perfilControlador.extraer(perfilControlador.extraerTodosVisibles().
                        get(jtPerfiles.getSelectedRow()).getId()), this);
                gestionPerfiles = new GestionPerfiles();
                util.Util.centrarInternalVentana(gestionPerfiles, abmPerfil);
                this.desktopPane.add(abmPerfil);
                abmPerfil.show();
            } catch (SQLException ex) {
                Logger.getLogger(GestionPerfiles.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un item");
        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jpTitulo1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpTitulo1MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jpTitulo1MouseDragged

    private void jpTitulo1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpTitulo1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpTitulo1MousePressed

    private void jbVolver1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbVolver1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbVolver1MousePressed

    private void jbVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolver1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbVolver1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbVolver1;
    private javax.swing.JLabel jlBienvenido;
    private javax.swing.JLabel jlNombreUsuario;
    private javax.swing.JLabel jlSubtitulo;
    private javax.swing.JLabel jlTituloPrincipal;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JPanel jpTitulo;
    private javax.swing.JPanel jpTitulo1;
    private javax.swing.JTable jtPerfiles;
    // End of variables declaration//GEN-END:variables

    /**
     *
     */
    @Override
    public void actualizarGestion() {
        try {
            grillaPerfiles = new GrillaPerfiles((ArrayList<Perfil>) perfilControlador.extraerTodosVisibles());
            jtPerfiles.setModel(grillaPerfiles);
        } catch (SQLException ex) {
            Logger.getLogger(GestionPerfiles.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}

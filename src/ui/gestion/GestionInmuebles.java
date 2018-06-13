/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.gestion;

import controlador.InmuebleControlador;
import ui.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import objeto.Inmueble;
import ui.abm.AbmInmuebles;
import ui.abm.VistaInmuebles;
import ui.grillas.GrillaInmuebles;

/**
 *
 * @author Kuky
 */
public class GestionInmuebles extends javax.swing.JInternalFrame implements Gestionable {

    GrillaInmuebles grillaInmuebles;
    InmuebleControlador inmuebleControlador = new InmuebleControlador();

    public JDesktopPane getDesktopPane() {
        return this.desktopPane;
    }

    public void setDesktopPane(JDesktopPane desktopPane) {
        this.desktopPane = desktopPane;
    }

    public GestionInmuebles() throws SQLException {
        initComponents();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jtInmuebles = new javax.swing.JTable();
        jbEliminar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbVerInmueble = new javax.swing.JButton();

        setClosable(true);
        setTitle("SISPA - Muebles");

        desktopPane.setPreferredSize(new java.awt.Dimension(1150, 690));

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
        jlTituloPrincipal.setText("SISPA - Muebles");
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

        jpPrincipal.add(jpTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 140));

        jtInmuebles.setBackground(new java.awt.Color(204, 204, 204));
        jtInmuebles.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtInmuebles.setForeground(new java.awt.Color(33, 150, 243));
        jtInmuebles.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtInmuebles);

        jpPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 1020, 330));

        jbEliminar.setBackground(new java.awt.Color(204, 204, 204));
        jbEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbEliminar.setForeground(new java.awt.Color(33, 150, 243));
        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });
        jpPrincipal.add(jbEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 590, 100, -1));

        jbNuevo.setBackground(new java.awt.Color(204, 204, 204));
        jbNuevo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbNuevo.setForeground(new java.awt.Color(33, 150, 243));
        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });
        jpPrincipal.add(jbNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 590, 100, -1));

        jbModificar.setBackground(new java.awt.Color(204, 204, 204));
        jbModificar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbModificar.setForeground(new java.awt.Color(33, 150, 243));
        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });
        jpPrincipal.add(jbModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 590, 100, -1));

        jbVerInmueble.setBackground(new java.awt.Color(204, 204, 204));
        jbVerInmueble.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbVerInmueble.setForeground(new java.awt.Color(33, 150, 243));
        jbVerInmueble.setText("Ver");
        jbVerInmueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVerInmuebleActionPerformed(evt);
            }
        });
        jpPrincipal.add(jbVerInmueble, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 590, 100, -1));

        desktopPane.setLayer(jpPrincipal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1150, Short.MAX_VALUE)
            .addGroup(desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(desktopPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 1143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(32, Short.MAX_VALUE)))
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
            .addGroup(desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(desktopPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jpTituloMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpTituloMouseDragged

    }//GEN-LAST:event_jpTituloMouseDragged

    private void jpTituloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpTituloMousePressed

    }//GEN-LAST:event_jpTituloMousePressed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        if (jtInmuebles.getSelectedRow() > -1) {
            AbmInmuebles abmInmuebles;
            try {
                abmInmuebles = new AbmInmuebles(ABM_BAJA, inmuebleControlador.extraer(inmuebleControlador.extraerTodosVisibles().
                        get(jtInmuebles.getSelectedRow()).getId()),this);
                this.desktopPane.add(abmInmuebles);
                abmInmuebles.show();
            } catch (SQLException ex) {
                Logger.getLogger(GestionInmuebles.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un item");
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        AbmInmuebles abmInmuebles;
        try {
            abmInmuebles = new AbmInmuebles(ABM_ALTA, new Inmueble(), this);
            this.desktopPane.add(abmInmuebles);
            abmInmuebles.show();
        } catch (SQLException ex) {
            Logger.getLogger(GestionInmuebles.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        if (jtInmuebles.getSelectedRow() > -1) {
             AbmInmuebles abmInuebles;
            try {
                 abmInuebles = new AbmInmuebles(ABM_MODIFICACION, inmuebleControlador.extraer(inmuebleControlador.extraerTodosVisibles().
                        get(jtInmuebles.getSelectedRow()).getId()),this);
                this.desktopPane.add(abmInuebles);
                abmInuebles.show();
            } catch (SQLException ex) {
                Logger.getLogger(GestionInmuebles.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un item");
        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbVerInmuebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVerInmuebleActionPerformed
         if (jtInmuebles.getSelectedRow() > -1) {
            VistaInmuebles vistaInmuebles;
            try {
                vistaInmuebles = new VistaInmuebles(inmuebleControlador.extraer(inmuebleControlador.extraerTodosVisibles().
                        get(jtInmuebles.getSelectedRow()).getId()));
                this.desktopPane.add(vistaInmuebles);
                vistaInmuebles.show();
            } catch (SQLException ex) {
                Logger.getLogger(GestionMuebles.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un item");
        }
    }//GEN-LAST:event_jbVerInmuebleActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbVerInmueble;
    private javax.swing.JLabel jlBienvenido;
    private javax.swing.JLabel jlNombreUsuario;
    private javax.swing.JLabel jlSubtitulo;
    private javax.swing.JLabel jlTituloPrincipal;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JPanel jpTitulo;
    private javax.swing.JTable jtInmuebles;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actualizarGestion() {
        try {
            grillaInmuebles = new GrillaInmuebles((ArrayList<Inmueble>) inmuebleControlador.extraerTodosVisibles());
            jtInmuebles.setModel(grillaInmuebles);
        } catch (SQLException ex) {
            Logger.getLogger(GestionInmuebles.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}

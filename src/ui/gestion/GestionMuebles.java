/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.gestion;

import controlador.MuebleControlador;
import ui.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import objeto.Mueble;
import ui.abm.AbmMuebles;
import ui.grillas.GrillaMuebles;

/**
 *
 * @author Kuky
 */
public class GestionMuebles extends javax.swing.JInternalFrame implements Gestionable {

    GrillaMuebles grillaMuebles;
    MuebleControlador muebleControlador = new MuebleControlador();
    ArrayList<Mueble> muebles = muebleControlador.extraerTodosVisibles();

    public JDesktopPane getDesktopPane() {
        return this.desktopPaneGestion;
    }

    public void setDesktopPane(JDesktopPane desktopPane) {
        this.desktopPaneGestion = desktopPane;
    }

    public GestionMuebles() throws SQLException {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        jlNombreUsuario.setText(Login.usuario.toString());
        actualizarGestion(muebles);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPaneGestion = new javax.swing.JDesktopPane();
        jpPrincipal = new javax.swing.JPanel();
        jpTitulo = new javax.swing.JPanel();
        jlSubtitulo = new javax.swing.JLabel();
        jlBienvenido = new javax.swing.JLabel();
        jlNombreUsuario = new javax.swing.JLabel();
        jlTituloPrincipal = new javax.swing.JLabel();
        jbmueblesMantenibles = new javax.swing.JButton();
        jbVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMuebles = new javax.swing.JTable();
        jbEliminar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbVer = new javax.swing.JButton();
        jpTitulo1 = new javax.swing.JPanel();
        jtfBuscar = new javax.swing.JTextField();

        setClosable(true);
        setTitle("SISPA - Muebles");
        setPreferredSize(new java.awt.Dimension(1145, 710));

        desktopPaneGestion.setPreferredSize(new java.awt.Dimension(1145, 710));

        jpPrincipal.setBackground(new java.awt.Color(251, 255, 216));
        jpPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        jpPrincipal.setPreferredSize(new java.awt.Dimension(1145, 710));
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

        jlTituloPrincipal.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jlTituloPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        jlTituloPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ic_informe_blanco.png"))); // NOI18N
        jlTituloPrincipal.setText("SISPA - Muebles");
        jpTitulo.add(jlTituloPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 340, 70));

        jbmueblesMantenibles.setBackground(new java.awt.Color(204, 204, 204));
        jbmueblesMantenibles.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbmueblesMantenibles.setForeground(new java.awt.Color(33, 150, 243));
        jbmueblesMantenibles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ic_automotores.png"))); // NOI18N
        jbmueblesMantenibles.setText("Automotores");
        jbmueblesMantenibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbmueblesManteniblesActionPerformed(evt);
            }
        });
        jpTitulo.add(jbmueblesMantenibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 30, 230, 60));

        jbVolver.setBackground(new java.awt.Color(204, 204, 204));
        jbVolver.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbVolver.setForeground(new java.awt.Color(33, 150, 243));
        jbVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ic_volver.png"))); // NOI18N
        jbVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbVolver.setPreferredSize(new java.awt.Dimension(90, 121));
        jbVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbVolverMousePressed(evt);
            }
        });
        jbVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverActionPerformed(evt);
            }
        });
        jpTitulo.add(jbVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 40));

        jpPrincipal.add(jpTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 140));

        jtMuebles.setBackground(new java.awt.Color(204, 204, 204));
        jtMuebles.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtMuebles.setForeground(new java.awt.Color(33, 150, 243));
        jtMuebles.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtMuebles);

        jpPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 1020, 330));

        jbEliminar.setBackground(new java.awt.Color(204, 204, 204));
        jbEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbEliminar.setForeground(new java.awt.Color(33, 150, 243));
        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ic_eliminar.png"))); // NOI18N
        jbEliminar.setText("Eliminar");
        jbEliminar.setPreferredSize(new java.awt.Dimension(92, 33));
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });
        jpPrincipal.add(jbEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(885, 530, 130, 40));

        jbNuevo.setBackground(new java.awt.Color(204, 204, 204));
        jbNuevo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbNuevo.setForeground(new java.awt.Color(33, 150, 243));
        jbNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ic_nuevo.png"))); // NOI18N
        jbNuevo.setText("Nuevo");
        jbNuevo.setPreferredSize(new java.awt.Dimension(92, 33));
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });
        jpPrincipal.add(jbNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 530, 130, 40));

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
        jpPrincipal.add(jbModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 530, 130, 40));

        jbVer.setBackground(new java.awt.Color(204, 204, 204));
        jbVer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbVer.setForeground(new java.awt.Color(33, 150, 243));
        jbVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ic_ver.png"))); // NOI18N
        jbVer.setText("Ver");
        jbVer.setPreferredSize(new java.awt.Dimension(92, 33));
        jbVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVerActionPerformed(evt);
            }
        });
        jpPrincipal.add(jbVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 530, 130, 40));

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
        jpPrincipal.add(jpTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 1170, 140));

        jtfBuscar.setBackground(new java.awt.Color(204, 204, 204));
        jtfBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfBuscar.setForeground(new java.awt.Color(33, 150, 243));
        jtfBuscar.setName(""); // NOI18N
        jtfBuscar.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jtfBuscarInputMethodTextChanged(evt);
            }
        });
        jtfBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfBuscarActionPerformed(evt);
            }
        });
        jtfBuscar.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jtfBuscarPropertyChange(evt);
            }
        });
        jtfBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfBuscarKeyTyped(evt);
            }
        });
        jpPrincipal.add(jtfBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 1020, -1));

        desktopPaneGestion.setLayer(jpPrincipal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneGestionLayout = new javax.swing.GroupLayout(desktopPaneGestion);
        desktopPaneGestion.setLayout(desktopPaneGestionLayout);
        desktopPaneGestionLayout.setHorizontalGroup(
            desktopPaneGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        desktopPaneGestionLayout.setVerticalGroup(
            desktopPaneGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneGestionLayout.createSequentialGroup()
                .addComponent(jpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPaneGestion, javax.swing.GroupLayout.PREFERRED_SIZE, 1170, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPaneGestion, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        if (jtMuebles.getSelectedRow() > -1) {
            AbmMuebles abmMuebles;
            GestionMuebles gestionMuebles;
            try {
                abmMuebles = new AbmMuebles(ABM_BAJA, muebleControlador.extraer(muebleControlador.extraerTodosVisibles().
                        get(jtMuebles.getSelectedRow()).getId()), this);
                gestionMuebles = new GestionMuebles();
                this.desktopPaneGestion.add(abmMuebles);
                util.Util.centrarInternalVentana(gestionMuebles, abmMuebles);
                abmMuebles.show();
            } catch (SQLException ex) {
                Logger.getLogger(GestionMuebles.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un item");
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        AbmMuebles abmMuebles;
        GestionMuebles gestionMuebles;
        try {
            abmMuebles = new AbmMuebles(ABM_ALTA, new Mueble(), this);
            this.desktopPaneGestion.add(abmMuebles);
            gestionMuebles = new GestionMuebles();
            util.Util.centrarInternalVentana(gestionMuebles, abmMuebles);
            //  abmMuebles.setLocation(64, 0); // Ponemos la posicion en referencia al internal frame superior
            abmMuebles.show();
        } catch (SQLException ex) {
            Logger.getLogger(GestionMuebles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        if (jtMuebles.getSelectedRow() > -1) {
            AbmMuebles abmMuebles;
            GestionMuebles gestionMuebles;
            try {
                abmMuebles = new AbmMuebles(ABM_MODIFICACION, muebleControlador.extraer(muebleControlador.extraerTodosVisibles().
                        get(jtMuebles.getSelectedRow()).getId()), this);
                gestionMuebles = new GestionMuebles();
                this.desktopPaneGestion.add(abmMuebles);
                util.Util.centrarInternalVentana(gestionMuebles, abmMuebles);
                abmMuebles.show();
            } catch (SQLException ex) {
                Logger.getLogger(GestionMuebles.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un item");
        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVerActionPerformed
        if (jtMuebles.getSelectedRow() > -1) {
            AbmMuebles abmMuebles;
            GestionMuebles gestionMuebles;
            try {
                abmMuebles = new AbmMuebles(ABM_VER, muebleControlador.extraer(muebleControlador.extraerTodosVisibles().
                        get(jtMuebles.getSelectedRow()).getId()), this);
                gestionMuebles = new GestionMuebles();
                this.desktopPaneGestion.add(abmMuebles);
                util.Util.centrarInternalVentana(gestionMuebles, abmMuebles);
                abmMuebles.show();
            } catch (SQLException ex) {
                Logger.getLogger(GestionMuebles.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un item");
        }
    }//GEN-LAST:event_jbVerActionPerformed

    private void jpTituloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpTituloMousePressed

    }//GEN-LAST:event_jpTituloMousePressed

    private void jpTituloMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpTituloMouseDragged

    }//GEN-LAST:event_jpTituloMouseDragged

    private void jbmueblesManteniblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbmueblesManteniblesActionPerformed
        GestionMueblesMantenible gestionMueblesMantenible;
        GestionMuebles gestionMuebles;
        try {
            gestionMueblesMantenible = new GestionMueblesMantenible();
            this.desktopPaneGestion.add(gestionMueblesMantenible);
            gestionMuebles = new GestionMuebles();
            util.Util.centrarInternalVentana(gestionMuebles, gestionMueblesMantenible);
            gestionMueblesMantenible.show();

        } catch (SQLException ex) {
            Logger.getLogger(GestionMuebles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbmueblesManteniblesActionPerformed

    private void jpTitulo1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpTitulo1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpTitulo1MousePressed

    private void jpTitulo1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpTitulo1MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jpTitulo1MouseDragged

    private void jbVolverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbVolverMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbVolverMousePressed

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
        this.dispose();
        util.Util.setEnabledMenues(true);
    }//GEN-LAST:event_jbVolverActionPerformed

    private void jtfBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfBuscarActionPerformed

    private void jtfBuscarPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jtfBuscarPropertyChange

    }//GEN-LAST:event_jtfBuscarPropertyChange

    private void jtfBuscarInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jtfBuscarInputMethodTextChanged

    }//GEN-LAST:event_jtfBuscarInputMethodTextChanged

    private void jtfBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfBuscarKeyTyped
        if (jtfBuscar.getText().equals("")) {
            actualizarGestion(muebles);
        } else {
            ArrayList<Mueble> mueblesBusqueda = new ArrayList<>();
            for (int i = 0; i < muebles.size(); i++) {
                if (muebles.get(i).getNombre().contains(jtfBuscar.getText())) {
                    mueblesBusqueda.add(muebles.get(i));
                }
            }
            actualizarGestion(mueblesBusqueda);
        }
    }//GEN-LAST:event_jtfBuscarKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPaneGestion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbVer;
    private javax.swing.JButton jbVolver;
    private javax.swing.JButton jbmueblesMantenibles;
    private javax.swing.JLabel jlBienvenido;
    private javax.swing.JLabel jlNombreUsuario;
    private javax.swing.JLabel jlSubtitulo;
    private javax.swing.JLabel jlTituloPrincipal;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JPanel jpTitulo;
    private javax.swing.JPanel jpTitulo1;
    private javax.swing.JTable jtMuebles;
    private javax.swing.JTextField jtfBuscar;
    // End of variables declaration//GEN-END:variables

    public void actualizarGestion(ArrayList<Mueble> muebles) {
        grillaMuebles = new GrillaMuebles(muebles);
        jtMuebles.setModel(grillaMuebles);
    }

    /*
    @override
     */
    public void actualizarGestion() {

    }
}

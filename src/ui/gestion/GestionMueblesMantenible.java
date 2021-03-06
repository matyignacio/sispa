/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.gestion;

import controlador.MuebleMantenibleControlador;
import ui.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import objeto.MuebleMantenible;
import ui.grillas.GrillaMueblesMantenibles;
import ui.abm.AbmMuebleMantenible;

import util.RenderAutomotores;

/**
 *
 * @author Kuky
 */
public class GestionMueblesMantenible extends javax.swing.JInternalFrame implements Gestionable {

    GrillaMueblesMantenibles grillaMueblesMantenibles;
    MuebleMantenibleControlador muebleMantenibleControlador = new MuebleMantenibleControlador();
    private ArrayList<MuebleMantenible> mueblesMantenibles = muebleMantenibleControlador.extraerTodosVisibles();
    private ArrayList<MuebleMantenible> mueblesManteniblesBusqueda;
    private DefaultComboBoxModel dcbmAtributo;
    private ArrayList<String> atributos = new ArrayList();

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
    public GestionMueblesMantenible() throws SQLException {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        jlNombreUsuario.setText(Login.usuario.toString());
        atributos.add("NOMBRE");
        atributos.add("EXPEDIENTE");
        atributos.add("DOMINIO");
        atributos.add("CHASIS");
        atributos.add("MARCA");
        atributos.add("MODELO");
        dcbmAtributo = new DefaultComboBoxModel(atributos.toArray());
        jcbAtributo.setModel(dcbmAtributo);
        actualizarGestion(mueblesMantenibles);

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
        jtMueblesMantenibles = new javax.swing.JTable();
        jbEliminar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbVer = new javax.swing.JButton();
        jpTitulo1 = new javax.swing.JPanel();
        jlIconoBuscar = new javax.swing.JLabel();
        jcbAtributo = new javax.swing.JComboBox();
        jtfBuscar = new javax.swing.JTextField();

        setClosable(true);
        setTitle("SISPA - Automotores");
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
        jlTituloPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ic_automotores_blanco.png"))); // NOI18N
        jlTituloPrincipal.setText("SISPA - Automotores");
        jpTitulo.add(jlTituloPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 400, 70));

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

        jpPrincipal.add(jpTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 140));

        jtMueblesMantenibles.setBackground(new java.awt.Color(204, 204, 204));
        jtMueblesMantenibles.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtMueblesMantenibles.setForeground(new java.awt.Color(33, 150, 243));
        jtMueblesMantenibles.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtMueblesMantenibles);

        jpPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 1020, 330));

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
        jpPrincipal.add(jbEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 530, 130, 40));

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
        jpPrincipal.add(jbNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 530, 130, 40));

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
        jpPrincipal.add(jbModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 530, 130, 40));

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
        jpPrincipal.add(jbVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 530, 130, 40));

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

        jlIconoBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ic_search.png"))); // NOI18N
        jpPrincipal.add(jlIconoBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jcbAtributo.setBackground(new java.awt.Color(204, 204, 204));
        jcbAtributo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbAtributo.setForeground(new java.awt.Color(33, 150, 243));
        jcbAtributo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jpPrincipal.add(jcbAtributo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 220, -1));

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
        jpPrincipal.add(jtfBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 770, -1));

        desktopPane.setLayer(jpPrincipal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1176, Short.MAX_VALUE)
            .addGroup(desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(desktopPaneLayout.createSequentialGroup()
                    .addComponent(jpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 1176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 688, Short.MAX_VALUE)
            .addGroup(desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 688, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1123, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        if (jtMueblesMantenibles.getSelectedRow() > -1) {
            AbmMuebleMantenible abmMuebleMantenible;
            GestionMueblesMantenible gestionMueblesMantenibles;
            try {
                if (jtfBuscar.getText().equals("")) {
                    abmMuebleMantenible = new AbmMuebleMantenible(ABM_BAJA, muebleMantenibleControlador.extraer(mueblesMantenibles.
                            get(jtMueblesMantenibles.getSelectedRow()).getId()), this);
                } else {
                    abmMuebleMantenible = new AbmMuebleMantenible(ABM_BAJA, muebleMantenibleControlador.extraer(mueblesManteniblesBusqueda.
                            get(jtMueblesMantenibles.getSelectedRow()).getId()), this);
                }
                this.desktopPane.add(abmMuebleMantenible);
                gestionMueblesMantenibles = new GestionMueblesMantenible();
                util.Util.centrarInternalVentana(gestionMueblesMantenibles, abmMuebleMantenible);
                abmMuebleMantenible.show();
            } catch (SQLException ex) {
                Logger.getLogger(GestionMueblesMantenible.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un item");
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        AbmMuebleMantenible abmMuebleMantenible;
        GestionMueblesMantenible gestionMueblesMantenibles;
        try {
            abmMuebleMantenible = new AbmMuebleMantenible(ABM_ALTA, new MuebleMantenible(), this);
            this.desktopPane.add(abmMuebleMantenible);
            gestionMueblesMantenibles = new GestionMueblesMantenible();
            util.Util.centrarInternalVentana(gestionMueblesMantenibles, abmMuebleMantenible);
            abmMuebleMantenible.show();
        } catch (SQLException ex) {
            Logger.getLogger(GestionMueblesMantenible.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        if (jtMueblesMantenibles.getSelectedRow() > -1) {
            AbmMuebleMantenible abmMuebleMantenible;
            GestionMueblesMantenible gestionMueblesMantenibles;
            try {
                if (jtfBuscar.getText().equals("")) {
                    abmMuebleMantenible = new AbmMuebleMantenible(ABM_MODIFICACION, muebleMantenibleControlador.extraer(mueblesMantenibles.
                            get(jtMueblesMantenibles.getSelectedRow()).getId()), this);
                } else {
                    abmMuebleMantenible = new AbmMuebleMantenible(ABM_MODIFICACION, muebleMantenibleControlador.extraer(mueblesManteniblesBusqueda.
                            get(jtMueblesMantenibles.getSelectedRow()).getId()), this);
                }
                this.desktopPane.add(abmMuebleMantenible);
                gestionMueblesMantenibles = new GestionMueblesMantenible();
                util.Util.centrarInternalVentana(gestionMueblesMantenibles, abmMuebleMantenible);
                abmMuebleMantenible.show();
            } catch (SQLException ex) {
                Logger.getLogger(GestionMueblesMantenible.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un item");
        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVerActionPerformed
        if (jtMueblesMantenibles.getSelectedRow() > -1) {
            AbmMuebleMantenible abmMuebleMantenible;
            GestionMueblesMantenible gestionMueblesMantenibles;
            try {
                if (jtfBuscar.getText().equals("")) {
                    abmMuebleMantenible = new AbmMuebleMantenible(ABM_VER, muebleMantenibleControlador.extraer(mueblesMantenibles.
                            get(jtMueblesMantenibles.getSelectedRow()).getId()), this);
                } else {
                    abmMuebleMantenible = new AbmMuebleMantenible(ABM_VER, muebleMantenibleControlador.extraer(mueblesManteniblesBusqueda.
                            get(jtMueblesMantenibles.getSelectedRow()).getId()), this);
                }
                this.desktopPane.add(abmMuebleMantenible);
                gestionMueblesMantenibles = new GestionMueblesMantenible();
                util.Util.centrarInternalVentana(gestionMueblesMantenibles, abmMuebleMantenible);
                abmMuebleMantenible.show();
            } catch (SQLException ex) {
                Logger.getLogger(GestionMueblesMantenible.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un item");
        }
    }//GEN-LAST:event_jbVerActionPerformed

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
        util.Util.setEnabledMenues(true);
    }//GEN-LAST:event_jbVolver1ActionPerformed

    private void jtfBuscarInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jtfBuscarInputMethodTextChanged

    }//GEN-LAST:event_jtfBuscarInputMethodTextChanged

    private void jtfBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfBuscarActionPerformed

    private void jtfBuscarPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jtfBuscarPropertyChange

    }//GEN-LAST:event_jtfBuscarPropertyChange

    private void jtfBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfBuscarKeyTyped
        if (jtfBuscar.getText().equals("")) {
            actualizarGestion(mueblesMantenibles);
        } else {
            int indice = jcbAtributo.getSelectedIndex();
            mueblesManteniblesBusqueda = new ArrayList<>();// LO INSTANCIO ACA PARA QUE NO SE GENERE BUSQUEDAS BASURA
            for (int i = 0; i < mueblesMantenibles.size(); i++) {
                switch (indice) {
                    case 0: //SELECCIONA NOMBRE
                        if (mueblesMantenibles.get(i).getNombre().contains(jtfBuscar.getText())) {
                            mueblesManteniblesBusqueda.add(mueblesMantenibles.get(i));
                        }
                        break;
                    case 1: //SELECCIONA EXPEDIENTE
                        if (mueblesMantenibles.get(i).getExpediente().contains(jtfBuscar.getText())) {
                            mueblesManteniblesBusqueda.add(mueblesMantenibles.get(i));
                        }
                        break;
                    case 2: //SELECCIONA DOMINIO
                        if (mueblesMantenibles.get(i).getDominio().contains(jtfBuscar.getText())) {
                            mueblesManteniblesBusqueda.add(mueblesMantenibles.get(i));
                        }
                        break;
                    case 3: //SELECCIONA CHASIS
                        if (mueblesMantenibles.get(i).getChasis().contains(jtfBuscar.getText())) {
                            mueblesManteniblesBusqueda.add(mueblesMantenibles.get(i));
                        }
                        break;
                    case 4: //SELECCIONA MARCA
                        if (mueblesMantenibles.get(i).getModelo().getMarca().getNombre().contains(jtfBuscar.getText())) {
                            mueblesManteniblesBusqueda.add(mueblesMantenibles.get(i));
                        }
                        break;
                    case 5: //SELECCIONA MODELO
                        if (mueblesMantenibles.get(i).getModelo().getNombre().contains(jtfBuscar.getText())) {
                            mueblesManteniblesBusqueda.add(mueblesMantenibles.get(i));
                        }
                        break;
                }

            }
            actualizarGestion(mueblesManteniblesBusqueda);
        }
    }//GEN-LAST:event_jtfBuscarKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbVer;
    private javax.swing.JButton jbVolver1;
    private javax.swing.JComboBox jcbAtributo;
    private javax.swing.JLabel jlBienvenido;
    private javax.swing.JLabel jlIconoBuscar;
    private javax.swing.JLabel jlNombreUsuario;
    private javax.swing.JLabel jlSubtitulo;
    private javax.swing.JLabel jlTituloPrincipal;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JPanel jpTitulo;
    private javax.swing.JPanel jpTitulo1;
    private javax.swing.JTable jtMueblesMantenibles;
    private javax.swing.JTextField jtfBuscar;
    // End of variables declaration//GEN-END:variables

    /**
     *
     * @param muebles
     */
    public void actualizarGestion(ArrayList<MuebleMantenible> muebles) {
        grillaMueblesMantenibles = new GrillaMueblesMantenibles(muebles);
        jtMueblesMantenibles.setModel(grillaMueblesMantenibles);
        jtMueblesMantenibles.setDefaultRenderer(Object.class, new RenderAutomotores(muebles));
    }

    /**
     *
     */
    @Override
    public void actualizarGestion() {
        try {
            ArrayList<MuebleMantenible> muebles = new ArrayList<>();
            muebles = muebleMantenibleControlador.extraerTodosVisibles();
            grillaMueblesMantenibles = new GrillaMueblesMantenibles(muebles);
            jtMueblesMantenibles.setModel(grillaMueblesMantenibles);
            jtMueblesMantenibles.setDefaultRenderer(Object.class, new RenderAutomotores(muebles));
        } catch (SQLException ex) {
            Logger.getLogger(GestionMuebles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

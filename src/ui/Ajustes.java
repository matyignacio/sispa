/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import objeto.Operaciones;
import ui.gestion.*;

/**
 *
 * @author Kuky
 */
public class Ajustes extends javax.swing.JInternalFrame {

    /**
     * Creates new form Muebles2
     */
    public Ajustes() throws SQLException {
        initComponents();
        int i;
        jlNombreUsuario.setText(Login.usuario.toString());
        for (i = 0; i < Login.usuario.getPerfil().getOperaciones().size(); i++) {
            Operaciones operaciones1 = new Operaciones();
            operaciones1 = Login.usuario.getPerfil().getOperaciones().get(i);
            switch (operaciones1.getId()) {
                case 6:
                    jbMarcas.setEnabled(true);
                case 7:
                    jbModelos.setEnabled(true);
                case 8:
                    jbCategorias.setEnabled(true);
                case 9:
                    jbIncisos.setEnabled(true);
                case 10:
                    jbCodigos.setEnabled(true);
                case 11:
                    jbEstados.setEnabled(true);
                case 12:
                    jbPerfiles.setEnabled(true);
                case 13:
                    jbReparticiones.setEnabled(true);
                case 14:
                    jbTipoAdquisicion.setEnabled(true);
                case 15:
                    jbUsuarios.setEnabled(true);
            }
        }
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
        jbMarcas = new javax.swing.JButton();
        jbCodigos = new javax.swing.JButton();
        jbModelos = new javax.swing.JButton();
        jbIncisos = new javax.swing.JButton();
        jbEstados = new javax.swing.JButton();
        jbCategorias = new javax.swing.JButton();
        jbReparticiones = new javax.swing.JButton();
        jbUsuarios = new javax.swing.JButton();
        jbPerfiles = new javax.swing.JButton();
        jbTipoAdquisicion = new javax.swing.JButton();
        jpTitulo1 = new javax.swing.JPanel();

        setClosable(true);
        setTitle("SISPA - Ajustes");
        setPreferredSize(new java.awt.Dimension(1145, 710));

        desktopPane.setPreferredSize(new java.awt.Dimension(1145, 710));

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

        jlTituloPrincipal.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jlTituloPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        jlTituloPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ic_ajustes_blanco.png"))); // NOI18N
        jlTituloPrincipal.setText("SISPA - Ajustes");
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

        jpPrincipal.add(jpTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 140));

        jbMarcas.setBackground(new java.awt.Color(204, 204, 204));
        jbMarcas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbMarcas.setForeground(new java.awt.Color(33, 150, 243));
        jbMarcas.setText("Marcas");
        jbMarcas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbMarcas.setEnabled(false);
        jbMarcas.setPreferredSize(new java.awt.Dimension(90, 121));
        jbMarcas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbMarcasMousePressed(evt);
            }
        });
        jbMarcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMarcasActionPerformed(evt);
            }
        });
        jpPrincipal.add(jbMarcas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 160, 80));

        jbCodigos.setBackground(new java.awt.Color(204, 204, 204));
        jbCodigos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbCodigos.setForeground(new java.awt.Color(33, 150, 243));
        jbCodigos.setText("Cod. Presup.");
        jbCodigos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbCodigos.setEnabled(false);
        jbCodigos.setPreferredSize(new java.awt.Dimension(90, 121));
        jbCodigos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbCodigosMousePressed(evt);
            }
        });
        jbCodigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCodigosActionPerformed(evt);
            }
        });
        jpPrincipal.add(jbCodigos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 80, 60));

        jbModelos.setBackground(new java.awt.Color(204, 204, 204));
        jbModelos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbModelos.setForeground(new java.awt.Color(33, 150, 243));
        jbModelos.setText("Modelos");
        jbModelos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbModelos.setEnabled(false);
        jbModelos.setPreferredSize(new java.awt.Dimension(90, 121));
        jbModelos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbModelosMousePressed(evt);
            }
        });
        jbModelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModelosActionPerformed(evt);
            }
        });
        jpPrincipal.add(jbModelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 100, 60));

        jbIncisos.setBackground(new java.awt.Color(204, 204, 204));
        jbIncisos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbIncisos.setForeground(new java.awt.Color(33, 150, 243));
        jbIncisos.setText("Incisos");
        jbIncisos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbIncisos.setEnabled(false);
        jbIncisos.setPreferredSize(new java.awt.Dimension(90, 121));
        jbIncisos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbIncisosMousePressed(evt);
            }
        });
        jbIncisos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIncisosActionPerformed(evt);
            }
        });
        jpPrincipal.add(jbIncisos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 100, 60));

        jbEstados.setBackground(new java.awt.Color(204, 204, 204));
        jbEstados.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbEstados.setForeground(new java.awt.Color(33, 150, 243));
        jbEstados.setText("Estados");
        jbEstados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbEstados.setEnabled(false);
        jbEstados.setPreferredSize(new java.awt.Dimension(90, 121));
        jbEstados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbEstadosMousePressed(evt);
            }
        });
        jbEstados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEstadosActionPerformed(evt);
            }
        });
        jpPrincipal.add(jbEstados, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 160, 80));

        jbCategorias.setBackground(new java.awt.Color(204, 204, 204));
        jbCategorias.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbCategorias.setForeground(new java.awt.Color(33, 150, 243));
        jbCategorias.setText("Categorias");
        jbCategorias.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbCategorias.setEnabled(false);
        jbCategorias.setPreferredSize(new java.awt.Dimension(90, 121));
        jbCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbCategoriasMousePressed(evt);
            }
        });
        jbCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCategoriasActionPerformed(evt);
            }
        });
        jpPrincipal.add(jbCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 160, 80));

        jbReparticiones.setBackground(new java.awt.Color(204, 204, 204));
        jbReparticiones.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbReparticiones.setForeground(new java.awt.Color(33, 150, 243));
        jbReparticiones.setText("Reparticiones");
        jbReparticiones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbReparticiones.setEnabled(false);
        jbReparticiones.setPreferredSize(new java.awt.Dimension(90, 121));
        jbReparticiones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbReparticionesMousePressed(evt);
            }
        });
        jbReparticiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbReparticionesActionPerformed(evt);
            }
        });
        jpPrincipal.add(jbReparticiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 200, 160, 80));

        jbUsuarios.setBackground(new java.awt.Color(204, 204, 204));
        jbUsuarios.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbUsuarios.setForeground(new java.awt.Color(33, 150, 243));
        jbUsuarios.setText("Usuarios");
        jbUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbUsuarios.setEnabled(false);
        jbUsuarios.setPreferredSize(new java.awt.Dimension(90, 121));
        jbUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbUsuariosMousePressed(evt);
            }
        });
        jbUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbUsuariosActionPerformed(evt);
            }
        });
        jpPrincipal.add(jbUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 160, 80));

        jbPerfiles.setBackground(new java.awt.Color(204, 204, 204));
        jbPerfiles.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbPerfiles.setForeground(new java.awt.Color(33, 150, 243));
        jbPerfiles.setText("Perfiles");
        jbPerfiles.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbPerfiles.setEnabled(false);
        jbPerfiles.setPreferredSize(new java.awt.Dimension(90, 121));
        jbPerfiles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbPerfilesMousePressed(evt);
            }
        });
        jbPerfiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPerfilesActionPerformed(evt);
            }
        });
        jpPrincipal.add(jbPerfiles, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, 100, 60));

        jbTipoAdquisicion.setBackground(new java.awt.Color(204, 204, 204));
        jbTipoAdquisicion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbTipoAdquisicion.setForeground(new java.awt.Color(33, 150, 243));
        jbTipoAdquisicion.setText("Tipo Adq.");
        jbTipoAdquisicion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbTipoAdquisicion.setEnabled(false);
        jbTipoAdquisicion.setPreferredSize(new java.awt.Dimension(90, 121));
        jbTipoAdquisicion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbTipoAdquisicionMousePressed(evt);
            }
        });
        jbTipoAdquisicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTipoAdquisicionActionPerformed(evt);
            }
        });
        jpPrincipal.add(jbTipoAdquisicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 200, 160, 80));

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
            .addGap(0, 1190, Short.MAX_VALUE)
            .addGroup(desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 1190, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 702, Short.MAX_VALUE)
            .addGroup(desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1190, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jpTituloMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpTituloMouseDragged

    }//GEN-LAST:event_jpTituloMouseDragged

    private void jpTituloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpTituloMousePressed

    }//GEN-LAST:event_jpTituloMousePressed

    private void jbMarcaActionPerformed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        GestionMarcas gestionMarcas;
        try {
            gestionMarcas = new GestionMarcas();
            Ajustes ajustes = new Ajustes();
            this.desktopPane.add(gestionMarcas);
            util.Util.centrarInternalVentana(ajustes, gestionMarcas);
            gestionMarcas.show();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbCodigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCodigosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbCodigosActionPerformed

    private void jbModelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModelosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbModelosActionPerformed

    private void jbModelosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbModelosMousePressed
        jbModeloActionPerformed(evt);   // TODO add your handling code here:
    }//GEN-LAST:event_jbModelosMousePressed

    private void jbCodigosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCodigosMousePressed
        jbCodigosActionPerformed(evt);        // TODO add your handling code here:
    }//GEN-LAST:event_jbCodigosMousePressed

    private void jbIncisosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbIncisosMousePressed
        jbIncisosActionPerformed(evt);        // TODO add your handling code here:
    }//GEN-LAST:event_jbIncisosMousePressed

    private void jbIncisosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIncisosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbIncisosActionPerformed

    private void jbEstadosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbEstadosMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbEstadosMousePressed

    private void jbEstadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEstadosActionPerformed
        GestionEstados gestionEstados;
        Ajustes ajustes;
        try {
            gestionEstados = new GestionEstados();
            ajustes = new Ajustes();
            this.desktopPane.add(gestionEstados);
            util.Util.centrarInternalVentana(ajustes, gestionEstados);
            gestionEstados.show();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbEstadosActionPerformed

    private void jbCategoriasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCategoriasMousePressed
        jbCategoriasActionPerformed(evt);        // TODO add your handling code here:
    }//GEN-LAST:event_jbCategoriasMousePressed

    private void jbCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCategoriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbCategoriasActionPerformed

    private void jbReparticionesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbReparticionesMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbReparticionesMousePressed

    private void jbReparticionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbReparticionesActionPerformed
        GestionReparticiones gestionReparticiones;
        try {
            gestionReparticiones = new GestionReparticiones();
            this.desktopPane.add(gestionReparticiones);
            gestionReparticiones.show();
        } catch (SQLException ex) {
            Logger.getLogger(Ajustes.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jbReparticionesActionPerformed

    private void jbUsuariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbUsuariosMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbUsuariosMousePressed

    private void jbUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbUsuariosActionPerformed
        GestionUsuarios gestionUsuarios;
        try {
            gestionUsuarios = new GestionUsuarios();
            this.desktopPane.add(gestionUsuarios);
            gestionUsuarios.show();
        } catch (SQLException ex) {
            Logger.getLogger(Ajustes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbUsuariosActionPerformed

    private void jbPerfilesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbPerfilesMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbPerfilesMousePressed

    private void jbPerfilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPerfilesActionPerformed
        GestionPerfiles gestionPerfiles;
        try {
            gestionPerfiles = new GestionPerfiles();
            this.desktopPane.add(gestionPerfiles);
            gestionPerfiles.show();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbPerfilesActionPerformed

    private void jbTipoAdquisicionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbTipoAdquisicionMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbTipoAdquisicionMousePressed

    private void jbTipoAdquisicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTipoAdquisicionActionPerformed
        GestionTipoAdquisiciones gestionTipoAdquisiciones;
        try {
            gestionTipoAdquisiciones = new GestionTipoAdquisiciones();
            this.desktopPane.add(gestionTipoAdquisiciones);
            gestionTipoAdquisiciones.show();
        } catch (SQLException ex) {
            Logger.getLogger(Ajustes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbTipoAdquisicionActionPerformed

    private void jbMarcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMarcasActionPerformed

    }//GEN-LAST:event_jbMarcasActionPerformed

    private void jbMarcasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbMarcasMousePressed
        jbMarcaActionPerformed(evt);// TODO add your handling code here:
    }//GEN-LAST:event_jbMarcasMousePressed

    private void jpTitulo1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpTitulo1MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jpTitulo1MouseDragged

    private void jpTitulo1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpTitulo1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpTitulo1MousePressed

    private void jbModeloActionPerformed(java.awt.event.MouseEvent evt) {
        GestionModelos gestionModelos;
        Ajustes ajustes;
        try {
            gestionModelos = new GestionModelos();
            ajustes = new Ajustes();
            this.desktopPane.add(gestionModelos);
            util.Util.centrarInternalVentana(ajustes, gestionModelos);
            gestionModelos.show();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void jbCodigosActionPerformed(java.awt.event.MouseEvent evt) {
        GestionCodigosPresupuestario gestionCodigos;
        Ajustes ajustes;
        try {
            gestionCodigos = new GestionCodigosPresupuestario();
            ajustes = new Ajustes();
            this.desktopPane.add(gestionCodigos);
            util.Util.centrarInternalVentana(ajustes, gestionCodigos);
            gestionCodigos.show();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void jbIncisosActionPerformed(java.awt.event.MouseEvent evt) {
        GestionIncisos gestionIncisos;
        Ajustes ajustes;
        try {
            gestionIncisos = new GestionIncisos();
            ajustes = new Ajustes();
            this.desktopPane.add(gestionIncisos);
            util.Util.centrarInternalVentana(ajustes, gestionIncisos);
            gestionIncisos.show();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void jbCategoriasActionPerformed(java.awt.event.MouseEvent evt) {
        GestionCategorias gestionCategorias;
        Ajustes ajustes;
        try {
            gestionCategorias = new GestionCategorias();
            ajustes = new Ajustes();
            this.desktopPane.add(gestionCategorias);
            util.Util.centrarInternalVentana(ajustes, gestionCategorias);
            gestionCategorias.show();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jbCategorias;
    private javax.swing.JButton jbCodigos;
    private javax.swing.JButton jbEstados;
    private javax.swing.JButton jbIncisos;
    private javax.swing.JButton jbMarcas;
    private javax.swing.JButton jbModelos;
    private javax.swing.JButton jbPerfiles;
    private javax.swing.JButton jbReparticiones;
    private javax.swing.JButton jbTipoAdquisicion;
    private javax.swing.JButton jbUsuarios;
    private javax.swing.JLabel jlBienvenido;
    private javax.swing.JLabel jlNombreUsuario;
    private javax.swing.JLabel jlSubtitulo;
    private javax.swing.JLabel jlTituloPrincipal;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JPanel jpTitulo;
    private javax.swing.JPanel jpTitulo1;
    // End of variables declaration//GEN-END:variables
}

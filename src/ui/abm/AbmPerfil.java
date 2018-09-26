/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.abm;

import controlador.OperacionesControlador;
import controlador.PerfilControlador;
import ui.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import objeto.Operaciones;
import objeto.Perfil;
import ui.gestion.Gestionable;

/**
 *
 * @author Kuky
 */
public class AbmPerfil extends javax.swing.JInternalFrame implements IAbm {

    OperacionesControlador operacionesControlador;
    private String operacion;
    private Perfil perfil;
    private Gestionable ventanaGestion;

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
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

    public AbmPerfil(String operacion, Perfil perfil, Gestionable ventanaGestion) throws SQLException {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
        jbgEstado.add(jrbVisible);
        jbgEstado.add(jrbNoVisible);
        jlNombreUsuario.setText(Login.usuario.toString());
        this.operacion = operacion;
        this.perfil = perfil;
        this.ventanaGestion = ventanaGestion;
        inicializacionVentana();
    }

    public AbmPerfil() throws SQLException {
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
        jbVolver1 = new javax.swing.JButton();
        jbAceptar = new javax.swing.JButton();
        jlNombre1 = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jlVisible = new javax.swing.JLabel();
        jrbNoVisible = new javax.swing.JRadioButton();
        jrbVisible = new javax.swing.JRadioButton();
        jlOperaciones = new javax.swing.JLabel();
        jcbAjustes = new javax.swing.JCheckBox();
        jcbInformes = new javax.swing.JCheckBox();
        jcbEstados = new javax.swing.JCheckBox();
        jcbUsuarios = new javax.swing.JCheckBox();
        jcbModelos = new javax.swing.JCheckBox();
        jcbCodigoPresupuestario = new javax.swing.JCheckBox();
        jcbMarcas = new javax.swing.JCheckBox();
        jcbCategorias = new javax.swing.JCheckBox();
        jcbIncisos = new javax.swing.JCheckBox();
        jcbPerfiles = new javax.swing.JCheckBox();
        jcbReparticiones = new javax.swing.JCheckBox();
        jcbTipoAdquisicion = new javax.swing.JCheckBox();
        jcbPermisos = new javax.swing.JCheckBox();
        jpTitulo1 = new javax.swing.JPanel();

        setClosable(true);
        setTitle("SISPA - Perfil");
        setPreferredSize(new java.awt.Dimension(1000, 710));

        desktopPane.setPreferredSize(new java.awt.Dimension(1000, 710));

        jpPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        jpPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        jpPrincipal.setPreferredSize(new java.awt.Dimension(1000, 710));
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
        jlTituloPrincipal.setText("SISPA - Perfil");
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
        jpPrincipal.add(jbAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 510, 100, -1));

        jlNombre1.setBackground(new java.awt.Color(204, 204, 204));
        jlNombre1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlNombre1.setForeground(new java.awt.Color(33, 150, 243));
        jlNombre1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlNombre1.setText("Nombre: ");
        jpPrincipal.add(jlNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 210, 20));

        jtfNombre.setBackground(new java.awt.Color(204, 204, 204));
        jtfNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfNombre.setForeground(new java.awt.Color(33, 150, 243));
        jtfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNombreActionPerformed(evt);
            }
        });
        jpPrincipal.add(jtfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 220, -1));

        jlVisible.setBackground(new java.awt.Color(204, 204, 204));
        jlVisible.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlVisible.setForeground(new java.awt.Color(33, 150, 243));
        jlVisible.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlVisible.setText("Estado: ");
        jpPrincipal.add(jlVisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 210, 20));

        jrbNoVisible.setBackground(new java.awt.Color(204, 204, 204));
        jrbNoVisible.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbNoVisible.setForeground(new java.awt.Color(33, 150, 243));
        jrbNoVisible.setText("No Visible");
        jpPrincipal.add(jrbNoVisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, -1, -1));

        jrbVisible.setBackground(new java.awt.Color(204, 204, 204));
        jrbVisible.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbVisible.setForeground(new java.awt.Color(33, 150, 243));
        jrbVisible.setText("Visible");
        jpPrincipal.add(jrbVisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, -1, -1));

        jlOperaciones.setBackground(new java.awt.Color(204, 204, 204));
        jlOperaciones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlOperaciones.setForeground(new java.awt.Color(33, 150, 243));
        jlOperaciones.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlOperaciones.setText("Operaciones: ");
        jpPrincipal.add(jlOperaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 210, 20));

        jcbAjustes.setBackground(new java.awt.Color(204, 204, 204));
        jcbAjustes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbAjustes.setForeground(new java.awt.Color(33, 150, 243));
        jcbAjustes.setText("Ajustes");
        jcbAjustes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAjustesActionPerformed(evt);
            }
        });
        jpPrincipal.add(jcbAjustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, -1, -1));

        jcbInformes.setBackground(new java.awt.Color(204, 204, 204));
        jcbInformes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbInformes.setForeground(new java.awt.Color(33, 150, 243));
        jcbInformes.setText("Informes");
        jpPrincipal.add(jcbInformes, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, -1, -1));

        jcbEstados.setBackground(new java.awt.Color(204, 204, 204));
        jcbEstados.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbEstados.setForeground(new java.awt.Color(33, 150, 243));
        jcbEstados.setText("Estados");
        jpPrincipal.add(jcbEstados, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, -1, -1));

        jcbUsuarios.setBackground(new java.awt.Color(204, 204, 204));
        jcbUsuarios.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbUsuarios.setForeground(new java.awt.Color(33, 150, 243));
        jcbUsuarios.setText("Usuarios");
        jpPrincipal.add(jcbUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, -1, -1));

        jcbModelos.setBackground(new java.awt.Color(204, 204, 204));
        jcbModelos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbModelos.setForeground(new java.awt.Color(33, 150, 243));
        jcbModelos.setText("Modelos");
        jpPrincipal.add(jcbModelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, -1, -1));

        jcbCodigoPresupuestario.setBackground(new java.awt.Color(204, 204, 204));
        jcbCodigoPresupuestario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbCodigoPresupuestario.setForeground(new java.awt.Color(33, 150, 243));
        jcbCodigoPresupuestario.setText("Cod. Presup.");
        jpPrincipal.add(jcbCodigoPresupuestario, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 350, -1, -1));

        jcbMarcas.setBackground(new java.awt.Color(204, 204, 204));
        jcbMarcas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbMarcas.setForeground(new java.awt.Color(33, 150, 243));
        jcbMarcas.setText("Marcas");
        jpPrincipal.add(jcbMarcas, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, -1, -1));

        jcbCategorias.setBackground(new java.awt.Color(204, 204, 204));
        jcbCategorias.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbCategorias.setForeground(new java.awt.Color(33, 150, 243));
        jcbCategorias.setText("Categorias");
        jpPrincipal.add(jcbCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, -1, -1));

        jcbIncisos.setBackground(new java.awt.Color(204, 204, 204));
        jcbIncisos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbIncisos.setForeground(new java.awt.Color(33, 150, 243));
        jcbIncisos.setText("Incisos");
        jpPrincipal.add(jcbIncisos, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, -1, -1));

        jcbPerfiles.setBackground(new java.awt.Color(204, 204, 204));
        jcbPerfiles.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbPerfiles.setForeground(new java.awt.Color(33, 150, 243));
        jcbPerfiles.setText("Perfiles");
        jpPrincipal.add(jcbPerfiles, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, -1, -1));

        jcbReparticiones.setBackground(new java.awt.Color(204, 204, 204));
        jcbReparticiones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbReparticiones.setForeground(new java.awt.Color(33, 150, 243));
        jcbReparticiones.setText("Reparticiones");
        jpPrincipal.add(jcbReparticiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 400, -1, -1));

        jcbTipoAdquisicion.setBackground(new java.awt.Color(204, 204, 204));
        jcbTipoAdquisicion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbTipoAdquisicion.setForeground(new java.awt.Color(33, 150, 243));
        jcbTipoAdquisicion.setText("Tipo de Adquisicion");
        jpPrincipal.add(jcbTipoAdquisicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, -1, -1));

        jcbPermisos.setBackground(new java.awt.Color(204, 204, 204));
        jcbPermisos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbPermisos.setForeground(new java.awt.Color(33, 150, 243));
        jcbPermisos.setText("Permisos de Usuario");
        jpPrincipal.add(jcbPermisos, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 450, -1, -1));

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
            .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1190, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 998, Short.MAX_VALUE)
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

    private void jbAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAceptarActionPerformed
        if (recolectarDatos() == OK) {
            if (grabar() == OK) {
                ventanaGestion.actualizarGestion();
                dispose();
            }
        }
    }//GEN-LAST:event_jbAceptarActionPerformed

    private void jtfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNombreActionPerformed

    private void jcbAjustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAjustesActionPerformed
        validarCheckBox();// TODO add your handling code here:
    }//GEN-LAST:event_jcbAjustesActionPerformed

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

    public void inicializacionVentana() {
        validarCheckBox();
        if (!operacion.equals(Gestionable.ABM_ALTA)) {
            int i;
            for (i = 0; i < perfil.getOperaciones().size(); i++) {
                Operaciones operaciones1 = new Operaciones();
                operaciones1 = perfil.getOperaciones().get(i);
                if (operaciones1.getId() == 3) {
                    jcbAjustes.setSelected(true);
                }
                if (operaciones1.getId() == 4) {
                    jcbUsuarios.setSelected(true);
                }
                if (operaciones1.getId() == 5) {
                    jcbInformes.setSelected(true);
                }
                if (operaciones1.getId() == 6) {
                    jcbMarcas.setSelected(true);
                }
                if (operaciones1.getId() == 7) {
                    jcbModelos.setSelected(true);
                }
                if (operaciones1.getId() == 8) {
                    jcbCategorias.setSelected(true);
                }
                if (operaciones1.getId() == 9) {
                    jcbIncisos.setSelected(true);
                }
                if (operaciones1.getId() == 10) {
                    jcbCodigoPresupuestario.setSelected(true);
                }
                if (operaciones1.getId() == 11) {
                    jcbEstados.setSelected(true);
                }
                if (operaciones1.getId() == 12) {
                    jcbPerfiles.setSelected(true);
                }
                if (operaciones1.getId() == 13) {
                    jcbReparticiones.setSelected(true);
                }
                if (operaciones1.getId() == 14) {
                    jcbTipoAdquisicion.setSelected(true);
                }
                if (operaciones1.getId() == 15) {
                    jcbPermisos.setSelected(true);
                }
                validarCheckBox();
            }
            jtfNombre.setText(perfil.getNombre());
            if (perfil.isVisible()) {
                jrbVisible.setSelected(true);
            } else {
                jrbNoVisible.setSelected(true);
            }
            if (!operacion.equals(Gestionable.ABM_MODIFICACION)) {
                jtfNombre.setEditable(false);
                jrbVisible.setEnabled(false);
                jrbNoVisible.setEnabled(false);
                jcbAjustes.setEnabled(false);
                jcbInformes.setEnabled(false);
                jcbUsuarios.setEnabled(false);
                jcbMarcas.setEnabled(false);
                jcbModelos.setEnabled(false);
                jcbIncisos.setEnabled(false);
                jcbCodigoPresupuestario.setEnabled(false);
                jcbCategorias.setEnabled(false);
                jcbEstados.setEnabled(false);
                jcbPerfiles.setEnabled(false);
                jcbReparticiones.setEnabled(false);
                jcbTipoAdquisicion.setEnabled(false);
                jcbPermisos.setEnabled(false);
            }
        }
    }

    public int recolectarDatos() {
        //cargamos los datos en el objeto
        perfil.setNombre(jtfNombre.getText());
        if (jrbVisible.isSelected()) {
            perfil.setVisible(true);
        } else {
            perfil.setVisible(false);
        }
        try {
            perfil.setOperaciones(asigarOperaciones());
        } catch (SQLException ex) {
            Logger.getLogger(AbmPerfil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return OK;
    }

    @Override
    public int grabar() {
        PerfilControlador perfilControlador = new PerfilControlador();
        if (operacion.equals(Gestionable.ABM_ALTA)) {
            try {
                perfilControlador.insertar(perfil);
            } catch (SQLException ex) {
                Logger.getLogger(AbmPerfil.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (operacion.equals(Gestionable.ABM_BAJA)) {
            try {
                perfilControlador.borrar(perfil);
            } catch (SQLException ex) {
                Logger.getLogger(AbmPerfil.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (operacion.equals(Gestionable.ABM_MODIFICACION)) {
            try {
                perfilControlador.modificar(perfil);
            } catch (SQLException ex) {
                Logger.getLogger(AbmPerfil.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return OK;
    }

    public void validarCheckBox() {
        if (!jcbAjustes.isSelected()) {
            jcbMarcas.setEnabled(false);
            jcbModelos.setEnabled(false);
            jcbIncisos.setEnabled(false);
            jcbCodigoPresupuestario.setEnabled(false);
            jcbCategorias.setEnabled(false);
            jcbEstados.setEnabled(false);
            jcbPerfiles.setEnabled(false);
            jcbReparticiones.setEnabled(false);
            jcbTipoAdquisicion.setEnabled(false);
            jcbPermisos.setEnabled(false);
        } else {
            jcbMarcas.setEnabled(true);
            jcbModelos.setEnabled(true);
            jcbIncisos.setEnabled(true);
            jcbCodigoPresupuestario.setEnabled(true);
            jcbCategorias.setEnabled(true);
            jcbEstados.setEnabled(true);
            jcbPerfiles.setEnabled(true);
            jcbReparticiones.setEnabled(true);
            jcbTipoAdquisicion.setEnabled(true);
            jcbPermisos.setEnabled(true);
        }
    }

    public ArrayList<Operaciones> asigarOperaciones() throws SQLException {
        operacionesControlador = new OperacionesControlador();
        ArrayList<Operaciones> operaciones = new ArrayList<>();
        Operaciones operaciones1 = new Operaciones();
        //-----------------------------------------------------------------------------------
        // SIEMPRE VA A PODER EDITAR MUEBLES E INMUEBLES
        operaciones1 = operacionesControlador.extraer(1);
        operaciones.add(operaciones1);
        operaciones1 = operacionesControlador.extraer(2);
        operaciones.add(operaciones1);
        //-----------------------------------------------------------------------------------
        if (jcbAjustes.isSelected()) {
            operaciones1 = operacionesControlador.extraer(3);//EL 3 ES EQUIVALENTE A AJUSTES
            operaciones.add(operaciones1);
            if (jcbMarcas.isSelected()) {
                operaciones1 = operacionesControlador.extraer(6);
                operaciones.add(operaciones1);
            }
            if (jcbModelos.isSelected()) {
                operaciones1 = operacionesControlador.extraer(7);
                operaciones.add(operaciones1);
            }
            if (jcbIncisos.isSelected()) {
                operaciones1 = operacionesControlador.extraer(9);
                operaciones.add(operaciones1);
            }
            if (jcbCodigoPresupuestario.isSelected()) {
                operaciones1 = operacionesControlador.extraer(10);
                operaciones.add(operaciones1);
            }
            if (jcbCategorias.isSelected()) {
                operaciones1 = operacionesControlador.extraer(8);
                operaciones.add(operaciones1);
            }
            if (jcbEstados.isSelected()) {
                operaciones1 = operacionesControlador.extraer(11);
                operaciones.add(operaciones1);
            }
            if (jcbPerfiles.isSelected()) {
                operaciones1 = operacionesControlador.extraer(12);
                operaciones.add(operaciones1);
            }
            if (jcbReparticiones.isSelected()) {
                operaciones1 = operacionesControlador.extraer(13);
                operaciones.add(operaciones1);
            }
            if (jcbTipoAdquisicion.isSelected()) {
                operaciones1 = operacionesControlador.extraer(14);
                operaciones.add(operaciones1);
            }
            if (jcbPermisos.isSelected()) {
                operaciones1 = operacionesControlador.extraer(15);
                operaciones.add(operaciones1);
            }
        }
        if (jcbUsuarios.isSelected()) {
            operaciones1 = operacionesControlador.extraer(4);//EL 4 ES EQUIVALENTE A USUARIOS
            operaciones.add(operaciones1);
        }
        if (jcbInformes.isSelected()) {
            operaciones1 = operacionesControlador.extraer(5);//EL 5 ES EQUIVALENTE A USUARIOS
            operaciones.add(operaciones1);
        }
        return operaciones;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jbAceptar;
    private javax.swing.JButton jbVolver1;
    private javax.swing.ButtonGroup jbgEstado;
    private javax.swing.JCheckBox jcbAjustes;
    private javax.swing.JCheckBox jcbCategorias;
    private javax.swing.JCheckBox jcbCodigoPresupuestario;
    private javax.swing.JCheckBox jcbEstados;
    private javax.swing.JCheckBox jcbIncisos;
    private javax.swing.JCheckBox jcbInformes;
    private javax.swing.JCheckBox jcbMarcas;
    private javax.swing.JCheckBox jcbModelos;
    private javax.swing.JCheckBox jcbPerfiles;
    private javax.swing.JCheckBox jcbPermisos;
    private javax.swing.JCheckBox jcbReparticiones;
    private javax.swing.JCheckBox jcbTipoAdquisicion;
    private javax.swing.JCheckBox jcbUsuarios;
    private javax.swing.JLabel jlBienvenido;
    private javax.swing.JLabel jlNombre1;
    private javax.swing.JLabel jlNombreUsuario;
    private javax.swing.JLabel jlOperaciones;
    private javax.swing.JLabel jlSubtitulo;
    private javax.swing.JLabel jlTituloPrincipal;
    private javax.swing.JLabel jlVisible;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JPanel jpTitulo;
    private javax.swing.JPanel jpTitulo1;
    private javax.swing.JRadioButton jrbNoVisible;
    private javax.swing.JRadioButton jrbVisible;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables

}

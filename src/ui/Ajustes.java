/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import ui.ajustes.Marcas;

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
        jlNombreUsuario.setText(Login.usuario.toString());
        jlUsuario.setForeground(Color.gray);
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
        jpModelo = new javax.swing.JPanel();
        jlModelo = new javax.swing.JLabel();
        jpMarca = new javax.swing.JPanel();
        jlMarca = new javax.swing.JLabel();
        jpInciso = new javax.swing.JPanel();
        jlInciso = new javax.swing.JLabel();
        jpCodigoPresupuestario = new javax.swing.JPanel();
        jlCodigoPresupuestario = new javax.swing.JLabel();
        jpCategoria = new javax.swing.JPanel();
        jlCategoria = new javax.swing.JLabel();
        jpEstado = new javax.swing.JPanel();
        jlEstado = new javax.swing.JLabel();
        jpReparticion = new javax.swing.JPanel();
        jlReparticion = new javax.swing.JLabel();
        jpPerfil = new javax.swing.JPanel();
        jlPerfil = new javax.swing.JLabel();
        jpUsuario = new javax.swing.JPanel();
        jlUsuario = new javax.swing.JLabel();
        jpReparticion1 = new javax.swing.JPanel();
        jlReparticion1 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("SISPA - Ajustes");

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

        jpPrincipal.add(jpTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 140));

        jpModelo.setBackground(java.awt.SystemColor.controlHighlight);
        jpModelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpModeloMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpModeloMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpModeloMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpModeloMousePressed(evt);
            }
        });

        jlModelo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlModelo.setForeground(new java.awt.Color(33, 150, 243));
        jlModelo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlModelo.setText("Modelos");
        jlModelo.setToolTipText("");

        javax.swing.GroupLayout jpModeloLayout = new javax.swing.GroupLayout(jpModelo);
        jpModelo.setLayout(jpModeloLayout);
        jpModeloLayout.setHorizontalGroup(
            jpModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlModelo, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        jpModeloLayout.setVerticalGroup(
            jpModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpModeloLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jlModelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(71, 71, 71))
        );

        jpPrincipal.add(jpModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 90, 90));

        jpMarca.setBackground(java.awt.SystemColor.controlHighlight);
        jpMarca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpMarcaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpMarcaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpMarcaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpMarcaMousePressed(evt);
            }
        });

        jlMarca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlMarca.setForeground(new java.awt.Color(33, 150, 243));
        jlMarca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlMarca.setText("Marcas");
        jlMarca.setToolTipText("");

        javax.swing.GroupLayout jpMarcaLayout = new javax.swing.GroupLayout(jpMarca);
        jpMarca.setLayout(jpMarcaLayout);
        jpMarcaLayout.setHorizontalGroup(
            jpMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        jpMarcaLayout.setVerticalGroup(
            jpMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMarcaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jlMarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(71, 71, 71))
        );

        jpPrincipal.add(jpMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 90, 90));

        jpInciso.setBackground(java.awt.SystemColor.controlHighlight);
        jpInciso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpIncisoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpIncisoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpIncisoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpIncisoMousePressed(evt);
            }
        });

        jlInciso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlInciso.setForeground(new java.awt.Color(33, 150, 243));
        jlInciso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlInciso.setText("Incisos");
        jlInciso.setToolTipText("");

        javax.swing.GroupLayout jpIncisoLayout = new javax.swing.GroupLayout(jpInciso);
        jpInciso.setLayout(jpIncisoLayout);
        jpIncisoLayout.setHorizontalGroup(
            jpIncisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlInciso, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        jpIncisoLayout.setVerticalGroup(
            jpIncisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIncisoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jlInciso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(71, 71, 71))
        );

        jpPrincipal.add(jpInciso, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 90, 90));

        jpCodigoPresupuestario.setBackground(java.awt.SystemColor.controlHighlight);
        jpCodigoPresupuestario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpCodigoPresupuestarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpCodigoPresupuestarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpCodigoPresupuestarioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpCodigoPresupuestarioMousePressed(evt);
            }
        });

        jlCodigoPresupuestario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlCodigoPresupuestario.setForeground(new java.awt.Color(33, 150, 243));
        jlCodigoPresupuestario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlCodigoPresupuestario.setText("Codigos P.");
        jlCodigoPresupuestario.setToolTipText("");

        javax.swing.GroupLayout jpCodigoPresupuestarioLayout = new javax.swing.GroupLayout(jpCodigoPresupuestario);
        jpCodigoPresupuestario.setLayout(jpCodigoPresupuestarioLayout);
        jpCodigoPresupuestarioLayout.setHorizontalGroup(
            jpCodigoPresupuestarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlCodigoPresupuestario, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        jpCodigoPresupuestarioLayout.setVerticalGroup(
            jpCodigoPresupuestarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCodigoPresupuestarioLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jlCodigoPresupuestario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(71, 71, 71))
        );

        jpPrincipal.add(jpCodigoPresupuestario, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, 90, 90));

        jpCategoria.setBackground(java.awt.SystemColor.controlHighlight);
        jpCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpCategoriaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpCategoriaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpCategoriaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpCategoriaMousePressed(evt);
            }
        });

        jlCategoria.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlCategoria.setForeground(new java.awt.Color(33, 150, 243));
        jlCategoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlCategoria.setText("Categoria");
        jlCategoria.setToolTipText("");

        javax.swing.GroupLayout jpCategoriaLayout = new javax.swing.GroupLayout(jpCategoria);
        jpCategoria.setLayout(jpCategoriaLayout);
        jpCategoriaLayout.setHorizontalGroup(
            jpCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        jpCategoriaLayout.setVerticalGroup(
            jpCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCategoriaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jlCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(71, 71, 71))
        );

        jpPrincipal.add(jpCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 90, 90));

        jpEstado.setBackground(java.awt.SystemColor.controlHighlight);
        jpEstado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpEstadoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpEstadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpEstadoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpEstadoMousePressed(evt);
            }
        });

        jlEstado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlEstado.setForeground(new java.awt.Color(33, 150, 243));
        jlEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlEstado.setText("Estado");
        jlEstado.setToolTipText("");

        javax.swing.GroupLayout jpEstadoLayout = new javax.swing.GroupLayout(jpEstado);
        jpEstado.setLayout(jpEstadoLayout);
        jpEstadoLayout.setHorizontalGroup(
            jpEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        jpEstadoLayout.setVerticalGroup(
            jpEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEstadoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jlEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(71, 71, 71))
        );

        jpPrincipal.add(jpEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 90, 90));

        jpReparticion.setBackground(java.awt.SystemColor.controlHighlight);
        jpReparticion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpReparticionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpReparticionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpReparticionMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpReparticionMousePressed(evt);
            }
        });

        jlReparticion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlReparticion.setForeground(new java.awt.Color(33, 150, 243));
        jlReparticion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlReparticion.setText("Reparticiones");
        jlReparticion.setToolTipText("");

        javax.swing.GroupLayout jpReparticionLayout = new javax.swing.GroupLayout(jpReparticion);
        jpReparticion.setLayout(jpReparticionLayout);
        jpReparticionLayout.setHorizontalGroup(
            jpReparticionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlReparticion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpReparticionLayout.setVerticalGroup(
            jpReparticionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpReparticionLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jlReparticion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(71, 71, 71))
        );

        jpPrincipal.add(jpReparticion, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 240, 90, 90));

        jpPerfil.setBackground(java.awt.SystemColor.controlHighlight);
        jpPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpPerfilMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpPerfilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpPerfilMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpPerfilMousePressed(evt);
            }
        });

        jlPerfil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlPerfil.setForeground(new java.awt.Color(33, 150, 243));
        jlPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlPerfil.setText("Perfiles");
        jlPerfil.setToolTipText("");

        javax.swing.GroupLayout jpPerfilLayout = new javax.swing.GroupLayout(jpPerfil);
        jpPerfil.setLayout(jpPerfilLayout);
        jpPerfilLayout.setHorizontalGroup(
            jpPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        jpPerfilLayout.setVerticalGroup(
            jpPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPerfilLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jlPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(71, 71, 71))
        );

        jpPrincipal.add(jpPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, 90, 90));

        jpUsuario.setBackground(java.awt.SystemColor.controlHighlight);
        jpUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpUsuarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpUsuarioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpUsuarioMousePressed(evt);
            }
        });

        jlUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlUsuario.setForeground(new java.awt.Color(33, 150, 243));
        jlUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlUsuario.setText("Usuarios");
        jlUsuario.setToolTipText("");

        javax.swing.GroupLayout jpUsuarioLayout = new javax.swing.GroupLayout(jpUsuario);
        jpUsuario.setLayout(jpUsuarioLayout);
        jpUsuarioLayout.setHorizontalGroup(
            jpUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        jpUsuarioLayout.setVerticalGroup(
            jpUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUsuarioLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jlUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(71, 71, 71))
        );

        jpPrincipal.add(jpUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, 90, 90));

        jpReparticion1.setBackground(java.awt.SystemColor.controlHighlight);
        jpReparticion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpReparticion1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpReparticion1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpReparticion1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpReparticion1MousePressed(evt);
            }
        });

        jlReparticion1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlReparticion1.setForeground(new java.awt.Color(33, 150, 243));
        jlReparticion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlReparticion1.setText("Tipo Adquisic.");
        jlReparticion1.setToolTipText("");

        javax.swing.GroupLayout jpReparticion1Layout = new javax.swing.GroupLayout(jpReparticion1);
        jpReparticion1.setLayout(jpReparticion1Layout);
        jpReparticion1Layout.setHorizontalGroup(
            jpReparticion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlReparticion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpReparticion1Layout.setVerticalGroup(
            jpReparticion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpReparticion1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jlReparticion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(71, 71, 71))
        );

        jpPrincipal.add(jpReparticion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 240, 90, 90));

        desktopPane.setLayer(jpPrincipal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1181, Short.MAX_VALUE)
            .addGroup(desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(desktopPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 1175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
            .addComponent(desktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jpTituloMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpTituloMouseDragged

    }//GEN-LAST:event_jpTituloMouseDragged

    private void jpTituloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpTituloMousePressed

    }//GEN-LAST:event_jpTituloMousePressed

    private void jpModeloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpModeloMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jpModeloMouseClicked

    private void jpModeloMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpModeloMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jpModeloMouseEntered

    private void jpModeloMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpModeloMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jpModeloMouseExited

    private void jpModeloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpModeloMousePressed

    }//GEN-LAST:event_jpModeloMousePressed

    private void jpMarcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpMarcaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jpMarcaMouseClicked

    private void jpMarcaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpMarcaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jpMarcaMouseEntered

    private void jpMarcaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpMarcaMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jpMarcaMouseExited

    private void jpMarcaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpMarcaMousePressed
        Marcas marcas;
        try {
            marcas = new Marcas();
            this.desktopPane.add(marcas);
            marcas.show();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jpMarcaMousePressed

    private void jpIncisoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpIncisoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jpIncisoMouseClicked

    private void jpIncisoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpIncisoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jpIncisoMouseEntered

    private void jpIncisoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpIncisoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jpIncisoMouseExited

    private void jpIncisoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpIncisoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpIncisoMousePressed

    private void jpCodigoPresupuestarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpCodigoPresupuestarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jpCodigoPresupuestarioMouseClicked

    private void jpCodigoPresupuestarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpCodigoPresupuestarioMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jpCodigoPresupuestarioMouseEntered

    private void jpCodigoPresupuestarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpCodigoPresupuestarioMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jpCodigoPresupuestarioMouseExited

    private void jpCodigoPresupuestarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpCodigoPresupuestarioMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpCodigoPresupuestarioMousePressed

    private void jpCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpCategoriaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jpCategoriaMouseClicked

    private void jpCategoriaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpCategoriaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jpCategoriaMouseEntered

    private void jpCategoriaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpCategoriaMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jpCategoriaMouseExited

    private void jpCategoriaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpCategoriaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpCategoriaMousePressed

    private void jpEstadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpEstadoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jpEstadoMouseClicked

    private void jpEstadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpEstadoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jpEstadoMouseEntered

    private void jpEstadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpEstadoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jpEstadoMouseExited

    private void jpEstadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpEstadoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpEstadoMousePressed

    private void jpReparticionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpReparticionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jpReparticionMouseClicked

    private void jpReparticionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpReparticionMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jpReparticionMouseEntered

    private void jpReparticionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpReparticionMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jpReparticionMouseExited

    private void jpReparticionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpReparticionMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpReparticionMousePressed

    private void jpPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpPerfilMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jpPerfilMouseClicked

    private void jpPerfilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpPerfilMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jpPerfilMouseEntered

    private void jpPerfilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpPerfilMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jpPerfilMouseExited

    private void jpPerfilMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpPerfilMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpPerfilMousePressed

    private void jpUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpUsuarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jpUsuarioMouseClicked

    private void jpUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpUsuarioMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jpUsuarioMouseEntered

    private void jpUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpUsuarioMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jpUsuarioMouseExited

    private void jpUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpUsuarioMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpUsuarioMousePressed

    private void jpReparticion1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpReparticion1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jpReparticion1MouseClicked

    private void jpReparticion1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpReparticion1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jpReparticion1MouseEntered

    private void jpReparticion1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpReparticion1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jpReparticion1MouseExited

    private void jpReparticion1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpReparticion1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpReparticion1MousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel jlBienvenido;
    private javax.swing.JLabel jlCategoria;
    private javax.swing.JLabel jlCodigoPresupuestario;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JLabel jlInciso;
    private javax.swing.JLabel jlMarca;
    private javax.swing.JLabel jlModelo;
    private javax.swing.JLabel jlNombreUsuario;
    private javax.swing.JLabel jlPerfil;
    private javax.swing.JLabel jlReparticion;
    private javax.swing.JLabel jlReparticion1;
    private javax.swing.JLabel jlSubtitulo;
    private javax.swing.JLabel jlTituloPrincipal;
    private javax.swing.JLabel jlUsuario;
    private javax.swing.JPanel jpCategoria;
    private javax.swing.JPanel jpCodigoPresupuestario;
    private javax.swing.JPanel jpEstado;
    private javax.swing.JPanel jpInciso;
    private javax.swing.JPanel jpMarca;
    private javax.swing.JPanel jpModelo;
    private javax.swing.JPanel jpPerfil;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JPanel jpReparticion;
    private javax.swing.JPanel jpReparticion1;
    private javax.swing.JPanel jpTitulo;
    private javax.swing.JPanel jpUsuario;
    // End of variables declaration//GEN-END:variables
}
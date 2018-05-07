/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Kuky
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal2
     */
    public Principal() {
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

        dpPrincipal = new javax.swing.JDesktopPane();
        jpPrincipal = new javax.swing.JPanel();
        jpTitulo = new javax.swing.JPanel();
        jlNombreUsuario = new javax.swing.JLabel();
        jlTituloPrincipal = new javax.swing.JLabel();
        jlSubtitulo = new javax.swing.JLabel();
        jlBienvenido = new javax.swing.JLabel();
        jpAjustes = new javax.swing.JPanel();
        jlAjustes = new javax.swing.JLabel();
        jlIconoAjustes = new javax.swing.JLabel();
        jpMuebles = new javax.swing.JPanel();
        jlMuebles = new javax.swing.JLabel();
        jlIconoMuebles = new javax.swing.JLabel();
        jpInmuebles = new javax.swing.JPanel();
        jlInmuebles = new javax.swing.JLabel();
        jlIconoInmuebles = new javax.swing.JLabel();
        jpInformes = new javax.swing.JPanel();
        jlInformes = new javax.swing.JLabel();
        jlIconoInformes = new javax.swing.JLabel();
        jpUsuarios = new javax.swing.JPanel();
        jlUsuarios = new javax.swing.JLabel();
        jlIconoUsuarios = new javax.swing.JLabel();
        jmbPrincipal = new javax.swing.JMenuBar();
        jmModulos = new javax.swing.JMenu();
        jmiMuebles = new javax.swing.JMenuItem();
        jmiInmubles = new javax.swing.JMenuItem();
        jmiInformes = new javax.swing.JMenuItem();
        jmiUsuarios = new javax.swing.JMenuItem();
        jmiAjustes = new javax.swing.JMenuItem();
        jmSesion = new javax.swing.JMenu();
        jmiCerrarSesion = new javax.swing.JMenuItem();
        jmAcercaDe = new javax.swing.JMenu();
        jmiSispa = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISPA");
        setResizable(false);

        dpPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        dpPrincipal.setForeground(new java.awt.Color(255, 255, 255));

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

        jlNombreUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlNombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jlNombreUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlNombreUsuario.setText("Usuario");
        jpTitulo.add(jlNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 170, -1));

        jlTituloPrincipal.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jlTituloPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        jlTituloPrincipal.setText("SISPA");
        jpTitulo.add(jlTituloPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 110, -1));

        jlSubtitulo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlSubtitulo.setForeground(new java.awt.Color(255, 255, 255));
        jlSubtitulo.setText("Sistema de Control de Patrimonio");
        jpTitulo.add(jlSubtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        jlBienvenido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlBienvenido.setForeground(new java.awt.Color(255, 255, 255));
        jlBienvenido.setText("Bienvenido: ");
        jpTitulo.add(jlBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));

        jpPrincipal.add(jpTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 200));

        jpAjustes.setBackground(java.awt.SystemColor.controlHighlight);
        jpAjustes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpAjustesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpAjustesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpAjustesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpAjustesMousePressed(evt);
            }
        });

        jlAjustes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlAjustes.setForeground(new java.awt.Color(33, 150, 243));
        jlAjustes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlAjustes.setText("Ajustes");
        jlAjustes.setToolTipText("");

        jlIconoAjustes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlIconoAjustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ic_ajustes.png"))); // NOI18N

        javax.swing.GroupLayout jpAjustesLayout = new javax.swing.GroupLayout(jpAjustes);
        jpAjustes.setLayout(jpAjustesLayout);
        jpAjustesLayout.setHorizontalGroup(
            jpAjustesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlAjustes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jlIconoAjustes, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        jpAjustesLayout.setVerticalGroup(
            jpAjustesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAjustesLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jlIconoAjustes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlAjustes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpPrincipal.add(jpAjustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 450, 140, 120));

        jpMuebles.setBackground(java.awt.SystemColor.controlHighlight);
        jpMuebles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpMueblesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpMueblesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpMueblesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpMueblesMousePressed(evt);
            }
        });

        jlMuebles.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlMuebles.setForeground(new java.awt.Color(33, 150, 243));
        jlMuebles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlMuebles.setText("Muebles");
        jlMuebles.setToolTipText("");

        jlIconoMuebles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlIconoMuebles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ic_mueble.png"))); // NOI18N

        javax.swing.GroupLayout jpMueblesLayout = new javax.swing.GroupLayout(jpMuebles);
        jpMuebles.setLayout(jpMueblesLayout);
        jpMueblesLayout.setHorizontalGroup(
            jpMueblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlMuebles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jlIconoMuebles, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        jpMueblesLayout.setVerticalGroup(
            jpMueblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMueblesLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jlIconoMuebles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlMuebles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpPrincipal.add(jpMuebles, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 140, 120));

        jpInmuebles.setBackground(java.awt.SystemColor.controlHighlight);
        jpInmuebles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpInmueblesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpInmueblesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpInmueblesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpInmueblesMousePressed(evt);
            }
        });

        jlInmuebles.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlInmuebles.setForeground(new java.awt.Color(33, 150, 243));
        jlInmuebles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlInmuebles.setText("Inmuebles");
        jlInmuebles.setToolTipText("");

        jlIconoInmuebles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlIconoInmuebles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ic_inmueble.png"))); // NOI18N

        javax.swing.GroupLayout jpInmueblesLayout = new javax.swing.GroupLayout(jpInmuebles);
        jpInmuebles.setLayout(jpInmueblesLayout);
        jpInmueblesLayout.setHorizontalGroup(
            jpInmueblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlInmuebles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jlIconoInmuebles, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        jpInmueblesLayout.setVerticalGroup(
            jpInmueblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInmueblesLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jlIconoInmuebles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlInmuebles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpPrincipal.add(jpInmuebles, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, 140, 120));

        jpInformes.setBackground(java.awt.SystemColor.controlHighlight);
        jpInformes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpInformesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpInformesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpInformesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpInformesMousePressed(evt);
            }
        });

        jlInformes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlInformes.setForeground(new java.awt.Color(33, 150, 243));
        jlInformes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlInformes.setText("Informes");
        jlInformes.setToolTipText("");

        jlIconoInformes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlIconoInformes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ic_informe.png"))); // NOI18N

        javax.swing.GroupLayout jpInformesLayout = new javax.swing.GroupLayout(jpInformes);
        jpInformes.setLayout(jpInformesLayout);
        jpInformesLayout.setHorizontalGroup(
            jpInformesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlInformes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jlIconoInformes, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        jpInformesLayout.setVerticalGroup(
            jpInformesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInformesLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jlIconoInformes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlInformes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpPrincipal.add(jpInformes, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 310, 140, 120));

        jpUsuarios.setBackground(java.awt.SystemColor.controlHighlight);
        jpUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpUsuariosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpUsuariosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpUsuariosMousePressed(evt);
            }
        });

        jlUsuarios.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlUsuarios.setForeground(new java.awt.Color(33, 150, 243));
        jlUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlUsuarios.setText("Usuarios");
        jlUsuarios.setToolTipText("");

        jlIconoUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlIconoUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ic_usuarios.png"))); // NOI18N

        javax.swing.GroupLayout jpUsuariosLayout = new javax.swing.GroupLayout(jpUsuarios);
        jpUsuarios.setLayout(jpUsuariosLayout);
        jpUsuariosLayout.setHorizontalGroup(
            jpUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jlIconoUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        jpUsuariosLayout.setVerticalGroup(
            jpUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUsuariosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jlIconoUsuarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpPrincipal.add(jpUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, 140, 120));

        dpPrincipal.setLayer(jpPrincipal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dpPrincipalLayout = new javax.swing.GroupLayout(dpPrincipal);
        dpPrincipal.setLayout(dpPrincipalLayout);
        dpPrincipalLayout.setHorizontalGroup(
            dpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dpPrincipalLayout.createSequentialGroup()
                .addComponent(jpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        dpPrincipalLayout.setVerticalGroup(
            dpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
        );

        jmbPrincipal.setBackground(new java.awt.Color(33, 150, 243));
        jmbPrincipal.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(33, 150, 243)));
        jmbPrincipal.setForeground(new java.awt.Color(33, 150, 243));

        jmModulos.setText("Modulos");

        jmiMuebles.setText("Muebles");
        jmiMuebles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiMueblesActionPerformed(evt);
            }
        });
        jmModulos.add(jmiMuebles);

        jmiInmubles.setText("Inmuebles");
        jmModulos.add(jmiInmubles);

        jmiInformes.setText("Informes");
        jmModulos.add(jmiInformes);

        jmiUsuarios.setText("Usuarios");
        jmModulos.add(jmiUsuarios);

        jmiAjustes.setText("Ajustes");
        jmiAjustes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAjustesActionPerformed(evt);
            }
        });
        jmModulos.add(jmiAjustes);

        jmbPrincipal.add(jmModulos);

        jmSesion.setText("Sesion");

        jmiCerrarSesion.setText("Cerrar Sesion");
        jmiCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCerrarSesionActionPerformed(evt);
            }
        });
        jmSesion.add(jmiCerrarSesion);

        jmbPrincipal.add(jmSesion);

        jmAcercaDe.setText("Acerca de");

        jmiSispa.setText("Que es SISPA");
        jmAcercaDe.add(jmiSispa);

        jmbPrincipal.add(jmAcercaDe);

        setJMenuBar(jmbPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpPrincipal)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jpTituloMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpTituloMouseDragged

    }//GEN-LAST:event_jpTituloMouseDragged

    private void jpTituloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpTituloMousePressed

    }//GEN-LAST:event_jpTituloMousePressed

    private void jpAjustesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpAjustesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jpAjustesMouseClicked

    private void jpAjustesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpAjustesMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jpAjustesMouseEntered

    private void jpAjustesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpAjustesMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jpAjustesMouseExited

    private void jpAjustesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpAjustesMousePressed
        Ajustes ajustes;
        try {
            ajustes = new Ajustes();
            this.dpPrincipal.add(ajustes);
            ajustes.show();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jpAjustesMousePressed

    private void jpMueblesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpMueblesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jpMueblesMouseClicked

    private void jpMueblesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpMueblesMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jpMueblesMouseEntered

    private void jpMueblesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpMueblesMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jpMueblesMouseExited

    private void jpMueblesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpMueblesMousePressed
        Muebles muebles;
        try {
            muebles = new Muebles();
            this.dpPrincipal.add(muebles);
            muebles.show();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jpMueblesMousePressed

    private void jpInmueblesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpInmueblesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jpInmueblesMouseClicked

    private void jpInmueblesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpInmueblesMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jpInmueblesMouseEntered

    private void jpInmueblesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpInmueblesMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jpInmueblesMouseExited

    private void jpInmueblesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpInmueblesMousePressed
        Inmuebles inmuebles;
        inmuebles = new Inmuebles();
        inmuebles.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jpInmueblesMousePressed

    private void jpInformesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpInformesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jpInformesMouseClicked

    private void jpInformesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpInformesMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jpInformesMouseEntered

    private void jpInformesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpInformesMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jpInformesMouseExited

    private void jpInformesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpInformesMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpInformesMousePressed

    private void jpUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpUsuariosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jpUsuariosMouseClicked

    private void jpUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpUsuariosMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jpUsuariosMouseEntered

    private void jpUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpUsuariosMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jpUsuariosMouseExited

    private void jpUsuariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpUsuariosMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpUsuariosMousePressed

    private void jmiMueblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiMueblesActionPerformed
        Muebles muebles;
        try {
            muebles = new Muebles();
            this.dpPrincipal.add(muebles);
            muebles.show();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jmiMueblesActionPerformed

    private void jmiCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCerrarSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiCerrarSesionActionPerformed

    private void jmiAjustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAjustesActionPerformed
        Ajustes ajustes;
        try {
            ajustes = new Ajustes();
            this.dpPrincipal.add(ajustes);
            ajustes.show();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmiAjustesActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpPrincipal;
    private javax.swing.JLabel jlAjustes;
    private javax.swing.JLabel jlBienvenido;
    private javax.swing.JLabel jlIconoAjustes;
    private javax.swing.JLabel jlIconoInformes;
    private javax.swing.JLabel jlIconoInmuebles;
    private javax.swing.JLabel jlIconoMuebles;
    private javax.swing.JLabel jlIconoUsuarios;
    private javax.swing.JLabel jlInformes;
    private javax.swing.JLabel jlInmuebles;
    private javax.swing.JLabel jlMuebles;
    private javax.swing.JLabel jlNombreUsuario;
    private javax.swing.JLabel jlSubtitulo;
    private javax.swing.JLabel jlTituloPrincipal;
    private javax.swing.JLabel jlUsuarios;
    private javax.swing.JMenu jmAcercaDe;
    private javax.swing.JMenu jmModulos;
    private javax.swing.JMenu jmSesion;
    private javax.swing.JMenuBar jmbPrincipal;
    private javax.swing.JMenuItem jmiAjustes;
    private javax.swing.JMenuItem jmiCerrarSesion;
    private javax.swing.JMenuItem jmiInformes;
    private javax.swing.JMenuItem jmiInmubles;
    private javax.swing.JMenuItem jmiMuebles;
    private javax.swing.JMenuItem jmiSispa;
    private javax.swing.JMenuItem jmiUsuarios;
    private javax.swing.JPanel jpAjustes;
    private javax.swing.JPanel jpInformes;
    private javax.swing.JPanel jpInmuebles;
    private javax.swing.JPanel jpMuebles;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JPanel jpTitulo;
    private javax.swing.JPanel jpUsuarios;
    // End of variables declaration//GEN-END:variables
}

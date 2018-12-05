/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import ui.reportes.GestionReportes;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import objeto.Operaciones;
import ui.gestion.*;

/**
 *
 * @author Kuky
 */
public class Principal extends javax.swing.JFrame {

    JProgressBar prog;

    /**
     * Creates new form Principal2
     */
    public Principal() {
        int i;
        initComponents();

        jlNombreUsuario.setText(Login.usuario.toString());
        for (i = 0; i < Login.usuario.getPerfil().getOperaciones().size(); i++) {
            Operaciones operaciones1 = new Operaciones();
            operaciones1 = Login.usuario.getPerfil().getOperaciones().get(i);
            switch (operaciones1.getId()) {
                case util.Util.ABM_AJUSTES:
                    jbAjustes.setEnabled(true);
                    break;
                case util.Util.ABM_INFORMES:
                    jbInformes.setEnabled(true);
                    break;
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

        dpPrincipal = new javax.swing.JDesktopPane();
        jpPrincipal = new javax.swing.JPanel();
        jbmueblesMantenibles = new javax.swing.JButton();
        jpTitulo = new javax.swing.JPanel();
        jlNombreUsuario = new javax.swing.JLabel();
        jlTituloPrincipal = new javax.swing.JLabel();
        jlBienvenido = new javax.swing.JLabel();
        jbSalir = new javax.swing.JButton();
        jbInmuebles = new javax.swing.JButton();
        jbMuebles = new javax.swing.JButton();
        jbInformes = new javax.swing.JButton();
        jpTitulo1 = new javax.swing.JPanel();
        jbAjustes = new javax.swing.JButton();
        jmbPrincipal = new javax.swing.JMenuBar();
        jmModulos = new javax.swing.JMenu();
        jmiMuebles = new javax.swing.JMenuItem();
        jmiInmubles = new javax.swing.JMenuItem();
        jmiAutomotores = new javax.swing.JMenuItem();
        jmiInformes = new javax.swing.JMenuItem();
        jmiAjustes = new javax.swing.JMenuItem();
        jmAcercaDe = new javax.swing.JMenu();
        jmiSispa = new javax.swing.JMenuItem();
        jmSesion = new javax.swing.JMenu();
        jmiCerrarSesion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISPA");
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        dpPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        dpPrincipal.setForeground(new java.awt.Color(255, 255, 255));

        jpPrincipal.setBackground(new java.awt.Color(251, 255, 216));
        jpPrincipal.setFocusable(false);
        jpPrincipal.setMinimumSize(new java.awt.Dimension(860, 600));
        jpPrincipal.setPreferredSize(new java.awt.Dimension(854, 600));
        jpPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jpPrincipal.add(jbmueblesMantenibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 1060, 70));

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
        jpTitulo.add(jlNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 130, 170, -1));

        jlTituloPrincipal.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jlTituloPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        jlTituloPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTituloPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo Centrado.png"))); // NOI18N
        jpTitulo.add(jlTituloPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 200, 150));

        jlBienvenido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlBienvenido.setForeground(new java.awt.Color(255, 255, 255));
        jlBienvenido.setText("Bienvenido: ");
        jpTitulo.add(jlBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 130, -1, -1));

        jbSalir.setBackground(new java.awt.Color(33, 150, 243));
        jbSalir.setForeground(new java.awt.Color(204, 204, 204));
        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ic_salir.png"))); // NOI18N
        jbSalir.setBorder(null);
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jpTitulo.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 0, 50, 50));

        jpPrincipal.add(jpTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 150));

        jbInmuebles.setBackground(new java.awt.Color(204, 204, 204));
        jbInmuebles.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbInmuebles.setForeground(new java.awt.Color(33, 150, 243));
        jbInmuebles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ic_inmueble.png"))); // NOI18N
        jbInmuebles.setText("Inmuebles");
        jbInmuebles.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbInmuebles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInmueblesActionPerformed(evt);
            }
        });
        jpPrincipal.add(jbInmuebles, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 1060, 70));

        jbMuebles.setBackground(new java.awt.Color(204, 204, 204));
        jbMuebles.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbMuebles.setForeground(new java.awt.Color(33, 150, 243));
        jbMuebles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ic_mueble.png"))); // NOI18N
        jbMuebles.setText("Muebles");
        jbMuebles.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbMuebles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMueblesActionPerformed(evt);
            }
        });
        jpPrincipal.add(jbMuebles, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 1060, 70));

        jbInformes.setBackground(new java.awt.Color(204, 204, 204));
        jbInformes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbInformes.setForeground(new java.awt.Color(33, 150, 243));
        jbInformes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ic_informe.png"))); // NOI18N
        jbInformes.setText("Informes");
        jbInformes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbInformes.setEnabled(false);
        jbInformes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInformesActionPerformed(evt);
            }
        });
        jpPrincipal.add(jbInformes, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 1060, 70));

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
        jpPrincipal.add(jpTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 1220, 150));

        jbAjustes.setBackground(new java.awt.Color(204, 204, 204));
        jbAjustes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbAjustes.setForeground(new java.awt.Color(33, 150, 243));
        jbAjustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ic_ajustes.png"))); // NOI18N
        jbAjustes.setText("Ajustes");
        jbAjustes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbAjustes.setEnabled(false);
        jbAjustes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAjustesActionPerformed(evt);
            }
        });
        jpPrincipal.add(jbAjustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, 1060, 70));

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
            .addComponent(jpPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
        );

        jmbPrincipal.setBackground(new java.awt.Color(33, 150, 243));
        jmbPrincipal.setBorder(new javax.swing.border.MatteBorder(null));
        jmbPrincipal.setForeground(new java.awt.Color(33, 150, 243));
        jmbPrincipal.setOpaque(false);

        jmModulos.setText("Modulos");

        jmiMuebles.setText("Muebles");
        jmiMuebles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiMueblesActionPerformed(evt);
            }
        });
        jmModulos.add(jmiMuebles);

        jmiInmubles.setText("Inmuebles");
        jmiInmubles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiInmublesActionPerformed(evt);
            }
        });
        jmModulos.add(jmiInmubles);

        jmiAutomotores.setText("Automotores");
        jmiAutomotores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAutomotoresActionPerformed(evt);
            }
        });
        jmModulos.add(jmiAutomotores);

        jmiInformes.setText("Informes");
        jmiInformes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiInformesActionPerformed(evt);
            }
        });
        jmModulos.add(jmiInformes);

        jmiAjustes.setText("Ajustes");
        jmiAjustes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAjustesActionPerformed(evt);
            }
        });
        jmModulos.add(jmiAjustes);

        jmbPrincipal.add(jmModulos);

        jmAcercaDe.setText("Acerca de");

        jmiSispa.setText("Que es SISPA");
        jmiSispa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSispaActionPerformed(evt);
            }
        });
        jmAcercaDe.add(jmiSispa);

        jmbPrincipal.add(jmAcercaDe);

        jmSesion.setText("Sesion");

        jmiCerrarSesion.setText("Cerrar Sesion");
        jmiCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCerrarSesionActionPerformed(evt);
            }
        });
        jmSesion.add(jmiCerrarSesion);

        jmbPrincipal.add(jmSesion);

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

    private void jmiMueblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiMueblesActionPerformed
        abrirMuebles();
    }//GEN-LAST:event_jmiMueblesActionPerformed

    private void jmiCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCerrarSesionActionPerformed
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea cerrar sesión?", "ATENCION!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0) {
            dispose();
            Login.login.setVisible(true);
        }

    }//GEN-LAST:event_jmiCerrarSesionActionPerformed

    private void jmiAjustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAjustesActionPerformed
        abrirAjustes();
    }//GEN-LAST:event_jmiAjustesActionPerformed

    private void jbInmueblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInmueblesActionPerformed
        abrirInmuebles();
    }//GEN-LAST:event_jbInmueblesActionPerformed

    private void jbMueblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMueblesActionPerformed
        abrirMuebles();
    }//GEN-LAST:event_jbMueblesActionPerformed

    private void jbAjustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAjustesActionPerformed
        abrirAjustes();

    }//GEN-LAST:event_jbAjustesActionPerformed

    private void jbInformesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInformesActionPerformed
        abrirReportes();
    }//GEN-LAST:event_jbInformesActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void jpTitulo1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpTitulo1MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jpTitulo1MouseDragged

    private void jpTitulo1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpTitulo1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpTitulo1MousePressed

    private void jmiInmublesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiInmublesActionPerformed
        abrirInmuebles();
    }//GEN-LAST:event_jmiInmublesActionPerformed

    private void jmiInformesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiInformesActionPerformed
        abrirReportes();
    }//GEN-LAST:event_jmiInformesActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea cerrar el sistema?", "ATENCION!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0) {
            System.exit(0);
        } else {
        }
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbmueblesManteniblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbmueblesManteniblesActionPerformed
        abrirAutomotores();
    }//GEN-LAST:event_jbmueblesManteniblesActionPerformed

    private void jmiAutomotoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAutomotoresActionPerformed
        abrirAutomotores();
    }//GEN-LAST:event_jmiAutomotoresActionPerformed

    private void jmiSispaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSispaActionPerformed
        AcercaDe acercaDe = new AcercaDe();
        this.dpPrincipal.add(acercaDe);
        util.Util.setEnabledMenues(false);
        util.Util.centrarVentana(dpPrincipal, acercaDe);
        acercaDe.show();
    }//GEN-LAST:event_jmiSispaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

 /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Principal principal = new Principal();
                principal.setVisible(true);
            }
        });
    }

    private void abrirAjustes() {
        Ajustes ajustes;
        try {
            ajustes = new Ajustes();
            this.dpPrincipal.add(ajustes);
            util.Util.setEnabledMenues(false);
            util.Util.centrarVentana(dpPrincipal, ajustes);
            ajustes.show();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void abrirMuebles() {
        GestionMuebles gestionMuebles;
        try {
            gestionMuebles = new GestionMuebles();
            this.dpPrincipal.add(gestionMuebles);
            util.Util.setEnabledMenues(false);
            util.Util.centrarVentana(dpPrincipal, gestionMuebles);
            gestionMuebles.show();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void abrirInmuebles() {
        GestionInmuebles gestionInmuebles;
        try {
            gestionInmuebles = new GestionInmuebles();
            this.dpPrincipal.add(gestionInmuebles);
            util.Util.setEnabledMenues(false);
            util.Util.centrarVentana(dpPrincipal, gestionInmuebles);
            gestionInmuebles.show();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void abrirAutomotores() {
        GestionMueblesMantenible gestionMueblesMantenible;
        try {
            gestionMueblesMantenible = new GestionMueblesMantenible();
            this.dpPrincipal.add(gestionMueblesMantenible);
            util.Util.setEnabledMenues(false);
            util.Util.centrarVentana(dpPrincipal, gestionMueblesMantenible);
            gestionMueblesMantenible.show();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void abrirReportes() {
        GestionReportes gestionReportes;
        try {
            gestionReportes = new GestionReportes();
            this.dpPrincipal.add(gestionReportes);
            util.Util.setEnabledMenues(false);
            util.Util.centrarVentana(dpPrincipal, gestionReportes);
            gestionReportes.show();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpPrincipal;
    private javax.swing.JButton jbAjustes;
    private javax.swing.JButton jbInformes;
    private javax.swing.JButton jbInmuebles;
    private javax.swing.JButton jbMuebles;
    private javax.swing.JButton jbSalir;
    private javax.swing.JButton jbmueblesMantenibles;
    private javax.swing.JLabel jlBienvenido;
    private javax.swing.JLabel jlNombreUsuario;
    private javax.swing.JLabel jlTituloPrincipal;
    public static javax.swing.JMenu jmAcercaDe;
    public static javax.swing.JMenu jmModulos;
    public static javax.swing.JMenu jmSesion;
    private javax.swing.JMenuBar jmbPrincipal;
    private javax.swing.JMenuItem jmiAjustes;
    private javax.swing.JMenuItem jmiAutomotores;
    private javax.swing.JMenuItem jmiCerrarSesion;
    private javax.swing.JMenuItem jmiInformes;
    private javax.swing.JMenuItem jmiInmubles;
    private javax.swing.JMenuItem jmiMuebles;
    private javax.swing.JMenuItem jmiSispa;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JPanel jpTitulo;
    private javax.swing.JPanel jpTitulo1;
    // End of variables declaration//GEN-END:variables
}

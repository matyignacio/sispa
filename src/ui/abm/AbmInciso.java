/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.abm;

import controlador.IncisoControlador;
import ui.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import objeto.Inciso;
import ui.gestion.Gestionable;

/**
 *
 * @author Kuky
 */
public class AbmInciso extends javax.swing.JInternalFrame implements IAbm {

    private String operacion;
    private Inciso inciso;
    private Gestionable ventanaGestion;
    private ArrayList<JTextField> campos = new ArrayList<>();

    /**
     *
     * @return
     */
    public String getOperacion() {
        return operacion;
    }

    /**
     *
     * @param operacion
     */
    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    /**
     *
     * @return
     */
    public Inciso getInciso() {
        return inciso;
    }

    /**
     *
     * @param inciso
     */
    public void setInciso(Inciso inciso) {
        this.inciso = inciso;
    }

    /**
     *
     * @return
     */
    public Gestionable getVentanaGestion() {
        return ventanaGestion;
    }

    /**
     *
     * @param ventanaGestion
     */
    public void setVentanaGestion(Gestionable ventanaGestion) {
        this.ventanaGestion = ventanaGestion;
    }

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
     * @param operacion
     * @param inciso
     * @param ventanaGestion
     * @throws SQLException
     */
    public AbmInciso(String operacion, Inciso inciso, Gestionable ventanaGestion) throws SQLException {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        campos.add(jtfNumero);
        campos.add(jtfPrincipal);
        campos.add(jtfParcial);
        jbgEstado.add(jrbVisible);
        jbgEstado.add(jrbNoVisible);
        jlNombreUsuario.setText(Login.usuario.toString());
        this.operacion = operacion;
        this.inciso = inciso;
        this.ventanaGestion = ventanaGestion;
        inicializacionVentana();

    }

    /**
     *
     * @throws SQLException
     */
    public AbmInciso() throws SQLException {
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
        jlNumero = new javax.swing.JLabel();
        jtfNumero = new javax.swing.JTextField();
        jlVisible = new javax.swing.JLabel();
        jrbNoVisible = new javax.swing.JRadioButton();
        jrbVisible = new javax.swing.JRadioButton();
        jlPrincipal = new javax.swing.JLabel();
        jtfPrincipal = new javax.swing.JTextField();
        jtfParcial = new javax.swing.JTextField();
        jlParcial = new javax.swing.JLabel();
        jpTitulo1 = new javax.swing.JPanel();

        setClosable(true);
        setTitle("SISPA - Incisos");
        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(1000, 710));

        desktopPane.setPreferredSize(new java.awt.Dimension(1000, 710));

        jpPrincipal.setBackground(new java.awt.Color(251, 255, 216));
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
        jlTituloPrincipal.setText("SISPA - Incisos");
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
        jpPrincipal.add(jbAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 520, 100, -1));

        jlNumero.setBackground(new java.awt.Color(204, 204, 204));
        jlNumero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlNumero.setForeground(new java.awt.Color(33, 150, 243));
        jlNumero.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlNumero.setText("Numero: ");
        jpPrincipal.add(jlNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 210, 20));

        jtfNumero.setBackground(new java.awt.Color(204, 204, 204));
        jtfNumero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfNumero.setForeground(new java.awt.Color(33, 150, 243));
        jtfNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNumeroActionPerformed(evt);
            }
        });
        jpPrincipal.add(jtfNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 220, -1));

        jlVisible.setBackground(new java.awt.Color(204, 204, 204));
        jlVisible.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlVisible.setForeground(new java.awt.Color(33, 150, 243));
        jlVisible.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlVisible.setText("Estado: ");
        jpPrincipal.add(jlVisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 210, 20));

        jrbNoVisible.setBackground(new java.awt.Color(204, 204, 204));
        jrbNoVisible.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbNoVisible.setForeground(new java.awt.Color(33, 150, 243));
        jrbNoVisible.setText("No Visible");
        jpPrincipal.add(jrbNoVisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, -1, -1));

        jrbVisible.setBackground(new java.awt.Color(204, 204, 204));
        jrbVisible.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbVisible.setForeground(new java.awt.Color(33, 150, 243));
        jrbVisible.setSelected(true);
        jrbVisible.setText("Visible");
        jpPrincipal.add(jrbVisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, -1, -1));

        jlPrincipal.setBackground(new java.awt.Color(204, 204, 204));
        jlPrincipal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlPrincipal.setForeground(new java.awt.Color(33, 150, 243));
        jlPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlPrincipal.setText("Principal: ");
        jpPrincipal.add(jlPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 210, 20));

        jtfPrincipal.setBackground(new java.awt.Color(204, 204, 204));
        jtfPrincipal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfPrincipal.setForeground(new java.awt.Color(33, 150, 243));
        jtfPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPrincipalActionPerformed(evt);
            }
        });
        jpPrincipal.add(jtfPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 220, -1));

        jtfParcial.setBackground(new java.awt.Color(204, 204, 204));
        jtfParcial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfParcial.setForeground(new java.awt.Color(33, 150, 243));
        jtfParcial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfParcialActionPerformed(evt);
            }
        });
        jpPrincipal.add(jtfParcial, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 220, -1));

        jlParcial.setBackground(new java.awt.Color(204, 204, 204));
        jlParcial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlParcial.setForeground(new java.awt.Color(33, 150, 243));
        jlParcial.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlParcial.setText("Parcial: ");
        jpPrincipal.add(jlParcial, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 210, 20));

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

        desktopPane.setLayer(jpPrincipal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1098, Short.MAX_VALUE)
            .addGroup(desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1098, Short.MAX_VALUE))
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

    private void jtfNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNumeroActionPerformed

    private void jtfPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPrincipalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPrincipalActionPerformed

    private void jtfParcialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfParcialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfParcialActionPerformed

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

    /**
     *
     */
    public void inicializacionVentana() {
        if (!operacion.equals(Gestionable.ABM_ALTA)) {
            jtfNumero.setText(String.valueOf(inciso.getNumero()));
            jtfPrincipal.setText(String.valueOf(inciso.getPrincipal()));
            jtfParcial.setText(String.valueOf(inciso.getParcial()));
            if (inciso.isVisible()) {
                jrbVisible.setSelected(true);
            } else {
                jrbNoVisible.setSelected(true);
            }
            if (!operacion.equals(Gestionable.ABM_MODIFICACION)) {
                jtfNumero.setEditable(false);
                jtfPrincipal.setEditable(false);
                jtfParcial.setEditable(false);
                jrbVisible.setEnabled(false);
                jrbNoVisible.setEnabled(false);
            }
        }
    }

    /**
     *
     * @return
     */
    public int recolectarDatos() {
        //cargamos los datos en el objeto
        if (util.Util.validarCampos(campos) == true) {
            inciso.setNumero(Integer.parseInt(jtfNumero.getText()));
            inciso.setPrincipal(Integer.parseInt(jtfPrincipal.getText()));
            inciso.setParcial(Integer.parseInt(jtfParcial.getText()));
            if (jrbVisible.isSelected()) {
                inciso.setVisible(true);
            } else {
                inciso.setVisible(false);
            }
            return OK;
        } else {
            JOptionPane.showMessageDialog(null, "Debe llenar los campos");
            return 0;
        }
    }

    /**
     *
     * @return
     */
    @Override
    public int grabar() {
        IncisoControlador incisoControlador = new IncisoControlador();
        if (operacion.equals(Gestionable.ABM_ALTA)) {
            try {
                incisoControlador.insertar(inciso);
            } catch (SQLException ex) {
                Logger.getLogger(AbmInciso.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (operacion.equals(Gestionable.ABM_BAJA)) {
            try {
                incisoControlador.borrar(inciso);
            } catch (SQLException ex) {
                Logger.getLogger(AbmInciso.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (operacion.equals(Gestionable.ABM_MODIFICACION)) {
            try {
                incisoControlador.modificar(inciso);
            } catch (SQLException ex) {
                Logger.getLogger(AbmInciso.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return OK;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jbAceptar;
    private javax.swing.JButton jbVolver1;
    private javax.swing.ButtonGroup jbgEstado;
    private javax.swing.JLabel jlBienvenido;
    private javax.swing.JLabel jlNombreUsuario;
    private javax.swing.JLabel jlNumero;
    private javax.swing.JLabel jlParcial;
    private javax.swing.JLabel jlPrincipal;
    private javax.swing.JLabel jlSubtitulo;
    private javax.swing.JLabel jlTituloPrincipal;
    private javax.swing.JLabel jlVisible;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JPanel jpTitulo;
    private javax.swing.JPanel jpTitulo1;
    private javax.swing.JRadioButton jrbNoVisible;
    private javax.swing.JRadioButton jrbVisible;
    private javax.swing.JTextField jtfNumero;
    private javax.swing.JTextField jtfParcial;
    private javax.swing.JTextField jtfPrincipal;
    // End of variables declaration//GEN-END:variables

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.abm;

import controlador.MarcaControlador;
import ui.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import objeto.Marca;
import static ui.Login.usuario;
import ui.gestion.Gestionable;

/**
 *
 * @author Kuky
 */
public class AbmMarca extends javax.swing.JInternalFrame implements IAbm {

    private String operacion;
    private Marca marca;
    private Gestionable ventanaGestion;

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
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

    public AbmMarca(String operacion, Marca marca, Gestionable ventanaGestion) throws SQLException {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
        jbgEstado.add(jrbVisible);
        jbgEstado.add(jrbNoVisible);
        jlNombreUsuario.setText(Login.usuario.toString());
        this.operacion = operacion;
        this.marca = marca;
        this.ventanaGestion = ventanaGestion;
        inicializacionVentana();

    }

    public AbmMarca() throws SQLException {
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
        jpTitulo1 = new javax.swing.JPanel();
        jpTitulo2 = new javax.swing.JPanel();

        setClosable(true);
        setTitle("SISPA - Marcas");
        setPreferredSize(new java.awt.Dimension(1000, 710));

        desktopPane.setRequestFocusEnabled(false);

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
        jlTituloPrincipal.setText("SISPA - Marcas");
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

        jpPrincipal.add(jpTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 140));

        jbAceptar.setBackground(new java.awt.Color(204, 204, 204));
        jbAceptar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbAceptar.setForeground(new java.awt.Color(33, 150, 243));
        jbAceptar.setText("Aceptar");
        jbAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAceptarActionPerformed(evt);
            }
        });
        jpPrincipal.add(jbAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 490, 100, -1));

        jlNombre1.setBackground(new java.awt.Color(204, 204, 204));
        jlNombre1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlNombre1.setForeground(new java.awt.Color(33, 150, 243));
        jlNombre1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlNombre1.setText("Nombre: ");
        jpPrincipal.add(jlNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 210, 20));

        jtfNombre.setBackground(new java.awt.Color(204, 204, 204));
        jtfNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfNombre.setForeground(new java.awt.Color(33, 150, 243));
        jtfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNombreActionPerformed(evt);
            }
        });
        jpPrincipal.add(jtfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 220, -1));

        jlVisible.setBackground(new java.awt.Color(204, 204, 204));
        jlVisible.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlVisible.setForeground(new java.awt.Color(33, 150, 243));
        jlVisible.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlVisible.setText("Estado: ");
        jpPrincipal.add(jlVisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 210, 20));

        jrbNoVisible.setBackground(new java.awt.Color(204, 204, 204));
        jrbNoVisible.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbNoVisible.setForeground(new java.awt.Color(33, 150, 243));
        jrbNoVisible.setText("No Visible");
        jpPrincipal.add(jrbNoVisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, -1, -1));

        jrbVisible.setBackground(new java.awt.Color(204, 204, 204));
        jrbVisible.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbVisible.setForeground(new java.awt.Color(33, 150, 243));
        jrbVisible.setText("Visible");
        jpPrincipal.add(jrbVisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, -1, -1));

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

        jpTitulo2.setBackground(new java.awt.Color(33, 150, 243));
        jpTitulo2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jpTitulo2MouseDragged(evt);
            }
        });
        jpTitulo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpTitulo2MousePressed(evt);
            }
        });
        jpTitulo2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jpPrincipal.add(jpTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 1170, 140));

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

    private void jpTitulo1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpTitulo1MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jpTitulo1MouseDragged

    private void jpTitulo1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpTitulo1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpTitulo1MousePressed

    private void jpTitulo2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpTitulo2MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jpTitulo2MouseDragged

    private void jpTitulo2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpTitulo2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpTitulo2MousePressed

    private void jbVolver1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbVolver1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbVolver1MousePressed

    private void jbVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolver1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbVolver1ActionPerformed

    public void inicializacionVentana() {
        if (!operacion.equals(Gestionable.ABM_ALTA)) {
            jtfNombre.setText(marca.getNombre());
            if (marca.isVisible()) {
                jrbVisible.setSelected(true);
            } else {
                jrbNoVisible.setSelected(true);
            }
            if (!operacion.equals(Gestionable.ABM_MODIFICACION)) {
                jtfNombre.setEditable(false);
                jrbVisible.setEnabled(false);
                jrbNoVisible.setEnabled(false);
            }
        }
    }

    public int recolectarDatos() {
        //cargamos los datos en el objeto
        marca.setNombre(jtfNombre.getText());
        if (jrbVisible.isSelected()) {
            marca.setVisible(true);
        } else {
            marca.setVisible(false);
        }
        return OK;
    }

    @Override
    public int grabar() {
        MarcaControlador marcaControlador = new MarcaControlador();
        if (operacion.equals(Gestionable.ABM_ALTA)) {
            try {
                marcaControlador.insertar(marca);
            } catch (SQLException ex) {
                Logger.getLogger(AbmMarca.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (operacion.equals(Gestionable.ABM_BAJA)) {
            try {
                marcaControlador.borrar(marca);
            } catch (SQLException ex) {
                Logger.getLogger(AbmMarca.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (operacion.equals(Gestionable.ABM_MODIFICACION)) {
            try {
                marcaControlador.modificar(marca);
            } catch (SQLException ex) {
                Logger.getLogger(AbmMarca.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JLabel jlNombre1;
    private javax.swing.JLabel jlNombreUsuario;
    private javax.swing.JLabel jlSubtitulo;
    private javax.swing.JLabel jlTituloPrincipal;
    private javax.swing.JLabel jlVisible;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JPanel jpTitulo;
    private javax.swing.JPanel jpTitulo1;
    private javax.swing.JPanel jpTitulo2;
    private javax.swing.JRadioButton jrbNoVisible;
    private javax.swing.JRadioButton jrbVisible;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables

}

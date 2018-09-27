/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.abm;

import controlador.CategoriaControlador;
import controlador.CodigoPresupuestarioControlador;
import controlador.IncisoControlador;
import ui.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDesktopPane;
import objeto.Categoria;
import objeto.CodigoPresupuestario;
import objeto.Inciso;
import static ui.Login.usuario;
import ui.gestion.Gestionable;

/**
 *
 * @author Kuky
 */
public class AbmCategoria extends javax.swing.JInternalFrame implements IAbm {

    private IncisoControlador incisoControlador = new IncisoControlador();
    private CodigoPresupuestarioControlador codigoPresupuestarioControlador = new CodigoPresupuestarioControlador();
    private DefaultComboBoxModel dcbmIncisos;
    private DefaultComboBoxModel dcbmCodigos;
    private String operacion;
    private Categoria categoria;
    private Gestionable ventanaGestion;

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
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

    public AbmCategoria(String operacion, Categoria categoria, Gestionable ventanaGestion) throws SQLException {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        jbgEstado.add(jrbVisible);
        jbgEstado.add(jrbNoVisible);
        jlNombreUsuario.setText(Login.usuario.toString());
        this.operacion = operacion;
        this.categoria = categoria;
        this.ventanaGestion = ventanaGestion;
        dcbmIncisos = new DefaultComboBoxModel(incisoControlador.extraerTodos().toArray());
        jcbIncisos.setModel(dcbmIncisos);
        dcbmCodigos = new DefaultComboBoxModel(codigoPresupuestarioControlador.extraerTodos().toArray());
        jcbCodigo.setModel(dcbmCodigos);
        inicializacionVentana();

    }

    public AbmCategoria() throws SQLException {
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
        jlNombre = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jlVisible = new javax.swing.JLabel();
        jrbNoVisible = new javax.swing.JRadioButton();
        jrbVisible = new javax.swing.JRadioButton();
        jlInciso = new javax.swing.JLabel();
        jcbIncisos = new javax.swing.JComboBox();
        jlCodigo = new javax.swing.JLabel();
        jcbCodigo = new javax.swing.JComboBox();
        jpTitulo1 = new javax.swing.JPanel();

        setClosable(true);
        setTitle("SISPA - Categoria");
        setPreferredSize(new java.awt.Dimension(1000, 710));

        desktopPane.setPreferredSize(new java.awt.Dimension(1000, 710));

        jpPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        jpPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        jpPrincipal.setMinimumSize(new java.awt.Dimension(1000, 710));
        jpPrincipal.setPreferredSize(new java.awt.Dimension(1000, 710));
        jpPrincipal.setRequestFocusEnabled(false);
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
        jlTituloPrincipal.setText("SISPA - Categoria");
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
        jpPrincipal.add(jbAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 530, 100, -1));

        jlNombre.setBackground(new java.awt.Color(204, 204, 204));
        jlNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlNombre.setForeground(new java.awt.Color(33, 150, 243));
        jlNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlNombre.setText("Nombre: ");
        jpPrincipal.add(jlNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 210, 20));

        jtfNombre.setBackground(new java.awt.Color(204, 204, 204));
        jtfNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfNombre.setForeground(new java.awt.Color(33, 150, 243));
        jtfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNombreActionPerformed(evt);
            }
        });
        jpPrincipal.add(jtfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 220, -1));

        jlVisible.setBackground(new java.awt.Color(204, 204, 204));
        jlVisible.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlVisible.setForeground(new java.awt.Color(33, 150, 243));
        jlVisible.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlVisible.setText("Estado: ");
        jpPrincipal.add(jlVisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 210, 20));

        jrbNoVisible.setBackground(new java.awt.Color(204, 204, 204));
        jrbNoVisible.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbNoVisible.setForeground(new java.awt.Color(33, 150, 243));
        jrbNoVisible.setText("No Visible");
        jpPrincipal.add(jrbNoVisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, -1, -1));

        jrbVisible.setBackground(new java.awt.Color(204, 204, 204));
        jrbVisible.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbVisible.setForeground(new java.awt.Color(33, 150, 243));
        jrbVisible.setText("Visible");
        jpPrincipal.add(jrbVisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, -1, -1));

        jlInciso.setBackground(new java.awt.Color(204, 204, 204));
        jlInciso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlInciso.setForeground(new java.awt.Color(33, 150, 243));
        jlInciso.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlInciso.setText("Inciso: ");
        jpPrincipal.add(jlInciso, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 210, 20));

        jcbIncisos.setBackground(new java.awt.Color(204, 204, 204));
        jcbIncisos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbIncisos.setForeground(new java.awt.Color(33, 150, 243));
        jcbIncisos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbIncisos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbIncisosActionPerformed(evt);
            }
        });
        jpPrincipal.add(jcbIncisos, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 220, -1));

        jlCodigo.setBackground(new java.awt.Color(204, 204, 204));
        jlCodigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlCodigo.setForeground(new java.awt.Color(33, 150, 243));
        jlCodigo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlCodigo.setText("Codigo Presupuestario: ");
        jpPrincipal.add(jlCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 210, 20));

        jcbCodigo.setBackground(new java.awt.Color(204, 204, 204));
        jcbCodigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbCodigo.setForeground(new java.awt.Color(33, 150, 243));
        jcbCodigo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCodigoActionPerformed(evt);
            }
        });
        jpPrincipal.add(jcbCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 220, -1));

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
                .addComponent(jpPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1098, Short.MAX_VALUE))
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
            .addGroup(desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopPaneLayout.createSequentialGroup()
                    .addComponent(jpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 684, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jpPrincipal.getAccessibleContext().setAccessibleName("");

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

    private void jcbIncisosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbIncisosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbIncisosActionPerformed

    private void jcbCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbCodigoActionPerformed

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
        if (!operacion.equals(Gestionable.ABM_ALTA)) {
            jtfNombre.setText(categoria.getNombre());
            if (categoria.isVisible()) {
                jrbVisible.setSelected(true);
            } else {
                jrbNoVisible.setSelected(true);
            }
            jcbIncisos.setSelectedItem(categoria.getInciso());
            jcbCodigo.setSelectedItem(categoria.getCodigoPresupuestario());
            if (!operacion.equals(Gestionable.ABM_MODIFICACION)) {
                jtfNombre.setEditable(false);
                jrbVisible.setEnabled(false);
                jrbNoVisible.setEnabled(false);
                jcbIncisos.setEnabled(false);
                jcbCodigo.setEnabled(false);
            }
        }
    }

    public int recolectarDatos() {
        //cargamos los datos en el objeto
        categoria.setNombre(jtfNombre.getText());
        if (jrbVisible.isSelected()) {
            categoria.setVisible(true);
        } else {
            categoria.setVisible(false);
        }
        categoria.setInciso((Inciso) jcbIncisos.getSelectedItem());
        categoria.setCodigoPresupuestaro((CodigoPresupuestario) jcbCodigo.getSelectedItem());
        return OK;
    }

    @Override
    public int grabar() {
        CategoriaControlador categoriaControlador = new CategoriaControlador();
        if (operacion.equals(Gestionable.ABM_ALTA)) {
            try {
                categoriaControlador.insertar(categoria);
            } catch (SQLException ex) {
                Logger.getLogger(AbmCategoria.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (operacion.equals(Gestionable.ABM_BAJA)) {
            try {
                categoriaControlador.borrar(categoria);
            } catch (SQLException ex) {
                Logger.getLogger(AbmCategoria.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (operacion.equals(Gestionable.ABM_MODIFICACION)) {
            try {
                categoriaControlador.modificar(categoria);
            } catch (SQLException ex) {
                Logger.getLogger(AbmCategoria.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return OK;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jbAceptar;
    private javax.swing.JButton jbVolver1;
    private javax.swing.ButtonGroup jbgEstado;
    private javax.swing.JComboBox jcbCodigo;
    private javax.swing.JComboBox jcbIncisos;
    private javax.swing.JLabel jlBienvenido;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JLabel jlInciso;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlNombreUsuario;
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

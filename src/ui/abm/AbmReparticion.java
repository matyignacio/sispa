/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.abm;

import controlador.ReparticionControlador;
import ui.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDesktopPane;
import objeto.Reparticion;
import ui.gestion.Gestionable;

/**
 *
 * @author Kuky
 */
public class AbmReparticion extends javax.swing.JInternalFrame implements IAbm {
    
    private ReparticionControlador reparticionControlador = new ReparticionControlador();
    private DefaultComboBoxModel<Reparticion> dcbmReparticionSuperior;
    private String operacion;
    private Reparticion reparticion;
    private Gestionable ventanaGestion;
    
    public String getOperacion() {
        return operacion;
    }
    
    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
    
    public Reparticion getReparticion() {
        return reparticion;
    }
    
    public void setReparticion(Reparticion reparticion) {
        this.reparticion = reparticion;
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
    
    public AbmReparticion(String operacion, Reparticion reparticion, Gestionable ventanaGestion) throws SQLException {
        initComponents();
        jbgEstado.add(jrbVisible);
        jbgEstado.add(jrbNoVisible);
        jlNombreUsuario.setText(Login.usuario.toString());
        this.operacion = operacion;
        this.reparticion = reparticion;
        this.ventanaGestion = ventanaGestion;
        dcbmReparticionSuperior = new DefaultComboBoxModel(reparticionControlador.extraerTodos().toArray());
        jcbReparticionSuperior.setModel(dcbmReparticionSuperior);
        inicializacionVentana();
        
    }
    
    public AbmReparticion() throws SQLException {
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
        jbAceptar = new javax.swing.JButton();
        jlNombre1 = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jlVisible = new javax.swing.JLabel();
        jrbNoVisible = new javax.swing.JRadioButton();
        jrbVisible = new javax.swing.JRadioButton();
        jlDepartamento = new javax.swing.JLabel();
        jtfDepartamento = new javax.swing.JTextField();
        jlLocalidad = new javax.swing.JLabel();
        jtfLocalidad = new javax.swing.JTextField();
        jlDomicilio = new javax.swing.JLabel();
        jtfDomicilio = new javax.swing.JTextField();
        jlReparticionSuperior = new javax.swing.JLabel();
        jcbReparticionSuperior = new javax.swing.JComboBox();

        setClosable(true);
        setTitle("SISPA - Reparticiones");

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
        jlTituloPrincipal.setText("SISPA - Reparticion");
        jpTitulo.add(jlTituloPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 520, 70));

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
        jpPrincipal.add(jbAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 540, 100, -1));

        jlNombre1.setBackground(new java.awt.Color(204, 204, 204));
        jlNombre1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlNombre1.setForeground(new java.awt.Color(33, 150, 243));
        jlNombre1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlNombre1.setText("Nombre: ");
        jpPrincipal.add(jlNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 210, 20));

        jtfNombre.setBackground(new java.awt.Color(204, 204, 204));
        jtfNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfNombre.setForeground(new java.awt.Color(33, 150, 243));
        jtfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNombreActionPerformed(evt);
            }
        });
        jpPrincipal.add(jtfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 220, -1));

        jlVisible.setBackground(new java.awt.Color(204, 204, 204));
        jlVisible.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlVisible.setForeground(new java.awt.Color(33, 150, 243));
        jlVisible.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlVisible.setText("Estado: ");
        jpPrincipal.add(jlVisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 210, 20));

        jrbNoVisible.setBackground(new java.awt.Color(204, 204, 204));
        jrbNoVisible.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbNoVisible.setForeground(new java.awt.Color(33, 150, 243));
        jrbNoVisible.setText("No Visible");
        jpPrincipal.add(jrbNoVisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, -1, -1));

        jrbVisible.setBackground(new java.awt.Color(204, 204, 204));
        jrbVisible.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbVisible.setForeground(new java.awt.Color(33, 150, 243));
        jrbVisible.setText("Visible");
        jpPrincipal.add(jrbVisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, -1, -1));

        jlDepartamento.setBackground(new java.awt.Color(204, 204, 204));
        jlDepartamento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlDepartamento.setForeground(new java.awt.Color(33, 150, 243));
        jlDepartamento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlDepartamento.setText("Departamento: ");
        jpPrincipal.add(jlDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 210, 20));

        jtfDepartamento.setBackground(new java.awt.Color(204, 204, 204));
        jtfDepartamento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfDepartamento.setForeground(new java.awt.Color(33, 150, 243));
        jtfDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDepartamentoActionPerformed(evt);
            }
        });
        jpPrincipal.add(jtfDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 220, -1));

        jlLocalidad.setBackground(new java.awt.Color(204, 204, 204));
        jlLocalidad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlLocalidad.setForeground(new java.awt.Color(33, 150, 243));
        jlLocalidad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlLocalidad.setText("Localidad: ");
        jpPrincipal.add(jlLocalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 210, 20));

        jtfLocalidad.setBackground(new java.awt.Color(204, 204, 204));
        jtfLocalidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfLocalidad.setForeground(new java.awt.Color(33, 150, 243));
        jtfLocalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfLocalidadActionPerformed(evt);
            }
        });
        jpPrincipal.add(jtfLocalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 220, -1));

        jlDomicilio.setBackground(new java.awt.Color(204, 204, 204));
        jlDomicilio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlDomicilio.setForeground(new java.awt.Color(33, 150, 243));
        jlDomicilio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlDomicilio.setText("Domicilio: ");
        jpPrincipal.add(jlDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 210, 20));

        jtfDomicilio.setBackground(new java.awt.Color(204, 204, 204));
        jtfDomicilio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfDomicilio.setForeground(new java.awt.Color(33, 150, 243));
        jtfDomicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDomicilioActionPerformed(evt);
            }
        });
        jpPrincipal.add(jtfDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, 220, -1));

        jlReparticionSuperior.setBackground(new java.awt.Color(204, 204, 204));
        jlReparticionSuperior.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlReparticionSuperior.setForeground(new java.awt.Color(33, 150, 243));
        jlReparticionSuperior.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlReparticionSuperior.setText("Depende de: ");
        jpPrincipal.add(jlReparticionSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 210, 20));

        jcbReparticionSuperior.setBackground(new java.awt.Color(204, 204, 204));
        jcbReparticionSuperior.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbReparticionSuperior.setForeground(new java.awt.Color(33, 150, 243));
        jcbReparticionSuperior.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jpPrincipal.add(jcbReparticionSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 220, -1));

        desktopPane.setLayer(jpPrincipal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1098, Short.MAX_VALUE)
            .addGroup(desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(desktopPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1092, Short.MAX_VALUE)))
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
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

    private void jtfDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDepartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfDepartamentoActionPerformed

    private void jtfLocalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfLocalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfLocalidadActionPerformed

    private void jtfDomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDomicilioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfDomicilioActionPerformed
    
    public void inicializacionVentana() {
        if (!operacion.equals(Gestionable.ABM_ALTA)) {
            jtfNombre.setText(reparticion.getNombre());
            if (reparticion.isVisible()) {
                jrbVisible.setSelected(true);
            } else {
                jrbNoVisible.setSelected(true);
            }
            jtfDepartamento.setText(reparticion.getDepartamento());
            jtfLocalidad.setText(reparticion.getLocalidad());
            jtfDomicilio.setText(reparticion.getDomicilio());
            jcbReparticionSuperior.setSelectedItem(reparticion.getReparticionSuperior());
            if (!operacion.equals(Gestionable.ABM_MODIFICACION)) {
                jtfNombre.setEditable(false);
                jrbVisible.setEnabled(false);
                jrbNoVisible.setEnabled(false);
                jcbReparticionSuperior.setEnabled(false);
                jtfDepartamento.setEnabled(false);
                jtfLocalidad.setEnabled(false);
                jtfDomicilio.setEnabled(false);
            }
        }
    }
    
    public int recolectarDatos() {
        //cargamos los datos en el objeto
        reparticion.setNombre(jtfNombre.getText());
        if (jrbVisible.isSelected()) {
            reparticion.setVisible(true);
        } else {
            reparticion.setVisible(false);
        }
        reparticion.setDepartamento(jtfDepartamento.getText());
        reparticion.setLocalidad(jtfLocalidad.getText());
        reparticion.setDomicilio(jtfDomicilio.getText());
        reparticion.setReparticionSuperior((Reparticion) jcbReparticionSuperior.getSelectedItem());
        return OK;
    }
    
    @Override
    public int grabar() {
        ReparticionControlador reparticionControlador = new ReparticionControlador();
        if (operacion.equals(Gestionable.ABM_ALTA)) {
            try {
                reparticionControlador.insertar(reparticion);
            } catch (SQLException ex) {
                Logger.getLogger(AbmReparticion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (operacion.equals(Gestionable.ABM_BAJA)) {
            try {
                reparticionControlador.borrar(reparticion);
            } catch (SQLException ex) {
                Logger.getLogger(AbmReparticion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (operacion.equals(Gestionable.ABM_MODIFICACION)) {
            try {
                reparticionControlador.modificar(reparticion);
            } catch (SQLException ex) {
                Logger.getLogger(AbmReparticion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return OK;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jbAceptar;
    private javax.swing.ButtonGroup jbgEstado;
    private javax.swing.JComboBox jcbReparticionSuperior;
    private javax.swing.JLabel jlBienvenido;
    private javax.swing.JLabel jlDepartamento;
    private javax.swing.JLabel jlDomicilio;
    private javax.swing.JLabel jlLocalidad;
    private javax.swing.JLabel jlNombre1;
    private javax.swing.JLabel jlNombreUsuario;
    private javax.swing.JLabel jlReparticionSuperior;
    private javax.swing.JLabel jlSubtitulo;
    private javax.swing.JLabel jlTituloPrincipal;
    private javax.swing.JLabel jlVisible;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JPanel jpTitulo;
    private javax.swing.JRadioButton jrbNoVisible;
    private javax.swing.JRadioButton jrbVisible;
    private javax.swing.JTextField jtfDepartamento;
    private javax.swing.JTextField jtfDomicilio;
    private javax.swing.JTextField jtfLocalidad;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables

}
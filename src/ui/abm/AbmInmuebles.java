/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.abm;


import controlador.ReparticionControlador;
import controlador.CategoriaControlador;
import controlador.InmuebleControlador;
import ui.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDesktopPane;
import objeto.Inmueble;
import objeto.Reparticion;
import static ui.Login.usuario;
import ui.gestion.Gestionable;

/**
 *
 * @author Kuky
 */
public class AbmInmuebles extends javax.swing.JInternalFrame implements IAbm {

    private ReparticionControlador reparticionControlador = new ReparticionControlador();


    private DefaultComboBoxModel dcbmReparticiones;
    private DefaultComboBoxModel dcbmCategoria;
    private String operacion;
    private Inmueble inmueble;
    private Gestionable ventanaGestion;

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public Inmueble getInmuueble() {
        return inmueble;
    }

    public void setInmueble(Inmueble mueble) {
        this.inmueble = mueble;
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

    public AbmInmuebles(String operacion, Inmueble inmueble, Gestionable ventanaGestion) throws SQLException {
        initComponents();
        jbgEstado.add(jrbVisible);
        jbgEstado.add(jrbNoVisible);
        jlNombreUsuario.setText(Login.usuario.toString());
        this.operacion = operacion;
        this.inmueble = inmueble;
        this.ventanaGestion = ventanaGestion;

        dcbmReparticiones = new DefaultComboBoxModel(reparticionControlador.extraerTodosSinNinguna().toArray());
        jcbReparticiones.setModel(dcbmReparticiones);

        

        inicializacionVentana();

    }

    public AbmInmuebles() throws SQLException {
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
        jtfExpediente = new javax.swing.JTextField();
        jlVisible = new javax.swing.JLabel();
        jrbNoVisible = new javax.swing.JRadioButton();
        jrbVisible = new javax.swing.JRadioButton();
        jcbReparticiones = new javax.swing.JComboBox();
        jlExpediente = new javax.swing.JLabel();
        jlObservaciones = new javax.swing.JLabel();
        jtfObservaciones = new javax.swing.JTextField();
        jlReparticiones = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jlCaracteristicas1 = new javax.swing.JLabel();
        jtfCaracteristicas = new javax.swing.JTextField();
        jlNombre = new javax.swing.JLabel();
        jlDomicilio = new javax.swing.JLabel();
        jlTipo = new javax.swing.JLabel();
        jtfTipo = new javax.swing.JTextField();
        jtfDomicilio = new javax.swing.JTextField();

        setClosable(true);
        setTitle("SISPA - Muebles");
        setPreferredSize(new java.awt.Dimension(1100, 712));

        desktopPane.setPreferredSize(new java.awt.Dimension(1098, 690));

        jpPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        jpPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        jpPrincipal.setPreferredSize(new java.awt.Dimension(1090, 493));
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
        jlTituloPrincipal.setText("SISPA - Inmuebles");
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
        jpPrincipal.add(jbAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, 100, -1));

        jtfExpediente.setBackground(new java.awt.Color(204, 204, 204));
        jtfExpediente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfExpediente.setForeground(new java.awt.Color(33, 150, 243));
        jtfExpediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfExpedienteActionPerformed(evt);
            }
        });
        jpPrincipal.add(jtfExpediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 220, -1));

        jlVisible.setBackground(new java.awt.Color(204, 204, 204));
        jlVisible.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlVisible.setForeground(new java.awt.Color(33, 150, 243));
        jlVisible.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlVisible.setText("Estado: ");
        jpPrincipal.add(jlVisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 210, 20));

        jrbNoVisible.setBackground(new java.awt.Color(204, 204, 204));
        jrbNoVisible.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbNoVisible.setForeground(new java.awt.Color(33, 150, 243));
        jrbNoVisible.setText("No Visible");
        jpPrincipal.add(jrbNoVisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, -1, -1));

        jrbVisible.setBackground(new java.awt.Color(204, 204, 204));
        jrbVisible.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbVisible.setForeground(new java.awt.Color(33, 150, 243));
        jrbVisible.setText("Visible");
        jpPrincipal.add(jrbVisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, 30));

        jcbReparticiones.setBackground(new java.awt.Color(204, 204, 204));
        jcbReparticiones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbReparticiones.setForeground(new java.awt.Color(33, 150, 243));
        jcbReparticiones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbReparticiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbReparticionesActionPerformed(evt);
            }
        });
        jpPrincipal.add(jcbReparticiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 220, -1));

        jlExpediente.setBackground(new java.awt.Color(204, 204, 204));
        jlExpediente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlExpediente.setForeground(new java.awt.Color(33, 150, 243));
        jlExpediente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlExpediente.setText("Expediente:");
        jpPrincipal.add(jlExpediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 210, 20));

        jlObservaciones.setBackground(new java.awt.Color(204, 204, 204));
        jlObservaciones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlObservaciones.setForeground(new java.awt.Color(33, 150, 243));
        jlObservaciones.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlObservaciones.setText("Observaciones:");
        jpPrincipal.add(jlObservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 210, 20));

        jtfObservaciones.setBackground(new java.awt.Color(204, 204, 204));
        jtfObservaciones.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfObservaciones.setForeground(new java.awt.Color(33, 150, 243));
        jtfObservaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfObservacionesActionPerformed(evt);
            }
        });
        jpPrincipal.add(jtfObservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 300, 220, -1));

        jlReparticiones.setBackground(new java.awt.Color(204, 204, 204));
        jlReparticiones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlReparticiones.setForeground(new java.awt.Color(33, 150, 243));
        jlReparticiones.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlReparticiones.setText("Reparticiones:");
        jpPrincipal.add(jlReparticiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 210, 20));

        jtfNombre.setBackground(new java.awt.Color(204, 204, 204));
        jtfNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfNombre.setForeground(new java.awt.Color(33, 150, 243));
        jtfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNombreActionPerformed(evt);
            }
        });
        jpPrincipal.add(jtfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 220, -1));

        jlCaracteristicas1.setBackground(new java.awt.Color(204, 204, 204));
        jlCaracteristicas1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlCaracteristicas1.setForeground(new java.awt.Color(33, 150, 243));
        jlCaracteristicas1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlCaracteristicas1.setText("Caracteristicas:");
        jpPrincipal.add(jlCaracteristicas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 210, 20));

        jtfCaracteristicas.setBackground(new java.awt.Color(204, 204, 204));
        jtfCaracteristicas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfCaracteristicas.setForeground(new java.awt.Color(33, 150, 243));
        jtfCaracteristicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCaracteristicasActionPerformed(evt);
            }
        });
        jpPrincipal.add(jtfCaracteristicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 220, -1));

        jlNombre.setBackground(new java.awt.Color(204, 204, 204));
        jlNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlNombre.setForeground(new java.awt.Color(33, 150, 243));
        jlNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlNombre.setText("Nombre: ");
        jpPrincipal.add(jlNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 210, 20));

        jlDomicilio.setBackground(new java.awt.Color(204, 204, 204));
        jlDomicilio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlDomicilio.setForeground(new java.awt.Color(33, 150, 243));
        jlDomicilio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlDomicilio.setText("Domicilio:");
        jpPrincipal.add(jlDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 210, 20));

        jlTipo.setBackground(new java.awt.Color(204, 204, 204));
        jlTipo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlTipo.setForeground(new java.awt.Color(33, 150, 243));
        jlTipo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlTipo.setText("Tipo:");
        jpPrincipal.add(jlTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 210, 20));

        jtfTipo.setBackground(new java.awt.Color(204, 204, 204));
        jtfTipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfTipo.setForeground(new java.awt.Color(33, 150, 243));
        jtfTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTipoActionPerformed(evt);
            }
        });
        jpPrincipal.add(jtfTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 210, 220, -1));

        jtfDomicilio.setBackground(new java.awt.Color(204, 204, 204));
        jtfDomicilio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfDomicilio.setForeground(new java.awt.Color(33, 150, 243));
        jtfDomicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDomicilioActionPerformed(evt);
            }
        });
        jpPrincipal.add(jtfDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 250, 220, -1));

        desktopPane.setLayer(jpPrincipal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("SISPA - Inmuebles");

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

    private void jtfExpedienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfExpedienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfExpedienteActionPerformed

    private void jtfObservacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfObservacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfObservacionesActionPerformed

    private void jtfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNombreActionPerformed

    private void jtfCaracteristicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCaracteristicasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCaracteristicasActionPerformed

    private void jcbReparticionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbReparticionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbReparticionesActionPerformed

    private void jtfTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTipoActionPerformed

    private void jtfDomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDomicilioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfDomicilioActionPerformed

    public void inicializacionVentana() {
        if (!operacion.equals(Gestionable.ABM_ALTA)) {
            jtfNombre.setText(inmueble.getNombre());
            if (inmueble.isVisible()) {
                jrbVisible.setSelected(true);
            } else {
                jrbNoVisible.setSelected(true);
            }
            jtfExpediente.setText(String.valueOf(inmueble.getExpediente()));
            jtfCaracteristicas.setText(String.valueOf(inmueble.getCaracteristicas()));
            jtfObservaciones.setText(String.valueOf(inmueble.getObservaciones()));
            jtfDomicilio.setText(String.valueOf(inmueble.getDomicilio()));
            jcbReparticiones.setSelectedItem(inmueble.getReparticion());
            jtfTipo.setText(inmueble.getTipo());

            if (!operacion.equals(Gestionable.ABM_MODIFICACION)) {
                jtfNombre.setEditable(false);
                jrbVisible.setEnabled(false);
                jrbNoVisible.setEnabled(false);
                jtfExpediente.setEnabled(false);
                jtfObservaciones.setEnabled(false);
                jcbReparticiones.setEnabled(false);
                jtfTipo.setEnabled(false);

            }
        }
    }

    public int recolectarDatos() {
        //cargamos los datos en el objeto
        inmueble.setNombre(jtfNombre.getText());
        if (jrbVisible.isSelected()) {
            inmueble.setVisible(true);
        } else {
            inmueble.setVisible(false);
        }
        inmueble.setExpediente(jtfExpediente.getText());
        inmueble.setCaracteristicas(jtfCaracteristicas.getText());
        inmueble.setObservaciones(jtfObservaciones.getText());
        inmueble.setDomicilio(jtfDomicilio.getText());
        inmueble.setReparticion((Reparticion) jcbReparticiones.getSelectedItem());
        inmueble.setTipo(jtfTipo.getText());
        return OK;
    }

    @Override
    public int grabar() {
        InmuebleControlador inmuebleControlador = new InmuebleControlador();
        if (operacion.equals(Gestionable.ABM_ALTA)) {
            try {
                inmuebleControlador.insertar(inmueble);
            } catch (SQLException ex) {
                Logger.getLogger(AbmInmuebles.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (operacion.equals(Gestionable.ABM_BAJA)) {
            try {
                inmuebleControlador.borrar(inmueble);
            } catch (SQLException ex) {
                Logger.getLogger(AbmInmuebles.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (operacion.equals(Gestionable.ABM_MODIFICACION)) {
            try {
                inmuebleControlador.modificar(inmueble);
            } catch (SQLException ex) {
                Logger.getLogger(AbmInmuebles.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return OK;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jbAceptar;
    private javax.swing.ButtonGroup jbgEstado;
    private javax.swing.JComboBox jcbReparticiones;
    private javax.swing.JLabel jlBienvenido;
    private javax.swing.JLabel jlCaracteristicas1;
    private javax.swing.JLabel jlDomicilio;
    private javax.swing.JLabel jlExpediente;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlNombreUsuario;
    private javax.swing.JLabel jlObservaciones;
    private javax.swing.JLabel jlReparticiones;
    private javax.swing.JLabel jlSubtitulo;
    private javax.swing.JLabel jlTipo;
    private javax.swing.JLabel jlTituloPrincipal;
    private javax.swing.JLabel jlVisible;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JPanel jpTitulo;
    private javax.swing.JRadioButton jrbNoVisible;
    private javax.swing.JRadioButton jrbVisible;
    private javax.swing.JTextField jtfCaracteristicas;
    private javax.swing.JTextField jtfDomicilio;
    private javax.swing.JTextField jtfExpediente;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfObservaciones;
    private javax.swing.JTextField jtfTipo;
    // End of variables declaration//GEN-END:variables

}

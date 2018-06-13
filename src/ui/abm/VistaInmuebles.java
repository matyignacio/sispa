/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.abm;

import ui.*;
import java.sql.SQLException;
import javax.swing.JDesktopPane;
import objeto.Inmueble;

/**
 *
 * @author Kuky
 */
public class VistaInmuebles extends javax.swing.JInternalFrame {

    public JDesktopPane getDesktopPane() {
        return this.desktopPane;
    }

    public void setDesktopPane(JDesktopPane desktopPane) {
        this.desktopPane = desktopPane;
    }

    public VistaInmuebles(Inmueble inmueble) throws SQLException {
        initComponents();
        jtfNombre.setText(inmueble.getNombre());
        if (inmueble.isVisible() == true) {
            jtfEstado.setText("Visible");
        } else {
            jtfEstado.setText("No Visible");
        }
        jtfExpediente.setText(inmueble.getExpediente());
        jtfCaracteristicas.setText(inmueble.getCaracteristicas());
        jtfReparticion.setText(inmueble.getReparticion().getNombre());
        jtfTipo.setText(inmueble.getTipo());
        jtfDomicilio.setText(inmueble.getDomicilio());
        jtfValor.setText(String.valueOf(inmueble.getValor()));
        jtaObservaciones.setText(inmueble.getObservaciones());
        jlNombreUsuario.setText(Login.usuario.toString());

    }

    public VistaInmuebles() throws SQLException {
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
        jlNombre = new javax.swing.JLabel();
        jlEstado = new javax.swing.JLabel();
        jlObservaciones = new javax.swing.JLabel();
        jlReparticion = new javax.swing.JLabel();
        jlExpediente = new javax.swing.JLabel();
        jlCaracteristicas = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jtfEstado = new javax.swing.JTextField();
        jtfExpediente = new javax.swing.JTextField();
        jtfReparticion = new javax.swing.JTextField();
        jtfCaracteristicas = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaObservaciones = new javax.swing.JTextArea();
        jlValor = new javax.swing.JLabel();
        jtfValor = new javax.swing.JTextField();
        jlTipo = new javax.swing.JLabel();
        jtfTipo = new javax.swing.JTextField();
        jlDomicilio = new javax.swing.JLabel();
        jtfDomicilio = new javax.swing.JTextField();

        setClosable(true);
        setTitle("SISPA - Mueble");

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );

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
        jlTituloPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ic_mueble_blanco.png"))); // NOI18N
        jlTituloPrincipal.setText("SISPA - Mueble");
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

        jlNombre.setBackground(new java.awt.Color(204, 204, 204));
        jlNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlNombre.setForeground(new java.awt.Color(33, 150, 243));
        jlNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlNombre.setText("Nombre: ");
        jpPrincipal.add(jlNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 210, 20));

        jlEstado.setBackground(new java.awt.Color(204, 204, 204));
        jlEstado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlEstado.setForeground(new java.awt.Color(33, 150, 243));
        jlEstado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlEstado.setText("Estado: ");
        jpPrincipal.add(jlEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 210, 20));

        jlObservaciones.setBackground(new java.awt.Color(204, 204, 204));
        jlObservaciones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlObservaciones.setForeground(new java.awt.Color(33, 150, 243));
        jlObservaciones.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlObservaciones.setText("Observaciones: ");
        jpPrincipal.add(jlObservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 210, 20));

        jlReparticion.setBackground(new java.awt.Color(204, 204, 204));
        jlReparticion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlReparticion.setForeground(new java.awt.Color(33, 150, 243));
        jlReparticion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlReparticion.setText("Reparticion: ");
        jpPrincipal.add(jlReparticion, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 210, 20));

        jlExpediente.setBackground(new java.awt.Color(204, 204, 204));
        jlExpediente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlExpediente.setForeground(new java.awt.Color(33, 150, 243));
        jlExpediente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlExpediente.setText("Expediente: ");
        jpPrincipal.add(jlExpediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 210, 20));

        jlCaracteristicas.setBackground(new java.awt.Color(204, 204, 204));
        jlCaracteristicas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlCaracteristicas.setForeground(new java.awt.Color(33, 150, 243));
        jlCaracteristicas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlCaracteristicas.setText("Caracteristicas: ");
        jpPrincipal.add(jlCaracteristicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 210, 20));

        jtfNombre.setBackground(new java.awt.Color(204, 204, 204));
        jtfNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfNombre.setForeground(new java.awt.Color(33, 150, 243));
        jtfNombre.setEnabled(false);
        jtfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNombreActionPerformed(evt);
            }
        });
        jpPrincipal.add(jtfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 220, -1));

        jtfEstado.setBackground(new java.awt.Color(204, 204, 204));
        jtfEstado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfEstado.setForeground(new java.awt.Color(33, 150, 243));
        jtfEstado.setEnabled(false);
        jtfEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEstadoActionPerformed(evt);
            }
        });
        jpPrincipal.add(jtfEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 220, -1));

        jtfExpediente.setBackground(new java.awt.Color(204, 204, 204));
        jtfExpediente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfExpediente.setForeground(new java.awt.Color(33, 150, 243));
        jtfExpediente.setEnabled(false);
        jtfExpediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfExpedienteActionPerformed(evt);
            }
        });
        jpPrincipal.add(jtfExpediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 220, -1));

        jtfReparticion.setBackground(new java.awt.Color(204, 204, 204));
        jtfReparticion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfReparticion.setForeground(new java.awt.Color(33, 150, 243));
        jtfReparticion.setEnabled(false);
        jtfReparticion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfReparticionActionPerformed(evt);
            }
        });
        jpPrincipal.add(jtfReparticion, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 220, -1));

        jtfCaracteristicas.setBackground(new java.awt.Color(204, 204, 204));
        jtfCaracteristicas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfCaracteristicas.setForeground(new java.awt.Color(33, 150, 243));
        jtfCaracteristicas.setEnabled(false);
        jtfCaracteristicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCaracteristicasActionPerformed(evt);
            }
        });
        jpPrincipal.add(jtfCaracteristicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 220, -1));

        jtaObservaciones.setBackground(new java.awt.Color(204, 204, 204));
        jtaObservaciones.setColumns(20);
        jtaObservaciones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtaObservaciones.setForeground(new java.awt.Color(33, 150, 243));
        jtaObservaciones.setRows(5);
        jtaObservaciones.setEnabled(false);
        jScrollPane1.setViewportView(jtaObservaciones);

        jpPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 660, 140));

        jlValor.setBackground(new java.awt.Color(204, 204, 204));
        jlValor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlValor.setForeground(new java.awt.Color(33, 150, 243));
        jlValor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlValor.setText("Valor: ");
        jpPrincipal.add(jlValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 210, 20));

        jtfValor.setBackground(new java.awt.Color(204, 204, 204));
        jtfValor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfValor.setForeground(new java.awt.Color(33, 150, 243));
        jtfValor.setEnabled(false);
        jtfValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfValorActionPerformed(evt);
            }
        });
        jpPrincipal.add(jtfValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 280, 220, -1));

        jlTipo.setBackground(new java.awt.Color(204, 204, 204));
        jlTipo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlTipo.setForeground(new java.awt.Color(33, 150, 243));
        jlTipo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlTipo.setText("Tipo: ");
        jpPrincipal.add(jlTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 210, 20));

        jtfTipo.setBackground(new java.awt.Color(204, 204, 204));
        jtfTipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfTipo.setForeground(new java.awt.Color(33, 150, 243));
        jtfTipo.setEnabled(false);
        jtfTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTipoActionPerformed(evt);
            }
        });
        jpPrincipal.add(jtfTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, 220, -1));

        jlDomicilio.setBackground(new java.awt.Color(204, 204, 204));
        jlDomicilio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlDomicilio.setForeground(new java.awt.Color(33, 150, 243));
        jlDomicilio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlDomicilio.setText("Domicilio: ");
        jpPrincipal.add(jlDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 210, 20));

        jtfDomicilio.setBackground(new java.awt.Color(204, 204, 204));
        jtfDomicilio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfDomicilio.setForeground(new java.awt.Color(33, 150, 243));
        jtfDomicilio.setEnabled(false);
        jtfDomicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDomicilioActionPerformed(evt);
            }
        });
        jpPrincipal.add(jtfDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, 220, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
            .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jpTituloMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpTituloMouseDragged

    }//GEN-LAST:event_jpTituloMouseDragged

    private void jpTituloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpTituloMousePressed

    }//GEN-LAST:event_jpTituloMousePressed

    private void jtfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNombreActionPerformed

    private void jtfEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEstadoActionPerformed

    private void jtfExpedienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfExpedienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfExpedienteActionPerformed

    private void jtfReparticionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfReparticionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfReparticionActionPerformed

    private void jtfCaracteristicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCaracteristicasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCaracteristicasActionPerformed

    private void jtfValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfValorActionPerformed

    private void jtfTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTipoActionPerformed

    private void jtfDomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDomicilioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfDomicilioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup jbgEstado;
    private javax.swing.JLabel jlBienvenido;
    private javax.swing.JLabel jlCaracteristicas;
    private javax.swing.JLabel jlDomicilio;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JLabel jlExpediente;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlNombreUsuario;
    private javax.swing.JLabel jlObservaciones;
    private javax.swing.JLabel jlReparticion;
    private javax.swing.JLabel jlSubtitulo;
    private javax.swing.JLabel jlTipo;
    private javax.swing.JLabel jlTituloPrincipal;
    private javax.swing.JLabel jlValor;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JPanel jpTitulo;
    private javax.swing.JTextArea jtaObservaciones;
    private javax.swing.JTextField jtfCaracteristicas;
    private javax.swing.JTextField jtfDomicilio;
    private javax.swing.JTextField jtfEstado;
    private javax.swing.JTextField jtfExpediente;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfReparticion;
    private javax.swing.JTextField jtfTipo;
    private javax.swing.JTextField jtfValor;
    // End of variables declaration//GEN-END:variables

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.abm;

import ui.*;
import java.sql.SQLException;
import javax.swing.JDesktopPane;
import objeto.Mueble;
import objeto.MuebleMantenible;

/**
 *
 * @author Kuky
 */
public class VistaMueblesMantenible extends javax.swing.JInternalFrame {

    public JDesktopPane getDesktopPane() {
        return this.desktopPane;
    }

    public void setDesktopPane(JDesktopPane desktopPane) {
        this.desktopPane = desktopPane;
    }

    public VistaMueblesMantenible(MuebleMantenible muebleMantenible) throws SQLException {
        initComponents();
        jtfNombre.setText(muebleMantenible.getNombre());
        jtfMarca.setText(muebleMantenible.getModelo().getMarca().getNombre());
        jtfModelo.setText(muebleMantenible.getModelo().getNombre());
        if (muebleMantenible.isVisible() == true) {
            jtfEstado.setText("Visible");
        } else {
            jtfEstado.setText("No Visible");
        }
        jtfCaracteristicas.setText(muebleMantenible.getCaracteristicas());
        jtfExpediente.setText(muebleMantenible.getExpediente());
        jtfReparticion.setText(muebleMantenible.getReparticion().getNombre());
        jtfCategoria.setText(muebleMantenible.getCategoria().getNombre());
        jtfInciso.setText(muebleMantenible.getCategoria().getInciso().toString());
        jtfCodigo.setText(muebleMantenible.getCategoria().getCodigoPresupuestario().toString());
        jtaObservaciones.setText(muebleMantenible.getObservaciones());
        jtfCantidad.setText(String.valueOf(muebleMantenible.getCantidad()));
        jtfValor.setText(String.valueOf(muebleMantenible.getValor()));

        jlNombreUsuario.setText(Login.usuario.toString());

    }

    public VistaMueblesMantenible() throws SQLException {
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
        jlModelo = new javax.swing.JLabel();
        jlInciso = new javax.swing.JLabel();
        jlCodigo = new javax.swing.JLabel();
        jlEstado = new javax.swing.JLabel();
        jlCategoria = new javax.swing.JLabel();
        jlObservaciones = new javax.swing.JLabel();
        jlReparticion = new javax.swing.JLabel();
        jlExpediente = new javax.swing.JLabel();
        jlCaracteristicas = new javax.swing.JLabel();
        jlMarca = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jtfMarca = new javax.swing.JTextField();
        jtfModelo = new javax.swing.JTextField();
        jtfEstado = new javax.swing.JTextField();
        jtfCategoria = new javax.swing.JTextField();
        jtfExpediente = new javax.swing.JTextField();
        jtfReparticion = new javax.swing.JTextField();
        jtfCaracteristicas = new javax.swing.JTextField();
        jtfInciso = new javax.swing.JTextField();
        jtfCodigo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaObservaciones = new javax.swing.JTextArea();
        jlValor = new javax.swing.JLabel();
        jlCantidad = new javax.swing.JLabel();
        jtfCantidad = new javax.swing.JTextField();
        jtfValor = new javax.swing.JTextField();

        setClosable(true);
        setTitle("SISPA - Automotores");

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
        jlTituloPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ic_automotores_blanco.png"))); // NOI18N
        jlTituloPrincipal.setText("SISPA - Automotores");
        jpTitulo.add(jlTituloPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 440, 70));

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

        jlModelo.setBackground(new java.awt.Color(204, 204, 204));
        jlModelo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlModelo.setForeground(new java.awt.Color(33, 150, 243));
        jlModelo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlModelo.setText("Modelo: ");
        jpPrincipal.add(jlModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 210, 20));

        jlInciso.setBackground(new java.awt.Color(204, 204, 204));
        jlInciso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlInciso.setForeground(new java.awt.Color(33, 150, 243));
        jlInciso.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlInciso.setText("Inciso: ");
        jpPrincipal.add(jlInciso, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 210, 20));

        jlCodigo.setBackground(new java.awt.Color(204, 204, 204));
        jlCodigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlCodigo.setForeground(new java.awt.Color(33, 150, 243));
        jlCodigo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlCodigo.setText("Codigo Presupuestario: ");
        jpPrincipal.add(jlCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 210, 20));

        jlEstado.setBackground(new java.awt.Color(204, 204, 204));
        jlEstado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlEstado.setForeground(new java.awt.Color(33, 150, 243));
        jlEstado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlEstado.setText("Estado: ");
        jpPrincipal.add(jlEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 210, 20));

        jlCategoria.setBackground(new java.awt.Color(204, 204, 204));
        jlCategoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlCategoria.setForeground(new java.awt.Color(33, 150, 243));
        jlCategoria.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlCategoria.setText("Categoria: ");
        jpPrincipal.add(jlCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 210, 20));

        jlObservaciones.setBackground(new java.awt.Color(204, 204, 204));
        jlObservaciones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlObservaciones.setForeground(new java.awt.Color(33, 150, 243));
        jlObservaciones.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlObservaciones.setText("Observaciones: ");
        jpPrincipal.add(jlObservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 210, 20));

        jlReparticion.setBackground(new java.awt.Color(204, 204, 204));
        jlReparticion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlReparticion.setForeground(new java.awt.Color(33, 150, 243));
        jlReparticion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlReparticion.setText("Reparticion: ");
        jpPrincipal.add(jlReparticion, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 210, 20));

        jlExpediente.setBackground(new java.awt.Color(204, 204, 204));
        jlExpediente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlExpediente.setForeground(new java.awt.Color(33, 150, 243));
        jlExpediente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlExpediente.setText("Expediente: ");
        jpPrincipal.add(jlExpediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 210, 20));

        jlCaracteristicas.setBackground(new java.awt.Color(204, 204, 204));
        jlCaracteristicas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlCaracteristicas.setForeground(new java.awt.Color(33, 150, 243));
        jlCaracteristicas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlCaracteristicas.setText("Caracteristicas: ");
        jpPrincipal.add(jlCaracteristicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 210, -1));

        jlMarca.setBackground(new java.awt.Color(204, 204, 204));
        jlMarca.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlMarca.setForeground(new java.awt.Color(33, 150, 243));
        jlMarca.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlMarca.setText("Marca: ");
        jpPrincipal.add(jlMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 210, 20));

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

        jtfMarca.setBackground(new java.awt.Color(204, 204, 204));
        jtfMarca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfMarca.setForeground(new java.awt.Color(33, 150, 243));
        jtfMarca.setEnabled(false);
        jtfMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfMarcaActionPerformed(evt);
            }
        });
        jpPrincipal.add(jtfMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 220, -1));

        jtfModelo.setBackground(new java.awt.Color(204, 204, 204));
        jtfModelo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfModelo.setForeground(new java.awt.Color(33, 150, 243));
        jtfModelo.setEnabled(false);
        jtfModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfModeloActionPerformed(evt);
            }
        });
        jpPrincipal.add(jtfModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 220, -1));

        jtfEstado.setBackground(new java.awt.Color(204, 204, 204));
        jtfEstado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfEstado.setForeground(new java.awt.Color(33, 150, 243));
        jtfEstado.setEnabled(false);
        jtfEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEstadoActionPerformed(evt);
            }
        });
        jpPrincipal.add(jtfEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 220, -1));

        jtfCategoria.setBackground(new java.awt.Color(204, 204, 204));
        jtfCategoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfCategoria.setForeground(new java.awt.Color(33, 150, 243));
        jtfCategoria.setEnabled(false);
        jtfCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCategoriaActionPerformed(evt);
            }
        });
        jpPrincipal.add(jtfCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, 220, -1));

        jtfExpediente.setBackground(new java.awt.Color(204, 204, 204));
        jtfExpediente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfExpediente.setForeground(new java.awt.Color(33, 150, 243));
        jtfExpediente.setEnabled(false);
        jtfExpediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfExpedienteActionPerformed(evt);
            }
        });
        jpPrincipal.add(jtfExpediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, 220, -1));

        jtfReparticion.setBackground(new java.awt.Color(204, 204, 204));
        jtfReparticion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfReparticion.setForeground(new java.awt.Color(33, 150, 243));
        jtfReparticion.setEnabled(false);
        jtfReparticion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfReparticionActionPerformed(evt);
            }
        });
        jpPrincipal.add(jtfReparticion, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 200, 220, -1));

        jtfCaracteristicas.setBackground(new java.awt.Color(204, 204, 204));
        jtfCaracteristicas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfCaracteristicas.setForeground(new java.awt.Color(33, 150, 243));
        jtfCaracteristicas.setEnabled(false);
        jtfCaracteristicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCaracteristicasActionPerformed(evt);
            }
        });
        jpPrincipal.add(jtfCaracteristicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 220, -1));

        jtfInciso.setBackground(new java.awt.Color(204, 204, 204));
        jtfInciso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfInciso.setForeground(new java.awt.Color(33, 150, 243));
        jtfInciso.setEnabled(false);
        jtfInciso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIncisoActionPerformed(evt);
            }
        });
        jpPrincipal.add(jtfInciso, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 280, 220, -1));

        jtfCodigo.setBackground(new java.awt.Color(204, 204, 204));
        jtfCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfCodigo.setForeground(new java.awt.Color(33, 150, 243));
        jtfCodigo.setEnabled(false);
        jtfCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCodigoActionPerformed(evt);
            }
        });
        jpPrincipal.add(jtfCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 320, 220, -1));

        jtaObservaciones.setBackground(new java.awt.Color(204, 204, 204));
        jtaObservaciones.setColumns(20);
        jtaObservaciones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtaObservaciones.setForeground(new java.awt.Color(33, 150, 243));
        jtaObservaciones.setRows(5);
        jtaObservaciones.setEnabled(false);
        jScrollPane1.setViewportView(jtaObservaciones);

        jpPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 660, 210));

        jlValor.setBackground(new java.awt.Color(204, 204, 204));
        jlValor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlValor.setForeground(new java.awt.Color(33, 150, 243));
        jlValor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlValor.setText("Valor: ");
        jpPrincipal.add(jlValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 210, 20));

        jlCantidad.setBackground(new java.awt.Color(204, 204, 204));
        jlCantidad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlCantidad.setForeground(new java.awt.Color(33, 150, 243));
        jlCantidad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlCantidad.setText("Cantidad: ");
        jpPrincipal.add(jlCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 210, 20));

        jtfCantidad.setBackground(new java.awt.Color(204, 204, 204));
        jtfCantidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfCantidad.setForeground(new java.awt.Color(33, 150, 243));
        jtfCantidad.setEnabled(false);
        jtfCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCantidadActionPerformed(evt);
            }
        });
        jpPrincipal.add(jtfCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 220, -1));

        jtfValor.setBackground(new java.awt.Color(204, 204, 204));
        jtfValor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfValor.setForeground(new java.awt.Color(33, 150, 243));
        jtfValor.setEnabled(false);
        jtfValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfValorActionPerformed(evt);
            }
        });
        jpPrincipal.add(jtfValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 360, 220, -1));

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
            .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
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

    private void jtfMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfMarcaActionPerformed

    private void jtfModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfModeloActionPerformed

    private void jtfEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEstadoActionPerformed

    private void jtfCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCategoriaActionPerformed

    private void jtfExpedienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfExpedienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfExpedienteActionPerformed

    private void jtfReparticionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfReparticionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfReparticionActionPerformed

    private void jtfCaracteristicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCaracteristicasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCaracteristicasActionPerformed

    private void jtfIncisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIncisoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfIncisoActionPerformed

    private void jtfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCodigoActionPerformed

    private void jtfCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCantidadActionPerformed

    private void jtfValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfValorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup jbgEstado;
    private javax.swing.JLabel jlBienvenido;
    private javax.swing.JLabel jlCantidad;
    private javax.swing.JLabel jlCaracteristicas;
    private javax.swing.JLabel jlCategoria;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JLabel jlExpediente;
    private javax.swing.JLabel jlInciso;
    private javax.swing.JLabel jlMarca;
    private javax.swing.JLabel jlModelo;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlNombreUsuario;
    private javax.swing.JLabel jlObservaciones;
    private javax.swing.JLabel jlReparticion;
    private javax.swing.JLabel jlSubtitulo;
    private javax.swing.JLabel jlTituloPrincipal;
    private javax.swing.JLabel jlValor;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JPanel jpTitulo;
    private javax.swing.JTextArea jtaObservaciones;
    private javax.swing.JTextField jtfCantidad;
    private javax.swing.JTextField jtfCaracteristicas;
    private javax.swing.JTextField jtfCategoria;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfEstado;
    private javax.swing.JTextField jtfExpediente;
    private javax.swing.JTextField jtfInciso;
    private javax.swing.JTextField jtfMarca;
    private javax.swing.JTextField jtfModelo;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfReparticion;
    private javax.swing.JTextField jtfValor;
    // End of variables declaration//GEN-END:variables

}

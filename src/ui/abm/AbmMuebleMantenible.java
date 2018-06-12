/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.abm;

import controlador.MuebleMantenibleControlador;
import controlador.ReparticionControlador;
import controlador.EstadoControlador;
import controlador.CategoriaControlador;
import controlador.MarcaControlador;
import controlador.ModeloControlador;
import ui.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDesktopPane;
import objeto.Categoria;
import objeto.Estado;
import objeto.Marca;
import objeto.Modelo;
import objeto.MuebleMantenible;
import objeto.Reparticion;
import static ui.Login.usuario;
import ui.gestion.Gestionable;

/**
 *
 * @author Kuky
 */
public class AbmMuebleMantenible extends javax.swing.JInternalFrame implements IAbm {

    private MuebleMantenibleControlador muebleMantenibleControlador = new MuebleMantenibleControlador();
    private ReparticionControlador reparticionControlador = new ReparticionControlador();
    private EstadoControlador estadoControlador = new EstadoControlador();
    private CategoriaControlador categoriaControlador = new CategoriaControlador();
    private ModeloControlador modeloControlador = new ModeloControlador();
    private MarcaControlador marcaControlador = new MarcaControlador();

    private DefaultComboBoxModel dcbmReparticiones;
    private DefaultComboBoxModel dcbmEstado;
    private DefaultComboBoxModel dcbmCategoria;
    private DefaultComboBoxModel dcbmMarca;
    private DefaultComboBoxModel dcbmModelo;
    private String operacion;
    private MuebleMantenible muebleMatenible;
    private Gestionable ventanaGestion;

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public MuebleMantenible getMuebleMantenible() {
        return muebleMatenible;
    }

    public void setMuebleMantenible(MuebleMantenible muebleMantenible) {
        this.muebleMatenible = muebleMantenible;
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

    public AbmMuebleMantenible(String operacion, MuebleMantenible muebleMantenible, Gestionable ventanaGestion) throws SQLException {
        initComponents();
        jbgEstado.add(jrbVisible);
        jbgEstado.add(jrbNoVisible);
        jlNombreUsuario.setText(Login.usuario.toString());
        this.operacion = operacion;
        this.muebleMatenible = muebleMantenible;
        this.ventanaGestion = ventanaGestion;

        dcbmReparticiones = new DefaultComboBoxModel(reparticionControlador.extraerTodosVisibles().toArray());
        jcbReparticiones.setModel(dcbmReparticiones);

        dcbmEstado = new DefaultComboBoxModel(estadoControlador.extraerTodosVisibles().toArray());
        jcbEstado.setModel(dcbmEstado);

        dcbmCategoria = new DefaultComboBoxModel(categoriaControlador.extraerTodosVisibles().toArray());
        jcbCategoria.setModel(dcbmCategoria);

        dcbmMarca = new DefaultComboBoxModel(marcaControlador.extraerTodosVisibles().toArray());
        jcbMarca.setModel(dcbmMarca);

        inicializarComboModelos();

        inicializacionVentana();

    }

    public AbmMuebleMantenible() throws SQLException {
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
        jlModelo = new javax.swing.JLabel();
        jtfExpediente = new javax.swing.JTextField();
        jlVisible = new javax.swing.JLabel();
        jrbNoVisible = new javax.swing.JRadioButton();
        jrbVisible = new javax.swing.JRadioButton();
        jcbReparticiones = new javax.swing.JComboBox();
        jlExpediente = new javax.swing.JLabel();
        jlObservaciones = new javax.swing.JLabel();
        jlReparticiones = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jlCaracteristicas1 = new javax.swing.JLabel();
        jtfCaracteristicas = new javax.swing.JTextField();
        jlNombre = new javax.swing.JLabel();
        jcbModelo = new javax.swing.JComboBox();
        jlEstado1 = new javax.swing.JLabel();
        jcbEstado = new javax.swing.JComboBox();
        ljCategoria1 = new javax.swing.JLabel();
        jcbCategoria = new javax.swing.JComboBox();
        jlMarca = new javax.swing.JLabel();
        jcbMarca = new javax.swing.JComboBox();
        jlDominio = new javax.swing.JLabel();
        jtfDominio = new javax.swing.JTextField();
        jlChasis = new javax.swing.JLabel();
        jtfChasis = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaObservaciones = new javax.swing.JTextArea();
        jlCantidad = new javax.swing.JLabel();
        jtfCantidad = new javax.swing.JTextField();
        jlValor = new javax.swing.JLabel();
        jtfValor = new javax.swing.JTextField();

        setClosable(true);
        setTitle("SISPA - Muebles");

        desktopPane.setPreferredSize(new java.awt.Dimension(1098, 690));

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
        jlTituloPrincipal.setText("SISPA - Muebles");
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

        jpPrincipal.add(jpTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 140));

        jbAceptar.setBackground(new java.awt.Color(204, 204, 204));
        jbAceptar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbAceptar.setForeground(new java.awt.Color(33, 150, 243));
        jbAceptar.setText("Aceptar");
        jbAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAceptarActionPerformed(evt);
            }
        });
        jpPrincipal.add(jbAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 610, 100, -1));

        jlModelo.setBackground(new java.awt.Color(204, 204, 204));
        jlModelo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlModelo.setForeground(new java.awt.Color(33, 150, 243));
        jlModelo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlModelo.setText("Modelo:");
        jpPrincipal.add(jlModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 120, 20));

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
        jpPrincipal.add(jrbVisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, -1));

        jcbReparticiones.setBackground(new java.awt.Color(204, 204, 204));
        jcbReparticiones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbReparticiones.setForeground(new java.awt.Color(33, 150, 243));
        jcbReparticiones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbReparticiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbReparticionesActionPerformed(evt);
            }
        });
        jpPrincipal.add(jcbReparticiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, 220, -1));

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
        jpPrincipal.add(jlObservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 210, 30));

        jlReparticiones.setBackground(new java.awt.Color(204, 204, 204));
        jlReparticiones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlReparticiones.setForeground(new java.awt.Color(33, 150, 243));
        jlReparticiones.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlReparticiones.setText("Reparticion:");
        jpPrincipal.add(jlReparticiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 130, 30));

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
        jpPrincipal.add(jlCaracteristicas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 210, 20));

        jtfCaracteristicas.setBackground(new java.awt.Color(204, 204, 204));
        jtfCaracteristicas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfCaracteristicas.setForeground(new java.awt.Color(33, 150, 243));
        jtfCaracteristicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCaracteristicasActionPerformed(evt);
            }
        });
        jpPrincipal.add(jtfCaracteristicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 220, -1));

        jlNombre.setBackground(new java.awt.Color(204, 204, 204));
        jlNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlNombre.setForeground(new java.awt.Color(33, 150, 243));
        jlNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlNombre.setText("Nombre: ");
        jpPrincipal.add(jlNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 210, 20));

        jcbModelo.setBackground(new java.awt.Color(204, 204, 204));
        jcbModelo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbModelo.setForeground(new java.awt.Color(33, 150, 243));
        jcbModelo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jpPrincipal.add(jcbModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, 220, -1));

        jlEstado1.setBackground(new java.awt.Color(204, 204, 204));
        jlEstado1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlEstado1.setForeground(new java.awt.Color(33, 150, 243));
        jlEstado1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlEstado1.setText("Estado:");
        jpPrincipal.add(jlEstado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, 90, 30));

        jcbEstado.setBackground(new java.awt.Color(204, 204, 204));
        jcbEstado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbEstado.setForeground(new java.awt.Color(33, 150, 243));
        jcbEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jpPrincipal.add(jcbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 200, 220, -1));

        ljCategoria1.setBackground(new java.awt.Color(204, 204, 204));
        ljCategoria1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ljCategoria1.setForeground(new java.awt.Color(33, 150, 243));
        ljCategoria1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ljCategoria1.setText("Categoria:");
        jpPrincipal.add(ljCategoria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 90, 20));

        jcbCategoria.setBackground(new java.awt.Color(204, 204, 204));
        jcbCategoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbCategoria.setForeground(new java.awt.Color(33, 150, 243));
        jcbCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jpPrincipal.add(jcbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 250, 220, -1));

        jlMarca.setBackground(new java.awt.Color(204, 204, 204));
        jlMarca.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlMarca.setForeground(new java.awt.Color(33, 150, 243));
        jlMarca.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlMarca.setText("Marca:");
        jpPrincipal.add(jlMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, 120, 20));

        jcbMarca.setBackground(new java.awt.Color(204, 204, 204));
        jcbMarca.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbMarca.setForeground(new java.awt.Color(33, 150, 243));
        jcbMarca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMarcaActionPerformed(evt);
            }
        });
        jpPrincipal.add(jcbMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 300, 220, -1));

        jlDominio.setBackground(new java.awt.Color(204, 204, 204));
        jlDominio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlDominio.setForeground(new java.awt.Color(33, 150, 243));
        jlDominio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlDominio.setText("Dominio:");
        jpPrincipal.add(jlDominio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 210, 20));

        jtfDominio.setBackground(new java.awt.Color(204, 204, 204));
        jtfDominio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfDominio.setForeground(new java.awt.Color(33, 150, 243));
        jtfDominio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDominioActionPerformed(evt);
            }
        });
        jpPrincipal.add(jtfDominio, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 220, -1));

        jlChasis.setBackground(new java.awt.Color(204, 204, 204));
        jlChasis.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlChasis.setForeground(new java.awt.Color(33, 150, 243));
        jlChasis.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlChasis.setText("Chasis:");
        jpPrincipal.add(jlChasis, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 210, 20));

        jtfChasis.setBackground(new java.awt.Color(204, 204, 204));
        jtfChasis.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfChasis.setForeground(new java.awt.Color(33, 150, 243));
        jtfChasis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfChasisActionPerformed(evt);
            }
        });
        jpPrincipal.add(jtfChasis, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 220, -1));

        jtaObservaciones.setColumns(20);
        jtaObservaciones.setRows(5);
        jScrollPane1.setViewportView(jtaObservaciones);

        jpPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 500, 640, -1));

        jlCantidad.setBackground(new java.awt.Color(204, 204, 204));
        jlCantidad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlCantidad.setForeground(new java.awt.Color(33, 150, 243));
        jlCantidad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlCantidad.setText("Cantidad:");
        jpPrincipal.add(jlCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 210, 20));

        jtfCantidad.setBackground(new java.awt.Color(204, 204, 204));
        jtfCantidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfCantidad.setForeground(new java.awt.Color(33, 150, 243));
        jtfCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCantidadActionPerformed(evt);
            }
        });
        jpPrincipal.add(jtfCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 220, -1));

        jlValor.setBackground(new java.awt.Color(204, 204, 204));
        jlValor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlValor.setForeground(new java.awt.Color(33, 150, 243));
        jlValor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlValor.setText("Valor:");
        jpPrincipal.add(jlValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 210, 20));

        jtfValor.setBackground(new java.awt.Color(204, 204, 204));
        jtfValor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfValor.setForeground(new java.awt.Color(33, 150, 243));
        jtfValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfValorActionPerformed(evt);
            }
        });
        jpPrincipal.add(jtfValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, 220, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 1092, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
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

    private void jtfExpedienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfExpedienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfExpedienteActionPerformed

    private void jtfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNombreActionPerformed

    private void jtfCaracteristicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCaracteristicasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCaracteristicasActionPerformed

    private void jcbReparticionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbReparticionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbReparticionesActionPerformed

    private void jcbMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMarcaActionPerformed
        try {
            inicializarComboModelos();
        } catch (SQLException ex) {
            Logger.getLogger(AbmMuebleMantenible.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jcbMarcaActionPerformed

    private void jtfDominioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDominioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfDominioActionPerformed

    private void jtfChasisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfChasisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfChasisActionPerformed

    private void jtfCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCantidadActionPerformed

    private void jtfValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfValorActionPerformed

    public void inicializacionVentana() {
        if (!operacion.equals(Gestionable.ABM_ALTA)) {
            jtfNombre.setText(muebleMatenible.getNombre());
            if (muebleMatenible.isVisible()) {
                jrbVisible.setSelected(true);
            } else {
                jrbNoVisible.setSelected(true);
            }
            jtfExpediente.setText(String.valueOf(muebleMatenible.getExpediente()));
            jtfCaracteristicas.setText(String.valueOf(muebleMatenible.getCaracteristicas()));
            jtaObservaciones.setText(String.valueOf(muebleMatenible.getObservaciones()));
            jtfDominio.setText(String.valueOf(muebleMatenible.getDominio()));
            jtfChasis.setText(String.valueOf(muebleMatenible.getChasis()));
            jcbReparticiones.setSelectedItem(muebleMatenible.getReparticion());
            jcbEstado.setSelectedItem(muebleMatenible.getEstado());
            jcbCategoria.setSelectedItem(muebleMatenible.getCategoria());
            jcbMarca.setSelectedItem(muebleMatenible.getModelo().getMarca());
            jcbModelo.setSelectedItem(muebleMatenible.getModelo());
            jtfCantidad.setText(String.valueOf(muebleMatenible.getCantidad()));
            jtfValor.setText(String.valueOf(muebleMatenible.getValor()));

            if (!operacion.equals(Gestionable.ABM_MODIFICACION)) {
                jtfNombre.setEditable(false);
                jrbVisible.setEnabled(false);
                jrbNoVisible.setEnabled(false);
                jtfExpediente.setEnabled(false);
                jtaObservaciones.setEnabled(false);
                jtfDominio.setEditable(false);
                jtfChasis.setEditable(false);
                jcbReparticiones.setEnabled(false);
                jcbEstado.setEnabled(false);
                jcbCategoria.setEnabled(false);
                jcbMarca.setEnabled(false);
                jcbModelo.setEnabled(false);
                jtfCantidad.setEditable(false);
                jtfValor.setEditable(false);
            }
        }
    }

    public int recolectarDatos() {
        //cargamos los datos en el objeto
        muebleMatenible.setNombre(jtfNombre.getText());
        if (jrbVisible.isSelected()) {
            muebleMatenible.setVisible(true);
        } else {
            muebleMatenible.setVisible(false);
        }
        muebleMatenible.setExpediente(jtfExpediente.getText());
        muebleMatenible.setCaracteristicas(jtfCaracteristicas.getText());
        muebleMatenible.setObservaciones(jtaObservaciones.getText());
        muebleMatenible.setDominio(jtfDominio.getText());
        muebleMatenible.setChasis(jtfChasis.getText());
        muebleMatenible.setReparticion((Reparticion) jcbReparticiones.getSelectedItem());
        muebleMatenible.setEstado((Estado) jcbEstado.getSelectedItem());
        muebleMatenible.setCategoria((Categoria) jcbCategoria.getSelectedItem());
        muebleMatenible.setModelo((Modelo) jcbModelo.getSelectedItem());
        muebleMatenible.setCantidad(Integer.parseInt(jtfCantidad.getText()));
        muebleMatenible.setValor(Float.parseFloat(jtfValor.getText()));
        return OK;
    }

    @Override
    public int grabar() {
        MuebleMantenibleControlador muebleMantenibleControlador = new MuebleMantenibleControlador();
        if (operacion.equals(Gestionable.ABM_ALTA)) {
            try {
                muebleMantenibleControlador.insertar(muebleMatenible);
            } catch (SQLException ex) {
                Logger.getLogger(AbmMuebleMantenible.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (operacion.equals(Gestionable.ABM_BAJA)) {
            try {
                muebleMantenibleControlador.borrar(muebleMatenible);
            } catch (SQLException ex) {
                Logger.getLogger(AbmMuebleMantenible.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (operacion.equals(Gestionable.ABM_MODIFICACION)) {
            try {
                muebleMantenibleControlador.modificar(muebleMatenible);
            } catch (SQLException ex) {
                Logger.getLogger(AbmMuebleMantenible.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return OK;
    }

    public void inicializarComboModelos() throws SQLException {
        dcbmModelo = new DefaultComboBoxModel(modeloControlador.extraerTodosVisiblesPorMarca(
                (Marca) jcbMarca.getSelectedItem()).toArray());
        jcbModelo.setModel(dcbmModelo);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAceptar;
    private javax.swing.ButtonGroup jbgEstado;
    private javax.swing.JComboBox jcbCategoria;
    private javax.swing.JComboBox jcbEstado;
    private javax.swing.JComboBox jcbMarca;
    private javax.swing.JComboBox jcbModelo;
    private javax.swing.JComboBox jcbReparticiones;
    private javax.swing.JLabel jlBienvenido;
    private javax.swing.JLabel jlCantidad;
    private javax.swing.JLabel jlCaracteristicas1;
    private javax.swing.JLabel jlChasis;
    private javax.swing.JLabel jlDominio;
    private javax.swing.JLabel jlEstado1;
    private javax.swing.JLabel jlExpediente;
    private javax.swing.JLabel jlMarca;
    private javax.swing.JLabel jlModelo;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlNombreUsuario;
    private javax.swing.JLabel jlObservaciones;
    private javax.swing.JLabel jlReparticiones;
    private javax.swing.JLabel jlSubtitulo;
    private javax.swing.JLabel jlTituloPrincipal;
    private javax.swing.JLabel jlValor;
    private javax.swing.JLabel jlVisible;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JPanel jpTitulo;
    private javax.swing.JRadioButton jrbNoVisible;
    private javax.swing.JRadioButton jrbVisible;
    private javax.swing.JTextArea jtaObservaciones;
    private javax.swing.JTextField jtfCantidad;
    private javax.swing.JTextField jtfCaracteristicas;
    private javax.swing.JTextField jtfChasis;
    private javax.swing.JTextField jtfDominio;
    private javax.swing.JTextField jtfExpediente;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfValor;
    private javax.swing.JLabel ljCategoria1;
    // End of variables declaration//GEN-END:variables

}

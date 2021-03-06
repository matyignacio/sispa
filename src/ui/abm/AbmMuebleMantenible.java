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
import controlador.TipoAdquisicionControlador;
import ui.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import objeto.Categoria;
import objeto.Estado;
import objeto.Marca;
import objeto.Modelo;
import objeto.MuebleMantenible;
import objeto.Reparticion;
import objeto.TipoAdquisicion;
import ui.gestion.Gestionable;

/**
 *
 * @author Kuky
 */
public class AbmMuebleMantenible extends javax.swing.JInternalFrame implements IAbm {

    private MuebleMantenible muebleMantenibleControlador = new MuebleMantenible();
    private ReparticionControlador reparticionControlador = new ReparticionControlador();
    private EstadoControlador estadoControlador = new EstadoControlador();
    private CategoriaControlador categoriaControlador = new CategoriaControlador();
    private ModeloControlador modeloControlador = new ModeloControlador();
    private MarcaControlador marcaControlador = new MarcaControlador();
    private TipoAdquisicionControlador tipoAdquisicionControlador = new TipoAdquisicionControlador();
    private String observaciones;
    private ArrayList<JTextField> campos = new ArrayList<>();

    private DefaultComboBoxModel dcbmReparticiones;
    private DefaultComboBoxModel dcbmEstado;
    private DefaultComboBoxModel dcbmCategoria;
    private DefaultComboBoxModel dcbmMarca;
    private DefaultComboBoxModel dcbmModelo;
    private DefaultComboBoxModel dcbmTipoAdquisicion;
    private String operacion;
    private MuebleMantenible muebleMantenible;
    private Gestionable ventanaGestion;

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
    public MuebleMantenible getMueble() {
        return muebleMantenible;
    }

    /**
     *
     * @param muebleMantenible
     */
    public void setMueble(MuebleMantenible muebleMantenible) {
        this.muebleMantenible = muebleMantenible;
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
     * @param muebleMantenible
     * @param ventanaGestion
     * @throws SQLException
     */
    public AbmMuebleMantenible(String operacion, MuebleMantenible muebleMantenible, Gestionable ventanaGestion) throws SQLException {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        campos.add(jtfNombre);
        campos.add(jtfExpediente);
        campos.add(jtfCaracteristicas);
        campos.add(jtfDominio);
        campos.add(jtfChasis);
        campos.add(jtfCantidad);
        campos.add(jtfValor);
        jbgEstado.add(jrbVisible);
        jbgEstado.add(jrbNoVisible);
        jlNombreUsuario.setText(Login.usuario.toString());
        this.operacion = operacion;
        this.muebleMantenible = muebleMantenible;
        this.ventanaGestion = ventanaGestion;

        dcbmReparticiones = new DefaultComboBoxModel(reparticionControlador.extraerTodosVisibles().toArray());
        jcbReparticiones.setModel(dcbmReparticiones);

        dcbmTipoAdquisicion = new DefaultComboBoxModel(tipoAdquisicionControlador.extraerTodosVisibles().toArray());
        jcbTipoAdquisicion.setModel(dcbmTipoAdquisicion);

        dcbmEstado = new DefaultComboBoxModel(estadoControlador.extraerTodosVisibles().toArray());
        jcbEstado.setModel(dcbmEstado);

        dcbmCategoria = new DefaultComboBoxModel(categoriaControlador.extraerTodosVisibles().toArray());
        jcbCategoria.setModel(dcbmCategoria);

        dcbmMarca = new DefaultComboBoxModel(marcaControlador.extraerTodosVisibles().toArray());
        jcbMarca.setModel(dcbmMarca);

        inicializarComboModelos();

        inicializacionVentana();

    }

    /**
     *
     * @throws SQLException
     */
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
        jbVolver1 = new javax.swing.JButton();
        jbAceptar = new javax.swing.JButton();
        jpTitulo1 = new javax.swing.JPanel();
        jrbVisible = new javax.swing.JRadioButton();
        jtfChasis = new javax.swing.JTextField();
        jlCaracteristicas1 = new javax.swing.JLabel();
        jlDominio = new javax.swing.JLabel();
        ljCategoria1 = new javax.swing.JLabel();
        jcbReparticiones = new javax.swing.JComboBox();
        jrbNoVisible = new javax.swing.JRadioButton();
        jcbCategoria = new javax.swing.JComboBox();
        jlValor = new javax.swing.JLabel();
        jcbMarca = new javax.swing.JComboBox();
        jlMarca = new javax.swing.JLabel();
        jlModelo = new javax.swing.JLabel();
        jtfDominio = new javax.swing.JTextField();
        jlNombre = new javax.swing.JLabel();
        jtfCaracteristicas = new javax.swing.JTextField();
        jlCantidad = new javax.swing.JLabel();
        jcbModelo = new javax.swing.JComboBox();
        jtfCantidad = new javax.swing.JFormattedTextField();
        jtfValor = new javax.swing.JFormattedTextField();
        jlVisible = new javax.swing.JLabel();
        jlExpediente = new javax.swing.JLabel();
        jlChasis = new javax.swing.JLabel();
        jtfExpediente = new javax.swing.JTextField();
        jcbEstado = new javax.swing.JComboBox();
        jlReparticiones = new javax.swing.JLabel();
        jlEstado1 = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jlObservaciones = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaObservaciones = new javax.swing.JTextArea();
        jlTipoAdquisicion = new javax.swing.JLabel();
        jcbTipoAdquisicion = new javax.swing.JComboBox();

        setClosable(true);
        setTitle("SISPA - Automotores");
        setPreferredSize(new java.awt.Dimension(1000, 710));

        desktopPane.setPreferredSize(new java.awt.Dimension(1000, 716));

        jpPrincipal.setBackground(new java.awt.Color(251, 255, 216));
        jpPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        jpPrincipal.setPreferredSize(new java.awt.Dimension(1000, 716));
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
        jlTituloPrincipal.setText("SISPA - Automotores");
        jpTitulo.add(jlTituloPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 390, 70));

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
        jpPrincipal.add(jbAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 490, 100, -1));

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

        jrbVisible.setBackground(new java.awt.Color(204, 204, 204));
        jrbVisible.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbVisible.setForeground(new java.awt.Color(33, 150, 243));
        jrbVisible.setSelected(true);
        jrbVisible.setText("Visible");
        jpPrincipal.add(jrbVisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        jtfChasis.setBackground(new java.awt.Color(204, 204, 204));
        jtfChasis.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfChasis.setForeground(new java.awt.Color(33, 150, 243));
        jtfChasis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfChasisActionPerformed(evt);
            }
        });
        jpPrincipal.add(jtfChasis, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 170, -1));

        jlCaracteristicas1.setBackground(new java.awt.Color(204, 204, 204));
        jlCaracteristicas1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlCaracteristicas1.setForeground(new java.awt.Color(33, 150, 243));
        jlCaracteristicas1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlCaracteristicas1.setText("Caracteristicas:");
        jpPrincipal.add(jlCaracteristicas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 280, 210, 20));

        jlDominio.setBackground(new java.awt.Color(204, 204, 204));
        jlDominio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlDominio.setForeground(new java.awt.Color(33, 150, 243));
        jlDominio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlDominio.setText("Dominio:");
        jpPrincipal.add(jlDominio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 210, 20));

        ljCategoria1.setBackground(new java.awt.Color(204, 204, 204));
        ljCategoria1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ljCategoria1.setForeground(new java.awt.Color(33, 150, 243));
        ljCategoria1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ljCategoria1.setText("Categoria:");
        jpPrincipal.add(ljCategoria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, 90, 20));

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

        jrbNoVisible.setBackground(new java.awt.Color(204, 204, 204));
        jrbNoVisible.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbNoVisible.setForeground(new java.awt.Color(33, 150, 243));
        jrbNoVisible.setText("No Visible");
        jpPrincipal.add(jrbNoVisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 100, -1));

        jcbCategoria.setBackground(new java.awt.Color(204, 204, 204));
        jcbCategoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbCategoria.setForeground(new java.awt.Color(33, 150, 243));
        jcbCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jpPrincipal.add(jcbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 240, 220, -1));

        jlValor.setBackground(new java.awt.Color(204, 204, 204));
        jlValor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlValor.setForeground(new java.awt.Color(33, 150, 243));
        jlValor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlValor.setText("Valor:");
        jpPrincipal.add(jlValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 210, 20));

        jcbMarca.setBackground(new java.awt.Color(204, 204, 204));
        jcbMarca.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbMarca.setForeground(new java.awt.Color(33, 150, 243));
        jcbMarca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMarcaActionPerformed(evt);
            }
        });
        jpPrincipal.add(jcbMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 280, 220, -1));

        jlMarca.setBackground(new java.awt.Color(204, 204, 204));
        jlMarca.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlMarca.setForeground(new java.awt.Color(33, 150, 243));
        jlMarca.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlMarca.setText("Marca:");
        jpPrincipal.add(jlMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, 120, 20));

        jlModelo.setBackground(new java.awt.Color(204, 204, 204));
        jlModelo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlModelo.setForeground(new java.awt.Color(33, 150, 243));
        jlModelo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlModelo.setText("Modelo:");
        jpPrincipal.add(jlModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, 120, 20));

        jtfDominio.setBackground(new java.awt.Color(204, 204, 204));
        jtfDominio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfDominio.setForeground(new java.awt.Color(33, 150, 243));
        jtfDominio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDominioActionPerformed(evt);
            }
        });
        jpPrincipal.add(jtfDominio, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 170, -1));

        jlNombre.setBackground(new java.awt.Color(204, 204, 204));
        jlNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlNombre.setForeground(new java.awt.Color(33, 150, 243));
        jlNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlNombre.setText("Nombre: ");
        jpPrincipal.add(jlNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 160, 210, 20));

        jtfCaracteristicas.setBackground(new java.awt.Color(204, 204, 204));
        jtfCaracteristicas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfCaracteristicas.setForeground(new java.awt.Color(33, 150, 243));
        jtfCaracteristicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCaracteristicasActionPerformed(evt);
            }
        });
        jpPrincipal.add(jtfCaracteristicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 170, -1));

        jlCantidad.setBackground(new java.awt.Color(204, 204, 204));
        jlCantidad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlCantidad.setForeground(new java.awt.Color(33, 150, 243));
        jlCantidad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlCantidad.setText("Cantidad:");
        jpPrincipal.add(jlCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 210, 20));

        jcbModelo.setBackground(new java.awt.Color(204, 204, 204));
        jcbModelo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbModelo.setForeground(new java.awt.Color(33, 150, 243));
        jcbModelo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jpPrincipal.add(jcbModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 320, 220, -1));

        jtfCantidad.setBackground(new java.awt.Color(204, 204, 204));
        jtfCantidad.setForeground(new java.awt.Color(33, 150, 243));
        jtfCantidad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jtfCantidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jpPrincipal.add(jtfCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 170, 25));

        jtfValor.setBackground(new java.awt.Color(204, 204, 204));
        jtfValor.setForeground(new java.awt.Color(33, 150, 243));
        jtfValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jtfValor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jpPrincipal.add(jtfValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 170, 25));

        jlVisible.setBackground(new java.awt.Color(204, 204, 204));
        jlVisible.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlVisible.setForeground(new java.awt.Color(33, 150, 243));
        jlVisible.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlVisible.setText("Estado: ");
        jpPrincipal.add(jlVisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 200, 210, 20));

        jlExpediente.setBackground(new java.awt.Color(204, 204, 204));
        jlExpediente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlExpediente.setForeground(new java.awt.Color(33, 150, 243));
        jlExpediente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlExpediente.setText("Expediente:");
        jpPrincipal.add(jlExpediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 240, 210, 20));

        jlChasis.setBackground(new java.awt.Color(204, 204, 204));
        jlChasis.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlChasis.setForeground(new java.awt.Color(33, 150, 243));
        jlChasis.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlChasis.setText("Chasis:");
        jpPrincipal.add(jlChasis, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 210, 20));

        jtfExpediente.setBackground(new java.awt.Color(204, 204, 204));
        jtfExpediente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfExpediente.setForeground(new java.awt.Color(33, 150, 243));
        jtfExpediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfExpedienteActionPerformed(evt);
            }
        });
        jpPrincipal.add(jtfExpediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 170, -1));

        jcbEstado.setBackground(new java.awt.Color(204, 204, 204));
        jcbEstado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbEstado.setForeground(new java.awt.Color(33, 150, 243));
        jcbEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jpPrincipal.add(jcbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 200, 220, -1));

        jlReparticiones.setBackground(new java.awt.Color(204, 204, 204));
        jlReparticiones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlReparticiones.setForeground(new java.awt.Color(33, 150, 243));
        jlReparticiones.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlReparticiones.setText("Reparticion:");
        jpPrincipal.add(jlReparticiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 130, 30));

        jlEstado1.setBackground(new java.awt.Color(204, 204, 204));
        jlEstado1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlEstado1.setForeground(new java.awt.Color(33, 150, 243));
        jlEstado1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlEstado1.setText("Estado:");
        jpPrincipal.add(jlEstado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, 90, 30));

        jtfNombre.setBackground(new java.awt.Color(204, 204, 204));
        jtfNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfNombre.setForeground(new java.awt.Color(33, 150, 243));
        jtfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNombreActionPerformed(evt);
            }
        });
        jpPrincipal.add(jtfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 170, -1));

        jlObservaciones.setBackground(new java.awt.Color(204, 204, 204));
        jlObservaciones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlObservaciones.setForeground(new java.awt.Color(33, 150, 243));
        jlObservaciones.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlObservaciones.setText("Mantenimiento:");
        jpPrincipal.add(jlObservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 320, 210, 30));

        jtaObservaciones.setColumns(20);
        jtaObservaciones.setRows(5);
        jScrollPane1.setViewportView(jtaObservaciones);

        jpPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 440, 100));

        jlTipoAdquisicion.setBackground(new java.awt.Color(204, 204, 204));
        jlTipoAdquisicion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlTipoAdquisicion.setForeground(new java.awt.Color(33, 150, 243));
        jlTipoAdquisicion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlTipoAdquisicion.setText("Tipo de Aquisic.");
        jpPrincipal.add(jlTipoAdquisicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, 120, 20));

        jcbTipoAdquisicion.setBackground(new java.awt.Color(204, 204, 204));
        jcbTipoAdquisicion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbTipoAdquisicion.setForeground(new java.awt.Color(33, 150, 243));
        jcbTipoAdquisicion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbTipoAdquisicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoAdquisicionActionPerformed(evt);
            }
        });
        jpPrincipal.add(jcbTipoAdquisicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 360, 220, -1));

        desktopPane.setLayer(jpPrincipal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopPaneLayout.createSequentialGroup()
                .addComponent(jpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 1098, Short.MAX_VALUE)
                .addContainerGap())
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 998, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jpTitulo1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpTitulo1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpTitulo1MousePressed

    private void jpTitulo1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpTitulo1MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jpTitulo1MouseDragged

    private void jbAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAceptarActionPerformed
        if (recolectarDatos() == OK) {
            if (grabar() == OK) {
                ventanaGestion.actualizarGestion();
                dispose();
            }
        }
    }//GEN-LAST:event_jbAceptarActionPerformed

    private void jpTituloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpTituloMousePressed

    }//GEN-LAST:event_jpTituloMousePressed

    private void jpTituloMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpTituloMouseDragged

    }//GEN-LAST:event_jpTituloMouseDragged

    private void jtfChasisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfChasisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfChasisActionPerformed

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

    private void jtfCaracteristicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCaracteristicasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCaracteristicasActionPerformed

    private void jtfExpedienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfExpedienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfExpedienteActionPerformed

    private void jtfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNombreActionPerformed

    private void jbVolver1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbVolver1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbVolver1MousePressed

    private void jbVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolver1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbVolver1ActionPerformed

    private void jcbTipoAdquisicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoAdquisicionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbTipoAdquisicionActionPerformed

    /**
     *
     */
    public void inicializacionVentana() {
        jcbReparticiones.setEnabled(false);
        jcbReparticiones.setSelectedItem(Login.usuario.getReparticion());
        if (!operacion.equals(Gestionable.ABM_ALTA)) {
            jtfNombre.setText(muebleMantenible.getNombre());
            if (muebleMantenible.isVisible()) {
                jrbVisible.setSelected(true);
            } else {
                jrbNoVisible.setSelected(true);
            }
            jtfExpediente.setText(String.valueOf(muebleMantenible.getExpediente()));
            jtfCaracteristicas.setText(String.valueOf(muebleMantenible.getCaracteristicas()));
            jtaObservaciones.setText(String.valueOf(muebleMantenible.getObservaciones()));
            jtfDominio.setText(String.valueOf(muebleMantenible.getDominio()));
            jtfChasis.setText(String.valueOf(muebleMantenible.getChasis()));
            jcbTipoAdquisicion.setSelectedItem(muebleMantenible.getTipoAdquisicion());
            jcbEstado.setSelectedItem(muebleMantenible.getEstado());
            jcbCategoria.setSelectedItem(muebleMantenible.getCategoria());
            jcbMarca.setSelectedItem(muebleMantenible.getModelo().getMarca());
            jcbModelo.setSelectedItem(muebleMantenible.getModelo());
            jtfCantidad.setText(String.valueOf(muebleMantenible.getCantidad()));
            jtfValor.setText(String.valueOf(muebleMantenible.getValor()));

            if (!operacion.equals(Gestionable.ABM_MODIFICACION)) {
                jtfNombre.setEditable(false);
                jrbVisible.setEnabled(false);
                jrbNoVisible.setEnabled(false);
                jtfExpediente.setEditable(false);
                jtaObservaciones.setEditable(false);
                jtfDominio.setEditable(false);
                jcbTipoAdquisicion.setEnabled(false);
                jtfChasis.setEditable(false);
                jcbReparticiones.setEnabled(false);
                jcbEstado.setEnabled(false);
                jtfCaracteristicas.setEditable(false);
                jcbCategoria.setEnabled(false);
                jcbMarca.setEnabled(false);
                jcbModelo.setEnabled(false);
                jtfCantidad.setEditable(false);
                jtfValor.setEditable(false);
                if (!operacion.equals(Gestionable.ABM_BAJA)) {
                    jbAceptar.setVisible(false);

                }
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
            if (muebleMantenible.getObservaciones() != null) {
                observaciones = muebleMantenible.getObservaciones();
            } else {
                observaciones = "";
            }
            muebleMantenible.setNombre(jtfNombre.getText());
            if (jrbVisible.isSelected()) {
                muebleMantenible.setVisible(true);
            } else {
                muebleMantenible.setVisible(false);
            }
            muebleMantenible.setExpediente(jtfExpediente.getText());
            muebleMantenible.setCaracteristicas(jtfCaracteristicas.getText());
            muebleMantenible.setObservaciones(jtaObservaciones.getText());
            muebleMantenible.setDominio(jtfDominio.getText());
            muebleMantenible.setChasis(jtfChasis.getText());
            muebleMantenible.setReparticion((Reparticion) jcbReparticiones.getSelectedItem());
            muebleMantenible.setEstado((Estado) jcbEstado.getSelectedItem());
            muebleMantenible.setCategoria((Categoria) jcbCategoria.getSelectedItem());
            muebleMantenible.setModelo((Modelo) jcbModelo.getSelectedItem());
            muebleMantenible.setCantidad(Integer.parseInt(jtfCantidad.getText()));
            muebleMantenible.setValor(Float.parseFloat(jtfValor.getText()));
            muebleMantenible.setTipoAdquisicion((TipoAdquisicion) jcbTipoAdquisicion.getSelectedItem());
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
        MuebleMantenibleControlador muebleMantenibleControlador = new MuebleMantenibleControlador();
        if (operacion.equals(Gestionable.ABM_ALTA)) {
            try {
                muebleMantenibleControlador.insertar(muebleMantenible);
            } catch (SQLException ex) {
                Logger.getLogger(AbmMuebleMantenible.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (operacion.equals(Gestionable.ABM_BAJA)) {
            try {
                muebleMantenibleControlador.borrar(muebleMantenible);
            } catch (SQLException ex) {
                Logger.getLogger(AbmMuebleMantenible.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (operacion.equals(Gestionable.ABM_MODIFICACION)) {
            try {
                muebleMantenibleControlador.modificar(muebleMantenible, observaciones);
            } catch (SQLException ex) {
                Logger.getLogger(AbmMuebleMantenible.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return OK;
    }

    /**
     *
     * @throws SQLException
     */
    public void inicializarComboModelos() throws SQLException {
        dcbmModelo = new DefaultComboBoxModel(modeloControlador.extraerTodosVisiblesPorMarca(
                (Marca) jcbMarca.getSelectedItem()).toArray());
        jcbModelo.setModel(dcbmModelo);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAceptar;
    private javax.swing.JButton jbVolver1;
    private javax.swing.ButtonGroup jbgEstado;
    private javax.swing.JComboBox jcbCategoria;
    private javax.swing.JComboBox jcbEstado;
    private javax.swing.JComboBox jcbMarca;
    private javax.swing.JComboBox jcbModelo;
    private javax.swing.JComboBox jcbReparticiones;
    private javax.swing.JComboBox jcbTipoAdquisicion;
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
    private javax.swing.JLabel jlTipoAdquisicion;
    private javax.swing.JLabel jlTituloPrincipal;
    private javax.swing.JLabel jlValor;
    private javax.swing.JLabel jlVisible;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JPanel jpTitulo;
    private javax.swing.JPanel jpTitulo1;
    private javax.swing.JRadioButton jrbNoVisible;
    private javax.swing.JRadioButton jrbVisible;
    private javax.swing.JTextArea jtaObservaciones;
    private javax.swing.JFormattedTextField jtfCantidad;
    private javax.swing.JTextField jtfCaracteristicas;
    private javax.swing.JTextField jtfChasis;
    private javax.swing.JTextField jtfDominio;
    private javax.swing.JTextField jtfExpediente;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JFormattedTextField jtfValor;
    private javax.swing.JLabel ljCategoria1;
    // End of variables declaration//GEN-END:variables

}

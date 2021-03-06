/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.abm;

import controlador.MuebleControlador;
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
import objeto.Mueble;
import objeto.Reparticion;
import objeto.TipoAdquisicion;
import ui.gestion.Gestionable;

/**
 *
 * @author Kuky
 */
public class AbmMuebles extends javax.swing.JInternalFrame implements IAbm {

    private MuebleControlador muebleControlador = new MuebleControlador();
    private ReparticionControlador reparticionControlador = new ReparticionControlador();
    private EstadoControlador estadoControlador = new EstadoControlador();
    private CategoriaControlador categoriaControlador = new CategoriaControlador();
    private ModeloControlador modeloControlador = new ModeloControlador();
    private MarcaControlador marcaControlador = new MarcaControlador();
    private TipoAdquisicionControlador tipoAdquisicionControlador = new TipoAdquisicionControlador();

    private DefaultComboBoxModel dcbmReparticiones;
    private DefaultComboBoxModel dcbmEstado;
    private DefaultComboBoxModel dcbmCategoria;
    private DefaultComboBoxModel dcbmMarca;
    private DefaultComboBoxModel dcbmModelo;
    private DefaultComboBoxModel dcbmTipoAdquisicion;
    private String operacion;
    private Mueble mueble;
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
    public Mueble getMueble() {
        return mueble;
    }

    /**
     *
     * @param mueble
     */
    public void setMueble(Mueble mueble) {
        this.mueble = mueble;
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
     * @param mueble
     * @param ventanaGestion
     * @throws SQLException
     */
    public AbmMuebles(String operacion, Mueble mueble, Gestionable ventanaGestion) throws SQLException {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        campos.add(jtfNombre);
        campos.add(jtfExpediente);
        campos.add(jtfCaracteristicas);
        campos.add(jtfCantidad);
        campos.add(jtfValor);
        jbgEstado.add(jrbVisible);
        jbgEstado.add(jrbNoVisible);
        jlNombreUsuario.setText(Login.usuario.toString());
        this.operacion = operacion;
        this.mueble = mueble;
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
    public AbmMuebles() throws SQLException {
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
        jlTipoAdquisicion = new javax.swing.JLabel();
        jcbTipoAdquisicion = new javax.swing.JComboBox();
        jcbModelo = new javax.swing.JComboBox();
        jlEstado1 = new javax.swing.JLabel();
        jcbEstado = new javax.swing.JComboBox();
        ljCategoria1 = new javax.swing.JLabel();
        jcbCategoria = new javax.swing.JComboBox();
        jlMarca = new javax.swing.JLabel();
        jcbMarca = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaObservaciones = new javax.swing.JTextArea();
        jlCantidad = new javax.swing.JLabel();
        jlValor = new javax.swing.JLabel();
        jpTitulo1 = new javax.swing.JPanel();
        jtfCantidad = new javax.swing.JFormattedTextField();
        jtfValor = new javax.swing.JFormattedTextField();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        desktopPane1 = new javax.swing.JDesktopPane();
        jpPrincipal1 = new javax.swing.JPanel();
        jpTitulo2 = new javax.swing.JPanel();
        jlTituloPrincipal1 = new javax.swing.JLabel();
        jlSubtitulo1 = new javax.swing.JLabel();
        jlBienvenido1 = new javax.swing.JLabel();
        jlNombreUsuario1 = new javax.swing.JLabel();
        jbAceptar1 = new javax.swing.JButton();
        jlModelo1 = new javax.swing.JLabel();
        jtfExpediente1 = new javax.swing.JTextField();
        jlVisible1 = new javax.swing.JLabel();
        jrbNoVisible1 = new javax.swing.JRadioButton();
        jrbVisible1 = new javax.swing.JRadioButton();
        jcbReparticiones1 = new javax.swing.JComboBox();
        jlExpediente1 = new javax.swing.JLabel();
        jlObservaciones1 = new javax.swing.JLabel();
        jlReparticiones1 = new javax.swing.JLabel();
        jtfNombre1 = new javax.swing.JTextField();
        jlCaracteristicas2 = new javax.swing.JLabel();
        jtfCaracteristicas1 = new javax.swing.JTextField();
        jlNombre1 = new javax.swing.JLabel();
        jcbModelo1 = new javax.swing.JComboBox();
        jlEstado2 = new javax.swing.JLabel();
        jcbEstado1 = new javax.swing.JComboBox();
        ljCategoria2 = new javax.swing.JLabel();
        jcbCategoria1 = new javax.swing.JComboBox();
        jlMarca1 = new javax.swing.JLabel();
        jcbMarca1 = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaObservaciones1 = new javax.swing.JTextArea();
        jlCantidad1 = new javax.swing.JLabel();
        jtfCantidad1 = new javax.swing.JTextField();
        jlValor1 = new javax.swing.JLabel();
        jtfValor1 = new javax.swing.JTextField();
        jpTitulo3 = new javax.swing.JPanel();

        setClosable(true);
        setTitle("SISPA - Muebles");
        setPreferredSize(new java.awt.Dimension(1000, 710));

        desktopPane.setPreferredSize(new java.awt.Dimension(1000, 710));

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
        jpPrincipal.add(jbAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 520, 100, -1));

        jlModelo.setBackground(new java.awt.Color(204, 204, 204));
        jlModelo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlModelo.setForeground(new java.awt.Color(33, 150, 243));
        jlModelo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlModelo.setText("Modelo:");
        jpPrincipal.add(jlModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, 120, 20));

        jtfExpediente.setBackground(new java.awt.Color(204, 204, 204));
        jtfExpediente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfExpediente.setForeground(new java.awt.Color(33, 150, 243));
        jtfExpediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfExpedienteActionPerformed(evt);
            }
        });
        jpPrincipal.add(jtfExpediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 220, -1));

        jlVisible.setBackground(new java.awt.Color(204, 204, 204));
        jlVisible.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlVisible.setForeground(new java.awt.Color(33, 150, 243));
        jlVisible.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlVisible.setText("Estado: ");
        jpPrincipal.add(jlVisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 190, 210, 20));

        jrbNoVisible.setBackground(new java.awt.Color(204, 204, 204));
        jrbNoVisible.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbNoVisible.setForeground(new java.awt.Color(33, 150, 243));
        jrbNoVisible.setText("No Visible");
        jpPrincipal.add(jrbNoVisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, -1, -1));

        jrbVisible.setBackground(new java.awt.Color(204, 204, 204));
        jrbVisible.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbVisible.setForeground(new java.awt.Color(33, 150, 243));
        jrbVisible.setSelected(true);
        jrbVisible.setText("Visible");
        jpPrincipal.add(jrbVisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, -1, -1));

        jcbReparticiones.setBackground(new java.awt.Color(204, 204, 204));
        jcbReparticiones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbReparticiones.setForeground(new java.awt.Color(33, 150, 243));
        jcbReparticiones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbReparticiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbReparticionesActionPerformed(evt);
            }
        });
        jpPrincipal.add(jcbReparticiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 220, -1));

        jlExpediente.setBackground(new java.awt.Color(204, 204, 204));
        jlExpediente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlExpediente.setForeground(new java.awt.Color(33, 150, 243));
        jlExpediente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlExpediente.setText("Expediente:");
        jpPrincipal.add(jlExpediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 240, 210, 20));

        jlObservaciones.setBackground(new java.awt.Color(204, 204, 204));
        jlObservaciones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlObservaciones.setForeground(new java.awt.Color(33, 150, 243));
        jlObservaciones.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlObservaciones.setText("Observaciones:");
        jpPrincipal.add(jlObservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 210, 20));

        jlReparticiones.setBackground(new java.awt.Color(204, 204, 204));
        jlReparticiones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlReparticiones.setForeground(new java.awt.Color(33, 150, 243));
        jlReparticiones.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlReparticiones.setText("Reparticion:");
        jpPrincipal.add(jlReparticiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 130, 30));

        jtfNombre.setBackground(new java.awt.Color(204, 204, 204));
        jtfNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfNombre.setForeground(new java.awt.Color(33, 150, 243));
        jtfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNombreActionPerformed(evt);
            }
        });
        jpPrincipal.add(jtfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 220, -1));

        jlCaracteristicas1.setBackground(new java.awt.Color(204, 204, 204));
        jlCaracteristicas1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlCaracteristicas1.setForeground(new java.awt.Color(33, 150, 243));
        jlCaracteristicas1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlCaracteristicas1.setText("Caracteristicas:");
        jpPrincipal.add(jlCaracteristicas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 290, 210, 20));

        jtfCaracteristicas.setBackground(new java.awt.Color(204, 204, 204));
        jtfCaracteristicas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfCaracteristicas.setForeground(new java.awt.Color(33, 150, 243));
        jtfCaracteristicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCaracteristicasActionPerformed(evt);
            }
        });
        jpPrincipal.add(jtfCaracteristicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 220, -1));

        jlNombre.setBackground(new java.awt.Color(204, 204, 204));
        jlNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlNombre.setForeground(new java.awt.Color(33, 150, 243));
        jlNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlNombre.setText("Nombre: ");
        jpPrincipal.add(jlNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 150, 210, 20));

        jlTipoAdquisicion.setBackground(new java.awt.Color(204, 204, 204));
        jlTipoAdquisicion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlTipoAdquisicion.setForeground(new java.awt.Color(33, 150, 243));
        jlTipoAdquisicion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlTipoAdquisicion.setText("Tipo de Aquisic.");
        jpPrincipal.add(jlTipoAdquisicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 120, 20));

        jcbTipoAdquisicion.setBackground(new java.awt.Color(204, 204, 204));
        jcbTipoAdquisicion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbTipoAdquisicion.setForeground(new java.awt.Color(33, 150, 243));
        jcbTipoAdquisicion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbTipoAdquisicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoAdquisicionActionPerformed(evt);
            }
        });
        jpPrincipal.add(jcbTipoAdquisicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, 220, -1));

        jcbModelo.setBackground(new java.awt.Color(204, 204, 204));
        jcbModelo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbModelo.setForeground(new java.awt.Color(33, 150, 243));
        jcbModelo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbModeloActionPerformed(evt);
            }
        });
        jpPrincipal.add(jcbModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, 220, -1));

        jlEstado1.setBackground(new java.awt.Color(204, 204, 204));
        jlEstado1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlEstado1.setForeground(new java.awt.Color(33, 150, 243));
        jlEstado1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlEstado1.setText("Estado:");
        jpPrincipal.add(jlEstado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 90, 30));

        jcbEstado.setBackground(new java.awt.Color(204, 204, 204));
        jcbEstado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbEstado.setForeground(new java.awt.Color(33, 150, 243));
        jcbEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jpPrincipal.add(jcbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, 220, -1));

        ljCategoria1.setBackground(new java.awt.Color(204, 204, 204));
        ljCategoria1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ljCategoria1.setForeground(new java.awt.Color(33, 150, 243));
        ljCategoria1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ljCategoria1.setText("Categoria:");
        jpPrincipal.add(ljCategoria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 90, 20));

        jcbCategoria.setBackground(new java.awt.Color(204, 204, 204));
        jcbCategoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbCategoria.setForeground(new java.awt.Color(33, 150, 243));
        jcbCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jpPrincipal.add(jcbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, 220, -1));

        jlMarca.setBackground(new java.awt.Color(204, 204, 204));
        jlMarca.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlMarca.setForeground(new java.awt.Color(33, 150, 243));
        jlMarca.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlMarca.setText("Marca:");
        jpPrincipal.add(jlMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 120, 20));

        jcbMarca.setBackground(new java.awt.Color(204, 204, 204));
        jcbMarca.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbMarca.setForeground(new java.awt.Color(33, 150, 243));
        jcbMarca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMarcaActionPerformed(evt);
            }
        });
        jpPrincipal.add(jcbMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, 220, -1));

        jtaObservaciones.setColumns(20);
        jtaObservaciones.setRows(5);
        jScrollPane1.setViewportView(jtaObservaciones);

        jpPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 620, 50));

        jlCantidad.setBackground(new java.awt.Color(204, 204, 204));
        jlCantidad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlCantidad.setForeground(new java.awt.Color(33, 150, 243));
        jlCantidad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlCantidad.setText("Cantidad:");
        jpPrincipal.add(jlCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 340, 210, 20));

        jlValor.setBackground(new java.awt.Color(204, 204, 204));
        jlValor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlValor.setForeground(new java.awt.Color(33, 150, 243));
        jlValor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlValor.setText("Valor:");
        jpPrincipal.add(jlValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 390, 210, 20));

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

        jtfCantidad.setBackground(new java.awt.Color(204, 204, 204));
        jtfCantidad.setForeground(new java.awt.Color(33, 150, 243));
        jtfCantidad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jtfCantidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jpPrincipal.add(jtfCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 220, 25));

        jtfValor.setBackground(new java.awt.Color(204, 204, 204));
        jtfValor.setForeground(new java.awt.Color(33, 150, 243));
        jtfValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jtfValor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jpPrincipal.add(jtfValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 220, 25));

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

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setTitle("SISPA - Muebles");
        jInternalFrame1.setPreferredSize(new java.awt.Dimension(1000, 710));

        desktopPane1.setPreferredSize(new java.awt.Dimension(1000, 716));

        jpPrincipal1.setBackground(new java.awt.Color(255, 255, 255));
        jpPrincipal1.setForeground(new java.awt.Color(255, 255, 255));
        jpPrincipal1.setPreferredSize(new java.awt.Dimension(1000, 716));
        jpPrincipal1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jlTituloPrincipal1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jlTituloPrincipal1.setForeground(new java.awt.Color(255, 255, 255));
        jlTituloPrincipal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ic_ajustes_blanco.png"))); // NOI18N
        jlTituloPrincipal1.setText("SISPA - Muebles");
        jpTitulo2.add(jlTituloPrincipal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 340, 70));

        jlSubtitulo1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlSubtitulo1.setForeground(new java.awt.Color(255, 255, 255));
        jlSubtitulo1.setText("Sistema de Control de Patrimonio");
        jpTitulo2.add(jlSubtitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        jlBienvenido1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlBienvenido1.setForeground(new java.awt.Color(255, 255, 255));
        jlBienvenido1.setText("Bienvenido: ");
        jpTitulo2.add(jlBienvenido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        jlNombreUsuario1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlNombreUsuario1.setForeground(new java.awt.Color(255, 255, 255));
        jlNombreUsuario1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlNombreUsuario1.setText("Usuario");
        jpTitulo2.add(jlNombreUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 170, -1));

        jpPrincipal1.add(jpTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 140));

        jbAceptar1.setBackground(new java.awt.Color(204, 204, 204));
        jbAceptar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbAceptar1.setForeground(new java.awt.Color(33, 150, 243));
        jbAceptar1.setText("Aceptar");
        jbAceptar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAceptar1ActionPerformed(evt);
            }
        });
        jpPrincipal1.add(jbAceptar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 520, 100, -1));

        jlModelo1.setBackground(new java.awt.Color(204, 204, 204));
        jlModelo1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlModelo1.setForeground(new java.awt.Color(33, 150, 243));
        jlModelo1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlModelo1.setText("Modelo:");
        jpPrincipal1.add(jlModelo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, 120, 20));

        jtfExpediente1.setBackground(new java.awt.Color(204, 204, 204));
        jtfExpediente1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfExpediente1.setForeground(new java.awt.Color(33, 150, 243));
        jtfExpediente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfExpediente1ActionPerformed(evt);
            }
        });
        jpPrincipal1.add(jtfExpediente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 220, -1));

        jlVisible1.setBackground(new java.awt.Color(204, 204, 204));
        jlVisible1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlVisible1.setForeground(new java.awt.Color(33, 150, 243));
        jlVisible1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlVisible1.setText("Estado: ");
        jpPrincipal1.add(jlVisible1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 190, 210, 20));

        jrbNoVisible1.setBackground(new java.awt.Color(204, 204, 204));
        jrbNoVisible1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbNoVisible1.setForeground(new java.awt.Color(33, 150, 243));
        jrbNoVisible1.setText("No Visible");
        jpPrincipal1.add(jrbNoVisible1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, -1, -1));

        jrbVisible1.setBackground(new java.awt.Color(204, 204, 204));
        jrbVisible1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbVisible1.setForeground(new java.awt.Color(33, 150, 243));
        jrbVisible1.setText("Visible");
        jpPrincipal1.add(jrbVisible1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, -1, -1));

        jcbReparticiones1.setBackground(new java.awt.Color(204, 204, 204));
        jcbReparticiones1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbReparticiones1.setForeground(new java.awt.Color(33, 150, 243));
        jcbReparticiones1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbReparticiones1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbReparticiones1ActionPerformed(evt);
            }
        });
        jpPrincipal1.add(jcbReparticiones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 220, -1));

        jlExpediente1.setBackground(new java.awt.Color(204, 204, 204));
        jlExpediente1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlExpediente1.setForeground(new java.awt.Color(33, 150, 243));
        jlExpediente1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlExpediente1.setText("Expediente:");
        jpPrincipal1.add(jlExpediente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 240, 210, 20));

        jlObservaciones1.setBackground(new java.awt.Color(204, 204, 204));
        jlObservaciones1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlObservaciones1.setForeground(new java.awt.Color(33, 150, 243));
        jlObservaciones1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlObservaciones1.setText("Observaciones:");
        jpPrincipal1.add(jlObservaciones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 210, 20));

        jlReparticiones1.setBackground(new java.awt.Color(204, 204, 204));
        jlReparticiones1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlReparticiones1.setForeground(new java.awt.Color(33, 150, 243));
        jlReparticiones1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlReparticiones1.setText("Reparticion:");
        jpPrincipal1.add(jlReparticiones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 130, 30));

        jtfNombre1.setBackground(new java.awt.Color(204, 204, 204));
        jtfNombre1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfNombre1.setForeground(new java.awt.Color(33, 150, 243));
        jtfNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNombre1ActionPerformed(evt);
            }
        });
        jpPrincipal1.add(jtfNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 220, -1));

        jlCaracteristicas2.setBackground(new java.awt.Color(204, 204, 204));
        jlCaracteristicas2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlCaracteristicas2.setForeground(new java.awt.Color(33, 150, 243));
        jlCaracteristicas2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlCaracteristicas2.setText("Caracteristicas:");
        jpPrincipal1.add(jlCaracteristicas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 290, 210, 20));

        jtfCaracteristicas1.setBackground(new java.awt.Color(204, 204, 204));
        jtfCaracteristicas1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfCaracteristicas1.setForeground(new java.awt.Color(33, 150, 243));
        jtfCaracteristicas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCaracteristicas1ActionPerformed(evt);
            }
        });
        jpPrincipal1.add(jtfCaracteristicas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 220, -1));

        jlNombre1.setBackground(new java.awt.Color(204, 204, 204));
        jlNombre1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlNombre1.setForeground(new java.awt.Color(33, 150, 243));
        jlNombre1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlNombre1.setText("Nombre: ");
        jpPrincipal1.add(jlNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 150, 210, 20));

        jcbModelo1.setBackground(new java.awt.Color(204, 204, 204));
        jcbModelo1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbModelo1.setForeground(new java.awt.Color(33, 150, 243));
        jcbModelo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbModelo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbModelo1ActionPerformed(evt);
            }
        });
        jpPrincipal1.add(jcbModelo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, 220, -1));

        jlEstado2.setBackground(new java.awt.Color(204, 204, 204));
        jlEstado2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlEstado2.setForeground(new java.awt.Color(33, 150, 243));
        jlEstado2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlEstado2.setText("Estado:");
        jpPrincipal1.add(jlEstado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 90, 30));

        jcbEstado1.setBackground(new java.awt.Color(204, 204, 204));
        jcbEstado1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbEstado1.setForeground(new java.awt.Color(33, 150, 243));
        jcbEstado1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jpPrincipal1.add(jcbEstado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, 220, -1));

        ljCategoria2.setBackground(new java.awt.Color(204, 204, 204));
        ljCategoria2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ljCategoria2.setForeground(new java.awt.Color(33, 150, 243));
        ljCategoria2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ljCategoria2.setText("Categoria:");
        jpPrincipal1.add(ljCategoria2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 90, 20));

        jcbCategoria1.setBackground(new java.awt.Color(204, 204, 204));
        jcbCategoria1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbCategoria1.setForeground(new java.awt.Color(33, 150, 243));
        jcbCategoria1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jpPrincipal1.add(jcbCategoria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, 220, -1));

        jlMarca1.setBackground(new java.awt.Color(204, 204, 204));
        jlMarca1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlMarca1.setForeground(new java.awt.Color(33, 150, 243));
        jlMarca1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlMarca1.setText("Marca:");
        jpPrincipal1.add(jlMarca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 120, 20));

        jcbMarca1.setBackground(new java.awt.Color(204, 204, 204));
        jcbMarca1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbMarca1.setForeground(new java.awt.Color(33, 150, 243));
        jcbMarca1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbMarca1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMarca1ActionPerformed(evt);
            }
        });
        jpPrincipal1.add(jcbMarca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, 220, -1));

        jtaObservaciones1.setColumns(20);
        jtaObservaciones1.setRows(5);
        jScrollPane2.setViewportView(jtaObservaciones1);

        jpPrincipal1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 620, 50));

        jlCantidad1.setBackground(new java.awt.Color(204, 204, 204));
        jlCantidad1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlCantidad1.setForeground(new java.awt.Color(33, 150, 243));
        jlCantidad1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlCantidad1.setText("Cantidad:");
        jpPrincipal1.add(jlCantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 340, 210, 20));

        jtfCantidad1.setBackground(new java.awt.Color(204, 204, 204));
        jtfCantidad1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfCantidad1.setForeground(new java.awt.Color(33, 150, 243));
        jtfCantidad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCantidad1ActionPerformed(evt);
            }
        });
        jpPrincipal1.add(jtfCantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 220, -1));

        jlValor1.setBackground(new java.awt.Color(204, 204, 204));
        jlValor1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlValor1.setForeground(new java.awt.Color(33, 150, 243));
        jlValor1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlValor1.setText("Valor:");
        jpPrincipal1.add(jlValor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 390, 210, 20));

        jtfValor1.setBackground(new java.awt.Color(204, 204, 204));
        jtfValor1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfValor1.setForeground(new java.awt.Color(33, 150, 243));
        jtfValor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfValor1ActionPerformed(evt);
            }
        });
        jpPrincipal1.add(jtfValor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 220, -1));

        jpTitulo3.setBackground(new java.awt.Color(33, 150, 243));
        jpTitulo3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jpTitulo3MouseDragged(evt);
            }
        });
        jpTitulo3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpTitulo3MousePressed(evt);
            }
        });
        jpTitulo3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jpPrincipal1.add(jpTitulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 1170, 140));

        desktopPane1.setLayer(jpPrincipal1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPane1Layout = new javax.swing.GroupLayout(desktopPane1);
        desktopPane1.setLayout(desktopPane1Layout);
        desktopPane1Layout.setHorizontalGroup(
            desktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopPane1Layout.createSequentialGroup()
                .addComponent(jpPrincipal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        desktopPane1Layout.setVerticalGroup(
            desktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrincipal1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addComponent(desktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 998, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
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
            Logger.getLogger(AbmMuebles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jcbMarcaActionPerformed

    private void jcbModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbModeloActionPerformed

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

    private void jbAceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAceptar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbAceptar1ActionPerformed

    private void jtfExpediente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfExpediente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfExpediente1ActionPerformed

    private void jcbReparticiones1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbReparticiones1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbReparticiones1ActionPerformed

    private void jtfNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNombre1ActionPerformed

    private void jtfCaracteristicas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCaracteristicas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCaracteristicas1ActionPerformed

    private void jcbModelo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbModelo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbModelo1ActionPerformed

    private void jcbMarca1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMarca1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbMarca1ActionPerformed

    private void jtfCantidad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCantidad1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCantidad1ActionPerformed

    private void jtfValor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfValor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfValor1ActionPerformed

    private void jpTitulo3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpTitulo3MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jpTitulo3MouseDragged

    private void jpTitulo3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpTitulo3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpTitulo3MousePressed

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
            jtfNombre.setText(mueble.getNombre());
            if (mueble.isVisible()) {
                jrbVisible.setSelected(true);
            } else {
                jrbNoVisible.setSelected(true);
            }
            jtfExpediente.setText(String.valueOf(mueble.getExpediente()));
            jtfCaracteristicas.setText(String.valueOf(mueble.getCaracteristicas()));
            jtaObservaciones.setText(String.valueOf(mueble.getObservaciones()));
            jcbTipoAdquisicion.setSelectedItem(mueble.getTipoAdquisicion());
            jcbEstado.setSelectedItem(mueble.getEstado());
            jcbCategoria.setSelectedItem(mueble.getCategoria());
            jcbMarca.setSelectedItem(mueble.getModelo().getMarca());
            jcbModelo.setSelectedItem(mueble.getModelo());
            jtfCantidad.setText(String.valueOf(mueble.getCantidad()));
            jtfValor.setText(String.valueOf(mueble.getValor()));

            if (!operacion.equals(Gestionable.ABM_MODIFICACION)) {
                jtfNombre.setEditable(false);
                jrbVisible.setEnabled(false);
                jrbNoVisible.setEnabled(false);
                jtfExpediente.setEditable(false);
                jtaObservaciones.setEditable(false);
                jcbEstado.setEnabled(false);
                jcbCategoria.setEnabled(false);
                jcbTipoAdquisicion.setEnabled(false);
                jcbMarca.setEnabled(false);
                jcbModelo.setEnabled(false);
                jtfCantidad.setEditable(false);
                jtfValor.setEditable(false);
                jtfCaracteristicas.setEditable(false);
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
            mueble.setNombre(jtfNombre.getText());
            if (jrbVisible.isSelected()) {
                mueble.setVisible(true);
            } else {
                mueble.setVisible(false);
            }
            mueble.setExpediente(jtfExpediente.getText());
            mueble.setCaracteristicas(jtfCaracteristicas.getText());
            mueble.setObservaciones(jtaObservaciones.getText());
            mueble.setReparticion((Reparticion) jcbReparticiones.getSelectedItem());
            mueble.setEstado((Estado) jcbEstado.getSelectedItem());
            mueble.setCategoria((Categoria) jcbCategoria.getSelectedItem());
            mueble.setModelo((Modelo) jcbModelo.getSelectedItem());
            mueble.setCantidad(Integer.parseInt(jtfCantidad.getText()));
            mueble.setValor(Float.parseFloat(jtfValor.getText()));
            mueble.setTipoAdquisicion((TipoAdquisicion) jcbTipoAdquisicion.getSelectedItem());
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
        MuebleControlador muebleControlador = new MuebleControlador();
        if (operacion.equals(Gestionable.ABM_ALTA)) {
            try {
                muebleControlador.insertar(mueble);
            } catch (SQLException ex) {
                Logger.getLogger(AbmMuebles.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (operacion.equals(Gestionable.ABM_BAJA)) {
            try {
                muebleControlador.borrar(mueble);
            } catch (SQLException ex) {
                Logger.getLogger(AbmMuebles.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (operacion.equals(Gestionable.ABM_MODIFICACION)) {
            try {
                muebleControlador.modificar(mueble);
            } catch (SQLException ex) {
                Logger.getLogger(AbmMuebles.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JDesktopPane desktopPane1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbAceptar;
    private javax.swing.JButton jbAceptar1;
    private javax.swing.JButton jbVolver1;
    private javax.swing.ButtonGroup jbgEstado;
    private javax.swing.JComboBox jcbCategoria;
    private javax.swing.JComboBox jcbCategoria1;
    private javax.swing.JComboBox jcbEstado;
    private javax.swing.JComboBox jcbEstado1;
    private javax.swing.JComboBox jcbMarca;
    private javax.swing.JComboBox jcbMarca1;
    private javax.swing.JComboBox jcbModelo;
    private javax.swing.JComboBox jcbModelo1;
    private javax.swing.JComboBox jcbReparticiones;
    private javax.swing.JComboBox jcbReparticiones1;
    private javax.swing.JComboBox jcbTipoAdquisicion;
    private javax.swing.JLabel jlBienvenido;
    private javax.swing.JLabel jlBienvenido1;
    private javax.swing.JLabel jlCantidad;
    private javax.swing.JLabel jlCantidad1;
    private javax.swing.JLabel jlCaracteristicas1;
    private javax.swing.JLabel jlCaracteristicas2;
    private javax.swing.JLabel jlEstado1;
    private javax.swing.JLabel jlEstado2;
    private javax.swing.JLabel jlExpediente;
    private javax.swing.JLabel jlExpediente1;
    private javax.swing.JLabel jlMarca;
    private javax.swing.JLabel jlMarca1;
    private javax.swing.JLabel jlModelo;
    private javax.swing.JLabel jlModelo1;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlNombre1;
    private javax.swing.JLabel jlNombreUsuario;
    private javax.swing.JLabel jlNombreUsuario1;
    private javax.swing.JLabel jlObservaciones;
    private javax.swing.JLabel jlObservaciones1;
    private javax.swing.JLabel jlReparticiones;
    private javax.swing.JLabel jlReparticiones1;
    private javax.swing.JLabel jlSubtitulo;
    private javax.swing.JLabel jlSubtitulo1;
    private javax.swing.JLabel jlTipoAdquisicion;
    private javax.swing.JLabel jlTituloPrincipal;
    private javax.swing.JLabel jlTituloPrincipal1;
    private javax.swing.JLabel jlValor;
    private javax.swing.JLabel jlValor1;
    private javax.swing.JLabel jlVisible;
    private javax.swing.JLabel jlVisible1;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JPanel jpPrincipal1;
    private javax.swing.JPanel jpTitulo;
    private javax.swing.JPanel jpTitulo1;
    private javax.swing.JPanel jpTitulo2;
    private javax.swing.JPanel jpTitulo3;
    private javax.swing.JRadioButton jrbNoVisible;
    private javax.swing.JRadioButton jrbNoVisible1;
    private javax.swing.JRadioButton jrbVisible;
    private javax.swing.JRadioButton jrbVisible1;
    private javax.swing.JTextArea jtaObservaciones;
    private javax.swing.JTextArea jtaObservaciones1;
    private javax.swing.JFormattedTextField jtfCantidad;
    private javax.swing.JTextField jtfCantidad1;
    private javax.swing.JTextField jtfCaracteristicas;
    private javax.swing.JTextField jtfCaracteristicas1;
    private javax.swing.JTextField jtfExpediente;
    private javax.swing.JTextField jtfExpediente1;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfNombre1;
    private javax.swing.JFormattedTextField jtfValor;
    private javax.swing.JTextField jtfValor1;
    private javax.swing.JLabel ljCategoria1;
    private javax.swing.JLabel ljCategoria2;
    // End of variables declaration//GEN-END:variables

}

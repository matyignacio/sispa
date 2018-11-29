/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import ui.Login;

/**
 *
 * @author Kuky
 */
public class Util {

    /**
     *
     */
    public static final int MUEBLE_MANTENIBLE = 1;

    /**
     *
     */
    public static final int MUEBLE_NO_MANTENIBLE = 0;

    /**
     *
     */
    public static final int ABM_AJUSTES = 3;

    /**
     *
     */
    public static final int ABM_USUARIOS = 4;

    /**
     *
     */
    public static final int ABM_INFORMES = 5;

    /**
     *
     */
    public static final int ABM_MARCAS = 6;

    /**
     *
     */
    public static final int ABM_MODELOS = 7;

    /**
     *
     */
    public static final int ABM_CATEGORIAS = 8;

    /**
     *
     */
    public static final int ABM_INCISOS = 9;

    /**
     *
     */
    public static final int ABM_CODIGOS_PRESUPUESTARIOS = 10;

    /**
     *
     */
    public static final int ABM_ESTADOS = 11;

    /**
     *
     */
    public static final int ABM_PERFILES = 12;

    /**
     *
     */
    public static final int ABM_REPARTICIONES = 13;

    /**
     *
     */
    public static final int ABM_TIPO_ADQUISICIONES = 14;

    /**
     *
     */
    public static final String CORREO = "sispaunlar@gmail.com";

    /**
     *
     */
    public static final String CLAVE = "sispasispa";

    /**
     *
     */
    public static final String LOOK_AND_FEEL = "Windows";

    /**
     *
     * @param dpPrincipal
     * @param gestion
     */
    public static void centrarVentana(javax.swing.JDesktopPane dpPrincipal, JInternalFrame gestion) {
        Dimension desktopSize = dpPrincipal.getSize();
        Dimension frameSize = gestion.getSize();
        gestion.setLocation((desktopSize.width - frameSize.width) / 2, (desktopSize.height - frameSize.height) / 2);

    }

    /**
     *
     * @param dpPrincipal
     * @param gestion
     */
    public static void centrarInternalVentana(JInternalFrame dpPrincipal, JInternalFrame gestion) {
        Dimension desktopSize = dpPrincipal.getSize();
        Dimension frameSize = gestion.getSize();
        gestion.setLocation(((desktopSize.width - frameSize.width) / 2) - 8, (desktopSize.height - frameSize.height) / 2);
    }

    /**
     *
     * @param estado
     */
    public static void setEnabledMenues(Boolean estado) {
        ui.Principal.jmModulos.setEnabled(estado);
        ui.Principal.jmSesion.setEnabled(estado);
        ui.Principal.jmAcercaDe.setEnabled(estado);
    }

    /**
     *
     * @param lookAndFeel
     */
    public static void modificarLookAndFeel(String lookAndFeel) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if (lookAndFeel.equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    public static boolean validarCampos(ArrayList<JTextField> campos) {
        boolean bandera = true;
        for (int i = 0; i < campos.size(); i++) {
            if (campos.get(i).getText().trim().equals("")) {
                bandera = false;
            }
        }
        return bandera;
    }

}

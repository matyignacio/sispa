/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.awt.Dimension;
import javax.swing.JInternalFrame;

/**
 *
 * @author Kuky
 */
public class Util {

    public static final int MUEBLE_MANTENIBLE = 1;
    public static final int MUEBLE_NO_MANTENIBLE = 0;
    public static final int ABM_AJUSTES = 3;
    public static final int ABM_USUARIOS = 4;
    public static final int ABM_INFORMES = 5;
    public static final String CORREO = "sispaunlar@gmail.com";
    public static final String CLAVE = "sispasispa";
    public static final String LOOK_AND_FEEL = "Windows";

    public static void centrarVentana(javax.swing.JDesktopPane dpPrincipal, JInternalFrame gestion) {
        Dimension desktopSize = dpPrincipal.getSize();
        Dimension FrameSize = gestion.getSize();
        gestion.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        
    }  

    public static void centrarInternalVentana(JInternalFrame dpPrincipal, JInternalFrame gestion) {
        Dimension desktopSize = dpPrincipal.getSize();
        Dimension FrameSize = gestion.getSize();
        gestion.setLocation(((desktopSize.width - FrameSize.width) / 2)- 8, (desktopSize.height - FrameSize.height) / 2);
    }


}

/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.gestion;

/**
 *
 * @author Kuky
 */
public interface Gestionable {

    /**
     *
     */
    public static final String ABM_ALTA = "ALTA";

    /**
     *
     */
    public static final String ABM_BAJA = "BAJA";

    /**
     *
     */
    public static final String ABM_MODIFICACION = "MOD";

    /**
     *
     */
    public static final String ABM_VER = "VISTA";

    /**
     *
     */
    public void actualizarGestion();
}

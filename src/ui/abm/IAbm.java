/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.abm;

/**
 *
 * @author Kuky
 */
public interface IAbm {

    public static final int OK = 1;
    public static final int ERROR = 0;

    int grabar();

    void inicializacionVentana();

    int recolectarDatos();
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objeto;

import java.util.ArrayList;

/**
 *
 * @author Kuky
 */
public class Perfil {

    private int tipo;
    private boolean visible;
    private ArrayList<Operaciones> operaciones;

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public ArrayList<Operaciones> getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(ArrayList<Operaciones> operaciones) {
        this.operaciones = operaciones;
    }

}

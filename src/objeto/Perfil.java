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

    private int administrador;
    private int comun;
    private ArrayList<Operaciones> operaciones;

    public int getAdministrador() {
        return administrador;
    }

    public void setAdministrador(int administrador) {
        this.administrador = administrador;
    }

    public int getComun() {
        return comun;
    }

    public void setComun(int comun) {
        this.comun = comun;
    }

    public ArrayList<Operaciones> getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(ArrayList<Operaciones> operaciones) {
        this.operaciones = operaciones;
    }

}

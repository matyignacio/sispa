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
public class Perfil extends ObjetoBase{

private ArrayList<Operaciones> operaciones = new ArrayList<>();    

    public ArrayList<Operaciones> getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(ArrayList<Operaciones> operaciones) {
        this.operaciones = operaciones;
    }

    
}

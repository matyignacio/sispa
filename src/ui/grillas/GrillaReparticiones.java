/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.grillas;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import objeto.Reparticion;

/**
 *
 * @author Kuky
 */
public class GrillaReparticiones extends AbstractTableModel {

    ArrayList<Reparticion> reparticiones;

    /**
     *
     * @return
     */
    public ArrayList<Reparticion> getReparticiones() {
        return reparticiones;
    }

    /**
     *
     * @param reparticiones
     */
    public void setReparticiones(ArrayList<Reparticion> reparticiones) {
        this.reparticiones = reparticiones;
    }

    /**
     *
     * @param reparticiones
     */
    public GrillaReparticiones(ArrayList<Reparticion> reparticiones) {
        this.reparticiones = reparticiones;
    }

    @Override
    public int getRowCount() {
        return reparticiones.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Reparticion reparticion = reparticiones.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return reparticion.getNombre();
            case 1:
                return reparticion.getDepartamento();
            case 2:
                return reparticion.getLocalidad();
            case 3:
                return reparticion.getDomicilio();
            case 4:
                return reparticion.getReparticionSuperior();
            case 5:
                if (reparticion.isVisible()) {
                    return "Visible";
                } else {
                    return "No visible";
                }
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "NOMBRE";
            case 1:
                return "DEPARTAMENTO";
            case 2:
                return "LOCALIDAD";
            case 3:
                return "DOMICILIO";
            case 4:
                return "DEPENDE DE";
            case 5:
                return "ESTADO";
            default:
                return "";
        }
    }
}

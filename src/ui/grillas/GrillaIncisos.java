/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.grillas;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import objeto.Inciso;

/**
 *
 * @author Kuky
 */
public class GrillaIncisos extends AbstractTableModel {

    ArrayList<Inciso> incisos;

    /**
     *
     * @return
     */
    public ArrayList<Inciso> getIncisos() {
        return incisos;
    }

    /**
     *
     * @param incisos
     */
    public void setIncisos(ArrayList<Inciso> incisos) {
        this.incisos = incisos;
    }

    /**
     *
     * @param incisos
     */
    public GrillaIncisos(ArrayList<Inciso> incisos) {
        this.incisos = incisos;
    }

    @Override
    public int getRowCount() {
        return incisos.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Inciso marca = incisos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return marca.getNumero();
            case 1:
                return marca.getPrincipal();
            case 2:
                return marca.getParcial();

            case 3:
                if (marca.isVisible()) {
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
                return "PRINCIPAL";
            case 2:
                return "PARCIAL";
            case 3:
                return "ESTADO";
            default:
                return "";
        }
    }
}

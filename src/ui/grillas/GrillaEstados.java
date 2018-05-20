/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.grillas;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import objeto.Estado;

/**
 *
 * @author Kuky
 */
public class GrillaEstados extends AbstractTableModel {

    ArrayList<Estado> estados;

    public ArrayList<Estado> getEstados() {
        return estados;
    }

    public void setEstados(ArrayList<Estado> estados) {
        this.estados = estados;
    }

    public GrillaEstados(ArrayList<Estado> estados) {
        this.estados = estados;
    }

    @Override
    public int getRowCount() {
        return estados.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Estado estado = estados.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return estado.getNombre();
            case 1:
                if (estado.isVisible()) {
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
                return "ESTADO";
            default:
                return "";
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.grillas;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import objeto.Marca;

/**
 *
 * @author Kuky
 */
public class GrillaMarcas extends AbstractTableModel {

    ArrayList<Marca> marcas;

    /**
     *
     * @return
     */
    public ArrayList<Marca> getMarcas() {
        return marcas;
    }

    /**
     *
     * @param marcas
     */
    public void setMarcas(ArrayList<Marca> marcas) {
        this.marcas = marcas;
    }

    /**
     *
     * @param marcas
     */
    public GrillaMarcas(ArrayList<Marca> marcas) {
        this.marcas = marcas;
    }

    @Override
    public int getRowCount() {
        return marcas.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Marca marca = marcas.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return marca.getNombre();
            case 1:
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
                return "ESTADO";
            default:
                return "";
        }
    }
}

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

    public ArrayList<Marca> getMarcas() {
        return marcas;
    }

    public void setMarcas(ArrayList<Marca> marcas) {
        this.marcas = marcas;
    }

    public GrillaMarcas(ArrayList<Marca> marcas) {
        this.marcas = marcas;
    }

    @Override
    public int getRowCount() {
        return marcas.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Marca marca = marcas.get(rowIndex);
        if (columnIndex == 0) {
            return marca.getId();
        }
        if (columnIndex == 1) {
            return marca.getNombre();
        }
        if (columnIndex == 2) {
            return marca.isVisible();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        if (column == 0) {
            return "IDENTIFICACION";
        }
        if (column == 1) {
            return "NOMBRE";
        }
        if (column == 2) {
            return "ESTADO";
        }
        return "";
    }

}

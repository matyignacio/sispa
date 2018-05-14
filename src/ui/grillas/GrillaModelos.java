/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.grillas;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import objeto.Modelo;

/**
 *
 * @author Kuky
 */
public class GrillaModelos extends AbstractTableModel {

    ArrayList<Modelo> modelos;

    public ArrayList<Modelo> getMarcas() {
        return modelos;
    }

    public void setMarcas(ArrayList<Modelo> modelos) {
        this.modelos = modelos;
    }

    public GrillaModelos(ArrayList<Modelo> modelos) {
        this.modelos = modelos;
    }

    @Override
    public int getRowCount() {
        return modelos.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Modelo modelo = modelos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return modelo.getMarca().getNombre();
            case 1:
                return modelo.getNombre();
            case 2:
                return modelo.getAño();
            case 3:
                return modelo.isVisible();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "MARCA";
            case 1:
                return "NOMBRE";
            case 2:
                return "AÑO";
            case 3:
                return "ESTADO";
            default:
                return "";
        }
    }

}

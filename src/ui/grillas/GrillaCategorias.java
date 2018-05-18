/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.grillas;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import objeto.Categoria;

/**
 *
 * @author Kuky
 */
public class GrillaCategorias extends AbstractTableModel {

    ArrayList<Categoria> categorias;

    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(ArrayList<Categoria> categorias) {
        this.categorias = categorias;
    }

    public GrillaCategorias(ArrayList<Categoria> categorias) {
        this.categorias = categorias;
    }

    @Override
    public int getRowCount() {
        return categorias.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Categoria categoria = categorias.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return categoria.getNombre();
            case 1:
                return categoria.getCodigoPresupuestaro();
            case 2:
                return categoria.getInciso();
            case 3:
                if (categoria.isVisible()) {
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
                return "CODIGO PRESUPUESTARIO";
            case 2:
                return "INCISO";
            case 3:
                return "ESTADO";
            default:
                return "";
        }
    }
}

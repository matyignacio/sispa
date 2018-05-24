/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.grillas;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import objeto.TipoAdquisicion;

/**
 *
 * @author Kuky
 */
public class GrillaTipoAdquisiciones extends AbstractTableModel {

    ArrayList<TipoAdquisicion> tipoAdquisiciones;

    public ArrayList<TipoAdquisicion> getTipoAdquisiciones() {
        return tipoAdquisiciones;
    }

    public void setTipoAdquisiciones(ArrayList<TipoAdquisicion> tipoAdquisiciones) {
        this.tipoAdquisiciones = tipoAdquisiciones;
    }

    public GrillaTipoAdquisiciones(ArrayList<TipoAdquisicion> tipoAdquisiciones) {
        this.tipoAdquisiciones = tipoAdquisiciones;
    }

    @Override
    public int getRowCount() {
        return tipoAdquisiciones.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        TipoAdquisicion tipoadquisicion = tipoAdquisiciones.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return tipoadquisicion.getNombre();
            case 1:
                if (tipoadquisicion.isVisible()) {
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

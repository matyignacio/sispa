/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.grillas;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import objeto.Mueble;

/**
 *
 * @author Kuky
 */
public class GrillaMuebles extends AbstractTableModel {

    ArrayList<Mueble> muebles;

    public ArrayList<Mueble> getMuebles() {
        return muebles;
    }

    public void setMuebles(ArrayList<Mueble> muebles) {
        this.muebles = muebles;
    }

    public GrillaMuebles(ArrayList<Mueble> muebles) {
        this.muebles = muebles;
    }

    @Override
    public int getRowCount() {
        return muebles.size();
    }

    @Override
    public int getColumnCount() {
        return 9;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Mueble mueble = muebles.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return mueble.getNombre();
            case 1:
                if (mueble.isVisible()) {
                    return "Visible";
                } else {
                    return "No visible";
                }
            case 2:
                return mueble.getExpediente();
            case 3:
                return mueble.getCaracteristicas();
            case 4:
                return mueble.getObservaciones();
            case 5:
                return mueble.getReparticion();
            case 6:
                return mueble.getEstado();
            case 7:
                return mueble.getCategoria();
            case 8:
                return mueble.getModelo();

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
            case 2:
                return "EXPEDIENTE";
            case 3:
                return "CARACTERISTICAS";
            case 4:
                return "OBSERVACIONES";
            case 5:
                return "REPARTICION";
            case 6:
                return "ESTADO";
            case 7:
                return "CATEGORIA";
            case 8:
                return "MODELO";

            default:
                return "";
        }
    }
}

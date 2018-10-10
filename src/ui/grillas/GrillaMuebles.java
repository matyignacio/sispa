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

    /**
     *
     * @return
     */
    public ArrayList<Mueble> getMuebles() {
        return muebles;
    }

    /**
     *
     * @param muebles
     */
    public void setMuebles(ArrayList<Mueble> muebles) {
        this.muebles = muebles;
    }

    /**
     *
     * @param muebles
     */
    public GrillaMuebles(ArrayList<Mueble> muebles) {
        this.muebles = muebles;
    }

    @Override
    public int getRowCount() {
        return muebles.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Mueble mueble = muebles.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return mueble.getNombre();
            case 1:
                return mueble.getExpediente();
            case 2:
                return mueble.getCategoria();
            case 3:
                return mueble.getModelo().getMarca();
            case 4:
                return mueble.getModelo();
            case 5:
                return mueble.getCaracteristicas();

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
                return "EXPEDIENTE";
            case 2:
                return "CATEGORIA";
            case 3:
                return "MARCA";
            case 4:
                return "MODELO";
            case 5:
                return "CARACTERISTICAS";

            default:
                return "";
        }
    }
}

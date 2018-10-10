/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.grillas;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import objeto.Inmueble;

/**
 *
 * @author Kuky
 */
public class GrillaInmuebles extends AbstractTableModel {

    ArrayList<Inmueble> inmuebles;

    /**
     *
     * @return
     */
    public ArrayList<Inmueble> getMuebles() {
        return inmuebles;
    }

    /**
     *
     * @param inmuebles
     */
    public void setInmuebles(ArrayList<Inmueble> inmuebles) {
        this.inmuebles = inmuebles;
    }

    /**
     *
     * @param inmuebles
     */
    public GrillaInmuebles(ArrayList<Inmueble> inmuebles) {
        this.inmuebles = inmuebles;
    }

    @Override
    public int getRowCount() {
        return inmuebles.size();
    }

    @Override
    public int getColumnCount() {
        return 9;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Inmueble inmueble = inmuebles.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return inmueble.getNombre();
            case 1:
                if (inmueble.isVisible()) {
                    return "Visible";
                } else {
                    return "No visible";
                }
            case 2:
                return inmueble.getExpediente();
            case 3:
                return inmueble.getCaracteristicas();
            case 4:
                return inmueble.getObservaciones();
            case 5:
                return inmueble.getDomicilio();
            case 6:
                return inmueble.getTipo();
            case 7:
                return inmueble.getReparticion();

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
                return "DOMICILIO";
            case 6:
                return "TIPO";
            case 7:
                return "REPARTICION";

            default:
                return "";
        }
    }
}

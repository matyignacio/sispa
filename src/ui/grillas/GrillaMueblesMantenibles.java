/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.grillas;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import objeto.MuebleMantenible;

/**
 *
 * @author Kuky
 */
public class GrillaMueblesMantenibles extends AbstractTableModel {

    ArrayList<MuebleMantenible> mueblesMantenibles;

    public ArrayList<MuebleMantenible> getMuebleMantenibles() {
        return mueblesMantenibles;
    }

    public void setMueblesMantenibles(ArrayList<MuebleMantenible> mueblesMantenibles) {
        this.mueblesMantenibles = mueblesMantenibles;
    }

    public GrillaMueblesMantenibles(ArrayList<MuebleMantenible> mueblesMantenibles) {
        this.mueblesMantenibles = mueblesMantenibles;
    }

    @Override
    public int getRowCount() {
        return mueblesMantenibles.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        MuebleMantenible muebleMantenible = mueblesMantenibles.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return muebleMantenible.getNombre();
            case 1:
                return muebleMantenible.getExpediente();
            case 2:
                return muebleMantenible.getDominio();
            case 3:
                return muebleMantenible.getChasis();
            case 4:
                return muebleMantenible.getModelo().getMarca();
            case 5:
                return muebleMantenible.getModelo().getId();

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
                return "DOMINIO";
            case 3:
                return "CHASIS";
            case 4:
                return "MARCA";
            case 5:
                return "MODELO";

            default:
                return "";
        }
    }
}

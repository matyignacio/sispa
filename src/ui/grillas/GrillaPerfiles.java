/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.grillas;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import objeto.Perfil;

/**
 *
 * @author Kuky
 */
public class GrillaPerfiles extends AbstractTableModel {

    ArrayList<Perfil> perfiles;

    public ArrayList<Perfil> getPerfiles() {
        return perfiles;
    }

    public void setPerfiles(ArrayList<Perfil> perfiles) {
        this.perfiles = perfiles;
    }

    public GrillaPerfiles(ArrayList<Perfil> perfiles) {
        this.perfiles = perfiles;
    }

    @Override
    public int getRowCount() {
        return perfiles.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Perfil perfil = perfiles.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return perfil.getNombre();
            case 1:
                if (perfil.isVisible()) {
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

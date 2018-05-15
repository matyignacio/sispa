/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.grillas;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import objeto.CodigoPresupuestario;

/**
 *
 * @author Kuky
 */
public class GrillaCodigosPresupuestarios extends AbstractTableModel {

    ArrayList<CodigoPresupuestario> codigosPresupuestarios;

    public ArrayList<CodigoPresupuestario> getCodigoPresupuestarios() {
        return codigosPresupuestarios;
    }

    public void setCodigoPresupuestarios(ArrayList<CodigoPresupuestario> codigoPresupuestarios) {
        this.codigosPresupuestarios = codigoPresupuestarios;
    }

    public GrillaCodigosPresupuestarios(ArrayList<CodigoPresupuestario> codigoPresupuestarios) {
        this.codigosPresupuestarios = codigoPresupuestarios;
    }

    @Override
    public int getRowCount() {
        return codigosPresupuestarios.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        CodigoPresupuestario codigoPresupuestario = codigosPresupuestarios.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return codigoPresupuestario.getNumero();
            case 1:
                return codigoPresupuestario.isVisible();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "NUMERO";
            case 1:
                return "ESTADO";
            default:
                return null;
        }
    }
}

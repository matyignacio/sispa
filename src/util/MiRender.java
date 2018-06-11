/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import controlador.MuebleMantenibleControlador;
import java.awt.Color;
import java.awt.Component;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import objeto.MuebleMantenible;

/**
 *
 * @author Kuky
 */
public class MiRender extends DefaultTableCellRenderer {

    MuebleMantenible muebleMantenible = new MuebleMantenible();
    MuebleMantenibleControlador mantenibleControlador = new MuebleMantenibleControlador();

    java.sql.Timestamp currentTimestamp = new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());

    public Component getTableCellRendererComponent(JTable table,
            Object object,
            boolean isSelected,
            boolean hasFocus,
            int row,
            int column) {
        super.getTableCellRendererComponent(table, object, isSelected, hasFocus, row, column);
        try {
            muebleMantenible = mantenibleControlador.extraerDeTabla(
                    String.valueOf(table.getValueAt(row, 0)),
                    String.valueOf(table.getValueAt(row, 1)),
                    String.valueOf(table.getValueAt(row, 2)),
                    String.valueOf(table.getValueAt(row, 3)),
                    Integer.parseInt(String.valueOf(table.getValueAt(row, 4))));
            JOptionPane.showMessageDialog(table, (muebleMantenible.getNombre()));
//            if (currentTimestamp-muebleMantenible.getFecha()) {
//
//            }
//        if (String.valueOf(table.getValueAt(row, column)).equals("FORD")) {
//            this.setOpaque(true);
//            this.setForeground(Color.RED);
//        } else {
//
//        }
            //JOptionPane.showMessageDialog(table, String.valueOf(table.getValueAt(row, 5)));
        } catch (SQLException ex) {
            Logger.getLogger(MiRender.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import objeto.MuebleMantenible;

/**
 *
 * @author Kuky
 */
public class MiRender extends DefaultTableCellRenderer {

//    java.sql.Timestamp currentTimestamp = new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());
//    int i = 0;
    public Component getTableCellRendererComponent(JTable table,
            Object object,
            boolean isSelected,
            boolean hasFocus,
            int row,
            int column) {
        super.getTableCellRendererComponent(table, object, isSelected, hasFocus, row, column);
//        if (String.valueOf(table.getValueAt(row, column)).equals("FORD")) {
//            this.setOpaque(true);
//            this.setForeground(Color.RED);
//        } else {
//
//        }
        return this;
    }
}
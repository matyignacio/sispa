/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.awt.Color;
import java.awt.Component;
import java.util.Calendar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import objeto.MuebleMantenible;

/**
 *
 * @author Kuky
 */
public class MiRender extends DefaultTableCellRenderer {

    java.sql.Timestamp currentTimestamp = new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());

    public Component getTableCellRendererComponent(JTable table,
            MuebleMantenible muebleMantenible,
            boolean isSelected,
            boolean hasFocus,
            int row,
            int column) {
        super.getTableCellRendererComponent(table, muebleMantenible, isSelected, hasFocus, row, column);
        if (currentTimestamp.compareTo(muebleMantenible.getFecha()) > 0) {
            this.setOpaque(true);
            this.setBackground(Color.RED);
            this.setForeground(Color.YELLOW);
        } else {
            this.setOpaque(true);
            this.setBackground(Color.RED);
            this.setForeground(Color.YELLOW);
        }

        return this;
    }
}

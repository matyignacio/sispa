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
    private int columna;
    
  

    MuebleMantenible muebleMantenible;
    MuebleMantenibleControlador mantenibleControlador = new MuebleMantenibleControlador();
    int i = 0;
    java.sql.Timestamp currentTimestamp = new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());

    public Component getTableCellRendererComponent(JTable table,
            Object object,
            boolean isSelected,
            boolean hasFocus,
            int row,
            int column) {
        
        
             
             
            
            
        super.getTableCellRendererComponent(table, object, isSelected, hasFocus, row, column);
        
         String valor = table.getValueAt(row, 5).toString();
             if (Integer.parseInt(valor) == 8) {
 
                        //la pinto de amarillo
                        setBackground(Color.RED);
                        setForeground(Color.YELLOW);
                    }
             
        
//         if()
//         this.setOpaque(true);
//         this.setBackground(Color.RED);
//         this.setForeground(Color.YELLOW);
      
      
//        for (i = 0; i < 3; i++) {
//            muebleMantenible = new MuebleMantenible();
//            try {
//                muebleMantenible = mantenibleControlador.extraerDeTabla(
//                        String.valueOf(table.getValueAt(i, 0)),
//                        String.valueOf(table.getValueAt(i, 1)),
//                        String.valueOf(table.getValueAt(i, 2)),
//                        String.valueOf(table.getValueAt(i, 3)),
//                        Integer.parseInt(String.valueOf(table.getValueAt(i, 5))));
//                
//            
//                
//                if (currentTimestamp.compareTo(muebleMantenible.getFecha()) < 0) {
//                    this.setOpaque(true);
//
//                }
//            } catch (SQLException ex) {
//                Logger.getLogger(MiRender.class.getName()).log(Level.SEVERE, null, ex);
//            }
        
//        if(table.getValueAt(row,columna).equals("S"))
//    {
//        this.setForeground(Color.RED);
//    }else if(table.getValueAt(row,columna).equals("A")){
//        this.setForeground(Color.BLUE);
//    }else if(table.getValueAt(row, columna).equals("C")){
//        this.setForeground(Color.GREEN);
//    }

        return this;
    }
}

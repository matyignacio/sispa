/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import controlador.MuebleMantenibleControlador;
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

    private ArrayList<MuebleMantenible> muebles;
    java.sql.Timestamp currentTimestamp = new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());
    long fechaMueble = 0, fechaActual = currentTimestamp.getTime();
    long anio = (long) (1200000000 * 26.27988782333333);//forma de calcular un año en tics
    //NO PUEDO PONER DIRECTAMENTE 31535865388 PORQUE ME DICE "INTEGER TOO LONG" (?)
    long trimestre = (long) (1200000000 * 19.7099158675); //forma de calcular un trimestre en tics

    public MiRender(ArrayList<MuebleMantenible> muebles) {
        this.muebles = muebles;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table,
            Object object,
            boolean isSelected,
            boolean hasFocus,
            int row,
            int column) {

        setBackground(new Color(204, 204, 204));//color por defecto de las tablas
        setForeground(new Color(33, 150, 243));//color que usamos en todas las vistas
        super.getTableCellRendererComponent(table, object, isSelected, hasFocus, row, column);
        fechaMueble = muebles.get(row).getFecha().getTime();
        if ((fechaActual - fechaMueble) > trimestre) {
            setForeground(new Color(204, 51, 0));
        }
        if ((fechaActual - fechaMueble) > anio) {
            setBackground(Color.RED);
            setForeground(Color.YELLOW);
        }
        return this;
    }
}

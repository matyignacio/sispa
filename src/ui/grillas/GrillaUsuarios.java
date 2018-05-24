/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.grillas;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import objeto.Usuario;

/**
 *
 * @author Kuky
 */
public class GrillaUsuarios extends AbstractTableModel {

    ArrayList<Usuario> usuarios;

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public GrillaUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public int getRowCount() {
        return usuarios.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Usuario usuario = usuarios.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return usuario.getNombre();
            case 1:
                if (usuario.isVisible()) {
                    return "Visible";
                } else {
                    return "No visible";
                }
            case 2:
                return usuario.getMail();
            case 3:
                return usuario.getPerfil();
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
                return "E-MAIL";
            case 3:
                return "Perfil";
            default:
                return "";
        }
    }
}

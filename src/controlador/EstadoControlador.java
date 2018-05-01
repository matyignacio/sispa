/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import objeto.Estado;

/**
 *
 * @author Kuky
 */
public class EstadoControlador {

    private Estado estado;
    private ArrayList<Estado> estados = new ArrayList<>();
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;

    public Estado extraer(Integer id) throws SQLException {
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM public.Estados WHERE id=?";
        ps = conn.prepareStatement(consultaSql);
        ps.setInt(1, id);
        ps.executeQuery();
        rs = ps.getResultSet();
        while (rs.next()) {
            estado = new Estado();
            estado.setId(rs.getInt(1));
            estado.setNombre(rs.getString(2));
            estado.setVisible(rs.getBoolean(3));
          
          
            
        }
        rs.close();
        ps.close();
        conn.close();
        return estado;
    }
    
    public ArrayList<Estado> extraerTodos() throws SQLException {
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM public.Estados";
        ps = conn.prepareStatement(consultaSql);
        ps.execute();
        rs = ps.getResultSet();
        while (rs.next()) {
            estado = new Estado();
            estados = new ArrayList<>();
            estado.setId(rs.getInt(1));
            estado.setNombre(rs.getString(2));
            estado.setVisible(rs.getBoolean(3));
            
          
            estados.add(estado);
        }
        rs.close();
        ps.close();
        conn.close();
        return estados;
    }

    public void insertar(Estado estado) throws SQLException {
        conn = ConexionDB.GetConnection();
        String consultaSql = "INSERT INTO public.Estados (nombre, visible)  VALUES (?,?)";
        ps = conn.prepareStatement(consultaSql);
        ps.setString(1, estado.getNombre());
        ps.setBoolean(2, estado.isVisible());
   
        ps.execute();
        JOptionPane.showMessageDialog(null, "Insertado correctamente");
        ps.close();
        conn.close();
    }
    
     public void modificar(Estado estado) throws SQLException {
        conn = ConexionDB.GetConnection();
        String consultaSql = "UPDATE public.Estados SET nombre=?, visible=? WHERE id=?";
        ps = conn.prepareStatement(consultaSql);
        ps.setString(1, estado.getNombre());
        ps.setBoolean(2, estado.isVisible());
        ps.setInt(3, estado.getId());

        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, estado.toString() + " modificado correctamente");
        ps.close();
        conn.close();
    }
     
      public void borrar(Estado estado) throws SQLException {
        conn = ConexionDB.GetConnection();
        String consultaSql = "DELETE FROM public.Estados WHERE id=?";
        ps = conn.prepareStatement(consultaSql);
        ps.setInt(1, estado.getId());
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, estado.toString() + " eliminado correctamente");
        ps.close();
        conn.close();
    }
}

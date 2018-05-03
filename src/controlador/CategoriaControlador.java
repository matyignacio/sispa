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
import objeto.Categoria;
import objeto.Categoria;

public class CategoriaControlador {
    
     private Categoria categoria;
    private ArrayList<Categoria> categorias;
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public Categoria extraer(Integer id) throws SQLException {
        IncisoControlador i = new IncisoControlador();
        CodigoPresupuestarioControlador c = new CodigoPresupuestarioControlador();
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM \"Categorias\" WHERE id=?";
        ps = conn.prepareStatement(consultaSql);
        ps.setInt(1, id);
        ps.executeQuery();
        rs = ps.getResultSet();
        while (rs.next()) {
            categoria = new Categoria();
            categoria.setId(rs.getInt(1));
            categoria.setNombre(rs.getString(2));
            categoria.setVisible(rs.getBoolean(3));
            categoria.setInciso(i.extraer(rs.getInt(4)));
            categoria.setCodigoPresupuestaro(c.extraer(rs.getInt(5)));
        }
        rs.close();
        ps.close();
        conn.close();
        return categoria;
    }
public ArrayList<Categoria> extraerTodos() throws SQLException {
         IncisoControlador i = new IncisoControlador();
        CodigoPresupuestarioControlador c = new CodigoPresupuestarioControlador();
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM \"Categorias\"";
        ps = conn.prepareStatement(consultaSql);
        ps.execute();
        rs = ps.getResultSet();
        while (rs.next()) {
            categoria = new Categoria();
            categorias = new ArrayList<>();
            categoria = new Categoria();
            categoria.setId(rs.getInt(1));
            categoria.setNombre(rs.getString(2));
            categoria.setVisible(rs.getBoolean(3));
            categoria.setInciso(i.extraer(rs.getInt(4)));
            categoria.setCodigoPresupuestaro(c.extraer(rs.getInt(5)));
            categorias.add(categoria);
        }
        rs.close();
        ps.close();
        conn.close();
        return categorias;
    }

 public void insertar(Categoria modelo) throws SQLException {
        conn = ConexionDB.GetConnection();
        String consultaSql = "INSERT INTO \"Categorias\"(nombre, visible, id_inciso, id_codigo_presupuestario) VALUES (?, ?, ?, ?)";
        ps = conn.prepareStatement(consultaSql);
        ps.setString(1, categoria.getNombre());
        ps.setBoolean(2, categoria.isVisible());
        ps.setInt(3, categoria.getInciso().getId());
        ps.setInt (4, categoria.getCodigoPresupuestaro().getId());
        ps.execute();
        JOptionPane.showMessageDialog(null, "Insertado correctamente");
        ps.close();
        conn.close();
    }
 
 public void modificar(Categoria categoria) throws SQLException {
        conn = ConexionDB.GetConnection();
        String consultaSql = "UPDATE \"Categorias\" SET nombre=?, visible=?, id_inciso=?, id_codigo_presupuestario=? WHERE id=?";
        ps = conn.prepareStatement(consultaSql);
        ps.setString(1, categoria.getNombre());
        ps.setBoolean(2, categoria.isVisible());
        ps.setInt(3, categoria.getInciso().getId());
        ps.setInt (4, categoria.getCodigoPresupuestaro().getId());
        ps.setInt(5, categoria.getId());
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, categoria.toString() + " modificado correctamente");
        ps.close();
        conn.close();
    }
 
 public void borrar(Categoria categoria) throws SQLException {
        conn = ConexionDB.GetConnection();
        String consultaSql = "DELETE FROM \"Categorias\" WHERE id=?";
        ps = conn.prepareStatement(consultaSql);
        ps.setInt(1, categoria.getId());
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, categoria.toString() + " eliminado correctamente");
        ps.close();
        conn.close();
    }
 
}
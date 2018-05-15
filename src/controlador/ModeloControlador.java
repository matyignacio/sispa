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
import objeto.Modelo;

public class ModeloControlador {

    private Modelo modelo;
    private ArrayList<Modelo> modelos;
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;

    public Modelo extraer(Integer id) throws SQLException {

        MarcaControlador m = new MarcaControlador();
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM \"Modelos\" WHERE id=?";
        ps = conn.prepareStatement(consultaSql);
        ps.setInt(1, id);
        ps.executeQuery();
        rs = ps.getResultSet();
        while (rs.next()) {
            modelo = new Modelo();
            modelo.setId(rs.getInt(1));
            modelo.setNombre(rs.getString(2));
            modelo.setVisible(rs.getBoolean(3));
            modelo.setAño(rs.getInt(4));
            modelo.setMarca(m.extraer(rs.getInt(5)));
        }
        rs.close();
        ps.close();
        conn.close();
        return modelo;
    }

    public ArrayList<Modelo> extraerTodos() throws SQLException {
        MarcaControlador m = new MarcaControlador();
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM \"Modelos\" order by id";
        ps = conn.prepareStatement(consultaSql);
        ps.execute();
        rs = ps.getResultSet();
        modelos = new ArrayList<>();
        while (rs.next()) {
            modelo = new Modelo();
            modelo.setId(rs.getInt(1));
            modelo.setNombre(rs.getString(2));
            modelo.setVisible(rs.getBoolean(3));
            modelo.setAño(rs.getInt(4));
            modelo.setMarca(m.extraer(rs.getInt(5)));
            modelos.add(modelo);
        }
        rs.close();
        ps.close();
        conn.close();
        return modelos;
    }

    public ArrayList<Modelo> extraerTodosVisibles() throws SQLException {
        MarcaControlador m = new MarcaControlador();
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM \"Modelos\" where visible = TRUE order by id";
        ps = conn.prepareStatement(consultaSql);
        ps.execute();
        rs = ps.getResultSet();
        modelos = new ArrayList<>();
        while (rs.next()) {
            modelo = new Modelo();
            modelo.setId(rs.getInt(1));
            modelo.setNombre(rs.getString(2));
            modelo.setVisible(rs.getBoolean(3));
            modelo.setAño(rs.getInt(4));
            modelo.setMarca(m.extraer(rs.getInt(5)));
            modelos.add(modelo);
        }
        rs.close();
        ps.close();
        conn.close();
        return modelos;
    }

    public void insertar(Modelo modelo) throws SQLException {
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea guardar?", "ATENCION!", JOptionPane.YES_NO_OPTION) == 0) {
            conn = ConexionDB.GetConnection();
            String consultaSql = "INSERT INTO \"Modelos\" (nombre, visible, \"año\", id_marca) VALUES (?, ?, ?, ?)";
            ps = conn.prepareStatement(consultaSql);
            ps.setString(1, modelo.getNombre());
            ps.setBoolean(2, modelo.isVisible());
            ps.setInt(3, modelo.getAño());
            ps.setInt(4, modelo.getMarca().getId());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Insertado correctamente");
            ps.close();
            conn.close();
        }
    }

    public void modificar(Modelo modelo) throws SQLException {
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea modificar?", "ATENCION!", JOptionPane.YES_NO_OPTION) == 0) {
            conn = ConexionDB.GetConnection();
            String consultaSql = "UPDATE \"Modelos\" SET  nombre=?, visible=?, \"año\"=?, id_marca=? WHERE id=?";
            ps = conn.prepareStatement(consultaSql);
            ps.setString(1, modelo.getNombre());
            ps.setBoolean(2, modelo.isVisible());
            ps.setInt(3, modelo.getAño());
            ps.setInt(4, modelo.getMarca().getId());
            ps.setInt(5, modelo.getId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, modelo.toString() + " modificado correctamente");
            ps.close();
            conn.close();
        }
    }

    public void borrar(Modelo modelo) throws SQLException {
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea eliminar?", "ATENCION!", JOptionPane.YES_NO_OPTION) == 0) {
            conn = ConexionDB.GetConnection();
            String consultaSql = "DELETE FROM \"Modelos\" WHERE id=?";
            ps = conn.prepareStatement(consultaSql);
            ps.setInt(1, modelo.getId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, modelo.toString() + " eliminado correctamente");
            ps.close();
            conn.close();
        }
    }
}

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
import objeto.Operaciones;

public class OperacionesControlador {

    private Operaciones operacion;
    private ArrayList<Operaciones> operaciones;
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;

    public Operaciones extraer(Integer id) throws SQLException {
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM operaciones WHERE id=?";
        ps = conn.prepareStatement(consultaSql);
        ps.setInt(1, id);
        ps.executeQuery();
        rs = ps.getResultSet();
        while (rs.next()) {
            operacion = new Operaciones();
            operacion.setId(rs.getInt(1));
            operacion.setNombre(rs.getString(2));
            operacion.setVisible(rs.getBoolean(3));
//            operacion.setUsuario(usuarioControlador.extraer(rs.getInt(4))); HAY QUE ARREGLAR ESTA LINEA
        }
        rs.close();
        ps.close();
        conn.close();
        return operacion;
    }

    public ArrayList<Operaciones> extraerTodos() throws SQLException {
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM operaciones order by nombre";
        ps = conn.prepareStatement(consultaSql);
        ps.execute();
        rs = ps.getResultSet();
        operaciones = new ArrayList<>();
        while (rs.next()) {
            operacion = new Operaciones();
            operacion.setId(rs.getInt(1));
            operacion.setNombre(rs.getString(2));
            operacion.setVisible(rs.getBoolean(3));
            operaciones.add(operacion);
        }
        rs.close();
        ps.close();
        conn.close();
        return operaciones;
    }

    public ArrayList<Operaciones> extraerTodosVisibles() throws SQLException {
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM operaciones where visible = TRUE order by nombre";
        ps = conn.prepareStatement(consultaSql);
        ps.execute();
        rs = ps.getResultSet();
        operaciones = new ArrayList<>();
        while (rs.next()) {
            operacion = new Operaciones();
            operacion.setId(rs.getInt(1));
            operacion.setNombre(rs.getString(2));
            operacion.setVisible(rs.getBoolean(3));
            operaciones.add(operacion);
        }
        rs.close();
        ps.close();
        conn.close();
        return operaciones;
    }

    public void insertar(Operaciones operacion) throws SQLException {
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea guardar?", "ATENCION!", JOptionPane.YES_NO_OPTION) == 0) {
            conn = ConexionDB.GetConnection();
            String consultaSql = "INSERT INTO operaciones (nombre, visible)  VALUES (?,?)";
            ps = conn.prepareStatement(consultaSql);
            ps.setString(1, operacion.getNombre());
            ps.setBoolean(2, operacion.isVisible());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Insertado correctamente");
            ps.close();
            conn.close();
        }
    }

    public void modificar(Operaciones operacion) throws SQLException {
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea modificar?", "ATENCION!", JOptionPane.YES_NO_OPTION) == 0) {
            conn = ConexionDB.GetConnection();
            String consultaSql = "UPDATE operaciones SET nombre=?, visible=? WHERE id=?";
            ps = conn.prepareStatement(consultaSql);
            ps.setString(1, operacion.getNombre());
            ps.setBoolean(2, operacion.isVisible());
            ps.setInt(3, operacion.getId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, operacion.toString() + " modificado correctamente");
            ps.close();
            conn.close();
        }
    }

    public void borrar(Operaciones operacion) throws SQLException {
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea eliminar?", "ATENCION!", JOptionPane.YES_NO_OPTION) == 0) {
            conn = ConexionDB.GetConnection();
            String consultaSql = "DELETE FROM operaciones WHERE id=?";
            ps = conn.prepareStatement(consultaSql);
            ps.setInt(1, operacion.getId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, operacion.toString() + " eliminado correctamente");
            ps.close();
            conn.close();
        }
    }
}

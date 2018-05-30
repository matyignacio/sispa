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
import objeto.Reparticion;

public class ReparticionControlador {

    private Reparticion reparticion;
    private ArrayList<Reparticion> reparticiones;
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;

    public Reparticion extraer(Integer id) throws SQLException {
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM reparticiones WHERE id=?";
        ps = conn.prepareStatement(consultaSql);
        ps.setInt(1, id);
        ps.executeQuery();
        rs = ps.getResultSet();
        while (rs.next()) {
            reparticion = new Reparticion();
            reparticion.setId(rs.getInt(1));
            reparticion.setNombre(rs.getString(2));
            reparticion.setLocalidad(rs.getString(3));
            reparticion.setDepartamento(rs.getString(4));
            reparticion.setDomicilio(rs.getString(5));
            if (rs.getInt(6) != 0) {
                Reparticion repSuperior = new Reparticion();
                ReparticionControlador reparticionControlador = new ReparticionControlador();
                repSuperior = reparticionControlador.extraer(rs.getInt(6));
                reparticion.setReparticionSuperior(repSuperior);
            }
            reparticion.setVisible(rs.getBoolean(7));
        }
        rs.close();
        ps.close();
        conn.close();
        return reparticion;
    }

    public ArrayList<Reparticion> extraerTodos() throws SQLException {
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM reparticiones order by id";
        ps = conn.prepareStatement(consultaSql);
        ps.execute();
        rs = ps.getResultSet();
        reparticiones = new ArrayList<>();
        while (rs.next()) {
            reparticion = new Reparticion();
            reparticion.setId(rs.getInt(1));
            reparticion.setNombre(rs.getString(2));
            reparticion.setLocalidad(rs.getString(3));
            reparticion.setDepartamento(rs.getString(4));
            reparticion.setDomicilio(rs.getString(5));
            if (rs.getInt(6) != 0) {
                Reparticion repSuperior = new Reparticion();
                ReparticionControlador reparticionControlador = new ReparticionControlador();
                repSuperior = reparticionControlador.extraer(rs.getInt(6));
                reparticion.setReparticionSuperior(repSuperior);
            } else {
                Reparticion repSuperior = new Reparticion(0);
                reparticion.setReparticionSuperior(repSuperior);
            }
            reparticion.setVisible(rs.getBoolean(7));
            reparticiones.add(reparticion);
        }
        rs.close();
        ps.close();
        conn.close();
        return reparticiones;
    }

    public ArrayList<Reparticion> extraerTodosSinNinguna() throws SQLException {
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM reparticiones WHERE id>0 order by nombre";
        ps = conn.prepareStatement(consultaSql);
        ps.execute();
        rs = ps.getResultSet();
        reparticiones = new ArrayList<>();
        while (rs.next()) {
            reparticion = new Reparticion();
            reparticion.setId(rs.getInt(1));
            reparticion.setNombre(rs.getString(2));
            reparticion.setLocalidad(rs.getString(3));
            reparticion.setDepartamento(rs.getString(4));
            reparticion.setDomicilio(rs.getString(5));
            if (rs.getInt(6) != 0) {
                Reparticion repSuperior = new Reparticion();
                ReparticionControlador reparticionControlador = new ReparticionControlador();
                repSuperior = reparticionControlador.extraer(rs.getInt(6));
                reparticion.setReparticionSuperior(repSuperior);
            } else {
                Reparticion repSuperior = new Reparticion(0);
                reparticion.setReparticionSuperior(repSuperior);
            }
            reparticion.setVisible(rs.getBoolean(7));
            reparticiones.add(reparticion);
        }
        rs.close();
        ps.close();
        conn.close();
        return reparticiones;
    }

    public ArrayList<Reparticion> extraerTodosVisibles() throws SQLException {
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM reparticiones WHERE visible = true AND id>0  order by nombre";
        ps = conn.prepareStatement(consultaSql);
        ps.execute();
        rs = ps.getResultSet();
        reparticiones = new ArrayList<>();
        while (rs.next()) {
            reparticion = new Reparticion();
            reparticion.setId(rs.getInt(1));
            reparticion.setNombre(rs.getString(2));
            reparticion.setLocalidad(rs.getString(3));
            reparticion.setDepartamento(rs.getString(4));
            reparticion.setDomicilio(rs.getString(5));
            if (rs.getInt(6) != 0) {
                Reparticion repSuperior = new Reparticion();
                ReparticionControlador reparticionControlador = new ReparticionControlador();
                repSuperior = reparticionControlador.extraer(rs.getInt(6));
                reparticion.setReparticionSuperior(repSuperior);
            } else {
                Reparticion repSuperior = new Reparticion(0);
                reparticion.setReparticionSuperior(repSuperior);
            }
            reparticion.setVisible(rs.getBoolean(7));
            reparticiones.add(reparticion);
        }
        rs.close();
        ps.close();
        conn.close();
        return reparticiones;
    }

    public void insertar(Reparticion reparticion) throws SQLException {
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea guardar?", "ATENCION!", JOptionPane.YES_NO_OPTION) == 0) {
            conn = ConexionDB.GetConnection();
            String consultaSql = "INSERT INTO reparticiones ( nombre, localidad, departamento, domicilio, id_reparticion_superior, visible) VALUES (?, ?, ?, ?, ?, ?)";
            ps = conn.prepareStatement(consultaSql);
            ps.setString(1, reparticion.getNombre());
            ps.setString(2, reparticion.getLocalidad());
            ps.setString(3, reparticion.getDepartamento());
            ps.setString(4, reparticion.getDomicilio());
            if (reparticion.getReparticionSuperior().getId() > 0) {
                ps.setInt(5, reparticion.getReparticionSuperior().getId());
            } else {
                ps.setInt(5, 0);
            }
            ps.setBoolean(6, reparticion.isVisible());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Insertado correctamente");
            ps.close();
            conn.close();
        }
    }

    public void modificar(Reparticion reparticion) throws SQLException {
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea modificar?", "ATENCION!", JOptionPane.YES_NO_OPTION) == 0) {
            conn = ConexionDB.GetConnection();
            String consultaSql = "UPDATE reparticiones SET nombre=?, localidad=?, departamento=?, domicilio=?, id_reparticion_superior=?, visible=? WHERE id=?";
            ps = conn.prepareStatement(consultaSql);
            ps.setString(1, reparticion.getNombre());
            ps.setString(2, reparticion.getLocalidad());
            ps.setString(3, reparticion.getDepartamento());
            ps.setString(4, reparticion.getDomicilio());
            if (reparticion.getReparticionSuperior().getId() > 0) {
                ps.setInt(5, reparticion.getReparticionSuperior().getId());
            } else {
                ps.setInt(5, 0);
            }
            ps.setBoolean(6, reparticion.isVisible());
            ps.setInt(7, reparticion.getId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, reparticion.toString() + " modificado correctamente");
            ps.close();
            conn.close();
        }
    }

    public void borrar(Reparticion reparticion) throws SQLException {
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea eliminar?", "ATENCION!", JOptionPane.YES_NO_OPTION) == 0) {
            try {
                conn = ConexionDB.GetConnection();
                String consultaSql = "DELETE FROM reparticiones WHERE id=?";
                ps = conn.prepareStatement(consultaSql);
                ps.setInt(1, reparticion.getId());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, reparticion.toString() + " eliminado correctamente");
                ps.close();
                conn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex, "No se pudo eliminar " + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}

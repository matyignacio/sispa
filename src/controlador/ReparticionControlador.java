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

        MarcaControlador m = new MarcaControlador();
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM \"Reparticiones\" WHERE id=?";
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
            //  reparticion.setReparticionSuperior(reparticion);
        }
        rs.close();
        ps.close();
        conn.close();
        return reparticion;
    }

    public ArrayList<Reparticion> extraerTodos() throws SQLException {
        MarcaControlador m = new MarcaControlador();
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM \"Reparticiones\" order by nombre";
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
            //  reparticion.setReparticionSuperior(reparticion);

            reparticiones.add(reparticion);
        }
        rs.close();
        ps.close();
        conn.close();
        return reparticiones;
    }

    public ArrayList<Reparticion> extraerTodosVisibles() throws SQLException {
        MarcaControlador m = new MarcaControlador();
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM \"Reparticiones\" where visible = TRUE order by nombre";
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
            //  reparticion.setReparticionSuperior(reparticion);

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
            String consultaSql = "INSERT INTO \"Reparticiones\"( nombre, localidad, departamento, domicilio, id_reparticion_superior) VALUES (?, ?, ?, ?, ?)";
            ps = conn.prepareStatement(consultaSql);
            ps.setString(1, reparticion.getNombre());
            ps.setString(2, reparticion.getLocalidad());
            ps.setString(3, reparticion.getDepartamento());
            ps.setString(4, reparticion.getDomicilio());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Insertado correctamente");
            ps.close();
            conn.close();
        }
    }

    public void modificar(Reparticion reparticion) throws SQLException {
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea modificar?", "ATENCION!", JOptionPane.YES_NO_OPTION) == 0) {
            conn = ConexionDB.GetConnection();
            String consultaSql = "UPDATE \"Reparticiones\" SET nombre=?, localidad=?, departamento=?, domicilio=?, id_reparticion_superior=? WHERE id=?";
            ps = conn.prepareStatement(consultaSql);
            ps.setString(1, reparticion.getNombre());
            ps.setString(2, reparticion.getLocalidad());
            ps.setString(3, reparticion.getDepartamento());
            ps.setString(4, reparticion.getDomicilio());
            ps.setInt(5, reparticion.getId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, reparticion.toString() + " modificado correctamente");
            ps.close();
            conn.close();
        }
    }

    public void borrar(Reparticion reparticion) throws SQLException {
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea eliminar?", "ATENCION!", JOptionPane.YES_NO_OPTION) == 0) {
            conn = ConexionDB.GetConnection();
            String consultaSql = "DELETE FROM \"Reparticiones\" WHERE id=?";
            ps = conn.prepareStatement(consultaSql);
            ps.setInt(1, reparticion.getId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, reparticion.toString() + " eliminado correctamente");
            ps.close();
            conn.close();
        }
    }
}

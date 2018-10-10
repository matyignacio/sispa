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
import objeto.Marca;
import objeto.Modelo;

/**
 *
 * @author Kuky
 */
public class ModeloControlador {

    private Modelo modelo;
    private ArrayList<Modelo> modelos;
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
    MarcaControlador marcaControlador = new MarcaControlador();

    /**
     *
     * @param id
     * @return
     * @throws SQLException
     */
    public Modelo extraer(Integer id) throws SQLException {
        marcaControlador = new MarcaControlador();
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM modelos WHERE id=?";
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
            modelo.setMarca(marcaControlador.extraer(rs.getInt(5)));
        }
        rs.close();
        ps.close();
        conn.close();
        return modelo;
    }

    /**
     *
     * @return
     * @throws SQLException
     */
    public ArrayList<Modelo> extraerTodos() throws SQLException {
        marcaControlador = new MarcaControlador();
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM modelos order by nombre";
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
            modelo.setMarca(marcaControlador.extraer(rs.getInt(5)));
            modelos.add(modelo);
        }
        rs.close();
        ps.close();
        conn.close();
        return modelos;
    }

    /**
     *
     * @return
     * @throws SQLException
     */
    public ArrayList<Modelo> extraerTodosVisibles() throws SQLException {
        marcaControlador = new MarcaControlador();
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM modelos where visible = TRUE order by nombre";
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
            modelo.setMarca(marcaControlador.extraer(rs.getInt(5)));
            modelos.add(modelo);
        }
        rs.close();
        ps.close();
        conn.close();
        return modelos;
    }

    /**
     *
     * @param marca
     * @return
     * @throws SQLException
     */
    public ArrayList<Modelo> extraerTodosVisiblesPorMarca(Marca marca) throws SQLException {
        marcaControlador = new MarcaControlador();
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM modelos where visible = TRUE AND id_marca=? order by nombre";
        ps = conn.prepareStatement(consultaSql);
        ps.setInt(1, marca.getId());
        ps.execute();
        rs = ps.getResultSet();
        modelos = new ArrayList<>();
        while (rs.next()) {
            modelo = new Modelo();
            modelo.setId(rs.getInt(1));
            modelo.setNombre(rs.getString(2));
            modelo.setVisible(rs.getBoolean(3));
            modelo.setAño(rs.getInt(4));
            modelo.setMarca(marca);
            modelos.add(modelo);
        }
        rs.close();
        ps.close();
        conn.close();
        return modelos;
    }

    /**
     *
     * @param modelo
     * @throws SQLException
     */
    public void insertar(Modelo modelo) throws SQLException {
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea guardar?", "ATENCION!", JOptionPane.YES_NO_OPTION) == 0) {
            conn = ConexionDB.GetConnection();
            String consultaSql = "INSERT INTO modelos (nombre, visible, \"año\", id_marca) VALUES (?, ?, ?, ?)";
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

    /**
     *
     * @param modelo
     * @throws SQLException
     */
    public void modificar(Modelo modelo) throws SQLException {
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea modificar?", "ATENCION!", JOptionPane.YES_NO_OPTION) == 0) {
            conn = ConexionDB.GetConnection();
            String consultaSql = "UPDATE modelos SET  nombre=?, visible=?, \"año\"=?, id_marca=? WHERE id=?";
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

    /**
     *
     * @param modelo
     * @throws SQLException
     */
    public void borrar(Modelo modelo) throws SQLException {
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea eliminar?", "ATENCION!", JOptionPane.YES_NO_OPTION) == 0) {
            try {

                conn = ConexionDB.GetConnection();
                String consultaSql = "DELETE FROM modelos WHERE id=?";
                ps = conn.prepareStatement(consultaSql);
                ps.setInt(1, modelo.getId());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, modelo.toString() + " eliminado correctamente");
                ps.close();
                conn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex, "No se pudo eliminar " + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}

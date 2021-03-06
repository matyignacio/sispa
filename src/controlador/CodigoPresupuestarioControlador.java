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
import objeto.CodigoPresupuestario;

/**
 *
 * @author Kuky
 */
public class CodigoPresupuestarioControlador {

    private CodigoPresupuestario codigo;
    private ArrayList<CodigoPresupuestario> codigos;
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;

    /**
     *
     * @param id
     * @return
     * @throws SQLException
     */
    public CodigoPresupuestario extraer(Integer id) throws SQLException {
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM codigos_presupuestarios WHERE id=?";
        ps = conn.prepareStatement(consultaSql);
        ps.setInt(1, id);
        ps.executeQuery();
        rs = ps.getResultSet();
        while (rs.next()) {
            codigo = new CodigoPresupuestario();
            codigo.setId(rs.getInt(1));
            codigo.setNumero(rs.getInt(2));
            codigo.setVisible(rs.getBoolean(3));
        }
        rs.close();
        ps.close();
        conn.close();
        return codigo;
    }

    /**
     *
     * @return
     * @throws SQLException
     */
    public ArrayList<CodigoPresupuestario> extraerTodos() throws SQLException {
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM codigos_presupuestarios order by numero";
        ps = conn.prepareStatement(consultaSql);
        ps.execute();
        rs = ps.getResultSet();
        codigos = new ArrayList<>();
        while (rs.next()) {
            codigo = new CodigoPresupuestario();
            codigo.setId(rs.getInt(1));
            codigo.setNumero(rs.getInt(2));
            codigo.setVisible(rs.getBoolean(3));
            codigos.add(codigo);
        }
        rs.close();
        ps.close();
        conn.close();
        return codigos;
    }

    /**
     *
     * @return
     * @throws SQLException
     */
    public ArrayList<CodigoPresupuestario> extraerTodosVisibles() throws SQLException {
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM codigos_presupuestarios where visible = TRUE order by numero";
        ps = conn.prepareStatement(consultaSql);
        ps.execute();
        rs = ps.getResultSet();
        codigos = new ArrayList<>();
        while (rs.next()) {
            codigo = new CodigoPresupuestario();
            codigo.setId(rs.getInt(1));
            codigo.setNumero(rs.getInt(2));
            codigo.setVisible(rs.getBoolean(3));
            codigos.add(codigo);
        }
        rs.close();
        ps.close();
        conn.close();
        return codigos;
    }

    /**
     *
     * @param codigo
     * @throws SQLException
     */
    public void insertar(CodigoPresupuestario codigo) throws SQLException {
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea guardar?", "ATENCION!", JOptionPane.YES_NO_OPTION) == 0) {
            conn = ConexionDB.GetConnection();
            String consultaSql = "INSERT INTO codigos_presupuestarios (numero, visible)  VALUES (?,?)";
            ps = conn.prepareStatement(consultaSql);
            ps.setInt(1, codigo.getNumero());
            ps.setBoolean(2, codigo.isVisible());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Insertado correctamente");
            ps.close();
            conn.close();
        }
    }

    /**
     *
     * @param codigo
     * @throws SQLException
     */
    public void modificar(CodigoPresupuestario codigo) throws SQLException {
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea modificar?", "ATENCION!", JOptionPane.YES_NO_OPTION) == 0) {
            conn = ConexionDB.GetConnection();
            String consultaSql = "UPDATE codigos_presupuestarios SET numero=?, visible=? WHERE id=?";
            ps = conn.prepareStatement(consultaSql);
            ps.setInt(1, codigo.getNumero());
            ps.setBoolean(2, codigo.isVisible());
            ps.setInt(3, codigo.getId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, codigo.toString() + " modificado correctamente");
            ps.close();
            conn.close();
        }
    }

    /**
     *
     * @param codigo
     * @throws SQLException
     */
    public void borrar(CodigoPresupuestario codigo) throws SQLException {
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea eliminar?", "ATENCION!", JOptionPane.YES_NO_OPTION) == 0) {
            try {

                conn = ConexionDB.GetConnection();
                String consultaSql = "DELETE FROM codigos_presupuestarios WHERE id=?";
                ps = conn.prepareStatement(consultaSql);
                ps.setInt(1, codigo.getId());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, codigo.toString() + " eliminado correctamente");
                ps.close();
                conn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex, "No se pudo eliminar " + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}

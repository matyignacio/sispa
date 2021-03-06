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
import objeto.Inciso;

/**
 *
 * @author Kuky
 */
public class IncisoControlador {

    private Inciso inciso;
    private ArrayList<Inciso> incisos;
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;

    /**
     *
     * @param id
     * @return
     * @throws SQLException
     */
    public Inciso extraer(Integer id) throws SQLException {
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM incisos WHERE id=?";
        ps = conn.prepareStatement(consultaSql);
        ps.setInt(1, id);
        ps.executeQuery();
        rs = ps.getResultSet();
        while (rs.next()) {
            inciso = new Inciso();
            inciso.setId(rs.getInt(1));
            inciso.setNumero(rs.getInt(2));
            inciso.setPrincipal(rs.getInt(3));
            inciso.setParcial(rs.getInt(4));
            inciso.setVisible(rs.getBoolean(5));
        }
        rs.close();
        ps.close();
        conn.close();
        return inciso;
    }

    /**
     *
     * @return
     * @throws SQLException
     */
    public ArrayList<Inciso> extraerTodos() throws SQLException {
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM incisos order by numero";
        ps = conn.prepareStatement(consultaSql);
        ps.execute();
        rs = ps.getResultSet();
        incisos = new ArrayList<>();
        while (rs.next()) {
            inciso = new Inciso();
            inciso.setId(rs.getInt(1));
            inciso.setNumero(rs.getInt(2));
            inciso.setPrincipal(rs.getInt(3));
            inciso.setParcial(rs.getInt(4));
            inciso.setVisible(rs.getBoolean(5));
            incisos.add(inciso);
        }
        rs.close();
        ps.close();
        conn.close();
        return incisos;
    }

    /**
     *
     * @return
     * @throws SQLException
     */
    public ArrayList<Inciso> extraerTodosVisibles() throws SQLException {
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM incisos where visible = TRUE order by numero";
        ps = conn.prepareStatement(consultaSql);
        ps.execute();
        rs = ps.getResultSet();
        incisos = new ArrayList<>();
        while (rs.next()) {
            inciso = new Inciso();
            inciso.setId(rs.getInt(1));
            inciso.setNumero(rs.getInt(2));
            inciso.setPrincipal(rs.getInt(3));
            inciso.setParcial(rs.getInt(4));
            inciso.setVisible(rs.getBoolean(5));
            incisos.add(inciso);
        }
        rs.close();
        ps.close();
        conn.close();
        return incisos;
    }

    /**
     *
     * @param inciso
     * @throws SQLException
     */
    public void insertar(Inciso inciso) throws SQLException {
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea guardar?", "ATENCION!", JOptionPane.YES_NO_OPTION) == 0) {
            conn = ConexionDB.GetConnection();
            String consultaSql = "INSERT INTO incisos (numero, principal, parcial, visible)  VALUES (?,?,?,?)";
            ps = conn.prepareStatement(consultaSql);
            ps.setInt(1, inciso.getNumero());
            ps.setInt(2, inciso.getPrincipal());
            ps.setInt(3, inciso.getParcial());
            ps.setBoolean(4, inciso.isVisible());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Insertado correctamente");
            ps.close();
            conn.close();
        }
    }

    /**
     *
     * @param inciso
     * @throws SQLException
     */
    public void modificar(Inciso inciso) throws SQLException {
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea modificar?", "ATENCION!", JOptionPane.YES_NO_OPTION) == 0) {
            conn = ConexionDB.GetConnection();
            String consultaSql = "UPDATE incisos SET numero=?, principal=?, parcial=?, visible=? WHERE id=?";
            ps = conn.prepareStatement(consultaSql);
            ps.setInt(1, inciso.getNumero());
            ps.setInt(2, inciso.getPrincipal());
            ps.setInt(3, inciso.getParcial());
            ps.setBoolean(4, inciso.isVisible());
            ps.setInt(5, inciso.getId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, inciso.toString() + " modificado correctamente");
            ps.close();
            conn.close();
        }
    }

    /**
     *
     * @param inciso
     * @throws SQLException
     */
    public void borrar(Inciso inciso) throws SQLException {
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea eliminar?", "ATENCION!", JOptionPane.YES_NO_OPTION) == 0) {
            try {

                conn = ConexionDB.GetConnection();
                String consultaSql = "DELETE FROM incisos WHERE id=?";
                ps = conn.prepareStatement(consultaSql);
                ps.setInt(1, inciso.getId());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, inciso.toString() + " eliminado correctamente");
                ps.close();
                conn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex, "No se pudo eliminar " + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}

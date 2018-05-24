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
import objeto.Perfil;

/**
 *
 * @author Kuky
 */
public class PerfilControlador {

    private Perfil perfil;
    private ArrayList<Perfil> perfiles;
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
    private PreparedStatement ps2;
    private ResultSet rs2;
    private OperacionesControlador operacionesControlador;
    private Operaciones operacion;
    private ArrayList<Operaciones> operaciones;

    public Perfil extraer(Integer id) throws SQLException {
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM perfiles where id=?";
        ps = conn.prepareStatement(consultaSql);
        ps.setInt(1, id);
        ps.executeQuery();
        rs = ps.getResultSet();
        while (rs.next()) {
            perfil = new Perfil();
            perfil.setId(rs.getInt(1));
            perfil.setNombre(rs.getString(2));
            perfil.setVisible(rs.getBoolean(3));
            consultaSql = "SELECT id_operacion FROM operaciones_perfiles WHERE id_perfil= ?";
            ps2 = conn.prepareStatement(consultaSql);
            ps2.setInt(1, perfil.getId());
            ps2.executeQuery();
            rs2 = ps2.getResultSet();
            operaciones = new ArrayList<>();
            operacionesControlador = new OperacionesControlador();
            while (rs2.next()) {
                operacion = new Operaciones();
                operacion = operacionesControlador.extraer(rs2.getInt(1));
                operaciones.add(operacion);
            }
            perfil.setOperaciones(operaciones);
        }
        rs.close();
        ps.close();
        conn.close();
        return perfil;
    }

    public ArrayList<Perfil> extraerTodos() throws SQLException {
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM perfiles order by nombre";
        ps = conn.prepareStatement(consultaSql);
        ps.execute();
        rs = ps.getResultSet();
        perfiles = new ArrayList<>();
        while (rs.next()) {
            perfil = new Perfil();
            perfil.setId(rs.getInt(1));
            perfil.setNombre(rs.getString(2));
            perfil.setVisible(rs.getBoolean(3));
            perfiles.add(perfil);
        }
        rs.close();
        ps.close();
        conn.close();
        return perfiles;
    }

    public ArrayList<Perfil> extraerTodosVisibles() throws SQLException {
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM perfiles where visible = TRUE order by nombre";
        ps = conn.prepareStatement(consultaSql);
        ps.execute();
        rs = ps.getResultSet();
        perfiles = new ArrayList<>();
        while (rs.next()) {
            perfil = new Perfil();
            perfil.setId(rs.getInt(1));
            perfil.setNombre(rs.getString(2));
            perfil.setVisible(rs.getBoolean(3));
            perfiles.add(perfil);
        }
        rs.close();
        ps.close();
        conn.close();
        return perfiles;
    }

    public void insertar(Perfil perfil) throws SQLException {
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea guardar?", "ATENCION!", JOptionPane.YES_NO_OPTION) == 0) {
            conn = ConexionDB.GetConnection();
            String consultaSql = "INSERT INTO perfiles (nombre, visible)  VALUES (?,?)";
            ps = conn.prepareStatement(consultaSql);
            ps.setString(1, perfil.getNombre());
            ps.setBoolean(2, perfil.isVisible());
            ps.execute();
            insertarOperacionesPerfiles(extraerNuevoId(conn), perfil.getOperaciones(), conn);
            JOptionPane.showMessageDialog(null, "Insertado correctamente");
            ps.close();
            conn.close();
        }
    }

    public void insertarOperacionesPerfiles(Integer id, ArrayList<Operaciones> operaciones, Connection conn) throws SQLException {
        int i;
        for (i = 0; i < operaciones.size(); i++) {
            String consultaSql = "INSERT INTO operaciones_perfiles (id_perfil, id_operacion)  VALUES (?,?)";
            ps2 = conn.prepareStatement(consultaSql);
            ps2.setInt(1, id);
            ps2.setInt(2, operaciones.get(i).getId());
            ps2.execute();
        }
        ps2.close();
    }

    public int extraerNuevoId(Connection conn) throws SQLException {
        ResultSet rs3;
        PreparedStatement ps3;
        int id = 0;
        String consultaSql = "SELECT id FROM perfiles ORDER BY id DESC LIMIT 1";
        ps3 = conn.prepareStatement(consultaSql);
        ps3.executeQuery();
        rs3 = ps3.getResultSet();
        while (rs3.next()) {
            id = rs3.getInt(1);
        }
        rs3.close();
        ps3.close();
        return id;
    }

    public void modificar(Perfil perfil) throws SQLException {
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea modificar?", "ATENCION!", JOptionPane.YES_NO_OPTION) == 0) {
            conn = ConexionDB.GetConnection();
            String consultaSql = "DELETE FROM operaciones_perfiles WHERE id_perfil=?";
            ps = conn.prepareStatement(consultaSql);
            ps.setInt(1, perfil.getId());
            ps.executeUpdate();
            // PRIMERO ELIMINO LAS OPERACIONES DEL PERFIL
            consultaSql = "UPDATE perfiles SET nombre=?, visible=? WHERE id=?";
            ps = conn.prepareStatement(consultaSql);
            ps.setString(1, perfil.getNombre());
            ps.setBoolean(2, perfil.isVisible());
            ps.setInt(3, perfil.getId());
            ps.executeUpdate();
            insertarOperacionesPerfiles(perfil.getId(), perfil.getOperaciones(), conn);
            JOptionPane.showMessageDialog(null, perfil.toString() + " modificado correctamente");
            ps.close();
            conn.close();
        }
    }

    public void borrar(Perfil perfil) throws SQLException {
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea eliminar?", "ATENCION!", JOptionPane.YES_NO_OPTION) == 0) {
            try {
                conn = ConexionDB.GetConnection();
                String consultasql = "DELETE FROM perfiles WHERE id=?";
                ps = conn.prepareStatement(consultasql);
                ps.setInt(1, perfil.getId());
                ps.executeUpdate();
                consultasql = "DELETE FROM operaciones_perfiles WHERE id_perfil=?";
                ps = conn.prepareStatement(consultasql);
                ps.setInt(1, perfil.getId());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, perfil.toString() + " eliminado correctamente");
                ps.close();
                conn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex, "No se pudo eliminar " + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            }

        }

    }

}

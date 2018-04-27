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

    public Inciso extraer(Integer id) throws SQLException {
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM SISPA.Incisos WHERE id=?";
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
        }
        rs.close();
        ps.close();
        conn.close();
        return inciso;
    }

    public ArrayList<Inciso> extraerTodos() throws SQLException {
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM SISPA.Incisos";
        ps = conn.prepareStatement(consultaSql);
        ps.execute();
        rs = ps.getResultSet();
        while (rs.next()) {
            inciso = new Inciso();
            incisos = new ArrayList<>();
            inciso.setId(rs.getInt(1));
            inciso.setNumero(rs.getInt(2));
            inciso.setPrincipal(rs.getInt(3));
            inciso.setParcial(rs.getInt(4));
            incisos.add(inciso);
        }
        rs.close();
        ps.close();
        conn.close();
        return incisos;
    }

    public void insertar(Inciso inciso) throws SQLException {
        conn = ConexionDB.GetConnection();
        String consultaSql = "INSERT INTO SISPA.Incisos (numero, principal, parcial)  VALUES (?,?,?)";
        ps = conn.prepareStatement(consultaSql);
        ps.setInt(1, inciso.getNumero());
        ps.setInt(2, inciso.getPrincipal());
        ps.setInt(3, inciso.getParcial());
        ps.execute();
        JOptionPane.showMessageDialog(null, "Insertado correctamente");
        ps.close();
        conn.close();
    }

    public void modificar(Inciso inciso) throws SQLException {
        conn = ConexionDB.GetConnection();
        String consultaSql = "UPDATE SISPA.Incisos SET numero=?, principal=?, parcial=? WHERE id=?";
        ps = conn.prepareStatement(consultaSql);
        ps.setInt(1, inciso.getNumero());
        ps.setInt(2, inciso.getPrincipal());
        ps.setInt(3, inciso.getParcial());
        ps.setInt(4, inciso.getId());
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, inciso.toString() + " modificado correctamente");
        ps.close();
        conn.close();
    }

    public void borrar(Inciso inciso) throws SQLException {
        conn = ConexionDB.GetConnection();
        String consultaSql = "DELETE FROM SISPA.Incisos WHERE id=?";
        ps = conn.prepareStatement(consultaSql);
        ps.setInt(1, inciso.getId());
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, inciso.toString() + " eliminado correctamente");
        ps.close();
        conn.close();
    }

}

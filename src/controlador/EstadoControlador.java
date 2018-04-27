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
import objeto.Estado;

/**
 *
 * @author Kuky
 */
public class EstadoControlador {

    private Estado estado;
    private ArrayList<Estado> estados = new ArrayList<>();
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;

    public Estado extraer(Integer id) throws SQLException {
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM SISPA.Estados WHERE id=?";
        ps = conn.prepareStatement(consultaSql);
        ps.setInt(1, id);
        ps.executeQuery();
        rs = ps.getResultSet();
        while (rs.next()) {
            estado = new Estado();
            estado.setId(rs.getInt(0));
            estado.setNombre(rs.getString(1));
            estado.setVisible(rs.getBoolean(2));
        }
        rs.close();
        ps.close();
        conn.close();
        return estado;
    }

}

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

    public Perfil extraer(Integer id) throws SQLException {
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM public.\"Perfiles\"";
        ps = conn.prepareStatement(consultaSql);
        ps.setInt(1, id);
        ps.executeQuery();
        rs = ps.getResultSet();
        while (rs.next()) {
            perfil = new Perfil();
            perfil.setId(rs.getInt(1));
            perfil.setNombre(rs.getString(2));
            perfil.setVisible(rs.getBoolean(3));
        }
        rs.close();
        ps.close();
        conn.close();
        return perfil;
    }

    public ArrayList<Perfil> extraerTodos() throws SQLException {
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM public.\"Perfiles\"";
        ps = conn.prepareStatement(consultaSql);
        ps.execute();
        rs = ps.getResultSet();
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

    public void insertar(Perfil perfil) {

    }

}

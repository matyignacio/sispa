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
import objeto.Mueble;

/**
 *
 * @author Kuky
 */
public class MuebleControlador {

    private Mueble mueble;
    private ArrayList<Mueble> muebles = new ArrayList<>();
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;

    public Mueble extraer(Integer id) throws SQLException {
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM public.Muebles WHERE id=?";
        ps = conn.prepareStatement(consultaSql);
        ps.setInt(1, id);
        ps.executeQuery();
        rs = ps.getResultSet();
        while (rs.next()) {
            mueble = new Mueble();
            mueble.setId(rs.getInt(1));
            mueble.setNombre(rs.getString(2));
            mueble.setVisible(rs.getBoolean(3));
            mueble.setExpediente(rs.getString(4));
            mueble.setObservaciones(rs.getString(5));
            //FALTAN CATEGORIA, ESTADO, MODELO, USUARIO Y REPARTICION
        }
        rs.close();
        ps.close();
        conn.close();
        return mueble;
    }

}

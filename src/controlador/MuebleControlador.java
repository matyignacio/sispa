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
    CategoriaControlador c = new CategoriaControlador();
    EstadoControlador e = new EstadoControlador();
    ModeloControlador m = new ModeloControlador();
    UsuarioControlador u = new UsuarioControlador();
    ReparticionControlador r = new ReparticionControlador();

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
            mueble.setCaracteristicas(rs.getString(5));
            mueble.setObservaciones(rs.getString(6));
            mueble.setCategoria(c.extraer(rs.getInt(7)));
            mueble.setEstado(e.extraer(rs.getInt(8)));
            mueble.setModelo(m.extraer(rs.getInt(9)));
            mueble.setUsuario(u.extraer(rs.getInt(10)));
            mueble.setReparticion(r.extraer(rs.getInt(11)));

        }
        rs.close();
        ps.close();
        conn.close();
        return mueble;
    }

    public ArrayList<Mueble> extraerTodos() throws SQLException {
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM public.Muebles";
        ps = conn.prepareStatement(consultaSql);
        ps.execute();
        rs = ps.getResultSet();
        while (rs.next()) {
            mueble = new Mueble();
            muebles = new ArrayList<>();
            mueble.setId(rs.getInt(1));
            mueble.setNombre(rs.getString(2));
            mueble.setVisible(rs.getBoolean(3));
            mueble.setExpediente(rs.getString(4));
            mueble.setCaracteristicas(rs.getString(5));
            mueble.setObservaciones(rs.getString(6));
            mueble.setCategoria(c.extraer(rs.getInt(7)));
            mueble.setEstado(e.extraer(rs.getInt(8)));
            mueble.setModelo(m.extraer(rs.getInt(9)));
            mueble.setUsuario(u.extraer(rs.getInt(10)));
            mueble.setReparticion(r.extraer(rs.getInt(11)));
            muebles.add(mueble);
        }
        rs.close();
        ps.close();
        conn.close();
        return muebles;
    }

    public void insertar(Mueble mueble) throws SQLException {
        conn = ConexionDB.GetConnection();
        String consultaSql = "INSERT INTO \"Muebles\"( nombre, visible, expediente, caracteristica, observaciones,"
                + "id_categoria, id_estado, id_modelo, id_usuario, id_reparticion)"
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        ps = conn.prepareStatement(consultaSql);
        ps.setString(1, mueble.getNombre());
        ps.setBoolean(2, mueble.isVisible());
        ps.setString(3, mueble.getExpediente());
        ps.setString(4, mueble.getCaracteristicas());
        ps.setString(5, mueble.getObservaciones());
        ps.setInt(6, mueble.getCategoria().getId());
        ps.setInt(7, mueble.getEstado().getId());
        ps.setInt(8, mueble.getModelo().getId());
        ps.setInt(9, mueble.getUsuario().getId());
        ps.setInt(10, mueble.getReparticion().getId());

        ps.execute();
        JOptionPane.showMessageDialog(null, "Insertado correctamente");
        ps.close();
        conn.close();
    }

    public void modificar(Mueble mueble) throws SQLException {
        conn = ConexionDB.GetConnection();
        String consultaSql = "UPDATE \"Muebles\" SET nombre=?, visible=?, expediente=?, caracteristica=?, observaciones=?, id_categoria=?,"
                + "id_estado=?, id_modelo=?, id_usuario=?, id_reparticion=? WHERE id=?";
        ps = conn.prepareStatement(consultaSql);
        ps.setString(1, mueble.getNombre());
        ps.setBoolean(2, mueble.isVisible());
        ps.setString(3, mueble.getExpediente());
        ps.setString(4, mueble.getCaracteristicas());
        ps.setString(5, mueble.getObservaciones());
        ps.setInt(6, mueble.getCategoria().getId());
        ps.setInt(7, mueble.getEstado().getId());
        ps.setInt(8, mueble.getModelo().getId());
        ps.setInt(9, mueble.getUsuario().getId());
        ps.setInt(10, mueble.getReparticion().getId());
        ps.setInt(11, mueble.getId());
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, mueble.toString() + " modificado correctamente");
        ps.close();
        conn.close();
    }
    
    public void borrar(Mueble mueble) throws SQLException {
        conn = ConexionDB.GetConnection();
        String consultaSql = "DELETE FROM public.Muebles WHERE id=?";
        ps = conn.prepareStatement(consultaSql);
        ps.setInt(1, mueble.getId());
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, mueble.toString() + " eliminado correctamente");
        ps.close();
        conn.close();
    }
}

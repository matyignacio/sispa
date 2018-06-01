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
import ui.Login;

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
    CategoriaControlador categoriaControlador = new CategoriaControlador();
    EstadoControlador estadoControlador = new EstadoControlador();
    ModeloControlador modeloControlador = new ModeloControlador();
    ReparticionControlador reparticionControlador = new ReparticionControlador();

    public Mueble extraer(Integer id) throws SQLException {
        categoriaControlador = new CategoriaControlador();
        estadoControlador = new EstadoControlador();
        modeloControlador = new ModeloControlador();
        reparticionControlador = new ReparticionControlador();
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM muebles WHERE id=? AND mantenible=0";
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
            mueble.setCategoria(categoriaControlador.extraer(rs.getInt(9)));
            mueble.setEstado(estadoControlador.extraer(rs.getInt(10)));
            mueble.setModelo(modeloControlador.extraer(rs.getInt(11)));
            mueble.setReparticion(reparticionControlador.extraer(rs.getInt(12)));

        }
        rs.close();
        ps.close();
        conn.close();
        return mueble;
    }

    public ArrayList<Mueble> extraerTodos() throws SQLException {
        categoriaControlador = new CategoriaControlador();
        estadoControlador = new EstadoControlador();
        modeloControlador = new ModeloControlador();
        reparticionControlador = new ReparticionControlador();
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM muebles WHERE mantenible=0 AND id_reparticion=? order by nombre";
        ps = conn.prepareStatement(consultaSql);
        ps.setInt(1, Login.usuario.getReparticion().getId());
        ps.execute();
        rs = ps.getResultSet();
        muebles = new ArrayList<>();
        while (rs.next()) {
            mueble = new Mueble();
            mueble.setId(rs.getInt(1));
            mueble.setNombre(rs.getString(2));
            mueble.setVisible(rs.getBoolean(3));
            mueble.setExpediente(rs.getString(4));
            mueble.setCaracteristicas(rs.getString(5));
            mueble.setObservaciones(rs.getString(6));
            mueble.setCategoria(categoriaControlador.extraer(rs.getInt(9)));
            mueble.setEstado(estadoControlador.extraer(rs.getInt(10)));
            mueble.setModelo(modeloControlador.extraer(rs.getInt(11)));
            mueble.setReparticion(reparticionControlador.extraer(rs.getInt(12)));
            muebles.add(mueble);
        }
        rs.close();
        ps.close();
        conn.close();
        return muebles;
    }

    public ArrayList<Mueble> extraerTodosVisibles() throws SQLException {
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM muebles where visible = TRUE AND mantenible=0 AND id_reparticion=? order by nombre";
        ps = conn.prepareStatement(consultaSql);
        ps.setInt(1, Login.usuario.getReparticion().getId());
        ps.execute();
        rs = ps.getResultSet();
        muebles = new ArrayList<>();
        while (rs.next()) {
            mueble = new Mueble();
            mueble.setId(rs.getInt(1));
            mueble.setNombre(rs.getString(2));
            mueble.setVisible(rs.getBoolean(3));
            mueble.setExpediente(rs.getString(4));
            mueble.setCaracteristicas(rs.getString(5));
            mueble.setObservaciones(rs.getString(6));
            mueble.setCategoria(categoriaControlador.extraer(rs.getInt(9)));
            mueble.setEstado(estadoControlador.extraer(rs.getInt(10)));
            mueble.setModelo(modeloControlador.extraer(rs.getInt(11)));
            mueble.setReparticion(reparticionControlador.extraer(rs.getInt(12)));
            muebles.add(mueble);
        }
        rs.close();
        ps.close();
        conn.close();
        return muebles;
    }

    public void insertar(Mueble mueble) throws SQLException {
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea guardar?", "ATENCION!", JOptionPane.YES_NO_OPTION) == 0) {
            conn = ConexionDB.GetConnection();
            String consultaSql = "INSERT INTO muebles ( nombre, visible, expediente, caracteristica, observaciones,"
                    + "id_categoria, id_estado, id_modelo, id_reparticion, mantenible)"
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
            ps.setInt(9, mueble.getReparticion().getId());
            ps.setInt(10, 0);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Insertado correctamente");
            ps.close();
            conn.close();
        }
    }

    public void modificar(Mueble mueble) throws SQLException {
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea modificar?", "ATENCION!", JOptionPane.YES_NO_OPTION) == 0) {
            conn = ConexionDB.GetConnection();
            String consultaSql = "UPDATE muebles SET nombre=?, visible=?, expediente=?, caracteristica=?, observaciones=?, id_categoria=?,"
                    + "id_estado=?, id_modelo=?, id_reparticion=?, mantenible=? WHERE id=?";
            ps = conn.prepareStatement(consultaSql);
            ps.setString(1, mueble.getNombre());
            ps.setBoolean(2, mueble.isVisible());
            ps.setString(3, mueble.getExpediente());
            ps.setString(4, mueble.getCaracteristicas());
            ps.setString(5, mueble.getObservaciones());
            ps.setInt(6, mueble.getCategoria().getId());
            ps.setInt(7, mueble.getEstado().getId());
            ps.setInt(8, mueble.getModelo().getId());
            ps.setInt(9, mueble.getReparticion().getId());
            ps.setInt(10, 0);
            ps.setInt(11, mueble.getId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, mueble.toString() + " modificado correctamente");
            ps.close();
            conn.close();
        }
    }

    public void borrar(Mueble mueble) throws SQLException {
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea eliminar?", "ATENCION!", JOptionPane.YES_NO_OPTION) == 0) {
            try {
                conn = ConexionDB.GetConnection();
                String consultaSql = "DELETE FROM muebles WHERE id=?";
                ps = conn.prepareStatement(consultaSql);
                ps.setInt(1, mueble.getId());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, mueble.toString() + " eliminado correctamente");
                ps.close();
                conn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex, "No se pudo eliminar " + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}

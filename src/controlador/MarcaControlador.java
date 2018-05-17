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

public class MarcaControlador {

    private Marca marca;
    private ArrayList<Marca> marcas;
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
    private UsuarioControlador usuarioControlador;

    public Marca extraer(Integer id) throws SQLException {
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM public.\"Marcas\" WHERE id=? ";
        ps = conn.prepareStatement(consultaSql);
        ps.setInt(1, id);
        ps.executeQuery();
        rs = ps.getResultSet();
        while (rs.next()) {
            marca = new Marca();
            marca.setId(rs.getInt(1));
            marca.setNombre(rs.getString(2));
            marca.setVisible(rs.getBoolean(3));

        }
        rs.close();
        ps.close();
        conn.close();
        return marca;
    }

    public ArrayList<Marca> extraerTodos() throws SQLException {
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM public.\"Marcas\" order by id";
        ps = conn.prepareStatement(consultaSql);
        ps.executeQuery();
        rs = ps.getResultSet();
        marcas = new ArrayList<Marca>();
        while (rs.next()) {
            marca = new Marca();
            marca.setId(rs.getInt(1));
            marca.setNombre(rs.getString(2));
            marca.setVisible(rs.getBoolean(3));
            marca.setUsuario(usuarioControlador.extraer(rs.getInt(4)));

            marcas.add(marca);
        }
        rs.close();
        ps.close();
        conn.close();
        return marcas;
    }

    public ArrayList<Marca> extraerTodosVisibles() throws SQLException {
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM public.\"Marcas\" where visible = TRUE order by id";
        ps = conn.prepareStatement(consultaSql);
        ps.executeQuery();
        rs = ps.getResultSet();
        marcas = new ArrayList<Marca>();
        while (rs.next()) {
            marca = new Marca();
            marca.setId(rs.getInt(1));
            marca.setNombre(rs.getString(2));
            marca.setVisible(rs.getBoolean(3));

            marcas.add(marca);
        }
        rs.close();
        ps.close();
        conn.close();
        return marcas;
    }

    public void insertar(Marca marca) throws SQLException {
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea guardar?", "ATENCION!", JOptionPane.YES_NO_OPTION) == 0) {
            conn = ConexionDB.GetConnection();
            String consultaSql = "INSERT INTO public.\"Marcas\" (nombre, visible)  VALUES (?,?)";
            ps = conn.prepareStatement(consultaSql);
            ps.setString(1, marca.getNombre());
            ps.setBoolean(2, marca.isVisible());
            ps.setInt(3, marca.getUsuario().getId());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Insertado correctamente");
            ps.close();
            conn.close();
        }
    }

    public void modificar(Marca marca) throws SQLException {
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea modificar?", "ATENCION!", JOptionPane.YES_NO_OPTION) == 0) {
            conn = ConexionDB.GetConnection();
            String consultaSql = "UPDATE public.\"Marcas\" SET nombre=?, visible=? WHERE id=?";
            ps = conn.prepareStatement(consultaSql);
            ps.setString(1, marca.getNombre());
            ps.setBoolean(2, marca.isVisible());
            ps.setInt(3, marca.getId());
            ps.setInt(3, marca.getUsuario().getId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, marca.toString() + " modificado correctamente");
            ps.close();
            conn.close();
        }
    }

    public void borrar(Marca marca) throws SQLException {
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea eliminar?", "ATENCION!", JOptionPane.YES_NO_OPTION) == 0) {
            conn = ConexionDB.GetConnection();
            String consultaSql = "DELETE FROM public.\"Marcas\" WHERE id=?";
            ps = conn.prepareStatement(consultaSql);
            ps.setInt(1, marca.getId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, marca.toString() + " eliminado correctamente");
            ps.close();
            conn.close();
        }
    }
}

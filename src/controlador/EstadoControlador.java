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
    private UsuarioControlador usuarioControlador;

    public Estado extraer(Integer id) throws SQLException {
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM public.\"Estados\" WHERE id=?";
        ps = conn.prepareStatement(consultaSql);
        ps.setInt(1, id);
        ps.executeQuery();
        rs = ps.getResultSet();
        while (rs.next()) {
            estado = new Estado();
            estado.setId(rs.getInt(1));
            estado.setNombre(rs.getString(2));
            estado.setVisible(rs.getBoolean(3));
            estado.setUsuario(usuarioControlador.extraer(rs.getInt(4)));
        }
        rs.close();
        ps.close();
        conn.close();
        return estado;
    }

    public ArrayList<Estado> extraerTodos() throws SQLException {
        usuarioControlador = new UsuarioControlador(); //HAY QUE INICIALIZARLO PARA PODER USARLO

        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM public.Estados order by nombre";
        ps = conn.prepareStatement(consultaSql);
        ps.execute();
        rs = ps.getResultSet();
        estados = new ArrayList<>();
        while (rs.next()) {
            estado = new Estado();
            estado.setId(rs.getInt(1));
            estado.setNombre(rs.getString(2));
            estado.setVisible(rs.getBoolean(3));
            
            estados.add(estado);
        }
        rs.close();
        ps.close();
        conn.close();
        return estados;
    }

    public ArrayList<Estado> extraerTodosVisibles() throws SQLException {
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM public.Estados where visible = TRUE order by nombre";
        ps = conn.prepareStatement(consultaSql);
        ps.execute();
        rs = ps.getResultSet();
        estados = new ArrayList<>();
        while (rs.next()) {
            estado = new Estado();
            estado.setId(rs.getInt(1));
            estado.setNombre(rs.getString(2));
            estado.setVisible(rs.getBoolean(3));
            estados.add(estado);
        }
        rs.close();
        ps.close();
        conn.close();
        return estados;
    }

    public void insertar(Estado estado) throws SQLException {
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea guardar?", "ATENCION!", JOptionPane.YES_NO_OPTION) == 0) {
            conn = ConexionDB.GetConnection();
            String consultaSql = "INSERT INTO public.Estados (nombre, visible, id_usuario)  VALUES (?,?,?)";
            ps = conn.prepareStatement(consultaSql);
            ps.setString(1, estado.getNombre());
            ps.setBoolean(2, estado.isVisible());
            ps.setInt(3, estado.getUsuario().getId());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Insertado correctamente");
            ps.close();
            conn.close();
        }
    }

    public void modificar(Estado estado) throws SQLException {
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea modificar?", "ATENCION!", JOptionPane.YES_NO_OPTION) == 0) {
            conn = ConexionDB.GetConnection();
            String consultaSql = "UPDATE public.Estados SET nombre=?, visible=?, id_usuario=? WHERE id=?";
            ps = conn.prepareStatement(consultaSql);
            ps.setString(1, estado.getNombre());
            ps.setBoolean(2, estado.isVisible());
            ps.setInt(3, estado.getUsuario().getId());
            ps.setInt(4, estado.getId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, estado.toString() + " modificado correctamente");
            ps.close();
            conn.close();
        }
    }

    public void borrar(Estado estado) throws SQLException {
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea eliminar?", "ATENCION!", JOptionPane.YES_NO_OPTION) == 0) {
            conn = ConexionDB.GetConnection();
            String consultaSql = "DELETE FROM public.Estados WHERE id=?";
            ps = conn.prepareStatement(consultaSql);
            ps.setInt(1, estado.getId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, estado.toString() + " eliminado correctamente");
            ps.close();
            conn.close();
        }
    }
}

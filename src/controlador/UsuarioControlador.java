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
import objeto.Reparticion;
import objeto.Usuario;

public class UsuarioControlador {

    private Usuario usuario;
    private ArrayList<Usuario> usuarios;
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
    private PerfilControlador perfilcontrolador;
    private ReparticionControlador reparticionControlador;

    public Usuario extraer(Integer id) throws SQLException {
        perfilcontrolador = new PerfilControlador(); //HAY QUE INICIALIZARLO PARA PODER USARLO
        reparticionControlador = new ReparticionControlador();
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM usuarios where id=?";
        ps = conn.prepareStatement(consultaSql);
        ps.setInt(1, id);
        ps.executeQuery();
        rs = ps.getResultSet();
        while (rs.next()) {
            usuario = new Usuario();
            usuario.setId(rs.getInt(1));
            usuario.setNombre(rs.getString(2));
            usuario.setMail(rs.getString(3));
            usuario.setClave(rs.getString(4));
            usuario.setVisible(rs.getBoolean(5));
            usuario.setPerfil(perfilcontrolador.extraer(rs.getInt(6)));
            usuario.setReparticion(reparticionControlador.extraer(rs.getInt(7)));
        }
        rs.close();
        ps.close();
        conn.close();
        return usuario;
    }

    public ArrayList<Usuario> extraerTodos() throws SQLException {
        perfilcontrolador = new PerfilControlador();
        reparticionControlador = new ReparticionControlador();
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM usuarios order by nombre";
        ps = conn.prepareStatement(consultaSql);
        ps.execute();
        rs = ps.getResultSet();
        usuarios = new ArrayList<>();
        while (rs.next()) {
            usuario = new Usuario();
            usuario.setId(rs.getInt(1));
            usuario.setNombre(rs.getString(2));
            usuario.setMail(rs.getString(3));
            usuario.setClave(rs.getString(4));
            usuario.setVisible(rs.getBoolean(5));
            usuario.setPerfil(perfilcontrolador.extraer(rs.getInt(6)));
            usuario.setReparticion(reparticionControlador.extraer(rs.getInt(7)));
            usuarios.add(usuario);
        }
        rs.close();
        ps.close();
        conn.close();
        return usuarios;
    }

    public ArrayList<Usuario> extraerTodosVisibles() throws SQLException {
        perfilcontrolador = new PerfilControlador();
        reparticionControlador = new ReparticionControlador();
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM usuarios where visible = TRUE order by nombre";
        ps = conn.prepareStatement(consultaSql);
        ps.execute();
        rs = ps.getResultSet();
        usuarios = new ArrayList<>();
        while (rs.next()) {
            usuario = new Usuario();
            usuario.setId(rs.getInt(1));
            usuario.setNombre(rs.getString(2));
            usuario.setMail(rs.getString(3));
            usuario.setClave(rs.getString(4));
            usuario.setVisible(rs.getBoolean(5));
            usuario.setPerfil(perfilcontrolador.extraer(rs.getInt(6)));
            usuario.setReparticion(reparticionControlador.extraer(rs.getInt(7)));
            usuarios.add(usuario);
        }
        rs.close();
        ps.close();
        conn.close();
        return usuarios;
    }

    public void insertar(Usuario usuario) throws SQLException {

        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea guardar?", "ATENCION!", JOptionPane.YES_NO_OPTION) == 0) {
            conn = ConexionDB.GetConnection();
            String consultaSql = "INSERT INTO usuarios ( nombre, mail, clave, visible, id_perfil, id_reparticion) VALUES (?, ?, ?, ?, ?, ?)";
            ps = conn.prepareStatement(consultaSql);
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getMail());
            ps.setString(3, usuario.getClave());
            ps.setBoolean(4, usuario.isVisible());
            ps.setInt(5, usuario.getPerfil().getId());
            ps.setInt(6, usuario.getReparticion().getId());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Insertado correctamente");
            ps.close();
            conn.close();
        }
    }

    public void modificar(Usuario usuario) throws SQLException {
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea modificar?", "ATENCION!", JOptionPane.YES_NO_OPTION) == 0) {
            conn = ConexionDB.GetConnection();
            String consultaSql = "UPDATE usuarios SET nombre=?, mail=?, clave=?, visible=?, id_perfil=?, id_reparticion=? WHERE id=?";
            ps = conn.prepareStatement(consultaSql);
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getMail());
            ps.setString(3, usuario.getClave());
            ps.setBoolean(4, usuario.isVisible());
            ps.setInt(5, usuario.getPerfil().getId());
            ps.setInt(6, usuario.getReparticion().getId());
            ps.setInt(7, usuario.getId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, usuario.toString() + " modificado correctamente");
            ps.close();
            conn.close();
        }
    }

    public void borrar(Usuario usuario) throws SQLException {
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea eliminar?", "ATENCION!", JOptionPane.YES_NO_OPTION) == 0) {
            try {
                conn = ConexionDB.GetConnection();
                String consultaSql = "DELETE FROM usuarios WHERE id=?";
                ps = conn.prepareStatement(consultaSql);
                ps.setInt(1, usuario.getId());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, usuario.toString() + " eliminado correctamente");
                ps.close();
                conn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex, "No se pudo eliminar " + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public Usuario validarUsuario(Usuario usuario) throws SQLException {
        perfilcontrolador = new PerfilControlador();
        conn = ConexionDB.GetConnection();
        String consultaSql = "select * from usuarios where mail like ? AND clave like ? AND visible = TRUE";
        ps = conn.prepareStatement(consultaSql);
        ps.setString(1, usuario.getMail());
        ps.setString(2, usuario.getClave());
        ps.executeQuery();
        rs = ps.getResultSet();
        while (rs.next()) {
            usuario.setId(rs.getInt(1));
            usuario.setNombre(rs.getString(2));
            usuario.setMail(rs.getString(3));
            usuario.setClave(rs.getString(4));
            usuario.setVisible(rs.getBoolean(5));
            usuario.setPerfil(perfilcontrolador.extraer(rs.getInt(6)));
        }
        return usuario;
    }

}

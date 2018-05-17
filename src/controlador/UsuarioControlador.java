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
import objeto.Usuario;

public class UsuarioControlador {

    private Usuario usuario;
    private ArrayList<Usuario> usuarios;
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
    private PerfilControlador perfilcontrolador;

    public Usuario extraer(Integer id) throws SQLException {
        perfilcontrolador = new PerfilControlador(); //HAY QUE INICIALIZARLO PARA PODER USARLO
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM public.\"Usuarios\" where id=?";
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
        }
        rs.close();
        ps.close();
        conn.close();
        return usuario;
    }

    public ArrayList<Usuario> extraerTodos() throws SQLException {
        perfilcontrolador = new PerfilControlador();
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM public.\"Usuarios\" where id!=0 order by id";
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
            if (rs.getInt(7) != 0) {
                Usuario usuarioSuperior = new Usuario();
                UsuarioControlador usuarioControlador = new UsuarioControlador();
                usuarioSuperior = usuarioControlador.extraer(rs.getInt(7));
                usuario.setUsuario(usuarioSuperior);
            }
            usuarios.add(usuario);
        }
        rs.close();
        ps.close();
        conn.close();
        return usuarios;
    }

    public ArrayList<Usuario> extraerTodosVisibles() throws SQLException {
        perfilcontrolador = new PerfilControlador();
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM public.\"Usuarios\" where where id!=0 AND visible = TRUE order by id";
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
            String consultaSql = "INSERT INTO public.\"Usuarios\" ( nombre, mail, clave, visible, id_perfil, id_usuario) VALUES (?, ?, ?, ?, ?, ?)";
            ps = conn.prepareStatement(consultaSql);
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getMail());
            ps.setString(3, usuario.getClave());
            ps.setBoolean(4, usuario.isVisible());
            ps.setInt(5, usuario.getPerfil().getId());
            ps.setInt(6, usuario.getUsuario().getId());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Insertado correctamente");
            ps.close();
            conn.close();
        }
    }

    public void modificar(Usuario usuario) throws SQLException {
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea modificar?", "ATENCION!", JOptionPane.YES_NO_OPTION) == 0) {
            conn = ConexionDB.GetConnection();
            String consultaSql = "UPDATE public.\"Usuarios\" SET nombre=?, mail=?, clave=?, visible=?, id_perfil=?, id_usuario=? WHERE id=?";
            ps = conn.prepareStatement(consultaSql);
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getMail());
            ps.setString(3, usuario.getClave());
            ps.setBoolean(4, usuario.isVisible());
            ps.setInt(5, usuario.getPerfil().getId());
            ps.setInt(6, usuario.getUsuario().getId());
            ps.setInt(7, usuario.getId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, usuario.toString() + " modificado correctamente");
            ps.close();
            conn.close();
        }
    }

    public void borrar(Usuario usuario) throws SQLException {
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea eliminar?", "ATENCION!", JOptionPane.YES_NO_OPTION) == 0) {
            conn = ConexionDB.GetConnection();
            String consultaSql = "DELETE FROM public.\"Usuarios\" WHERE id=?";
            ps = conn.prepareStatement(consultaSql);
            ps.setInt(1, usuario.getId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, usuario.toString() + " eliminado correctamente");
            ps.close();
            conn.close();
        }
    }

    public Usuario validarUsuario(Usuario usuario) throws SQLException {
        conn = ConexionDB.GetConnection();
        String consultaSql = "select * from public.\"Usuarios\" where mail like ? AND clave like ? AND visible = TRUE";
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
        }
        return usuario;
    }

}

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
    private PreparedStatement ps2;
    private ResultSet rs2;
    private PerfilControlador perfilcontrolador;
    private Reparticion reparticion;
    private ReparticionControlador reparticionControlador;
    private ArrayList<Reparticion> reparticiones;

    public Usuario extraer(Integer id) throws SQLException {
        perfilcontrolador = new PerfilControlador(); //HAY QUE INICIALIZARLO PARA PODER USARLO
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
            /*consultaSql = "SELECT id_reparticion FROM reparticion_usuarios WHERE id_usuario= ?";
            ps2 = conn.prepareStatement(consultaSql);
            ps2.setInt(1, usuario.getId());
            ps2.executeQuery();
            rs2 = ps2.getResultSet();
            reparticiones = new ArrayList<>();
            reparticionControlador = new ReparticionControlador();
            while (rs2.next()) {
                reparticion = new Reparticion();
                reparticion = reparticionControlador.extraer(rs2.getInt(1));
                reparticiones.add(reparticion);
            }
            usuario.setReparticiones(reparticiones);*/
        }
        //rs2.close();
        //ps2.close();
        rs.close();
        ps.close();
        conn.close();
        return usuario;
    }

    public ArrayList<Usuario> extraerTodos() throws SQLException {
        perfilcontrolador = new PerfilControlador();
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
            String consultaSql = "INSERT INTO usuarios ( nombre, mail, clave, visible, id_perfil) VALUES (?, ?, ?, ?, ?)";
            ps = conn.prepareStatement(consultaSql);
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getMail());
            ps.setString(3, usuario.getClave());
            ps.setBoolean(4, usuario.isVisible());
            ps.setInt(5, usuario.getPerfil().getId());
            ps.execute();
            //insertarReparticionUsuarios(extraerNuevoId(conn), usuario.getReparticiones(), conn);
            JOptionPane.showMessageDialog(null, "Insertado correctamente");
            ps.close();
            conn.close();
        }
    }

    /*public void insertarReparticionUsuarios(Integer id, ArrayList<Reparticion> reparticiones, Connection conn) throws SQLException {
        int i;
        for (i = 0; i < reparticiones.size(); i++) {
            String consultaSql = "INSERT INTO reparticion_usuarios (id_usuario, id_reparticion)  VALUES (?,?)";
            ps2 = conn.prepareStatement(consultaSql);
            ps2.setInt(1, id);
            ps2.setInt(2, reparticiones.get(i).getId());
            ps2.execute();
        }
        ps2.close();
    }*/

 /*public int extraerNuevoId(Connection conn) throws SQLException {
        ResultSet rs3;
        PreparedStatement ps3;
        int id = 0;
        String consultaSql = "SELECT id FROM usuarios perfiles ORDER BY id DESC LIMIT 1";
        ps3 = conn.prepareStatement(consultaSql);
        ps3.executeQuery();
        rs3 = ps3.getResultSet();
        while (rs3.next()) {
            id = rs3.getInt(1);
        }
        rs3.close();
        ps3.close();
        return id;
    }*/
    public void modificar(Usuario usuario) throws SQLException {
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea modificar?", "ATENCION!", JOptionPane.YES_NO_OPTION) == 0) {
            conn = ConexionDB.GetConnection();
            String consultaSql = "DELETE FROM reparticion_usuarios WHERE id_usuario=?";
            ps = conn.prepareStatement(consultaSql);
            ps.setInt(1, usuario.getId());
            ps.executeUpdate();
            // PRIMERO ELIMINO LAS REPARTICIONES DEL USUARIO
            consultaSql = "UPDATE usuarios SET nombre=?, mail=?, clave=?, visible=?, id_perfil=? WHERE id=?";
            ps = conn.prepareStatement(consultaSql);
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getMail());
            ps.setString(3, usuario.getClave());
            ps.setBoolean(4, usuario.isVisible());
            ps.setInt(5, usuario.getPerfil().getId());
            ps.setInt(6, usuario.getId());
            ps.executeUpdate();
            //insertarReparticionUsuarios(usuario.getId(), usuario.getReparticiones(), conn);
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

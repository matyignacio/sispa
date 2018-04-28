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
    
    public Usuario extraer(Integer id) throws SQLException {
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM public.Usuarios";
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
        }
        rs.close();
        ps.close();
        conn.close();
        return usuario;
    }
    
    public ArrayList<Usuario> extraerTodos() throws SQLException {
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM public.Usuarios";
        ps = conn.prepareStatement(consultaSql);
        ps.execute();
        rs = ps.getResultSet();
        while (rs.next()) {
            usuario = new Usuario();
            usuarios = new ArrayList<>();
            usuario.setId(rs.getInt(1));
            usuario.setNombre(rs.getString(2));
            usuario.setMail(rs.getString(3));
            usuario.setClave(rs.getString(4));
            usuarios.add(usuario);
        }
        rs.close();
        ps.close();
        conn.close();
        return usuarios;
    }
    
      public void insertar(Usuario usuario) throws SQLException {
        conn = ConexionDB.GetConnection();
        String consultaSql = "INSERT INTO public.Usuarios ( nombre, mail, clave) VALUES (?, ?, ?)";
        ps = conn.prepareStatement(consultaSql);
        ps.setString(1, usuario.getNombre());
        ps.setString(2, usuario.getMail());
        ps.setString(3, usuario.getClave());
        ps.execute();
        JOptionPane.showMessageDialog(null, "Insertado correctamente");
        ps.close();
        conn.close();
    }
      
      public void modificar(Usuario usuario) throws SQLException {
        conn = ConexionDB.GetConnection();
        String consultaSql = "UPDATE public.Usuarios SET nombre=?, mail=?, clave=? WHERE id=?";
        ps = conn.prepareStatement(consultaSql);
        ps.setString(1, usuario.getNombre());
        ps.setString(2, usuario.getMail());
        ps.setString(3, usuario.getClave());
       
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, usuario.toString() + " modificado correctamente");
        ps.close();
        conn.close();
    }
      
      public void borrar(Usuario usuario) throws SQLException {
        conn = ConexionDB.GetConnection();
        String consultaSql = "DELETE FROM public.Usuarios WHERE id=?";
        ps = conn.prepareStatement(consultaSql);
        ps.setInt(1, usuario.getId());
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, usuario.toString() + " eliminado correctamente");
        ps.close();
        conn.close();
    }
}

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
import objeto.TipoAdquisicion;

public class TipoAdquisicionControlador {

    private TipoAdquisicion tipo;
    private ArrayList<TipoAdquisicion> tipos = new ArrayList<>();
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
    private UsuarioControlador usuarioControlador;

    public TipoAdquisicion extraer(Integer id) throws SQLException {
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM public.\"tipo_adquisicion\" WHERE id=?";
        ps = conn.prepareStatement(consultaSql);
        ps.setInt(1, id);
        ps.executeQuery();
        rs = ps.getResultSet();
        while (rs.next()) {
            tipo = new TipoAdquisicion();
            tipo.setId(rs.getInt(1));
            tipo.setNombre(rs.getString(2));
            tipo.setVisible(rs.getBoolean(3));
        }
        rs.close();
        ps.close();
        conn.close();
        return tipo;
    }
    
    public ArrayList<TipoAdquisicion> extraerTodos() throws SQLException {
        usuarioControlador = new UsuarioControlador();
        
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM public.\"tipo_adquisicion\" order by id";
        ps = conn.prepareStatement(consultaSql);
        ps.execute();
        rs = ps.getResultSet();
        tipos = new ArrayList<>();
        while (rs.next()) {
            tipo = new TipoAdquisicion();
            tipo.setId(rs.getInt(1));
            tipo.setNombre(rs.getString(2));
            tipo.setVisible(rs.getBoolean(3));
            tipo.setUsuario(usuarioControlador.extraer(rs.getInt(4)));
            tipos.add(tipo);
        }
        rs.close();
        ps.close();
        conn.close();
        return tipos;
    }
    
    public ArrayList<TipoAdquisicion> extraerTodosVisible() throws SQLException {
        usuarioControlador = new UsuarioControlador();
        
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM public.\"tipo_adquisicion\" where visible = TRUE order by id";
        ps = conn.prepareStatement(consultaSql);
        ps.execute();
        rs = ps.getResultSet();
        tipos = new ArrayList<>();
        while (rs.next()) {
            tipo = new TipoAdquisicion();
            tipo.setId(rs.getInt(1));
            tipo.setNombre(rs.getString(2));
            tipo.setVisible(rs.getBoolean(3));
            tipos.add(tipo);
        }
        rs.close();
        ps.close();
        conn.close();
        return tipos;
    }
    
     public void insertar(TipoAdquisicion tipo) throws SQLException {
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea guardar?", "ATENCION!", JOptionPane.YES_NO_OPTION) == 0) {
            conn = ConexionDB.GetConnection();
            String consultaSql = "INSERT INTO public.\"tipo_adquisicion\" (nombre, visible, id_usuario)  VALUES (?,?,?)";
            ps = conn.prepareStatement(consultaSql);
            ps.setString(1, tipo.getNombre());
            ps.setBoolean(2, tipo.isVisible());
            ps.setInt(3, tipo.getUsuario().getId());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Insertado correctamente");
            ps.close();
            conn.close();
        }
    }
     
      public void modificar(TipoAdquisicion tipo) throws SQLException {
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea modificar?", "ATENCION!", JOptionPane.YES_NO_OPTION) == 0) {
            conn = ConexionDB.GetConnection();
            String consultaSql = "UPDATE public.\"tipo_adquisicion\" SET nombre=?, visible=?, id_usuario=? WHERE id=?";
            ps = conn.prepareStatement(consultaSql);
            ps.setString(1, tipo.getNombre());
            ps.setBoolean(2, tipo.isVisible());
            ps.setInt(3, tipo.getUsuario().getId());
            ps.setInt(4, tipo.getId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, tipo.toString() + " modificado correctamente");
            ps.close();
            conn.close();
        }
    }
      
      public void borrar(TipoAdquisicion tipo) throws SQLException {
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea eliminar?", "ATENCION!", JOptionPane.YES_NO_OPTION) == 0) {
            conn = ConexionDB.GetConnection();
            String consultaSql = "DELETE FROM public.\"tipo_adquisicion\" WHERE id=?";
            ps = conn.prepareStatement(consultaSql);
            ps.setInt(1, tipo.getId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, tipo.toString() + " eliminado correctamente");
            ps.close();
            conn.close();
        }
    }
}

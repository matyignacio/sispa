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
import objeto.AdquisicionMueble;


public class AdquisicionMuebleControlador {

    private AdquisicionMueble AdquisicionMueble;
    private ArrayList<AdquisicionMueble> adquisicionMuebles = new ArrayList<>();
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
    private MuebleControlador muebleControlador;
    private TipoAdquisicionControlador tipoAdquisicionControlador;
    private UsuarioControlador usuarioControlador;

    public AdquisicionMueble extraer(Integer id) throws SQLException {

        muebleControlador = new MuebleControlador();
        tipoAdquisicionControlador = new TipoAdquisicionControlador();
        usuarioControlador = new UsuarioControlador();

        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT id, nombre, visible, fecha, monto, id_mueble, id_tipo_adquisicion, "
                + "       id_usuario"
                + "  FROM \"Adquisicion_Muebles\"";
        ps = conn.prepareStatement(consultaSql);
        ps.setInt(1, id);
        ps.executeQuery();
        rs = ps.getResultSet();
        while (rs.next()) {
            AdquisicionMueble = new AdquisicionMueble();
            AdquisicionMueble.setId(rs.getInt(1));
            AdquisicionMueble.setNombre(rs.getString(2));
            AdquisicionMueble.setVisible(rs.getBoolean(3));
            AdquisicionMueble.setFecha(rs.getDate(4));
            AdquisicionMueble.setMonto(rs.getFloat(5));
            AdquisicionMueble.setMueble(muebleControlador.extraer(rs.getInt(6)));
            AdquisicionMueble.setTipoAdquisicion(tipoAdquisicionControlador.extraer(rs.getInt(7)));
            AdquisicionMueble.setUsuario(usuarioControlador.extraer(rs.getInt(8)));

        }
        rs.close();
        ps.close();
        conn.close();
        return AdquisicionMueble;
    }

    public ArrayList<AdquisicionMueble> extraerTodos() throws SQLException {
        muebleControlador = new MuebleControlador();
        tipoAdquisicionControlador = new TipoAdquisicionControlador();

        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM \"Adquisicion_Muebles\" order bye id";
        ps = conn.prepareStatement(consultaSql);
        ps.execute();
        rs = ps.getResultSet();
        adquisicionMuebles = new ArrayList<>();
        while (rs.next()) {
            AdquisicionMueble = new AdquisicionMueble();
            AdquisicionMueble = new AdquisicionMueble();
            AdquisicionMueble.setId(rs.getInt(1));
            AdquisicionMueble.setNombre(rs.getString(2));
            AdquisicionMueble.setVisible(rs.getBoolean(3));
            AdquisicionMueble.setFecha(rs.getDate(4));
            AdquisicionMueble.setMonto(rs.getFloat(5));
            AdquisicionMueble.setMueble(muebleControlador.extraer(rs.getInt(6)));
            AdquisicionMueble.setTipoAdquisicion(tipoAdquisicionControlador.extraer(rs.getInt(7)));

            adquisicionMuebles.add(AdquisicionMueble);
        }
        rs.close();
        ps.close();
        conn.close();
        return adquisicionMuebles;
    }

    public ArrayList<AdquisicionMueble> extraerTodosVisibles() throws SQLException {
        muebleControlador = new MuebleControlador();
        tipoAdquisicionControlador = new TipoAdquisicionControlador();

        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM \"Adquisicion_Muebles\" where visible = TRUE order by id";
        ps = conn.prepareStatement(consultaSql);
        ps.execute();
        rs = ps.getResultSet();
        adquisicionMuebles = new ArrayList<>();
        while (rs.next()) {
            AdquisicionMueble = new AdquisicionMueble();
            AdquisicionMueble = new AdquisicionMueble();
            AdquisicionMueble.setId(rs.getInt(1));
            AdquisicionMueble.setNombre(rs.getString(2));
            AdquisicionMueble.setVisible(rs.getBoolean(3));
            AdquisicionMueble.setFecha(rs.getDate(4));
            AdquisicionMueble.setMonto(rs.getFloat(5));
            AdquisicionMueble.setMueble(muebleControlador.extraer(rs.getInt(6)));
            AdquisicionMueble.setTipoAdquisicion(tipoAdquisicionControlador.extraer(rs.getInt(7)));

            adquisicionMuebles.add(AdquisicionMueble);
        }
        rs.close();
        ps.close();
        conn.close();
        return adquisicionMuebles;
    }

    public void insertar(AdquisicionMueble adquisicionmueble) throws SQLException {
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea guardar?", "ATENCION!", JOptionPane.YES_NO_OPTION) == 0) {
            conn = ConexionDB.GetConnection();
            String consultaSql = "INSERT INTO \"Adquisicion_Muebles\""
                    + "            (nombre, visible, fecha, monto, id_mueble, id_tipo_adquisicion,"
                    + "            id_usuario)"
                    + "    VALUES (?, ?, ?, ?, ?, ?,"
                    + "            ?)";
            ps = conn.prepareStatement(consultaSql);
            ps.setString(1, adquisicionmueble.getNombre());
            ps.setBoolean(2, adquisicionmueble.isVisible());
            ps.setDate(3, adquisicionmueble.getFecha());
            ps.setFloat(4, adquisicionmueble.getMonto());
            ps.setInt(5, adquisicionmueble.getMueble().getId());
            ps.setInt(6, adquisicionmueble.getTipoAdquisicion().getId());
            ps.setInt(7, adquisicionmueble.getUsuario().getId());

            ps.execute();
            JOptionPane.showMessageDialog(null, "Insertado correctamente");
            ps.close();
            conn.close();
        }
    }

    public void modificar(AdquisicionMueble adquisicionmueble) throws SQLException {
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea modificar?", "ATENCION!", JOptionPane.YES_NO_OPTION) == 0) {
            conn = ConexionDB.GetConnection();
            String consultaSql = "UPDATE \"Adquisicion_Muebles\"\n"
                    + "   SET id=?, nombre=?, visible=?, fecha=?, monto=?, id_mueble=?, id_tipo_adquisicion=?, \n"
                    + "       id_usuario=?\n"
                    + " WHERE id=?";
            ps = conn.prepareStatement(consultaSql);
            ps.setString(1, adquisicionmueble.getNombre());
            ps.setBoolean(2, adquisicionmueble.isVisible());
            ps.setDate(3, adquisicionmueble.getFecha());
            ps.setFloat(4, adquisicionmueble.getMonto());
            ps.setInt(5, adquisicionmueble.getMueble().getId());
            ps.setInt(6, adquisicionmueble.getTipoAdquisicion().getId());
            ps.setInt(7, adquisicionmueble.getUsuario().getId());
            ps.setInt(8, adquisicionmueble.getId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, adquisicionmueble.toString() + " modificado correctamente");
            ps.close();
            conn.close();
        }
    }
    
    public void borrar(AdquisicionMueble adquisicionmueble) throws SQLException {
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea eliminar?", "ATENCION!", JOptionPane.YES_NO_OPTION) == 0) {
            conn = ConexionDB.GetConnection();
            String consultaSql = "DELETE \"Adquisicion_Muebles\" WHERE id=?";
            ps = conn.prepareStatement(consultaSql);
            ps.setInt(1, adquisicionmueble.getId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, adquisicionmueble.toString() + " eliminado correctamente");
            ps.close();
            conn.close();
        }
    }
}

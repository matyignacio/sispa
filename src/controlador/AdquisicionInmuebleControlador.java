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
import objeto.AdquisicionInmueble;

public class AdquisicionInmuebleControlador {

    private AdquisicionInmueble adquisicionInmueble;
    private ArrayList<AdquisicionInmueble> adquisicionInmuebles = new ArrayList<>();
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
    private InmuebleControlador inmuebleControlador;
    private TipoAdquisicionControlador tipoAdquisicionControlador;
    private UsuarioControlador usuarioControlador;

    public AdquisicionInmueble extraer(Integer id) throws SQLException {

        inmuebleControlador = new InmuebleControlador();
        tipoAdquisicionControlador = new TipoAdquisicionControlador();
        usuarioControlador = new UsuarioControlador();

        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT id, nombre, visible, fecha, monto, id_inmueble, id_tipo_adquisicion,"
                + "       id_usuario"
                + "  FROM \"Adquisicion_Inmuebles\"";
        ps = conn.prepareStatement(consultaSql);
        ps.setInt(1, id);
        ps.executeQuery();
        rs = ps.getResultSet();
        while (rs.next()) {
            adquisicionInmueble = new AdquisicionInmueble();
            adquisicionInmueble.setId(rs.getInt(1));
            adquisicionInmueble.setNombre(rs.getString(2));
            adquisicionInmueble.setVisible(rs.getBoolean(3));
            adquisicionInmueble.setFecha(rs.getDate(4));
            adquisicionInmueble.setMonto(rs.getFloat(5));
            adquisicionInmueble.setInmueble(inmuebleControlador.extraer(rs.getInt(6)));
            adquisicionInmueble.setTipoAdquisicion(tipoAdquisicionControlador.extraer(rs.getInt(7)));
            adquisicionInmueble.setUsuario(usuarioControlador.extraer(rs.getInt(8)));
        }
        rs.close();
        ps.close();
        conn.close();
        return adquisicionInmueble;
    }

    public ArrayList<AdquisicionInmueble> extraerTodos() throws SQLException {
        inmuebleControlador = new InmuebleControlador();
        tipoAdquisicionControlador = new TipoAdquisicionControlador();

        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM \"Adquisicion_Inmuebles\" order bye nombre";
        ps = conn.prepareStatement(consultaSql);
        ps.execute();
        rs = ps.getResultSet();
        adquisicionInmuebles = new ArrayList<>();
        while (rs.next()) {
            adquisicionInmueble = new AdquisicionInmueble();
            adquisicionInmueble = new AdquisicionInmueble();
            adquisicionInmueble.setId(rs.getInt(1));
            adquisicionInmueble.setNombre(rs.getString(2));
            adquisicionInmueble.setVisible(rs.getBoolean(3));
            adquisicionInmueble.setFecha(rs.getDate(4));
            adquisicionInmueble.setMonto(rs.getFloat(5));
            adquisicionInmueble.setInmueble(inmuebleControlador.extraer(rs.getInt(6)));
            adquisicionInmueble.setTipoAdquisicion(tipoAdquisicionControlador.extraer(rs.getInt(7)));

            adquisicionInmuebles.add(adquisicionInmueble);
        }
        rs.close();
        ps.close();
        conn.close();
        return adquisicionInmuebles;
    }

    public ArrayList<AdquisicionInmueble> extraerTodosVisibles() throws SQLException {
        inmuebleControlador = new InmuebleControlador();
        tipoAdquisicionControlador = new TipoAdquisicionControlador();

        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM \"Adquisicion_Inmuebles\" where visible = TRUE order by nombre";
        ps = conn.prepareStatement(consultaSql);
        ps.execute();
        rs = ps.getResultSet();
        adquisicionInmuebles = new ArrayList<>();
        while (rs.next()) {
            adquisicionInmueble = new AdquisicionInmueble();
            adquisicionInmueble = new AdquisicionInmueble();
            adquisicionInmueble.setId(rs.getInt(1));
            adquisicionInmueble.setNombre(rs.getString(2));
            adquisicionInmueble.setVisible(rs.getBoolean(3));
            adquisicionInmueble.setFecha(rs.getDate(4));
            adquisicionInmueble.setMonto(rs.getFloat(5));
            adquisicionInmueble.setInmueble(inmuebleControlador.extraer(rs.getInt(6)));
            adquisicionInmueble.setTipoAdquisicion(tipoAdquisicionControlador.extraer(rs.getInt(7)));

            adquisicionInmuebles.add(adquisicionInmueble);
        }
        rs.close();
        ps.close();
        conn.close();
        return adquisicionInmuebles;
    }

    public void insertar(AdquisicionInmueble adquisicionInmueble) throws SQLException {
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea guardar?", "ATENCION!", JOptionPane.YES_NO_OPTION) == 0) {
            conn = ConexionDB.GetConnection();
            String consultaSql = "INSERT INTO \"Adquisicion_Inmuebles\""
                    + "            (nombre, visible, fecha, monto, id_inmueble, id_tipo_adquisicion, "
                    + "            id_usuario)"
                    + "    VALUES (?, ?, ?, ?, ?, ?, ?)";
            ps = conn.prepareStatement(consultaSql);
            ps.setString(1, adquisicionInmueble.getNombre());
            ps.setBoolean(2, adquisicionInmueble.isVisible());
            ps.setDate(3, adquisicionInmueble.getFecha());
            ps.setFloat(4, adquisicionInmueble.getMonto());
            ps.setInt(5, adquisicionInmueble.getInmueble().getId());
            ps.setInt(6, adquisicionInmueble.getTipoAdquisicion().getId());
            ps.setInt(7, adquisicionInmueble.getUsuario().getId());

            ps.execute();
            JOptionPane.showMessageDialog(null, "Insertado correctamente");
            ps.close();
            conn.close();
        }
    }

    public void modificar(AdquisicionInmueble adquisicionInmueble) throws SQLException {
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea modificar?", "ATENCION!", JOptionPane.YES_NO_OPTION) == 0) {
            conn = ConexionDB.GetConnection();
            String consultaSql = "UPDATE \"Adquisicion_Inmuebles\"\n"
                    + "   SET id=?, nombre=?, visible=?, fecha=?, monto=?, id_inmueble=?, id_tipo_adquisicion=?, \n"
                    + "       id_usuario=?\n"
                    + " WHERE id=?";
            ps = conn.prepareStatement(consultaSql);
            ps.setString(1, adquisicionInmueble.getNombre());
            ps.setBoolean(2, adquisicionInmueble.isVisible());
            ps.setDate(3, adquisicionInmueble.getFecha());
            ps.setFloat(4, adquisicionInmueble.getMonto());
            ps.setInt(5, adquisicionInmueble.getInmueble().getId());
            ps.setInt(6, adquisicionInmueble.getTipoAdquisicion().getId());
            ps.setInt(7, adquisicionInmueble.getUsuario().getId());
            ps.setInt(8, adquisicionInmueble.getId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, adquisicionInmueble.toString() + " modificado correctamente");
            ps.close();
            conn.close();
        }
    }

    public void borrar(AdquisicionInmueble adquisicionInmueble) throws SQLException {
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea eliminar?", "ATENCION!", JOptionPane.YES_NO_OPTION) == 0) {
            conn = ConexionDB.GetConnection();
            String consultaSql = "DELETE \"Adquisicion_Inmuebles\" WHERE id=?";
            ps = conn.prepareStatement(consultaSql);
            ps.setInt(1, adquisicionInmueble.getId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, adquisicionInmueble.toString() + " eliminado correctamente");
            ps.close();
            conn.close();
        }
    }
}

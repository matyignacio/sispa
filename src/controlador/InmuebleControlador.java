/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author Lucas
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import objeto.Inmueble;

/**
 *
 * @author Kuky
 */
public class InmuebleControlador {

    private Inmueble inmueble;
    private ArrayList<Inmueble> inmuebles = new ArrayList<>();
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
    CategoriaControlador categoriaControlador = new CategoriaControlador();
    ReparticionControlador reparticionControlador = new ReparticionControlador();
    TipoAdquisicionControlador tipoAdquisicionControlador = new TipoAdquisicionControlador();

    /**
     *
     * @param id
     * @return
     * @throws SQLException
     */
    public Inmueble extraer(Integer id) throws SQLException {
        categoriaControlador = new CategoriaControlador();
        reparticionControlador = new ReparticionControlador();
        tipoAdquisicionControlador = new TipoAdquisicionControlador();
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM inmuebles WHERE id=?";
        ps = conn.prepareStatement(consultaSql);
        ps.setInt(1, id);
        ps.executeQuery();
        rs = ps.getResultSet();
        while (rs.next()) {
            inmueble = new Inmueble();
            inmueble.setId(rs.getInt(1));
            inmueble.setNombre(rs.getString(2));
            inmueble.setVisible(rs.getBoolean(3));
            inmueble.setExpediente(rs.getString(4));
            inmueble.setCaracteristicas(rs.getString(5));
            inmueble.setObservaciones(rs.getString(6));
            inmueble.setDomicilio(rs.getString(7));
            inmueble.setTipo(rs.getString(8));
            inmueble.setValor(rs.getFloat(10));
            inmueble.setReparticion(reparticionControlador.extraer(rs.getInt(9)));
            inmueble.setTipoAdquisicion(tipoAdquisicionControlador.extraer(rs.getInt(12)));
        }
        rs.close();
        ps.close();
        conn.close();
        return inmueble;
    }

    /**
     *
     * @return @throws SQLException
     */
    public ArrayList<Inmueble> extraerTodos() throws SQLException {
        categoriaControlador = new CategoriaControlador();
        reparticionControlador = new ReparticionControlador();
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM inmuebles order by nombre";
        ps = conn.prepareStatement(consultaSql);
        ps.execute();
        rs = ps.getResultSet();
        inmuebles = new ArrayList<>();
        while (rs.next()) {
            inmueble = new Inmueble();
            inmueble = new Inmueble();
            inmueble.setId(rs.getInt(1));
            inmueble.setNombre(rs.getString(2));
            inmueble.setVisible(rs.getBoolean(3));
            inmueble.setExpediente(rs.getString(4));
            inmueble.setCaracteristicas(rs.getString(5));
            inmueble.setObservaciones(rs.getString(6));
            inmueble.setDomicilio(rs.getString(7));
            inmueble.setTipo(rs.getString(8));
            inmueble.setValor(rs.getFloat(10));
            inmueble.setReparticion(reparticionControlador.extraer(rs.getInt(9)));
            inmueble.setTipoAdquisicion(tipoAdquisicionControlador.extraer(rs.getInt(12)));
            inmuebles.add(inmueble);
        }
        rs.close();
        ps.close();
        conn.close();
        return inmuebles;
    }

    /**
     *
     * @return @throws SQLException
     */
    public ArrayList<Inmueble> extraerTodosVisibles() throws SQLException {
        categoriaControlador = new CategoriaControlador();
        reparticionControlador = new ReparticionControlador();
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM inmuebles where visible = TRUE order by nombre ";
        ps = conn.prepareStatement(consultaSql);
        ps.execute();
        rs = ps.getResultSet();
        inmuebles = new ArrayList<>();
        while (rs.next()) {
            inmueble = new Inmueble();
            inmueble = new Inmueble();
            inmueble.setId(rs.getInt(1));
            inmueble.setNombre(rs.getString(2));
            inmueble.setVisible(rs.getBoolean(3));
            inmueble.setExpediente(rs.getString(4));
            inmueble.setCaracteristicas(rs.getString(5));
            inmueble.setObservaciones(rs.getString(6));
            inmueble.setDomicilio(rs.getString(7));
            inmueble.setTipo(rs.getString(8));
            inmueble.setValor(rs.getFloat(10));
            inmueble.setReparticion(reparticionControlador.extraer(rs.getInt(9)));
            inmueble.setTipoAdquisicion(tipoAdquisicionControlador.extraer(rs.getInt(12)));
            inmuebles.add(inmueble);
        }
        rs.close();
        ps.close();
        conn.close();
        return inmuebles;
    }

    /**
     *
     * @param inmueble
     * @throws SQLException
     */
    public void insertar(Inmueble inmueble) throws SQLException {
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea guardar?", "ATENCION!", JOptionPane.YES_NO_OPTION) == 0) {
            conn = ConexionDB.GetConnection();
            String consultaSql = "INSERT INTO inmuebles (nombre, visible, expediente, caracteristica, observaciones, \n"
                    + "            domicilio, tipo, id_reparticion, valor, id_tipo_adquisicion)\n"
                    + "    VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
            ps = conn.prepareStatement(consultaSql);
            ps.setString(1, inmueble.getNombre());
            ps.setBoolean(2, inmueble.isVisible());
            ps.setString(3, inmueble.getExpediente());
            ps.setString(4, inmueble.getCaracteristicas());
            ps.setString(5, inmueble.getObservaciones());
            ps.setString(6, inmueble.getDomicilio());
            ps.setString(7, inmueble.getTipo());
            ps.setInt(8, inmueble.getReparticion().getId());
            ps.setFloat(9, inmueble.getValor());
            ps.setInt(10, inmueble.getTipoAdquisicion().getId());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Insertado correctamente");
            ps.close();
            conn.close();
        }
    }

    /**
     *
     * @param inmueble
     * @throws SQLException
     */
    public void modificar(Inmueble inmueble) throws SQLException {
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea modificar?", "ATENCION!", JOptionPane.YES_NO_OPTION) == 0) {
            conn = ConexionDB.GetConnection();
            String consultaSql = "UPDATE inmuebles"
                    + "   SET nombre=?, visible=?, expediente=?, caracteristica=?, observaciones=?, "
                    + "       domicilio=?, tipo=?, id_reparticion=?, valor=?, id_tipo_adquisicion=? "
                    + " WHERE id=?";
            ps = conn.prepareStatement(consultaSql);
            ps.setString(1, inmueble.getNombre());
            ps.setBoolean(2, inmueble.isVisible());
            ps.setString(3, inmueble.getExpediente());
            ps.setString(4, inmueble.getCaracteristicas());
            ps.setString(5, inmueble.getObservaciones());
            ps.setString(6, inmueble.getDomicilio());
            ps.setString(7, inmueble.getTipo());
            ps.setInt(8, inmueble.getReparticion().getId());
            ps.setFloat(9, inmueble.getValor());
            ps.setInt(10, inmueble.getTipoAdquisicion().getId());
            ps.setInt(11, inmueble.getId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, inmueble.toString() + " modificado correctamente");
            ps.close();
            conn.close();
        }
    }

    /**
     *
     * @param inmueble
     * @throws SQLException
     */
    public void borrar(Inmueble inmueble) throws SQLException {
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea eliminar?", "ATENCION!", JOptionPane.YES_NO_OPTION) == 0) {
            try {
                conn = ConexionDB.GetConnection();
                String consultaSql = "DELETE FROM inmuebles WHERE id=?";
                ps = conn.prepareStatement(consultaSql);
                ps.setInt(1, inmueble.getId());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, inmueble.toString() + " eliminado correctamente");
                ps.close();
                conn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex, "No se pudo eliminar " + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}

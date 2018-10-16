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
import java.util.Calendar;
import javax.swing.JOptionPane;
import objeto.MuebleMantenible;
import ui.Login;

/**
 *
 * @author Kuky
 */
public class MuebleMantenibleControlador {

    private MuebleMantenible muebleMantenible;
    private ArrayList<MuebleMantenible> mueblesMatenibles = new ArrayList<>();
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
    CategoriaControlador categoriaControlador = new CategoriaControlador();
    EstadoControlador estadoControlador = new EstadoControlador();
    ModeloControlador modeloControlador = new ModeloControlador();
    ReparticionControlador reparticionControlador = new ReparticionControlador();
    TipoAdquisicionControlador tipoAdquisicionControlador = new TipoAdquisicionControlador();

    /**
     *
     * @param id
     * @return
     * @throws SQLException
     */
    public MuebleMantenible extraer(Integer id) throws SQLException {
        categoriaControlador = new CategoriaControlador();
        estadoControlador = new EstadoControlador();
        modeloControlador = new ModeloControlador();
        reparticionControlador = new ReparticionControlador();

        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM muebles WHERE id=? AND mantenible=1";
        ps = conn.prepareStatement(consultaSql);
        ps.setInt(1, id);
        ps.executeQuery();
        rs = ps.getResultSet();
        while (rs.next()) {
            muebleMantenible = new MuebleMantenible();
            muebleMantenible.setId(rs.getInt(1));
            muebleMantenible.setNombre(rs.getString(2));
            muebleMantenible.setVisible(rs.getBoolean(3));
            muebleMantenible.setExpediente(rs.getString(4));
            muebleMantenible.setCaracteristicas(rs.getString(5));
            muebleMantenible.setObservaciones(rs.getString(6));
            muebleMantenible.setDominio(rs.getString(7));
            muebleMantenible.setChasis(rs.getString(8));
            muebleMantenible.setCategoria(categoriaControlador.extraer(rs.getInt(9)));
            muebleMantenible.setEstado(estadoControlador.extraer(rs.getInt(10)));
            muebleMantenible.setModelo(modeloControlador.extraer(rs.getInt(11)));
            muebleMantenible.setReparticion(reparticionControlador.extraer(rs.getInt(12)));
            muebleMantenible.setFecha(rs.getTimestamp(14));
            muebleMantenible.setCantidad(rs.getInt(15));
            muebleMantenible.setValor(rs.getFloat(16));
            muebleMantenible.setTipoAdquisicion(tipoAdquisicionControlador.extraer(rs.getInt(17)));

        }
        rs.close();
        ps.close();
        conn.close();
        return muebleMantenible;
    }

    /**
     *
     * @param nombre
     * @param expediente
     * @param dominio
     * @param chasis
     * @param modelo
     * @return
     * @throws SQLException
     */
    public MuebleMantenible extraerDeTabla(String nombre, String expediente, String dominio,
            String chasis, Integer modelo) throws SQLException {
        categoriaControlador = new CategoriaControlador();
        estadoControlador = new EstadoControlador();
        modeloControlador = new ModeloControlador();
        reparticionControlador = new ReparticionControlador();

        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM muebles WHERE nombre=? AND expediente=? AND dominio=? "
                + "AND chasis=? AND id_modelo=? AND mantenible=1";
        ps = conn.prepareStatement(consultaSql);
        ps.setString(1, nombre);
        ps.setString(2, expediente);
        ps.setString(3, dominio);
        ps.setString(4, chasis);
        ps.setInt(5, modelo);
        ps.executeQuery();
        rs = ps.getResultSet();
        while (rs.next()) {
            muebleMantenible = new MuebleMantenible();
            muebleMantenible.setId(rs.getInt(1));
            muebleMantenible.setNombre(rs.getString(2));
            muebleMantenible.setVisible(rs.getBoolean(3));
            muebleMantenible.setExpediente(rs.getString(4));
            muebleMantenible.setCaracteristicas(rs.getString(5));
            muebleMantenible.setObservaciones(rs.getString(6));
            muebleMantenible.setDominio(rs.getString(7));
            muebleMantenible.setChasis(rs.getString(8));
            muebleMantenible.setCategoria(categoriaControlador.extraer(rs.getInt(9)));
            muebleMantenible.setEstado(estadoControlador.extraer(rs.getInt(10)));
            muebleMantenible.setModelo(modeloControlador.extraer(rs.getInt(11)));
            muebleMantenible.setReparticion(reparticionControlador.extraer(rs.getInt(12)));
            muebleMantenible.setFecha(rs.getTimestamp(14));
            muebleMantenible.setTipoAdquisicion(tipoAdquisicionControlador.extraer(rs.getInt(17)));

        }
        rs.close();
        ps.close();
        conn.close();
        return muebleMantenible;
    }

    /**
     *
     * @return @throws SQLException
     */
    public ArrayList<MuebleMantenible> extraerTodos() throws SQLException {
        categoriaControlador = new CategoriaControlador();
        estadoControlador = new EstadoControlador();
        modeloControlador = new ModeloControlador();
        reparticionControlador = new ReparticionControlador();
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM muebles WHERE mantenible=1 AND id_reparticion=? order by nombre";
        ps = conn.prepareStatement(consultaSql);
        ps.setInt(1, Login.usuario.getReparticion().getId());
        ps.execute();
        rs = ps.getResultSet();
        mueblesMatenibles = new ArrayList<>();
        while (rs.next()) {
            muebleMantenible = new MuebleMantenible();
            muebleMantenible.setId(rs.getInt(1));
            muebleMantenible.setNombre(rs.getString(2));
            muebleMantenible.setVisible(rs.getBoolean(3));
            muebleMantenible.setExpediente(rs.getString(4));
            muebleMantenible.setCaracteristicas(rs.getString(5));
            muebleMantenible.setObservaciones(rs.getString(6));
            muebleMantenible.setDominio(rs.getString(7));
            muebleMantenible.setChasis(rs.getString(8));
            muebleMantenible.setCategoria(categoriaControlador.extraer(rs.getInt(9)));
            muebleMantenible.setEstado(estadoControlador.extraer(rs.getInt(10)));
            muebleMantenible.setModelo(modeloControlador.extraer(rs.getInt(11)));
            muebleMantenible.setReparticion(reparticionControlador.extraer(rs.getInt(12)));
            muebleMantenible.setCantidad(rs.getInt(15));
            muebleMantenible.setValor(rs.getFloat(16));
            muebleMantenible.setTipoAdquisicion(tipoAdquisicionControlador.extraer(rs.getInt(17)));
            mueblesMatenibles.add(muebleMantenible);
        }
        rs.close();
        ps.close();
        conn.close();
        return mueblesMatenibles;
    }

    /**
     *
     * @return @throws SQLException
     */
    public ArrayList<MuebleMantenible> extraerTodosVisibles() throws SQLException {
        conn = ConexionDB.GetConnection();
        String consultaSql = "SELECT * FROM muebles where visible = TRUE AND mantenible=1 AND id_reparticion=? order by nombre";
        ps = conn.prepareStatement(consultaSql);
        ps.setInt(1, Login.usuario.getReparticion().getId());
        ps.execute();
        rs = ps.getResultSet();
        mueblesMatenibles = new ArrayList<>();
        while (rs.next()) {
            muebleMantenible = new MuebleMantenible();
            muebleMantenible.setId(rs.getInt(1));
            muebleMantenible.setNombre(rs.getString(2));
            muebleMantenible.setVisible(rs.getBoolean(3));
            muebleMantenible.setExpediente(rs.getString(4));
            muebleMantenible.setCaracteristicas(rs.getString(5));
            muebleMantenible.setObservaciones(rs.getString(6));
            muebleMantenible.setDominio(rs.getString(7));
            muebleMantenible.setChasis(rs.getString(8));
            muebleMantenible.setCategoria(categoriaControlador.extraer(rs.getInt(9)));
            muebleMantenible.setEstado(estadoControlador.extraer(rs.getInt(10)));
            muebleMantenible.setModelo(modeloControlador.extraer(rs.getInt(11)));
            muebleMantenible.setReparticion(reparticionControlador.extraer(rs.getInt(12)));
            muebleMantenible.setFecha(rs.getTimestamp(14));
            muebleMantenible.setCantidad(rs.getInt(15));
            muebleMantenible.setValor(rs.getFloat(16));
            muebleMantenible.setTipoAdquisicion(tipoAdquisicionControlador.extraer(rs.getInt(17)));
            mueblesMatenibles.add(muebleMantenible);
        }
        rs.close();
        ps.close();
        conn.close();
        return mueblesMatenibles;
    }

    /**
     *
     * @param muebleMantenible
     * @throws SQLException
     */
    public void insertar(MuebleMantenible muebleMantenible) throws SQLException {
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea guardar?", "ATENCION!", JOptionPane.YES_NO_OPTION) == 0) {
            conn = ConexionDB.GetConnection();
            String consultaSql = "INSERT INTO muebles ( nombre, visible, expediente, caracteristica, observaciones,dominio,chasis,"
                    + "id_categoria, id_estado, id_modelo, id_reparticion, mantenible, cantidad, valor, id_tipo_adquisicion)"
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            ps = conn.prepareStatement(consultaSql);
            ps.setString(1, muebleMantenible.getNombre());
            ps.setBoolean(2, muebleMantenible.isVisible());
            ps.setString(3, muebleMantenible.getExpediente());
            ps.setString(4, muebleMantenible.getCaracteristicas());
            ps.setString(5, muebleMantenible.getObservaciones());
            ps.setString(6, muebleMantenible.getDominio());
            ps.setString(7, muebleMantenible.getChasis());
            ps.setInt(8, muebleMantenible.getCategoria().getId());
            ps.setInt(9, muebleMantenible.getEstado().getId());
            ps.setInt(10, muebleMantenible.getModelo().getId());
            ps.setInt(11, muebleMantenible.getReparticion().getId());
            ps.setInt(12, util.Util.MUEBLE_MANTENIBLE);
            ps.setInt(13, muebleMantenible.getCantidad());
            ps.setFloat(14, muebleMantenible.getValor());
            ps.setInt(15, muebleMantenible.getTipoAdquisicion().getId());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Insertado correctamente");
            ps.close();
            conn.close();
        }
    }

    /**
     *
     * @param muebleMantenible
     * @throws SQLException
     */
    public void modificar(MuebleMantenible muebleMantenible) throws SQLException {
        java.sql.Timestamp currentTimestamp = new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());
//        JOptionPane.showMessageDialog(null, (java.sql.Date) now);
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea modificar?", "ATENCION!", JOptionPane.YES_NO_OPTION) == 0) {
            conn = ConexionDB.GetConnection();
            String consultaSql = "UPDATE muebles SET nombre=?, visible=?, expediente=?, caracteristica=?, observaciones=?, dominio=?, chasis=?, id_categoria=?,"
                    + "id_estado=?, id_modelo=?, id_reparticion=?, mantenible=?, fecha=?, cantidad=?, valor=?, id_tipo_adquisicion=? WHERE id=?";
            ps = conn.prepareStatement(consultaSql);
            ps.setString(1, muebleMantenible.getNombre());
            ps.setBoolean(2, muebleMantenible.isVisible());
            ps.setString(3, muebleMantenible.getExpediente());
            ps.setString(4, muebleMantenible.getCaracteristicas());
            ps.setString(5, muebleMantenible.getObservaciones());
            ps.setString(6, muebleMantenible.getDominio());
            ps.setString(7, muebleMantenible.getChasis());
            ps.setInt(8, muebleMantenible.getCategoria().getId());
            ps.setInt(9, muebleMantenible.getEstado().getId());
            ps.setInt(10, muebleMantenible.getModelo().getId());
            ps.setInt(11, muebleMantenible.getReparticion().getId());
            ps.setInt(12, util.Util.MUEBLE_MANTENIBLE);
            ps.setTimestamp(13, currentTimestamp);
            ps.setInt(14, muebleMantenible.getCantidad());
            ps.setFloat(15, muebleMantenible.getValor());
            ps.setInt(16, muebleMantenible.getTipoAdquisicion().getId());
            ps.setInt(17, muebleMantenible.getId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, muebleMantenible.toString() + " modificado correctamente");
            ps.close();
            conn.close();
        }
    }

    /**
     *
     * @param muebleMantenible
     * @throws SQLException
     */
    public void borrar(MuebleMantenible muebleMantenible) throws SQLException {
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea eliminar?", "ATENCION!", JOptionPane.YES_NO_OPTION) == 0) {
            try {
                conn = ConexionDB.GetConnection();
                String consultaSql = "DELETE FROM muebles WHERE id=?";
                ps = conn.prepareStatement(consultaSql);
                ps.setInt(1, muebleMantenible.getId());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, muebleMantenible.toString() + " eliminado correctamente");
                ps.close();
                conn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex, "No se pudo eliminar " + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    /**
     *
     * @param reparticion
     * @return
     * @throws SQLException
     */
    public ArrayList<MuebleMantenible> necesitaMantenimiento(int reparticion) throws SQLException {
        ArrayList<MuebleMantenible> autos = new ArrayList<>();
        try {
            conn = ConexionDB.GetConnection();
            //String consultaSql = "SELECT nombre,dominio,expediente FROM sispa.muebles \n"
            String consultaSql = "SELECT * FROM muebles "
                    + "WHERE mantenible = 1 "
                    + "AND id_reparticion = ? "
                    + "AND (CURRENT_TIMESTAMP - fecha)> 10000500000";//ESTO ES EQUIVALENTE A UN AÑO
            ps = conn.prepareStatement(consultaSql);
            ps.setInt(1, reparticion);
            ps.execute();
            rs = ps.getResultSet();
            while (rs.next()) {
                muebleMantenible = new MuebleMantenible();
                muebleMantenible.setId(rs.getInt(1));
                muebleMantenible.setNombre(rs.getString(2));
                muebleMantenible.setVisible(rs.getBoolean(3));
                muebleMantenible.setExpediente(rs.getString(4));
                muebleMantenible.setCaracteristicas(rs.getString(5));
                muebleMantenible.setObservaciones(rs.getString(6));
                muebleMantenible.setDominio(rs.getString(7));
                muebleMantenible.setChasis(rs.getString(8));
                muebleMantenible.setCategoria(categoriaControlador.extraer(rs.getInt(9)));
                muebleMantenible.setEstado(estadoControlador.extraer(rs.getInt(10)));
                muebleMantenible.setModelo(modeloControlador.extraer(rs.getInt(11)));
                muebleMantenible.setReparticion(reparticionControlador.extraer(rs.getInt(12)));
                muebleMantenible.setCantidad(rs.getInt(15));
                muebleMantenible.setValor(rs.getFloat(16));
                muebleMantenible.setTipoAdquisicion(tipoAdquisicionControlador.extraer(rs.getInt(17)));
                mueblesMatenibles.add(muebleMantenible);
                autos.add(muebleMantenible);
            }
            ps.close();
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error necesitaMantenimiento" + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
        }
        return autos;
    }
}

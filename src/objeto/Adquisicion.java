/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objeto;

import java.sql.Date;

/**
 *
 * @author Kuky
 */
public class Adquisicion extends ObjetoBase {

    private Date fecha;
    private float monto;
    private TipoAdquisicion tipoAdquisicion;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public TipoAdquisicion getTipoAdquisicion() {
        return tipoAdquisicion;
    }

    public void setTipoAdquisicion(TipoAdquisicion tipoAdquisicion) {
        this.tipoAdquisicion = tipoAdquisicion;
    }

}

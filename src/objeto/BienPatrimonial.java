/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objeto;

/**
 *
 * @author Kuky
 */
public class BienPatrimonial extends ObjetoBase {

    private String expediente;
    private String caracteristicas;
    private String observaciones;
    private Reparticion reparticion;
    private TipoAdquisicion tipoAdquisicion;
    private float valor;

    /**
     *
     * @return
     */
    public float getValor() {
        return valor;
    }

    /**
     *
     * @param valor
     */
    public void setValor(float valor) {
        this.valor = valor;
    }

    /**
     *
     * @return
     */
    public String getExpediente() {
        return expediente;
    }

    /**
     *
     * @param expediente
     */
    public void setExpediente(String expediente) {
        this.expediente = expediente;
    }

    /**
     *
     * @return
     */
    public String getCaracteristicas() {
        return caracteristicas;
    }

    /**
     *
     * @param caracteristicas
     */
    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    /**
     *
     * @return
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     *
     * @param observaciones
     */
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    /**
     *
     * @return
     */
    public Reparticion getReparticion() {
        return reparticion;
    }

    /**
     *
     * @param reparticion
     */
    public void setReparticion(Reparticion reparticion) {
        this.reparticion = reparticion;
    }

    /**
     *
     * @return
     */
    public TipoAdquisicion getTipoAdquisicion() {
        return tipoAdquisicion;
    }

    /**
     *
     * @param tipoAdquisicion
     */
    public void setTipoAdquisicion(TipoAdquisicion tipoAdquisicion) {
        this.tipoAdquisicion = tipoAdquisicion;
    }

}

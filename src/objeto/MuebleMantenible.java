/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objeto;

import java.sql.Timestamp;

/**
 *
 * @author Kuky
 */
public class MuebleMantenible extends Mueble {

    private String dominio;
    private String chasis;
    private Timestamp fecha;

    /**
     *
     * @return
     */
    public Timestamp getFecha() {
        return fecha;
    }

    /**
     *
     * @param fecha
     */
    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    /**
     *
     * @return
     */
    public String getDominio() {
        return dominio;
    }

    /**
     *
     * @param dominio
     */
    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    /**
     *
     * @return
     */
    public String getChasis() {
        return chasis;
    }

    /**
     *
     * @param chasis
     */
    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

}

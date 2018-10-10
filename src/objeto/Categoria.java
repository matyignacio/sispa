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
public class Categoria extends ObjetoBase {

    private Inciso inciso;
    private CodigoPresupuestario codigoPresupuestaro;

    /**
     *
     * @return
     */
    public Inciso getInciso() {
        return inciso;
    }

    /**
     *
     * @param inciso
     */
    public void setInciso(Inciso inciso) {
        this.inciso = inciso;
    }

    /**
     *
     * @return
     */
    public CodigoPresupuestario getCodigoPresupuestario() {
        return codigoPresupuestaro;
    }

    /**
     *
     * @param codigoPresupuestaro
     */
    public void setCodigoPresupuestaro(CodigoPresupuestario codigoPresupuestaro) {
        this.codigoPresupuestaro = codigoPresupuestaro;
    }

}

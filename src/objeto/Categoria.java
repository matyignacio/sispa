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
    private CodigoPresupuestaro codigoPresupuestaro;

    public Inciso getInciso() {
        return inciso;
    }

    public void setInciso(Inciso inciso) {
        this.inciso = inciso;
    }

    public CodigoPresupuestaro getCodigoPresupuestaro() {
        return codigoPresupuestaro;
    }

    public void setCodigoPresupuestaro(CodigoPresupuestaro codigoPresupuestaro) {
        this.codigoPresupuestaro = codigoPresupuestaro;
    }

}

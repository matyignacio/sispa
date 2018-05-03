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

    public Inciso getInciso() {
        return inciso;
    }

    public void setInciso(Inciso inciso) {
        this.inciso = inciso;
    }

    public CodigoPresupuestario getCodigoPresupuestaro() {
        return codigoPresupuestaro;
    }

    public void setCodigoPresupuestaro(CodigoPresupuestario codigoPresupuestaro) {
        this.codigoPresupuestaro = codigoPresupuestaro;
    }

    @Override
    public String toString() {
        return this.getNombre();
    }

}

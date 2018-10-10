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
public class Modelo extends ObjetoBase {

    private Marca marca;
    private int año;

    /**
     *
     * @return
     */
    public Marca getMarca() {
        return marca;
    }

    /**
     *
     * @param marca
     */
    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    /**
     *
     * @return
     */
    public int getAño() {
        return año;
    }

    /**
     *
     * @param año
     */
    public void setAño(int año) {
        this.año = año;
    }
}

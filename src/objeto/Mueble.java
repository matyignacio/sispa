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
public class Mueble extends BienPatrimonial {

    private Estado estado;
    private Categoria categoria;
    private Modelo modelo;
    private int cantidad;

    /**
     *
     * @return
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     *
     * @param cantidad
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     *
     * @return
     */
    public Estado getEstado() {
        return estado;
    }

    /**
     *
     * @param estado
     */
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    /**
     *
     * @return
     */
    public Categoria getCategoria() {
        return categoria;
    }

    /**
     *
     * @param categoria
     */
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    /**
     *
     * @return
     */
    public Modelo getModelo() {
        return modelo;
    }

    /**
     *
     * @param modelo
     */
    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

}

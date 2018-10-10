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
public class Inmueble extends BienPatrimonial {

    private String domicilio;
    private String tipo;

    /**
     *
     * @return
     */
    public String getTipo() {
        return tipo;
    }

    /**
     *
     * @param tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     *
     * @return
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     *
     * @param domicilio
     */
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

}

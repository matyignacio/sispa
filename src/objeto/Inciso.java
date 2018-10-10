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
public class Inciso {

    private int id;
    private int numero;
    private int principal;
    private int parcial;
    private boolean visible;

    /**
     *
     * @return
     */
    public boolean isVisible() {
        return visible;
    }

    /**
     *
     * @param visible
     */
    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public int getNumero() {
        return numero;
    }

    /**
     *
     * @param numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     *
     * @return
     */
    public int getPrincipal() {
        return principal;
    }

    /**
     *
     * @param principal
     */
    public void setPrincipal(int principal) {
        this.principal = principal;
    }

    /**
     *
     * @return
     */
    public int getParcial() {
        return parcial;
    }

    /**
     *
     * @param parcial
     */
    public void setParcial(int parcial) {
        this.parcial = parcial;
    }

    @Override
    public String toString() {
        return String.valueOf(this.getNumero());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Inciso other = (Inciso) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }

}

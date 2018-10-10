/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objeto;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Kuky
 */
public class Reparticion {

    private int id;
    private String nombre;
    private String localidad;
    private String departamento;
    private String domicilio;
    private ArrayList<Usuario> usuarios;
    private Reparticion reparticionSuperior;
    private boolean visible;

    /**
     *
     */
    public Reparticion() {
    }

    /**
     *
     * @param id
     * @param nombre
     * @param reparticionSuperior
     * @param visible
     */
    public Reparticion(int id, String nombre, Reparticion reparticionSuperior, boolean visible) {
        // HAGO ESTE CONSTRUCTOR PARA PODER CREAR LA REPARTICION "CERO" EN EL COMBOBOX
        this.id = id;
        this.nombre = nombre;
        this.reparticionSuperior = reparticionSuperior;
        this.visible = visible;
    }

    /**
     *
     * @param id
     */
    public Reparticion(int id) {
        // ESTE CONSTRUCTOR LO HAGO EN EL ELSE DE LOS EXTRAERTODOS
        this.id = id;
    }

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
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public String getLocalidad() {
        return localidad;
    }

    /**
     *
     * @param localidad
     */
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    /**
     *
     * @return
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     *
     * @param departamento
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
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

    /**
     *
     * @return
     */
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    /**
     *
     * @param usuarios
     */
    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    /**
     *
     * @return
     */
    public Reparticion getReparticionSuperior() {
        return reparticionSuperior;
    }

    /**
     *
     * @param reparticionSuperior
     */
    public void setReparticionSuperior(Reparticion reparticionSuperior) {
        this.reparticionSuperior = reparticionSuperior;
    }

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Reparticion other = (Reparticion) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

}

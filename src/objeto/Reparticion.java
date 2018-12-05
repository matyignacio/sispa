/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objeto;

import java.util.ArrayList;

/**
 *
 * @author Kuky
 */
public class Reparticion extends ObjetoBase{

    private String localidad;
    private String departamento;
    private String domicilio;
    private ArrayList<Usuario> usuarios;
    private Reparticion reparticionSuperior;

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

}

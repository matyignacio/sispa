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
public class Reparticion {

    private int id;
    private String nombre;
    private String localidad;
    private String departamento;
    private String domicilio;
    private ArrayList<Usuario> usuarios;
    private Reparticion reparticionSuperior;
    private boolean visible;

    public Reparticion() {
    }

    public Reparticion(int id, String nombre, Reparticion reparticionSuperior, boolean visible) {
        // HAGO ESTE CONSTRUCTOR PARA PODER CREAR LA REPARTICION "CERO" EN EL COMBOBOX
        this.id = id;
        this.nombre = nombre;
        this.reparticionSuperior = reparticionSuperior;
        this.visible = visible;
    }

    public Reparticion(int id) {
        // ESTE CONSTRUCTOR LO HAGO EN EL ELSE DE LOS EXTRAERTODOS
        this.id = id;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public Reparticion getReparticionSuperior() {
        return reparticionSuperior;
    }

    public void setReparticionSuperior(Reparticion reparticionSuperior) {
        this.reparticionSuperior = reparticionSuperior;
    }

}

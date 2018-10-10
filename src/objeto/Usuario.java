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
public class Usuario extends ObjetoBase {

    private String mail;
    private String clave;
    private Perfil perfil;
    private Reparticion reparticion;

    /**
     *
     * @return
     */
    public Reparticion getReparticion() {
        return reparticion;
    }

    /**
     *
     * @param reparticion
     */
    public void setReparticion(Reparticion reparticion) {
        this.reparticion = reparticion;
    }

    /**
     *
     * @return
     */
    public String getMail() {
        return mail;
    }

    /**
     *
     * @param mail
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     *
     * @return
     */
    public String getClave() {
        return clave;
    }

    /**
     *
     * @param clave
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     *
     * @return
     */
    public Perfil getPerfil() {
        return perfil;
    }

    /**
     *
     * @param perfil
     */
    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

}

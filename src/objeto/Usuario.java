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

    public Reparticion getReparticion() {
        return reparticion;
    }

    public void setReparticion(Reparticion reparticion) {
        this.reparticion = reparticion;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

}

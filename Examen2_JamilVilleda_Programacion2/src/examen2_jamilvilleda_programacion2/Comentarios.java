/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_jamilvilleda_programacion2;

import java.util.Date;

/**
 *
 * @author Jamil
 */
public class Comentarios extends Publicaciones {

    private String contenido;

    public Comentarios(String contenido, String ID, String mensaje, Usuarios user, String privacidad, Date fecha) {
        super(ID, mensaje, user, privacidad, fecha);
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "comentarios{" + contenido + "}";
    }

}

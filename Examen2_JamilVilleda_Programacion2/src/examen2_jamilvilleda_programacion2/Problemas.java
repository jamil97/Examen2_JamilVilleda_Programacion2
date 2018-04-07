/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_jamilvilleda_programacion2;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Jamil
 */
public class Problemas extends Publicaciones {

    private ArrayList<Respuestas> respuesta = new ArrayList();
    private String estado;
    private int categoria;

    public Problemas(String estado, int categoria, String ID, String mensaje, Usuarios user, String privacidad, Date fecha) {
        super(ID, mensaje, user, privacidad, fecha);
        this.estado = estado;
        this.categoria = categoria;
    }

    public ArrayList<Respuestas> getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(ArrayList<Respuestas> respuesta) {
        this.respuesta = respuesta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Problemas{" + "respuesta=" + respuesta + ", estado=" + estado + ", categoria=" + categoria + '}';
    }

}

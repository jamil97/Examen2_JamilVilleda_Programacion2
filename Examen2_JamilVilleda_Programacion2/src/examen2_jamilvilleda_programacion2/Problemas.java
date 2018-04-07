/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_jamilvilleda_programacion2;

import java.util.ArrayList;

/**
 *
 * @author Jamil
 */
public class Problemas {

    private ArrayList<Respuestas> respuesta = new ArrayList();
    private boolean estado;
    private String categoria;

    public Problemas(boolean estado, String categoria) {
        this.estado = estado;
        this.categoria = categoria;
    }
    

    public ArrayList<Respuestas> getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(ArrayList<Respuestas> respuesta) {
        this.respuesta = respuesta;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Problemas{" + "respuesta=" + respuesta + ", estado=" + estado + ", categoria=" + categoria + '}';
    }

}

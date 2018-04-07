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
public class Respuestas {

    private ArrayList<Integer> calificaciones = new ArrayList();
    private int calificacionGeneral;
    private ArrayList<Comentarios> comentarios = new ArrayList();

    public Respuestas(int calificacionGeneral) {
        this.calificacionGeneral = calificacionGeneral;
    }

    public ArrayList<Integer> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(ArrayList<Integer> calificaciones) {
        this.calificaciones = calificaciones;
    }

    public int getCalificacionGeneral() {
        return calificacionGeneral;
    }

    public void setCalificacionGeneral(int calificacionGeneral) {
        this.calificacionGeneral = calificacionGeneral;
    }

    public ArrayList<Comentarios> getComentarios() {
        return comentarios;
    }

    public void setComentarios(ArrayList<Comentarios> comentarios) {
        this.comentarios = comentarios;
    }

}

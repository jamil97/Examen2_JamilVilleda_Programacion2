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
public class Respuestas extends Publicaciones{

    private ArrayList calificaciones = new ArrayList();
    private int calificacionGeneral;
    private ArrayList comentarios = new ArrayList();

   public Respuestas(int calificacion_general, String ID, String mensaje, Usuarios user, String privacidad, Date fecha) {
        super(ID, mensaje, user, privacidad, fecha);
        this.calificacionGeneral = calificacion_general;
    }

    public ArrayList getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(ArrayList calificaciones) {
        this.calificaciones = calificaciones;
    }

    public int getCalificacionGeneral() {
        return calificacionGeneral;
    }

    public void setCalificacionGeneral(int calificacionGeneral) {
        this.calificacionGeneral = calificacionGeneral;
    }

    public ArrayList getComentarios() {
        return comentarios;
    }

    public void setComentarios(ArrayList comentarios) {
        this.comentarios = comentarios;
    }
   
   

    
    

}

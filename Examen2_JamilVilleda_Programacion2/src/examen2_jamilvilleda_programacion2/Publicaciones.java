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
public class Publicaciones {
    
    private int ID;
    private String mensaje;
    private Usuarios user;
    private String privacidad;
    private Date fecha;

    public Publicaciones(int ID, String mensaje, Usuarios user, String privacidad, Date fecha) {
        this.ID = ID;
        this.mensaje = mensaje;
        this.user = user;
        this.privacidad = privacidad;
        this.fecha = fecha;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Usuarios getUser() {
        return user;
    }

    public void setUser(Usuarios user) {
        this.user = user;
    }

    public String getPrivacidad() {
        return privacidad;
    }

    public void setPrivacidad(String privacidad) {
        this.privacidad = privacidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Publicaciones{" + "ID=" + ID + ", mensaje=" + mensaje + ", user=" + user + ", privacidad=" + privacidad + ", fecha=" + fecha + '}';
    }   
  
}

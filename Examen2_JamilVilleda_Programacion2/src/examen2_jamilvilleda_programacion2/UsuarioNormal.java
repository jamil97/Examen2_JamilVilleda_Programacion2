/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_jamilvilleda_programacion2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.Icon;

/**
 *
 * @author Jamil
 */
public class UsuarioNormal extends Usuarios {

    ArrayList<Publicaciones> publicaciones = new ArrayList();
    ArrayList<UsuarioNormal> amigoNormal = new ArrayList();
    ArrayList<String> solicitudes = new ArrayList();

    public UsuarioNormal(String nombreCompleto, String correoElectronico, Date fecha, String nombreUsuario, String contraseña, Icon foto, boolean bloqueado) {
        super(nombreCompleto, correoElectronico, fecha, nombreUsuario, contraseña, foto, bloqueado);
    }

    public ArrayList<Publicaciones> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(ArrayList<Publicaciones> publicaciones) {
        this.publicaciones = publicaciones;
    }

    public ArrayList<UsuarioNormal> getAmigoNormal() {
        return amigoNormal;
    }

    public void setAmigoNormal(ArrayList<UsuarioNormal> amigoNormal) {
        this.amigoNormal = amigoNormal;
    }

    public ArrayList<String> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(ArrayList<String> solicitudes) {
        this.solicitudes = solicitudes;
    }
    

}

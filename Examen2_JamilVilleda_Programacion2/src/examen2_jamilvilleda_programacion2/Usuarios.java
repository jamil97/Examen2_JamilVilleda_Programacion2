/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_jamilvilleda_programacion2;

import java.io.Serializable;
import java.util.Date;
import javax.swing.Icon;

/**
 *
 * @author Jamil
 */
public class Usuarios implements Serializable {
    private String nombreCompleto;
    private String correoElectronico;
    private Date fecha;
    private String nombreUsuario;
    private String contraseña;
    private Icon foto;
    private boolean bloqueado = false;

    public Usuarios(String nombreCompleto, String correoElectronico, Date fecha, String nombreUsuario, String contraseña, Icon foto, boolean bloqueado) {
        this.nombreCompleto = nombreCompleto;
        this.correoElectronico = correoElectronico;
        this.fecha = fecha;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.foto = foto;
        this.bloqueado = bloqueado;
    }

    
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Icon getFoto() {
        return foto;
    }

    public void setFoto(Icon foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "nombreCompleto=" + nombreCompleto + ", correoElectronico=" + correoElectronico + ", fecha=" + fecha + ", nombreUsuario=" + nombreUsuario + ", contrase\u00f1a=" + contraseña + ", foto=" + foto + ", bloqueado=" + bloqueado + '}';
    } 
}

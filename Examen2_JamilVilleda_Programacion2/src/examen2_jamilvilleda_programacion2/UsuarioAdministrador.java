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
public class UsuarioAdministrador extends Usuarios {
    
    public UsuarioAdministrador(String nombreCompleto, String correoElectronico, Date fecha, String nombreUsuario, String contraseña, Icon foto, boolean bloqueado) {
        super(nombreCompleto, correoElectronico, fecha, nombreUsuario, contraseña, foto, bloqueado);
    }
    
    
    
}

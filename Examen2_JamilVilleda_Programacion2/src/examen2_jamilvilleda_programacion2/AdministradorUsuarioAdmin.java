/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_jamilvilleda_programacion2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Jamil
 */
public class AdministradorUsuarioAdmin {

    ArrayList<UsuarioAdministrador> usuarioAdmin = new ArrayList();
    File archivo = null;

    public AdministradorUsuarioAdmin(String path) {
        archivo = new File(path);
    }

    public ArrayList<UsuarioAdministrador> getUsuarioAdmin() {
        return usuarioAdmin;
    }

    public void setUsuarioAdmin(ArrayList<UsuarioAdministrador> usuarioAdmin) {
        this.usuarioAdmin = usuarioAdmin;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setUsuarioAdmin(UsuarioAdministrador ua) {
        this.usuarioAdmin.add(ua);
    }

    public void cargarArchivo() {

        try {
            usuarioAdmin = new ArrayList();
            UsuarioAdministrador user;

            if (archivo.exists()) {

                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((user = (UsuarioAdministrador) objeto.readObject()) != null) {
                        usuarioAdmin.add(user);
                    }
                } catch (EOFException e) {

                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void escrbirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;

        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (UsuarioAdministrador um : usuarioAdmin) {
                bw.writeObject(um);
            }
            bw.flush();

        } catch (Exception e) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {

            }
        }
    }

}

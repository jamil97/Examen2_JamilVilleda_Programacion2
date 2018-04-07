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
public class AdministradorUsuarioNormal {

    ArrayList<UsuarioNormal> usuarioNormal = new ArrayList();
    File archivo = null;

    public AdministradorUsuarioNormal(String path) {
        archivo = new File(path);
    }

   
    
    public ArrayList<UsuarioNormal> getUsuarioNormal() {
        return usuarioNormal;
    }

    public void setUsuarioNormal(ArrayList<UsuarioNormal> usuarioNormal) {
        this.usuarioNormal = usuarioNormal;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setUsuarioNormal(UsuarioNormal um) {
        this.usuarioNormal.add(um);
    }

    public void cargarArchivo() {

        try {
            usuarioNormal = new ArrayList();
            UsuarioNormal user;

            if (archivo.exists()) {

                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((user = (UsuarioNormal) objeto.readObject()) != null) {
                        usuarioNormal.add(user);
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
            for (UsuarioNormal um : usuarioNormal) {
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

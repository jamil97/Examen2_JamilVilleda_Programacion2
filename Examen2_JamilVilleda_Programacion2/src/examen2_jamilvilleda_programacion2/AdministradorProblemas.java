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
public class AdministradorProblemas {

    private ArrayList<Problemas> listas_problemas = new ArrayList();
    private File archivo = null;

    public AdministradorProblemas(String path) {
        archivo = new File(path);
    }
    
    public ArrayList<Problemas> getListas_problemas() {
        return listas_problemas;
    }

    public void setListas_problemas(ArrayList<Problemas> listas_problemas) {
        this.listas_problemas = listas_problemas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void set_problemas(Problemas a) {
        listas_problemas.add(a);
    }

    public void cargarArchivo() {
        try {
            listas_problemas = new ArrayList();
            Problemas temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Problemas) objeto.readObject()) != null) {
                        listas_problemas.add(temp);
                    }
                } catch (EOFException e) {
                    //ENCONTRO EL FINAL DEL ARCHIVO
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;

        try {

            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Problemas t : listas_problemas) {
                bw.writeObject(t);

            }
            bw.flush();

        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
}

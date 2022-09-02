/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_emilianoagurcia;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author emili
 */
public class Clase_Administradora {
    private ArrayList <Entidad> ListaEntidades = new ArrayList();
    private ArrayList <Planta> ListaPlantas = new ArrayList();
    private ArrayList <Zombie> ListaZombies = new ArrayList();
    private File Archivo = null;
    
    public Clase_Administradora(String path) {
        Archivo = new File(path);
    }

    public ArrayList<Entidad> getListaEntidades() {
        return ListaEntidades;
    }

    public void setListaEntidades(ArrayList<Entidad> ListaEntidades) {
        this.ListaEntidades = ListaEntidades;
    }

    public ArrayList<Planta> getListaPlantas() {
        return ListaPlantas;
    }

    public void setListaPlantas(ArrayList<Planta> ListaPlantas) {
        this.ListaPlantas = ListaPlantas;
    }

    public ArrayList<Zombie> getListaZombies() {
        return ListaZombies;
    }

    public void setListaZombies(ArrayList<Zombie> ListaZombies) {
        this.ListaZombies = ListaZombies;
    }

    public File getArchivo() {
        return Archivo;
    }

    public void setArchivo(File Archivo) {
        this.Archivo = Archivo;
    }
    
    private String CargarZombies(){
        String TextoEnArchivo = "";
        
        return TextoEnArchivo;
    }
    private String CargarPlantas(){
        String TextoEnArchivo = "";
        
        return TextoEnArchivo;
    }
    
    private void EscribirZombies(){
        
    }
    private void EscribirPlantas(){
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_emilianoagurcia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author emili
 */
public class Admin {
    private ArrayList <Entidad> ListaEntidades = new ArrayList();
    private ArrayList <Planta> ListaPlantas = new ArrayList();
    private ArrayList <Zombie> ListaZombies = new ArrayList();
    private File Archivo = null;
    
    public Admin(String path) {
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
    
    public String LeerZombiesScanner(){
        FileReader FR = null;
        BufferedReader BR = null;
        String TextoEnArchivo = "";
        String Texto = "";
        
        if(Archivo.exists()){
            try {
                
                
                
            } catch (Exception e) {
            }
        }
        
        return TextoEnArchivo;
    }
    public String LeerPlantasScanner(){
        FileReader FR = null;
        BufferedReader BR = null;
        String TextoEnArchivo = "";
        
        if(Archivo.exists()){
            try {
                
                while( (TextoEnArchivo = BR.readLine()) != null){
                    TextoEnArchivo += BR.readLine();
                }
            } catch (Exception e) {
            }
        }
        
        return TextoEnArchivo;
    }
    
    public void EscribirZombies(){
        FileWriter FW = null;
        BufferedWriter BW = null;
        
        if(Archivo.exists()){
            try {
                
            } catch (Exception e) {
                
            }
        }
    }
    public void EscribirPlantas(){
        FileWriter FW = null;
        BufferedWriter BW = null;
        
        if(Archivo.exists()){
            try {
                
            } catch (Exception e) {
                
            }
        }
    }
    
    public void Cargar(){
        FileReader FR = null;
        BufferedReader BR = null;
        String linea = "";
        
        if(Archivo.exists()){
            System.out.println("Existe");
            try {
                while( BR.readLine() != null){
                    FR = new FileReader(Archivo);
                    BR = new BufferedReader(FR);

                    String[] Tipo = BR.readLine().split("|");

                    System.out.println(Tipo);
                }
            } catch (Exception e) {
            }    
        }else{
            System.out.println("No Existe");
        }
        
    }
}

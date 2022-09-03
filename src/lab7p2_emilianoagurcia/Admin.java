/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_emilianoagurcia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
    
    public void LeerZombies() throws IOException{
        FileReader FR = null;
        BufferedReader BR = null;
        
        if(Archivo.exists()){
            try {
                FR = new FileReader(Archivo);
                BR = new BufferedReader(FR);
                
                //Super
                String Nombre = "";
                int Vida = 0;
                int Ataque = 0;
                
                //Cargado
                int Size = 0;
                int Edad = 0;
                int NivelEnojo = 0;
                ArrayList <String> PersonasComidas = new ArrayList();

                //Clasico
                int YearsExperiencia = 0;
                
                String Color = "";
                String DireccionImagen = "";
                Bandera Bandera = new Bandera(Color, DireccionImagen);
                
                String[] Zombies = BR.readLine().split("|");
                
                for (int i = 0; i < Zombies.length; i++) {
                    boolean Cargado = false;
                    boolean Clasico = false;
                    
                    
                    String[] Super_o_Tipo = Zombies[i].split("_");
                    
                    
                    if(Super_o_Tipo[0].contains(":")){
                        String[] Colon = Super_o_Tipo[0].split(":");
                        
                        String[] Atributo = Super_o_Tipo[1].split(",");

                        for (int j = 0; j < Atributo.length; j++) {
                            String[] Valor = Atributo[j].split("=");
                            if (Valor[0].equals("Ataque")) {
                                Ataque = Integer.parseInt(Valor[1]);
                            } else if (Valor[0].equals("Nombre")) {
                                Nombre = Valor[1];
                            } else if (Valor[0].equals("Vida")) {
                                Vida = Integer.parseInt(Valor[1]);
                            }
                        }
                        
                        if(Colon[0].equals("Clasico")) {
                            
                        } else if (Colon[0].equals("Cargado")) {

                        }
                    }else{
                        String[] Colon = Super_o_Tipo[1].split(":");
                        
                        if(Colon[0].equals("Clasico")){
                            Clasico = true;
                            String AtributosJuntos = Colon[1]+Colon[2]+Colon[3];
                            String Atributos = AtributosJuntos.substring(1, AtributosJuntos.length()-1);
                            
                            String[] Atributo = Atributos.split(";");
                            for (int j = 0; j < Atributo.length; j++) {
                                if(Atributo[j].contains("[")){
                                    String[] Valor = Atributo[j].split("=");
                                    
                                    for (int k = 0; k < Valor.length; k++) {
                                        if(Valor[k].equals("Experiencia")){
                                            YearsExperiencia = Integer.parseInt(Valor[1]);
                                        }else{
                                            String AtributosBandera = Valor[1].substring(1, Valor[1].length()-1);
                                        }
                                    }
                                    
                                }    
                            }
                            
                            
                        }else if(Colon[0].equals("Cargado")){
                            Cargado = true;
                        }
                    }
                }//Fin Zombies
                
            } catch (Exception e) {
                
            }finally{
                FR.close();
                BR.close();
            }    
        }
    }
    public void LeerPlantas() throws FileNotFoundException, IOException{
        FileReader FR = null;
        BufferedReader BR = null;
        
        if(Archivo.exists()){    
            FR = new FileReader(Archivo);
            BR = new BufferedReader(FR);
            
            //Super
            String Nombre = "";
            String Rango = "";
            int Vida = 0;
            int Ataque = 0;
            
            //Disparo
            String Color = "";
            String Proyectil = "";
            
            //Defensa
            int Peso = 0;
            int Altura = 0;
            int Dureza = 0;
            
            //Explosiva
            int Magnitud = 0;
            
            
            String[] Planta = BR.readLine().split("|");
            
            for (int i = 0; i < Planta.length; i++) {
                boolean Defensa = false; 
                boolean Disparo = false;
                boolean Explosiva = false;
                
                String[] Super_o_Tipo = Planta[i].split("_");                    //Super de Clase Planta, o Tipo de Planta
                
                for (int j = 0; j < Super_o_Tipo.length; j++) {
                    
                    if(Super_o_Tipo[j].contains(":")){
                        String[] Colon = Super_o_Tipo[j].split(":");
                        
                        for (int k = 0; k < Colon.length; k++) {
                            if(Colon[0].equals("Disparo")){                     //Planta_Disparo
                                Disparo = true;
                                
                                String Atributos = Colon[1].substring( 1, Colon[1].length()-1);
                                String[] Atributo = Atributos.split(";");
                                
                                for (int l = 0; l < Atributo.length; l++) {
                                    String[] Valor = Atributo[k].split("=");
                                    if(Valor[0].equals("Color")){
                                        Color = Valor[1];
                                    }else if(Valor[0].equals("Proyectil")){
                                        Proyectil = Valor[1];
                                    }
                                }
                            }else if(Colon[0].equals("Defensa")){               //Planta_Defensa
                                Defensa = true;
                                String Atributos = Colon[1].substring( 1, Colon[1].length()-1); //Ignora los () de los Atributos
                                String[] Atributo = Atributos.split(";");
                                
                                for (int l = 0; l < Atributo.length; l++) {
                                    String[] Valor = Atributo[k].split("=");
                                    
                                    if(Valor[0].equals("Peso")){
                                        Peso = Integer.parseInt(Valor[1]);
                                    }else if(Valor[0].equals("Altura")){
                                        Altura = Integer.parseInt(Valor[1]);
                                    }else if(Valor[0].equals("Dureza")){
                                        Dureza = Integer.parseInt(Valor[1]);
                                    }
                                    
                                }
                            }else if(Colon[0].equals("Explosiva")){             //Planta_Explosiva
                                Explosiva = true;
                                String Atributos = Colon[1].substring( 1, Colon[1].length()-1);
                                String[] Valores = Atributos.split("=");
                                
                                Magnitud = Integer.parseInt(Valores[1]);
                            }
                        }
                    }else{
                        String[] Atributo = Super_o_Tipo[j].split(",");
                        
                        for (int k = 0; k < Atributo.length; k++) {
                            String[] Valores = Atributo[k].split("=");
                            
                            if(Valores[0].equals("Nombre")){
                                Nombre = Valores[1];
                            }else if(Valores[0].equals("Rango")){
                                Rango = Valores[1];
                            }else if(Valores[0].equals("Vida")){
                                Vida = Integer.parseInt(Valores[1]);
                            }else if(Valores[0].equals("Ataque")){
                                Ataque = Integer.parseInt(Valores[1]);
                            }
                        }
                    }
                }
                if(Disparo == true){
                    Planta newPlanta = new Planta_Disparo(Proyectil, Color, Rango, Nombre, Ataque, Vida);
                }else if(Defensa == true){
                    Planta newPlanta = new Planta_Defensa(Altura, Dureza, Peso, Rango, Nombre, Ataque, Vida);
                }else if(Explosiva == true){
                    Planta newPlanta = new Planta_Explosiva(Magnitud, Rango, Nombre, Ataque, Vida);
                }    
            }//Fin Plantas
            FR.close();
            BR.close();
        }
        
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
    
}

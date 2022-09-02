/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_emilianoagurcia;

import java.util.ArrayList;

/**
 *
 * @author emili
 */
public class Zombie_Cargado extends Zombie{
    int Size;
    int Edad;
    int NivelEnojo;
    ArrayList <String> PersonasComidas = new ArrayList();

    public Zombie_Cargado(int Size, int Edad, int NivelEnojo, String Nombre, int Ataque, int Vida) {
        super(Nombre, Ataque, Vida);
        this.Size = Size;
        this.Edad = Edad;
        this.NivelEnojo = NivelEnojo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getAtaque() {
        return Ataque;
    }

    public void setAtaque(int Ataque) {
        this.Ataque = Ataque;
    }

    public int getVida() {
        return Vida;
    }

    public void setVida(int Vida) {
        this.Vida = Vida;
    }

    
    public int getSize() {
        return Size;
    }

    public void setSize(int Size) {
        this.Size = Size;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getNivelEnojo() {
        return NivelEnojo;
    }

    public void setNivelEnojo(int NivelEnojo) {
        this.NivelEnojo = NivelEnojo;
    }

    public ArrayList<String> getPersonasComidas() {
        return PersonasComidas;
    }

    public void setPersonasComidas(ArrayList<String> PersonasComidas) {
        this.PersonasComidas = PersonasComidas;
    }

    @Override
    public String toString() {
        return "Zombie_Cargado{" + "Size=" + Size + ", Edad=" + Edad + ", NivelEnojo=" + NivelEnojo + ", PersonasComidas=" + PersonasComidas + '}';
    }
}

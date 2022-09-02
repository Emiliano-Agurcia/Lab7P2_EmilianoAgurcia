/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_emilianoagurcia;

/**
 *
 * @author emili
 */
public class Entidad {
    String Nombre;
    int Ataque;
    int Vida;

    public Entidad(String Nombre, int Ataque, int Vida) {
        this.Nombre = Nombre;
        this.Ataque = Ataque;
        this.Vida = Vida;
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

    @Override
    public String toString() {
        return "Entidad{" + "Nombre=" + Nombre + ", Ataque=" + Ataque + ", Vida=" + Vida + '}';
    }
    
    
}

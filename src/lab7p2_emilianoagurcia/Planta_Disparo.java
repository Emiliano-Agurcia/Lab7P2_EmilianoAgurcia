/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_emilianoagurcia;

import java.awt.Color;

/**
 *
 * @author emili
 */
public class Planta_Disparo extends Planta{
    String NombreProyectil;
    Color Color;

    public Planta_Disparo(String NombreProyectil, Color Color, String Rango, String Nombre, int Ataque, int Vida) {
        super(Rango, Nombre, Ataque, Vida);
        this.NombreProyectil = NombreProyectil;
        this.Color = Color;
    }

    


    public String getNombreProyectil() {
        return NombreProyectil;
    }

    public void setNombreProyectil(String NombreProyectil) {
        this.NombreProyectil = NombreProyectil;
    }

    public Color getColor() {
        return Color;
    }

    public void setColor(Color Color) {
        this.Color = Color;
    }

    public String getRango() {
        return Rango;
    }

    public void setRango(String Rango) {
        this.Rango = Rango;
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
        return "Planta_Disparo{" + "NombreProyectil=" + NombreProyectil + ", Color=" + Color + '}';
    }
}

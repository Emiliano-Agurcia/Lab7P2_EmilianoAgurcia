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
public class Planta_Explosiva extends Planta{
    int Magnitud;//De explosion

    public Planta_Explosiva(int Magnitud, String Rango, String Nombre, int Ataque, int Vida) {
        super(Rango, Nombre, Ataque, Vida);
        this.Magnitud = Magnitud;
    }

    public int getMagnitud() {
        return Magnitud;
    }

    public void setMagnitud(int Magnitud) {
        this.Magnitud = Magnitud;
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
        return "Planta_Explosiva{" + "Magnitud=" + Magnitud + '}';
    }
    
}

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
public class Planta_Defensa extends Planta{
    int Altura;
    int NivelDureza;
    int Peso;

    public Planta_Defensa(int Altura, int NivelDureza, int Peso, String Rango) {
        super(Rango);
        this.Altura = Altura;
        this.NivelDureza = NivelDureza;
        this.Peso = Peso;
    }

    public int getAltura() {
        return Altura;
    }

    public void setAltura(int Altura) {
        this.Altura = Altura;
    }

    public int getNivelDureza() {
        return NivelDureza;
    }

    public void setNivelDureza(int NivelDureza) {
        this.NivelDureza = NivelDureza;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int Peso) {
        this.Peso = Peso;
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
        return "Planta_Defensa{" + "Altura=" + Altura + ", NivelDureza=" + NivelDureza + ", Peso=" + Peso + '}';
    }
    
    
}

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
public class Zombie_Clasico extends Zombie{
    int YearsExperiencia;
    Bandera Bandera;

    public Zombie_Clasico(int YearsExperiencia, Bandera Bandera, String Nombre, int Ataque, int Vida) {
        super(Nombre, Ataque, Vida);
        this.YearsExperiencia = YearsExperiencia;
        this.Bandera = Bandera;
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
    
    public int getYearsExperiencia() {
        return YearsExperiencia;
    }

    public void setYearsExperiencia(int YearsExperiencia) {
        this.YearsExperiencia = YearsExperiencia;
    }

    public Bandera getBandera() {
        return Bandera;
    }

    public void setBandera(Bandera Bandera) {
        this.Bandera = Bandera;
    }

    @Override
    public String toString() {
        return "Zombie_Clasico{" + "YearsExperiencia=" + YearsExperiencia + ", Bandera=" + Bandera + '}';
    }

    
}

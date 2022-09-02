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

    public Zombie_Clasico(int YearsExperiencia, Bandera Bandera) {
        this.YearsExperiencia = YearsExperiencia;
        this.Bandera = Bandera;
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

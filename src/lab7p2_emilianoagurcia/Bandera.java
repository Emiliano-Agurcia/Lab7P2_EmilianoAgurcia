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
public class Bandera {
    String Color;
    String DireccionImagen;

    public Bandera(String Color, String DireccionImagen) {
        this.Color = Color;
        this.DireccionImagen = DireccionImagen;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getDireccionImagen() {
        return DireccionImagen;
    }

    public void setDireccionImagen(String DireccionImagen) {
        this.DireccionImagen = DireccionImagen;
    }

    @Override
    public String toString() {
        return "Bandera{" + "Color=" + Color + ", DireccionImagen=" + DireccionImagen + '}';
    }
}

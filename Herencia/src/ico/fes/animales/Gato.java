/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.animales;

/**
 *
 * @author sayun
 */
public class Gato extends Animal {
    private String Raza;
    private int Edad;
    private String Maullar;
    private String Rasguniar;

    public Gato() {
    }

    public Gato(String Raza, int Edad, String Maullar, String Rasguniar) {
        this.Raza = Raza;
        this.Edad = Edad;
        this.Maullar = Maullar;
        this.Rasguniar = Rasguniar;
    }

    public Gato(String Raza, int Edad, String Maullar, String Rasguniar, int NumeroPatas, int Cola, int Hocico, int Orejas) {
        super(NumeroPatas, Cola, Hocico, Orejas);
        this.Raza = Raza;
        this.Edad = Edad;
        this.Maullar = Maullar;
        this.Rasguniar = Rasguniar;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getMaullar() {
        return Maullar;
    }

    public void setMaullar(String Maullar) {
        this.Maullar = Maullar;
    }

    public String getRasguniar() {
        return Rasguniar;
    }

    public void setRasguniar(String Rasguniar) {
        this.Rasguniar = Rasguniar;
    }

    @Override
    public String toString() {
        return super.toString() + "Gato{" + "Raza=" + Raza + ", Edad=" + Edad + ", Maullar=" + Maullar + ", Rasguniar=" + Rasguniar + '}';
    }

    
    
    
}

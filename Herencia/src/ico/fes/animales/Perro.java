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
public class Perro extends Animal {
    private String Raza;
    private int Edad;
    private String Ladra;
    private String Olfato;

    public Perro() {
    }

    public Perro(String Raza, int Edad, String Ladra, String Olfato) {
        this.Raza = Raza;
        this.Edad = Edad;
        this.Ladra = Ladra;
        this.Olfato = Olfato;
    }

    public Perro(String Raza, int Edad, String Ladra, String Olfato, int NumeroPatas, int Cola, int Hocico, int Orejas) {
        super(NumeroPatas, Cola, Hocico, Orejas);
        this.Raza = Raza;
        this.Edad = Edad;
        this.Ladra = Ladra;
        this.Olfato = Olfato;
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

    public String getLadra() {
        return Ladra;
    }

    public void setLadra(String Ladra) {
        this.Ladra = Ladra;
    }

    public String getOlfato() {
        return Olfato;
    }

    public void setOlfato(String Olfato) {
        this.Olfato = Olfato;
    }

    @Override
    public String toString() {
        return super.toString() + "Perro{" + "Raza=" + Raza + ", Edad=" + Edad + ", Ladra=" + Ladra + ", Olfato=" + Olfato + '}';
    }
    
    

   
    
    
}

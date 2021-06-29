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
public class Animal {
    private int NumeroPatas;
    private int Cola;
    private int Hocico;
    private int Orejas;

    public Animal() {
    }

    public Animal(int NumeroPatas, int Cola, int Hocico, int Orejas) {
        this.NumeroPatas = NumeroPatas;
        this.Cola = Cola;
        this.Hocico = Hocico;
        this.Orejas = Orejas;
    }

    public int getOrejas() {
        return Orejas;
    }

    public void setOrejas(int Orejas) {
        this.Orejas = Orejas;
    }

    public int getNumeroPatas() {
        return NumeroPatas;
    }

    public void setNumeroPatas(int NumeroPatas) {
        this.NumeroPatas = NumeroPatas;
    }

    public int getCola() {
        return Cola;
    }

    public void setCola(int Cola) {
        this.Cola = Cola;
    }

    public int getHocico() {
        return Hocico;
    }

    public void setHocico(int Hocico) {
        this.Hocico = Hocico;
    }

    @Override
    public String toString() {
        return "Animal{" + "NumeroPatas=" + NumeroPatas + ", Cola=" + Cola + ", Hocico=" + Hocico + ", Orejas=" + Orejas + '}';
    }
    
    public static void main(String[] args){
        
        Animal a1 =new Animal(4, 1, 1, 2);
        System.out.println(a1);
        
        Perro p1 =new Perro("Husky", 5, "Si","Si");
        System.out.println(p1);
        
        Gato g1 =new Gato("Persa",8, "Si", "Si");
        System.out.println(g1);
        
    }
}

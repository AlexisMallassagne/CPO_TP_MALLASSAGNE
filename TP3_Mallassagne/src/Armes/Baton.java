/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author xelat
 */
public class Baton extends Arme{
    private int Indice;

    public Baton(String Nom, int niveauAttaque, int Indice) {
        super(Nom, niveauAttaque);
        if (Indice > 0) {
            Indice = Indice;
        }
        else {
            Indice=1;
        }

        if (Indice > 100) {
            Indice = 100;
        }
        this.Indice = Indice;
    }

    public int getIndice() {
        return Indice;
    }

    public void setIndice(int Indice) {
        this.Indice = Indice;
    }

    @Override
    public String toString() {
        return "nom{" + nom+ " niveau d'attaque " + this.getAttaque() + " age "+ Indice +'}';
    }
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author xelat
 */
public class Arme {

    public Arme(String Nom, int niveauAttaque) {
        Attaque = niveauAttaque;
        nom = Nom;
    }
    private int Attaque;
    String nom;

    public int getAttaque() {
        return Attaque;
    }

    public void setAttaque(int Attaque) {
        if (Attaque > 0) {
            Attaque = Attaque;
        }
        else {
            Attaque=1;
        }

        if (Attaque > 100) {
            Attaque = 100;
        }
        this.Attaque = Attaque;
        
    }

    public Arme(int Attaque, String nom) {
        this.Attaque = Attaque;
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Arme{" + "niveau d'attaque=" + Attaque + ", nom=" + nom + '}';
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;
import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author xelat
 */
public class Personnage {
    public Personnage(String Nom, int niveaudeVie) {
        pv = niveaudeVie;
        nom = Nom;
    }
    private int pv;
    String nom;
    ArrayList <Arme> Tab_Arme = new ArrayList<>();
    Arme Arme_en_main;

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }
    public void MethodeArme (Arme arme){
       for (int i=0; i<5; i++){
           if (Tab_Arme.get(i)==arme){
               System.out.println("l'arme ");
               Arme_en_main = Tab_Arme.get(i);
               break;
           }
           else{
               System.out.println("l'arme n'a pas été trouvé et elle n'est donc pas équipée");
           }
       }
    }
    public void AjoutArme (Arme arme){
        if (Tab_Arme.size()<5){
           Tab_Arme.add(arme);
       }
        
    }
    @Override
    public String toString() {
        return "Personnage{ niveau de vie = " + pv + ", nom= " + nom + '}';
    }
    
}

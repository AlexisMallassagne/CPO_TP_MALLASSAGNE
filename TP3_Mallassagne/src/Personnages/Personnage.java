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
    private Arme Arme_en_main;

    public Arme getArme_en_main() {
        return Arme_en_main;
    }
    

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }
    public void MethodeArme (Arme arme){
       int verif=0;
       for (int i=0; i<Tab_Arme.size(); i++){
           if (Tab_Arme.get(i)==arme){
               System.out.println("l'arme est équipée");
               Arme_en_main = Tab_Arme.get(i);
               verif=1;
               break;
           }
           
           
           
       }
       if (verif==0){
           System.out.println("l'arme n'a pas été trouvé et elle n'est donc pas équipée");
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_mallassagne;

import Armes.Baton;
import Armes.Epee;
import Armes.Arme;
import java.util.Scanner;
import java.util.ArrayList;
import Armes.*;
import Personnages.*;

/**
 *
 * @author xelat
 */
public class TP3_Mallassagne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arme arme1 = new Arme("arme standard",25);
        arme1.setAttaque(20);
        arme1.setAttaque(-20);
        System.out.println(arme1);
        
        Baton baton1 = new Baton("Charme", 5, 6);
        Baton baton2 = new Baton("Chêne", 4, 5);
        Epee epee1 = new Epee("Durandal",4,7);
        Epee epee2 = new Epee("Excalibur",7,5);
        ArrayList<Arme> TabArme= new ArrayList<>();
        TabArme.add(baton1);
        TabArme.add(baton2);
        TabArme.add(epee1);
        TabArme.add(epee2);
        System.out.println(TabArme.get(0));
        System.out.println(TabArme.size());
        Magicien magicien1 = new Magicien("Gandalf",65,true);
        Magicien magicien2 = new Magicien("Garcimore",44,false);
        Guerrier guerrier1 = new Guerrier( "Conan", 78, false);
        Guerrier guerrier2 = new Guerrier( "Lannister", 45, true);
        ArrayList<Personnage> TabPerso = new ArrayList<>();
        TabPerso.add(magicien1);
        TabPerso.add(guerrier2);
        TabPerso.add(guerrier1);
        TabPerso.add(magicien2);
        System.out.println(TabPerso.get(0));
        System.out.println(TabPerso.size());
        System.out.println(TabPerso.get(1));
        System.out.println(TabPerso.size());
        System.out.println(TabPerso.get(2));
        System.out.println(TabPerso.size());
        System.out.println(TabPerso.get(3));
        System.out.println(TabPerso.size());
        
        
        Arme verif = TabArme.get(0);
        if (verif instanceof Baton){
            System.out.println(verif+" est un baton");
        }
        else {
            System.out.println(verif+" n'est pas un baton");
        }
        
        Magicien Harry = new Magicien("Harry",56,false);
        Guerrier Doigby = new Guerrier("Doigby",45,false);
        Baton Bauldeumorv = new Baton ("Bauldeumorv",42,7);
        Baton boudboi = new Baton ("Boudboi",2,70);
        Baton branche = new Baton ("branche",99,1);
        Epee houillehouille = new Epee ("houilleHouille",50,230);
        Epee coupecoupe = new Epee ("coupecoupe",75,23);
        Epee T = new Epee ("T",1,758000);
        
        Harry.AjoutArme(Bauldeumorv);
        Harry.AjoutArme(boudboi);
        Harry.AjoutArme(houillehouille);
        Doigby.AjoutArme(branche);
        Doigby.AjoutArme(coupecoupe);
        Doigby.AjoutArme(T);
        Doigby.MethodeArme(T);
        Harry.MethodeArme(boudboi);
        Harry.ArmePréféré();
        Doigby.ArmePréféré();
        
    
    }
    
}

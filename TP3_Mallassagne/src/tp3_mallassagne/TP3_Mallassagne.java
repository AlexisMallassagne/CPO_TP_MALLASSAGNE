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
        Arme arme1 = new Arme("arme standard",25);//création d'une arme
        arme1.setAttaque(20);
        arme1.setAttaque(-20);
        System.out.println(arme1);
        
        Baton baton1 = new Baton("Charme", 5, 6);//création de baton et d'epee
        Baton baton2 = new Baton("Chêne", 4, 5);
        Epee epee1 = new Epee("Durandal",4,7);
        Epee epee2 = new Epee("Excalibur",7,5);
        ArrayList<Arme> TabArme= new ArrayList<>();//Création d'un tableau de place infini d'arme
        TabArme.add(baton1);//ajout d'arme dans le tableau
        TabArme.add(baton2);
        TabArme.add(epee1);
        TabArme.add(epee2);
        System.out.println(TabArme.get(0));
        System.out.println(TabArme.size());//affichage de la taille du tableau
        Magicien magicien1 = new Magicien("Gandalf",65,true);//création de magiciens et de guerrier
        Magicien magicien2 = new Magicien("Garcimore",44,false);
        Guerrier guerrier1 = new Guerrier( "Conan", 78, false);
        Guerrier guerrier2 = new Guerrier( "Lannister", 45, true);
        ArrayList<Personnage> TabPerso = new ArrayList<>();//Création de tableau de perso
        TabPerso.add(magicien1);//ajout de personnage
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
        
        Magicien Harry = new Magicien("Harry",56,false);//création d'un magicien =, d'un guerrier, de 3 epees et de 3 batons
        Guerrier Doigby = new Guerrier("Doigby",45,false);
        Baton Bauldeumorv = new Baton ("Bauldeumorv",42,7);
        Baton boudboi = new Baton ("Boudboi",2,70);
        Baton branche = new Baton ("branche",99,1);
        Epee houillehouille = new Epee ("houilleHouille",50,230);
        Epee coupecoupe = new Epee ("coupecoupe",75,23);
        Epee T = new Epee ("T",1,758000);
        
        Harry.AjoutArme(Bauldeumorv);//ajout d'epee et de batons dans "l'inventaire" du magicien et du guerrier
        Harry.AjoutArme(boudboi);
        Harry.AjoutArme(houillehouille);
        Doigby.AjoutArme(branche);
        Doigby.AjoutArme(coupecoupe);
        Doigby.AjoutArme(T);
        Doigby.PriseArme(T);//mise en main d'une arme choisi
        Harry.PriseArme(boudboi);
        Harry.ArmePréféré();//afficher le nombre d'arme preferes
        Doigby.ArmePréféré();
        
        System.out.println(Harry);
        System.out.println(Doigby);
        
        
    
    }
    
}

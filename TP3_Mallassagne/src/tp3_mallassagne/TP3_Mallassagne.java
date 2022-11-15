/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_mallassagne;

import java.util.Scanner;
import java.util.ArrayList;

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
        ArrayList<Arme> Tab1 = new ArrayList<>();
        Tab1.add(baton1);
        Tab1.add(baton2);
        Tab1.add(epee1);
        Tab1.add(epee2);
    }
    
}

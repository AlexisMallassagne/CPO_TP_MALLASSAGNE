package tp2_relation_1_mallassagne;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author xelat
 */
public class Voiture {
    public Voiture(String modele, String Marque, int PuissanceCV){
        Mode1=modele;
        Marq1=Marque;
        Puissance1=PuissanceCV;
    }
    String Mode1;
    String Marq1;
    int Puissance1;
    @Override
    public String toString() {
        return "Le modele de la voiture est "+ Mode1 +" de la marque "+ Marq1 +" d'une puissance de "+Puissance1+" chevaux";
    }
}

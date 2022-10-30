package tp2_relation_1_mallassagne;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author xelat
 */
public class Voiture { //Création de la classe Voiture

    public Voiture(String modele, String Marque, int PuissanceCV) { //Remplissage de la classe Voiture avec 4 attributs
        Mode1 = modele;
        Marq1 = Marque;
        Puissance1 = PuissanceCV;
        proprietaire = null;
    }
    String Mode1; //initialisation des attributs 
    String Marq1;
    int Puissance1;
    Personne proprietaire;

    /**
     * La methode toString retourne la chaine de caracteres que l'on souhaite
     * afficher quand l'objet est cité. C'est une methode qui s'appelle
     * automatiquement quand est cité dans System.out.println()
     */
    @Override
    public String toString() {
        return "Le modele de la voiture est " + Mode1 + " de la marque " + Marq1 + " d'une puissance de " + Puissance1 + " chevaux et son proprietaire est " + proprietaire;
    }
}

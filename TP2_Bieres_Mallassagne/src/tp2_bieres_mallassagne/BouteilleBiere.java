/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_mallassagne;

/**
 *
 * @author xelat
 */
public class BouteilleBiere { //Création de la classe BouteilleBiere

    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) { //Remplissage de la classe BouteilleBiere avec 4 attributs
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;
    }

    String nom; //initialisation des attributs 
    double degreAlcool;
    String brasserie;
    boolean ouverte;

    /**
     * La methode lireEtiquette permet d'afficher le nom, le degré d'alcool et
     * la brasserie d'une bouteille.
     */
    public void lireEtiquette() { //Creation de la methode lireEtiquette
        System.out.println("Bouteille de " + nom + " (" + degreAlcool + " degres) \nBrasserie : " + brasserie);
    }

    /**
     * La methode Decapsuler permet d'ouvrir une biere ou de prevenir que la
     * biere est deja ouverte
     */
    public void Décapsuler() {//creation de la methode decapsuler
        if (ouverte = false) {
            ouverte = true;
        } else {
            System.out.println("erreur : bière déjà ouverte");
        }
    }

    /**
     * La methode toString retourne la chaine de caracteres que l'on souhaite
     * afficher quand l'objet est cité. C'est une methode qui s'appelle
     * automatiquement quand est cité dans System.out.println()
     */
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom + " (" + degreAlcool + " degrés) Ouverte ? ";
        if (ouverte == true) { // ajout de l'affichage oui ou non en fonction de l'ouverture de la biere
            chaine_a_retourner += "oui";
        } else {
            chaine_a_retourner += "non";
        }
        return chaine_a_retourner;
    }

}

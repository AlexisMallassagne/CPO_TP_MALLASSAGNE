/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_mallassagne;

/**
 *
 * @author xelat
 */

public class BouteilleBiere {
    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
 nom = unNom;
 degreAlcool = unDegre;
 brasserie = uneBrasserie;
 ouverte = false;
}

    String nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte;
    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom +" (" + degreAlcool +" degres) \nBrasserie : " + brasserie ) ;
}
    public void Décapsuler () {
            if (ouverte=false){
                ouverte=true;
            }
            else{
                System.out.println("erreur : bière déjà ouverte") ;
            }
    }
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom + " (" + degreAlcool + " degrés) Ouverte ? "; 
        if (ouverte == true ) {
            chaine_a_retourner += "oui" ;
        }
        else {
            chaine_a_retourner += "non" ;
        }
        return chaine_a_retourner ;
}


}
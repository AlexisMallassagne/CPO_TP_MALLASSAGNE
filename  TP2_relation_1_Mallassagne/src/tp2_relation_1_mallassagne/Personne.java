package tp2_relation_1_mallassagne;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author xelat
 */
public class Personne {

    public Personne(String nom, String prenom) {
        nomP = nom;
        prenomP = prenom;
        liste_voitures = new Voiture[3];
        nbVoitures = 0;
    }
    String nomP;
    String prenomP;
    int nbVoitures;
    Voiture[] liste_voitures;

    @Override
    public String toString() {
        return "La personne au nom de " + nomP + ", son prenom est " + prenomP + " il a " + nbVoitures + " voitures. ";

    }

    public boolean ajouter_voiture(Voiture voiture_a_ajouter) {
        if (voiture_a_ajouter.proprietaire != null) {
            System.out.println("C'est une voiture volée");
            return false;
        }
        if (nbVoitures == 3) {
            System.out.println("Le proprietaire a 3 voitures, il ne peut pas en avoir plus.");
            return false;
        } else {
            liste_voitures[nbVoitures] = voiture_a_ajouter;
            nbVoitures += 1;
            voiture_a_ajouter.proprietaire = this;
            System.out.println("Il a une nouvelle voiture.");
            return true;
        }
    }
}

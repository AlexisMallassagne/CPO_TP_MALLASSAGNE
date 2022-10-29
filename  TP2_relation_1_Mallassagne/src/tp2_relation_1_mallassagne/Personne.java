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
    public Personne (String nom, String prenom){
        nomP=nom;
        prenomP=prenom;
        liste_voitures=new Voiture [3];
        nbVoitures=0;
    }
    String nomP;
    String prenomP;
    int nbVoitures;
    Voiture [] liste_voitures;
    @Override
    public String toString() {
        return "La personne au nom de "+ nomP+ ", son prenom est "+prenomP+ " il a "+nbVoitures+" voitures. ";
    }
}

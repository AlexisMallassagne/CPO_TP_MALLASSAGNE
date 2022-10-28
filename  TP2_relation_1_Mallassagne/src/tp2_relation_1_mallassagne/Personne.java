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
    }
    String nomP;
    String prenomP;
    @Override
    public String toString() {
        return "La personne a le nom "+ nomP+ ", son prenom est "+prenomP;
    }
}

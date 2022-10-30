/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_mallassagne;

/**
 *
 * @author xelat
 */
public class TP2_relation_1_Mallassagne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Voiture uneClio = new Voiture("Clio", "Renault", 5); //Création de 5 objets de types Voiture et 2 objets de types Personne
        Voiture uneAutreClio = new Voiture("Clio", "Renault", 5);
        Voiture une2008 = new Voiture("2008", "Peugeot", 6);
        Voiture uneMicra = new Voiture("Micra", "Nissan", 4);
        Voiture une720S = new Voiture("720S", "Mclaren", 720);
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");
        System.out.println("liste des voitures disponibles " + uneClio + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra);

        bob.liste_voitures[0] = uneClio; //On donne uneClio a bob
        bob.nbVoitures = 1; //bob a donc 1 voiture
        uneClio.proprietaire = bob;// le proprietaire de uneClio est bob
        System.out.println("la premiere voiture de Bob est " + bob.liste_voitures[0]);

        reno.liste_voitures[0] = une2008; //de même pour reno avec une2008 et uneAutreClio et pour bob avec uneMicra
        reno.nbVoitures = 1;
        une2008.proprietaire = reno;

        reno.liste_voitures[1] = uneAutreClio;
        reno.nbVoitures = 2;
        uneAutreClio.proprietaire = reno;

        bob.liste_voitures[1] = uneMicra;
        bob.nbVoitures = 2;
        uneMicra.proprietaire = bob;

        System.out.println(reno + "\n" + bob); //affichage des personnes et de leurs voitures
        System.out.println(bob.liste_voitures[0]);
        System.out.println(bob.liste_voitures[1]);
        System.out.println(reno.liste_voitures[0]);
        System.out.println(reno.liste_voitures[1]);
 
        bob.ajouter_voiture(une720S); // ajouts de voitures pour bob 
        reno.ajouter_voiture(uneClio); // pas d'ajouts car "c'est une voiture volé"

        System.out.println(reno.liste_voitures[2]); //cela renvoie donc "null"
        System.out.println(bob.liste_voitures[2]);
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_mallassagne;

/**
 *
 * @author AlexisMallassagne TDB
 */
public class TP2_Bieres_Mallassagne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0 ,"Dubuisson") ; //création de l'objet uneBiere
        uneBiere.nom = "Cuvée des trolls"; //Initialiastion "lente" de l'objet uneBiere, de même pour autreBiere et deuxBiere
        uneBiere.degreAlcool = 7.0;
        uneBiere.lireEtiquette();
        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6 ,"Abbaye de Leffe") ;
        autreBiere.nom = "Leffe";
        autreBiere.degreAlcool = 6.6;
        autreBiere.brasserie = "Abbaye de Leffe";
        autreBiere.lireEtiquette();
        BouteilleBiere deuxBiere = new BouteilleBiere("Desperados",5.9,"Tequila flavour") ;
        deuxBiere.lireEtiquette();

        BouteilleBiere troisBiere = new BouteilleBiere("Pelford",5.8,"Mon frigo") ; // création et initialisation de l'objet troisBiere
        troisBiere.lireEtiquette();

        BouteilleBiere quatreBiere = new BouteilleBiere("La Chouffe",8.0,"Nain sur un vélo") ;
        quatreBiere.lireEtiquette();//appel de la methode lireEtiquette
        System.out.println(uneBiere) ;
        uneBiere.Décapsuler();//appel de la methode Decapsuler
        

        
    }
    
}

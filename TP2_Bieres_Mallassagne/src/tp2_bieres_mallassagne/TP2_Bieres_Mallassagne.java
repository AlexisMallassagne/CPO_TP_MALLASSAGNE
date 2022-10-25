/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_mallassagne;

/**
 *
 * @author xelat
 */
public class TP2_Bieres_Mallassagne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0 ,"Dubuisson") ; //Définir un constructeur écrase la visibilité du constructeur par défaut, et il faut donc soit redéfinir un autre constructeur sans paramètres, soit modifier la création des objets précédent
        uneBiere.nom = "Cuvée des trolls";
        uneBiere.degreAlcool = 7.0;
        uneBiere.lireEtiquette();
        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6 ,"Abbaye de Leffe") ;
        autreBiere.nom = "Leffe";
        autreBiere.degreAlcool = 6.6;
        autreBiere.brasserie = "Abbaye de Leffe";
        autreBiere.lireEtiquette();
        BouteilleBiere deuxBiere = new BouteilleBiere("Desperados",5.9,"Tequila flavour") ;
        deuxBiere.lireEtiquette();

        BouteilleBiere troisBiere = new BouteilleBiere("Pelford",5.8,"Mon frigo") ;
        troisBiere.lireEtiquette();

        BouteilleBiere quatreBiere = new BouteilleBiere("La Chouffe",8.0,"Nain sur un vélo") ;
        quatreBiere.lireEtiquette();
        System.out.println(uneBiere) ;
        uneBiere.Décapsuler();


    }
    
}

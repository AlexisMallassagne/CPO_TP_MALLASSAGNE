/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_mallassagne;

/**
 *
 * @author xelat
 */
public class TP2_manip_Mallassagne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);
        Tartiflette assiette3 = assiette2;
        //l'assiette 2 est la même tartiflette que l'assiette 3 il n'y a donc que 2 assiettes créées
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);
        assiette2 = assiette1;
        assiette1 = assiette3;
        //Moussaka assiette666 = assiette1 ;
        //Moussaka assiette667 = new Tartiflette() ;  les lignes ne sont pas correctes
        //Non, une référence objet qui annonce référencer un type d’objet ne peut pas en référencer un autre qui n’a aucun rapport
        Tartiflette assiette4 = new Tartiflette(100);

        Moussaka [] tabAssiette = new Moussaka[10];
        
        for (int i = 0; i < 10; i++) {
            tabAssiette [i] = new Moussaka(100*i);
        }
        //on peut avoir une refenrence vers un objet qui est un attribut d'un autre objet 
        //En effet, c'est une façon de modéliser une relation entre deux objet
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_mallassagne;

import java.util.Scanner;

/**
 *
 * @author xelat
 */
public class TP2_convertisseurObjet_Mallassagne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Convertisseur Temperat = new Convertisseur();
        Convertisseur Temperat2 = new Convertisseur();
        double temp = 1.0;
        Temperat.FarenheitVersKelvin(temp); //création de 2 objets
        Temperat2.CelciusVersFarenheit(temp);
        //System.out.println(Temperat); affichage du nombre de conversions de 2 objets 
        //System.out.println(Temperat2);
        System.out.println("Quel conversion voulez-vous faire ? C vers F (1), ou F vers C (2), C vers K (3), K vers C (4), K vers F (5) ou F vers K (6)");
        Scanner sc = new Scanner(System.in); //l'utilisateur peux rentrer la valeur souhaiter
        int a = sc.nextInt();
        if (a == 1) {//plusieurs choix de conversion
            Convertisseur converchoisi = new Convertisseur();
            converchoisi.CelciusVersFarenheit(temp);
            System.out.println(converchoisi);// affichage du nombre de conversions
        }
        if (a == 2) {
            Convertisseur converchoisi = new Convertisseur();
            converchoisi.FarenheitVersCelcius(temp);
            System.out.println(converchoisi);
        }
        if (a == 3) {
            Convertisseur converchoisi = new Convertisseur();
            converchoisi.CelciusVersKelvin(temp);
            System.out.println(converchoisi);
        }
        if (a == 4) {
            Convertisseur converchoisi = new Convertisseur();
            converchoisi.KelvinVersCelcius(temp);
            System.out.println(converchoisi);
        }
        if (a == 5) {
            Convertisseur converchoisi = new Convertisseur();
            converchoisi.KelvinVersFarenheit(temp);
            System.out.println(converchoisi);
        }
        if (a == 6) {
            Convertisseur converchoisi = new Convertisseur();
            converchoisi.FarenheitVersKelvin(temp);
            System.out.println(converchoisi);
        }
        // Scanner cc = new Scanner(System.in); tentative d'afficher la conversion
        // int TempAConvert = cc.nextInt();
        // Convertisseur TempConvert = new Convertisseur();
        // TempConvert.FarenheitVersKelvin(TempAConvert);
        // System.out.println(TempConvert);

    }

}

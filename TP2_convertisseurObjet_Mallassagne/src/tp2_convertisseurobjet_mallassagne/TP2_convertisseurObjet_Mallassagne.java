/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_mallassagne;

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
        double temp=1.0;
        Temperat.FarenheitVersKelvin(temp);
        Temperat2.CelciusVersFarenheit(temp);
        
        System.out.println(Temperat);
        System.out.println(Temperat2);
        
        
        // TODO code application logic here
    }
    
}



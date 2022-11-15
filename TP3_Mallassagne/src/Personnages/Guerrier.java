/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author xelat
 */
import Armes.Epee;
public class Guerrier extends Personnage{
    private boolean cheval;

    public Guerrier(String Nom, int niveaudeVie, boolean cheval) {
        super(Nom, niveaudeVie);
        this.cheval = cheval;
    }

    public boolean isCheval() {
    String chev;
    if (cheval ==true){
        chev = "a un cheval";
    }
    else {
        chev="n'a pas de cheval";
    }
        return cheval;
    }

    public void setCheval(boolean cheval) {
        this.cheval = cheval;
    }
    public void ArmePréféré (){
        int b=0;
        for (int i =0; i<Tab_Arme.size();i++){
            if (Tab_Arme.get(i) instanceof Epee){
                System.out.println(Tab_Arme.get(i)+" est une de ses armes préférées.");
                b+=1;
            }
        }
        System.out.println("Il a "+b+" armes préférées");
    }
    
    @Override
    public String toString() {
        return "Guerrier{" + "cheval= " + cheval + " Nom : " + nom + "Niveau de vie : " + this.getPv() + '}';
    }
    
}

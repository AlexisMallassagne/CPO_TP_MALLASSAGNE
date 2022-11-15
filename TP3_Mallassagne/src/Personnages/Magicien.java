/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author xelat
 */
import Armes.Baton;
public class Magicien extends Personnage {
    
    private boolean confirmé;

    public Magicien(String Nom, int niveaudeVie, boolean confirmé) {
        super(Nom, niveaudeVie);
        this.confirmé = confirmé;
    }

    public boolean isConfirmé() {
        String conf;
        if (confirmé ==true){
        conf = "Confirmé";
        }
        else {
            conf="Débutant";
        }
        return confirmé;
    }

    public void setConfirmé(boolean confirmé) {
        this.confirmé = confirmé;
    }
    
    public void ArmePréféré (){
        int b=0;
        for (int i =0; i<Tab_Arme.size();i++){
            if (Tab_Arme.get(i) instanceof Baton){
                System.out.println(Tab_Arme.get(i)+" est une de ses armes préférées.");
                b+=1;
            }
        }
        System.out.println("Il a "+b+" armes préférées");
    }
    
    
    @Override
    public String toString() {
        return "Magicien{confirmé =" + confirmé + " Nom : " + nom + "Niveau de vie : " + this.getPv() + '}';
    }

}

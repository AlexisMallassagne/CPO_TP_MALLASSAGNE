/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_mallassagne;

/**
 *
 * @author xelat
 */
public class Guerrier extends Personnage{
    private boolean cheval;

    public Guerrier(boolean cheval, String Nom, int niveaudeVie) {
        super(Nom, niveaudeVie);
        this.cheval = cheval;
    }

    public boolean isCheval() {
        return cheval;
    }

    public void setCheval(boolean cheval) {
        this.cheval = cheval;
    }

    @Override
    public String toString() {
        return "Guerrier{" + "cheval= " + cheval + '}';
    }
    
}

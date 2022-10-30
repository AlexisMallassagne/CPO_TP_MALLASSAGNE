/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_mallassagne;

/**
 *
 * @author xelat
 */
public class Convertisseur { //Création de la classe Convertisseur

    public Convertisseur() { //Remplissage de la classe Convertisseur avec 1 attribut
        nbConversion = 0;
    }
    int nbConversion;

    /**
     * Prend en entrée la valeur en degrée Celcius puis la convertit en Kelvin
     * et la renvoie
     *
     * @param celcius
     * @return la temperature en Kelvin
     */
    public double CelciusVersKelvin(double celcius) {

        double Kelvin = celcius + 273.15;
        nbConversion += 1;

        return Kelvin;

    }

    /**
     * Prend en entrée la valeur en degrée Kelvin puis la convertit en Celcius
     * et la renvoie
     *
     * @param kelvin
     * @return la temperature en Celcius
     */
    public double KelvinVersCelcius(double kelvin) {

        double celcius = kelvin - 273.15;
        nbConversion += 1;

        return celcius;

    }

    /**
     * Prend en entrée la valeur en degrée Farenheit puis la convertit en
     * Celcius et la renvoie
     *
     * @param farenheit
     * @return la temperature en Celcius
     */
    public double FarenheitVersCelcius(double farenheit) {

        double celcius = (farenheit - 32) / 1.8;
        nbConversion += 1;

        return celcius;

    }

    /**
     * Prend en entrée la valeur en degrée Celcius puis la convertit en
     * Farenheit et la renvoie
     *
     * @param celcius
     * @return la temperature en Farenheit
     */
    public double CelciusVersFarenheit(double celcius) {

        double farenheit = (celcius * 1.8) + 32;
        nbConversion += 1;

        return farenheit;

    }

    /**
     * Prend en entrée la valeur en degrée Kelvin puis la convertit en Farenheit
     * et la renvoie
     *
     * @param kelvin
     * @return la temperature en Farenheit
     */
    public double KelvinVersFarenheit(double kelvin) {

        double farenheit = CelciusVersFarenheit(KelvinVersCelcius(kelvin));
        nbConversion += 1;

        return farenheit;

    }

    /**
     * Prend en entrée la valeur en degrée Farenheit puis la convertit en kelvin
     * et la renvoie
     *
     * @param farenheit
     * @return la temperature en Kelvin
     */
    public double FarenheitVersKelvin(double farenheit) {

        double kelvin = CelciusVersKelvin(FarenheitVersCelcius(farenheit));
        nbConversion += 1;

        return kelvin;
    }

    /**
     * La methode toString retourne la chaine de caracteres que l'on souhaite
     * afficher quand l'objet est cité. C'est une methode qui s'appelle
     * automatiquement quand est cité dans System.out.println()
     */
    @Override
    public String toString() {
        return "nb de conversions " + nbConversion;
    }
}

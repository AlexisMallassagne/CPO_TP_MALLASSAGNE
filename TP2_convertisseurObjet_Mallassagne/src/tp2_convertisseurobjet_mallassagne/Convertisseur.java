/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_mallassagne;

/**
 *
 * @author xelat
 */
public class Convertisseur {
    public Convertisseur() {
        nbConversion=0;
    }
        int nbConversion;

    public double CelciusVersKelvin(double celcius){
        
        double Kelvin = celcius + 273.15;
        nbConversion +=1;
        
        return Kelvin;
        
    }
    
    
    public double KelvinVersCelcius(double kelvin){

        double celcius = kelvin - 273.15;
        nbConversion +=1;

        return celcius;
        
    }
    
    
    public double FarenheitVersCelcius(double farenheit){

        double celcius = (farenheit - 32) / 1.8;
        nbConversion +=1;

        return celcius;

    }


    public double CelciusVersFarenheit(double celcius){

        double farenheit = (celcius * 1.8) + 32;
        nbConversion +=1;

        return farenheit;
        
    }
    
    
    public double KelvinVersFarenheit(double kelvin){

        double farenheit = CelciusVersFarenheit(KelvinVersCelcius(kelvin));
        nbConversion +=1;

        return farenheit;
        
    }
    
    
    public double FarenheitVersKelvin(double farenheit){

        double kelvin = CelciusVersKelvin(FarenheitVersCelcius(farenheit));
        nbConversion +=1;

        return kelvin;
    }
    
    @Override
    public String toString () {
        return "nb de conversions"+ nbConversion;
    }
}

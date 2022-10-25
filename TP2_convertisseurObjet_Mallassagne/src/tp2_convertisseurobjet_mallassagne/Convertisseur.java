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

    public Convertisseur(int nbconv) {
        nbConversions = nbconv;
    }
    int nbConversions=0;
    public double CelciusVersKelvin(double celcius){
        
        double Kelvin = celcius + 273.15;
        nbConversions +=1;
        
        return Kelvin;
        
    }
    
    
    public double KelvinVersCelcius(double kelvin){

        double celcius = kelvin - 273.15;
        nbConversions +=1;

        return celcius;
        
    }
    
    
    public double FarenheitVersCelcius(double farenheit){

        double celcius = (farenheit - 32) / 1.8;
        nbConversions +=1;

        return celcius;

    }


    public double CelciusVersFarenheit(double celcius){

        double farenheit = (celcius * 1.8) + 32;
        nbConversions +=1;

        return farenheit;
        
    }
    
    
    public double KelvinVersFarenheit(double kelvin){

        double farenheit = CelciusVersFarenheit(KelvinVersCelcius(kelvin));
        nbConversions +=1;

        return farenheit;
        
    }
    
    
    public double FarenheitVersKelvin(double farenheit){

        double kelvin = CelciusVersKelvin(FarenheitVersCelcius(farenheit));
        nbConversions +=1;

        return kelvin;
    }
    
    @Override
public String toString () {
return "nb de conversions"+ nbConversions;
}

}

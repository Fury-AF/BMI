/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tojasfarm;

import java.util.ArrayList;
import java.util.List;
import tojasfarm.Tyukok;
/**
 *
 * @author antalferencgeza
 */
public class TojasFarm {

    /**
     * @param args the command line arguments
     */
    
    private static List<Double>napokLista=new ArrayList<>();
    private static Tyukok TojasFarm= new Tyukok();
    private static Tyukok UjTojasFarm = new Tyukok();
    public static void main(String[] args) {
        // TODO code application logic here
       System.out.println("\nTyúkok:");
        
        //a) feladat:
        System.out.println("A tyúkok számának 4%-os csökkentése után az évi termelés: "+ Math.round(eviTermeles())+" tojás.");
        
        //b) feladat:
        System.out.println("Évi 8%-os termelésnövekedésnél a tyúkok számát "+ Math.round(tyukSzam())+"%-kal csökkentették.");
    
    }
    
   private static double eviTermeles(){
        TojasFarm.setOssztyuk(10000.0);
        TojasFarm.setTojasokszama(2.2*Math.pow(10, 6));
        double ujtojasokszama=TojasFarm.egytojotermeles()*1.08*(TojasFarm.getOssztyuk()*0.96);
        return ujtojasokszama;
    }
    private static double tyukSzam(){
        int szazalek=0;
        for (int i = 0; i < 30; i++) {
            UjTojasFarm.setOssztyuk(TojasFarm.getOssztyuk()-TojasFarm.getOssztyuk()*(i/100.0));
            double ujtermeles=TojasFarm.egytojotermeles()*(1+((2*i)/100.0));
            UjTojasFarm.setTojasokszama(UjTojasFarm.getOssztyuk()*ujtermeles);
            if (UjTojasFarm.getTojasokszama()==TojasFarm.getTojasokszama()*1.08) {
                szazalek=i;
            }
        }
        return szazalek;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tojasfarm;

/**
 *
 * @author antalferencgeza
 */
public class Tyukok {
    private double ossztyuk;
    private double tojasokszama;

    public void setOssztyuk(double ossztyuk) {
        this.ossztyuk = ossztyuk;
    }

    public void setTojasokszama(double tojasokszama) {
        this.tojasokszama = tojasokszama;
    }
    
    public double getOssztyuk(){
        return ossztyuk;
    }

    public double getTojasokszama() {
        return tojasokszama;
    }
    
    public double egytojotermeles(){
        return tojasokszama/ossztyuk;
    }
    
}


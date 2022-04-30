/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ital;

/**
 *
 * @author antalferencgeza
 */
public class Bor {
    private String fajta;
    private int evjarat;
    
    public Bor(String fajta, int evjarat){
        this.fajta = fajta;
        this.evjarat = evjarat;
    }
    public String getFajta(){
        return fajta;
    }
    public void setFajta(String fajta){
        this.fajta = fajta;
    }
    public int getEvjarat(){
        return evjarat;
    }
    public void setEvjarat(int evjarat){
        this.evjarat = evjarat;
    }
    @Override
    public String toString(){
        return "Bor [fajta=" + fajta + ", evjarat=" + evjarat + "]";
    }
    
}

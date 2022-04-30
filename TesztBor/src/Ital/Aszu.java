/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ital;

/**
 *
 * @author antalferencgeza
 */
public class Aszu extends Bor{
    private int puttony;
    public Aszu(int evjarat, int puttony){
        super("aszu", evjarat);
        this.puttony = puttony;
    }
    public int getPuttony(){
        return puttony;
    }
    public void setPuttony(int puttony){
        this.puttony = puttony;
    }
   
    public String toString(){
        return "Aszu [Puttony= " + getEvjarat()+ " evjarat= " + this.puttony +  "]";
    }
    
}
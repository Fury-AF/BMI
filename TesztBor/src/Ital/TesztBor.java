/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ital;

/**
 *
 * @author antalferencgeza
 */
import Ital.Aszu;
import Ital.Bor;
        
public class TesztBor{

     public static void kiirBor(Bor bor){
         System.out.println(bor);
     }
    
     
    public static void main(String[] args){
        for (int i =0; i <args.length; i++){
            if(args[i].equals("Aszu")){
                int puttony = Integer.parseInt(args[i+1]);
                int evjarat = Integer.parseInt(args[i+2]);
                Bor aszu = new Aszu(puttony,evjarat);
                kiirBor(aszu);
                i+=2;
            }
            else{
                int evjarat =   Integer.parseInt(args[i+1]);
                Bor bor = new Bor(args[i], evjarat);
                kiirBor(bor);
                i+=1;
            }
        }
    }
    
}


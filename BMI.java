/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bmi;

/**
 *
 * @author antalferencgeza
 */
import java.util.Scanner;
public class BMI {
   
    public static void main(String[] args) {
      Scanner calc = new Scanner(System.in);
      System.out.println("Kérem adja meg a nemét(f/n):");
      String sex = calc.nextLine();
      
      System.out.println("Kérem adja meg az életkorát:");
      int age = calc.nextInt();
      
      System.out.println("Kérem adja meg a magasságát(cm):");
      double height = calc.nextDouble()/100;
     
      System.out.println("Kérem adja meg a testtömegét(kg):");
      double weight = calc.nextDouble();
              
     double bmi = (weight / (height*height));
      
     System.out.println("AZ ön életkora: " + age + " Az ön BMI indexe: " +bmi);
        
     
      if ( bmi < 20) { 
          System.out.println("Ön sovány.");
          int i = 0;
          while (bmi < 20) {
              i++;
              weight = weight + 1;
              bmi = (weight / (height*height));
          }
          System.out.println("Önnek "+i+" kilót kell híznia hogy normál testalkatú legyen.");
      }
      
      else if (bmi > 25) {
            System.out.println("Ön túlsúlyos.");
            int i = 0;
            while (bmi > 25) {              
              i++;
              weight = weight - 1;
              bmi = (weight / (height*height));
          }
          System.out.println("Önnek "+i+" kilót kell fogynia hogy normál testalkatú legyen.");
      }
      
      else {
          System.out.println("Ön normál testalkatú.");
      }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BMI;

/**
 *
 * @author antalferencgeza
 */
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
//      System.out.println("Kérem adja meg a nemét(f/n):");
        char sex = extra.Console.readChar("Kérem adja meg a nemét(f/n):");
      
      System.out.println("Kérem adja meg az életkorát:");
      int age = calc.nextInt();
      
      System.out.println("Kérem adja meg a magasságát(cm):");
      double height = calc.nextDouble()/100;
     
      System.out.println("Kérem adja meg a testtömegét(kg):");
      double weight = calc.nextDouble();
              
     double bmi = (weight / (height*height));
      
     System.out.println("AZ ön életkora: " + age + " Az ön BMI indexe: " +bmi);
    
    
        
    if (sex =='f'){                                                     //nem figyelembevétel
        if (19 < age && age < 24){                             //életkor figyelembevétel
            if ( bmi < 19 ) { 
                System.out.println("Ön sovány.");
                int i = 0;
                while (bmi < 19) {
                    i++;
                    weight = weight + 1;
                    bmi = (weight / (height*height));
                }
                System.out.println("Önnek "+i+" kilót kell híznia hogy normál testalkatú legyen.");
            }

            else if (bmi > 25 ) {
                  System.out.println("Ön túlsúlyos.");
                  int i = 0;
                  while (bmi > 25.1) {              
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
        else if (25 < age && age < 34){
            if ( bmi < 20  ) { 
                System.out.println("Ön sovány.");
                int i = 0;
                while (bmi < 20) {
                    i++;
                    weight = weight + 1;
                    bmi = (weight / (height*height));
                }
                System.out.println("Önnek "+i+" kilót kell híznia hogy normál testalkatú legyen.");
            }

            else if (bmi > 25 ) {
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
           else if (35 < age && age < 44){
        if ( bmi < 21  ) { 
                System.out.println("Ön sovány.");
                int i = 0;
                while (bmi < 21) {
                    i++;
                    weight = weight + 1;
                    bmi = (weight / (height*height));
                }
                System.out.println("Önnek "+i+" kilót kell híznia hogy normál testalkatú legyen.");
            }

            else if (bmi > 26 ) {
                  System.out.println("Ön túlsúlyos.");
                  int i = 0;
                  while (bmi > 26) {              
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
        else if (45 < age && age < 54){
            if ( bmi < 22  ) { 
                System.out.println("Ön sovány.");
                int i = 0;
                while (bmi < 22) {
                    i++;
                    weight = weight + 1;
                    bmi = (weight / (height*height));
                }
                System.out.println("Önnek "+i+" kilót kell híznia hogy normál testalkatú legyen.");
            }

            else if (bmi > 27 ) {
                  System.out.println("Ön túlsúlyos.");
                  int i = 0;
                  while (bmi > 27) {              
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
        else if (55 < age && age < 64){
            if ( bmi < 23  ) { 
                System.out.println("Ön sovány.");
                int i = 0;
                while (bmi < 23) {
                    i++;
                    weight = weight + 1;
                    bmi = (weight / (height*height));
                }
                System.out.println("Önnek "+i+" kilót kell híznia hogy normál testalkatú legyen.");
            }

            else if (bmi > 28 ) {
                  System.out.println("Ön túlsúlyos.");
                  int i = 0;
                  while (bmi > 28) {              
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
        else {
            if ( bmi < 24  ) { 
                System.out.println("Ön sovány.");
                int i = 0;
                while (bmi < 24) {
                    i++;
                    weight = weight + 1;
                    bmi = (weight / (height*height));
                }
                System.out.println("Önnek "+i+" kilót kell híznia hogy normál testalkatú legyen.");
            }

            else if (bmi > 29 ) {
                  System.out.println("Ön túlsúlyos.");
                  int i = 0;
                  while (bmi > 29) {              
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
    
    else if(sex=='n'){                                         //nem figyelbevétel
        if (19 < age && age < 24){                             //életkor figyelembevétel
            if ( bmi < 18.5 ) { 
                System.out.println("Ön sovány.");
                int i = 0;
                while (bmi < 18.5) {
                    i++;
                    weight = weight + 1;
                    bmi = (weight / (height*height));
                }
                System.out.println("Önnek "+i+" kilót kell híznia hogy normál testalkatú legyen.");
            }

            else if (bmi > 24.5 ) {
                  System.out.println("Ön túlsúlyos.");
                  int i = 0;
                  while (bmi > 24.5) {              
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
        else if (25 < age && age < 34){
            if ( bmi < 19  ) { 
                System.out.println("Ön sovány.");
                int i = 0;
                while (bmi < 19) {
                    i++;
                    weight = weight + 1;
                    bmi = (weight / (height*height));
                }
                System.out.println("Önnek "+i+" kilót kell híznia hogy normál testalkatú legyen.");
            }

            else if (bmi >25  ) {
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
           else if (35 < age && age < 44){
        if ( bmi < 20.5  ) { 
                System.out.println("Ön sovány.");
                int i = 0;
                while (bmi < 20.5) {
                    i++;
                    weight = weight + 1;
                    bmi = (weight / (height*height));
                }
                System.out.println("Önnek "+i+" kilót kell híznia hogy normál testalkatú legyen.");
            }

            else if (bmi > 25.5 ) {
                  System.out.println("Ön túlsúlyos.");
                  int i = 0;
                  while (bmi > 25.5) {              
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
        else if (45 < age && age < 54){
            if ( bmi < 21  ) { 
                System.out.println("Ön sovány.");
                int i = 0;
                while (bmi < 21) {
                    i++;
                    weight = weight + 1;
                    bmi = (weight / (height*height));
                }
                System.out.println("Önnek "+i+" kilót kell híznia hogy normál testalkatú legyen.");
            }

            else if (bmi > 26 ) {
                  System.out.println("Ön túlsúlyos.");
                  int i = 0;
                  while (bmi > 26) {              
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
        else if (55 < age && age < 64){
            if ( bmi < 22.5  ) { 
                System.out.println("Ön sovány.");
                int i = 0;
                while (bmi < 22.5) {
                    i++;
                    weight = weight + 1;
                    bmi = (weight / (height*height));
                }
                System.out.println("Önnek "+i+" kilót kell híznia hogy normál testalkatú legyen.");
            }

            else if (bmi > 27.5 ) {
                  System.out.println("Ön túlsúlyos.");
                  int i = 0;
                  while (bmi > 27.5) {              
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
        else {
            if ( bmi < 23  ) { 
                System.out.println("Ön sovány.");
                int i = 0;
                while (bmi < 23) {
                    i++;
                    weight = weight + 1;
                    bmi = (weight / (height*height));
                }
                System.out.println("Önnek "+i+" kilót kell híznia hogy normál testalkatú legyen.");
            }

            else if (bmi > 28 ) {
                  System.out.println("Ön túlsúlyos.");
                  int i = 0;
                  while (bmi > 28) {              
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
    
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
//     
//     if ( bmi < 20 && sex =='f' ) { 
//          System.out.println("Ön sovány.");
//          int i = 0;
//          while (bmi < 20) {
//              i++;
//              weight = weight + 1;
//              bmi = (weight / (height*height));
//          }
//          System.out.println("Önnek "+i+" kilót kell híznia hogy normál testalkatú legyen.");
//      }
//      
//      else if (bmi > 25.1 && sex =='f') {
//            System.out.println("Ön túlsúlyos.");
//            int i = 0;
//            while (bmi > 25.1) {              
//              i++;
//              weight = weight - 1;
//              bmi = (weight / (height*height));
//          }
//          System.out.println("Önnek "+i+" kilót kell fogynia hogy normál testalkatú legyen.");
//      }
//      
//      else if ( bmi < 18.6 && sex =='n') { 
//          System.out.println("Ön sovány.");
//          int i = 0;
//          while (bmi < 18.6) {
//              i++;
//              weight = weight + 1;
//              bmi = (weight / (height*height));
//          }
//          System.out.println("Önnek "+i+" kilót kell híznia hogy normál testalkatú legyen.");
//      }
//      
//      else if (bmi > 23.8 && sex =='n' && 19<age && age<24) {
//            System.out.println("Ön túlsúlyos.");
//            int i = 0;
//            while (bmi > 23.8) {              
//              i++;
//              weight = weight - 1;
//              bmi = (weight / (height*height));
//          }
//          System.out.println("Önnek "+i+" kilót kell fogynia hogy normál testalkatú legyen.");
//      }
//      
//      else {
//          System.out.println("Ön normál testalkatú.");
//      }
    }
        
    }


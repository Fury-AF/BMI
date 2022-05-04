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


class OutOfRangeException extends RuntimeException {

  OutOfRangeException(String s) {
    super(s);
  }
}
public class BMI {
   
    public static void main(String[] args) {
      Scanner calc = new Scanner(System.in);
//      System.out.println("Kérem adja meg a nemét(f/n):");
        char sex = extra.Console.readChar("Kérem adja meg a nemét(f/n):");
      
      System.out.print("Kérem adja meg az életkorát:");
      int age = calc.nextInt();
      
//      static int beolvasAge(int tola, int iga) {
//    int age=0;
//    boolean ok=false;
//    while(!ok) {
//      try {
//        age=Integer.parseInt(extra.Console.readLine("Kor [18; 100]: "));
//        if(age<tola || age>iga)
//          throw new OutOfRangeException("Hiba: "+tola+"-tol "+iga+"-ig!");
//        ok=true;
//      }
//      catch (NumberFormatException e) {
//        System.out.println("Illegalis karakter!");
//      }
//      catch (OutOfRangeException e) {
//        System.out.println(e.getMessage());
//      }
//    }
//    return age;
//  };
//      
      System.out.print("Kérem adja meg a magasságát(cm):");
      double height = calc.nextDouble()/100;
      
// static int beolvasHeight(int tolh, int igh) {
//    int height=0;
//    boolean ok=false;
//    while(!ok) {
//      try {
//        height=Integer.parseInt(extra.Console.readLine("Magasság [150; 280]: "));
//        if(height<tolh || height>igh)
//          throw new OutOfRangeException("Hiba: "+tolh+"-tol "+igh+"-ig!");
//        ok=true;
//      }
//      catch (NumberFormatException e) {
//        System.out.println("Illegalis karakter!");
//      }
//      catch (OutOfRangeException e) {
//        System.out.println(e.getMessage());
//      }
//    }
//    return height/100;
//  };
     
      System.out.print("Kérem adja meg a testtömegét(kg):");
      double weight = calc.nextDouble();
              
// static int beolvasSúly(int tolw, int igw) {
//    int weight=0;
//    boolean ok=false;
//    while(!ok) {
//      try {
//        weight=Integer.parseInt(extra.Console.readLine("Súly [50; 450]: "));
//        if(weight<tolw || weight>igw)
//          throw new OutOfRangeException("Hiba: "+tolw+"-tol "+igw+"-ig!");
//        ok=true;
//      }
//      catch (NumberFormatException e) {
//        System.out.println("Illegalis karakter!");
//      }
//      catch (OutOfRangeException e) {
//        System.out.println(e.getMessage());
//      }
//    }
//    return weight;
//  };   
   double bmi = (weight / (height*height));
     System.out.print("AZ ön életkora: " + age + " Az ön BMI indexe: " +bmi);
 
//  public static void main(String[] args) {
//      Scanner calc = new Scanner(System.in);
////      System.out.println("Kérem adja meg a nemét(f/n):");
//        char sex = extra.Console.readChar("Kérem adja meg a nemét(f/n):"); 
//   
//    
  
        
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


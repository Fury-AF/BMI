/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BMI_OOP;

/**
 *
 * @author antalferencgeza
 */



public class Index_kor extends Index{
        private int age;
        
        public Index_kor(float bmi, int age){
            super( "kor" , bmi);
            this.age=age;
        }
        public int getAge(){
            return age;
        }
        public void setAge(){
            this.age=age;
        }
}

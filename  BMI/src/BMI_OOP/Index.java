/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BMI_OOP;

/**
 *
 * @author antalferencgeza
 */
public class Index {
    private float height;
    private float weight;
    
    public Index(float height, float weight){
        this.height=height;
        this.weight=weight;
    }

    
    public float getHeight(){
        return height;    
    }
    
    public float getWeight(){
        return weight;
    }
    public void setHeight(){
        this.height=height;
    }
    public void setWeight(){
        this.weight=weight;
    }
    
    public static void Bmi_index(float height, float weight){
        float bmi= weight/(height*height);
        }
    
}


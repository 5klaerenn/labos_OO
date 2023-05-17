/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cours5.Labo;

/**
 *
 * @author abenkhedher
 */
public class Circle extends Shape {
    
    final static double PI = 3.141592564 ;
    private double radius ;
    private double surface;

    public Circle() {
        radius = 0 ;
    }
        
    public Circle(double x, double y, double r) {
        super(x,y) ;
        radius = r ;
    }
    
    public void setRadius(double r){
        this.radius = r;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public double getSurface(){
        return surface;
    }
    
    public double calculerSurface(){
        return surface = radius * radius * PI;
    }
    
    public boolean isBigger(Circle c){
        return this.equals(c);
    }
    
    public String toString() {
        calculerSurface();
        return super.toString() + " Rayon : " + radius + " Surface : " + surface;
    }

    public boolean equals(Object obj){
       if(obj instanceof Circle){
           
           Circle autre = (Circle) obj;
           
           if(this.surface == autre.surface){
              return true;
           } else{
                   return false; 
                   }
       } else 
           return false;
   }
    
}

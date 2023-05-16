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

    public Circle() {
        radius = 0 ;
    }
        
    public Circle(double x, double y, double r) {
        super(x,y) ;
        radius = r ;
    }
    
    public String toString() {
        return super.toString() + " Rayon : " + radius ;
    }

    
}

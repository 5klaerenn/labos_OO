/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cours5.Labo;

/**
 *
 * @author Sklaerenn
 */
public class ColoredCircle extends Circle {
    
    private String color;
    
    public ColoredCircle(){
        this.color = "blanc";
    }
    
    public ColoredCircle(double x, double y, double r, String c){
        super(x, y, r);
        this.color = c; 
    }
    
    public String toString() {
        return super.toString() + " Rayon : " + getRadius() + " Surface : " + super.calculerSurface() + " Couleur : " + color;
    }
}


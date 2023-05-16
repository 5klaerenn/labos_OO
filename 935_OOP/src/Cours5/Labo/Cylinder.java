/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cours5.Labo;

/**
 *
 * @author Sklaerenn
 */
public class Cylinder extends Circle {
    
    private double hauteur;
    private double volume;

    public Cylinder(){
        this.hauteur = 0.0;
    }

    public Cylinder(double x, double y, double r, double h){
        super(x, y, r);
        hauteur = h;
    }
    
    public double calculerVolume(){
        return volume = super.calculerSurface() * hauteur;
    }
    
    public String toString() {
        return super.toString() + " Volume : " + volume;
    }
        
        

}

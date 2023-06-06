/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Formatif3;

/**
 *
 * @author Sklaerenn
 */
public class Cercle extends FormeGeo {
    
    private double rayon; 
    
    public Cercle(String c, double x, double y, double r){
        super(c, x, y);
        this.rayon = r;
    }
    
    public String toString(){
        return super.toString() + " est un Cercle de rayon : " + this.rayon;
    }

    public double calculerAire() {
        return 2 * Math.PI * rayon; 
    }
    
    

}

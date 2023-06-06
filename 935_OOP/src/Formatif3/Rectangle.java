/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Formatif3;

/**
 *
 * @author Sklaerenn
 */
public class Rectangle extends FormeGeo {
    
    private double largeur;
    private double hauteur;
    
    public Rectangle(String c, double x, double y, double l, double h){
        super(c, x, y);
        this.largeur = l;
        this.hauteur = h;
    }
    
    public String toString(){
        
        String s = new String();
        s = super.toString() + " est un Rectangle de largeur : " + this.largeur + " et de hauteur : " + this.hauteur  + "\n";
        s += "Aire : " + calculerAire()  + "\n"; 
        s += "Distance par rapport à l'origine : " + calculerDistance();
                
        return s;
    }
    
    public double calculerAire(){
        return largeur * hauteur;
    }
    
    public double calculerDistance(){
        return Math.sqrt(super.getPositionX() * super.getPositionX() + super.getPositionY() * super.getPositionY());
    } 
    
    public void deplacer(double x, double y){       
        
        double xActuel = super.getPositionX(); 
        double yActuel = super.getPositionY(); 
        
        xActuel += x;
        yActuel += y;
        
        super.setPositionX(xActuel);
        super.setPositionY(yActuel);
        
    }
    
}

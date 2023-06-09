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
        String s = new String(); 
        s = super.toString() + " est un Cercle de rayon : " + this.rayon + "\n";
        s += " Aire : " + calculerAire() + "\n"; 
        s += "Distance par rapport à l'origine : " + calculerDistance();
                
        return s;
    }

    public double calculerAire() {
        return 2 * Math.PI * rayon; 
    }
    
    public double calculerDistance(){
        return Math.sqrt(super.getPositionX() * super.getPositionX() + super.getPositionY() * super.getPositionY());
    } 
    
        double xActuel = super.getPositionX(); 
    public void deplacer(double x, double y){       
        
        double yActuel = super.getPositionY(); 
        
        xActuel += x;
        yActuel += y;
        
        super.setPositionX(xActuel);
        super.setPositionY(yActuel);
        
    }

}

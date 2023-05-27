/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cours7.Labo;

/**
 *
 * @author Sklaerenn
 */
public class Cercle implements FormesGeometriques {
    
    private double rayon; 
    
    public Cercle(double r){
        this.rayon = r;
    }
    
    public double diametre() {
        return rayon * 2;
    }
    
    public double surface(){
        return rayon * rayon * Math.PI;
    };
    
    public double perimetre(){
        return 2 * Math.PI * rayon;
    };
    

    @Override
    public String affiche() {
        String s;
        s = "**************************************\n";
        s += "Je suis un cercle : (" + rayon + ") \n";
        s += "Ma surface : " + surface() + "\n";
        s += "Mon perimetre : " + perimetre();
        
        return s;
    }

}

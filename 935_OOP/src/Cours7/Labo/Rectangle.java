/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cours7.Labo;

/**
 *
 * @author Sklaerenn
 */
public class Rectangle implements FormesGeometriques {
    
    private double largeur;
    private double longueur; 
    
    public Rectangle(double lar, double lon){
        this.largeur = lar;
        this.longueur = lon;
    }
    
    public Rectangle(double lar){
        this.largeur = lar;
    }

    public double getLargeur() {
        return largeur;
    }
    
    
    
    public double surface(){
        return longueur * largeur;
    };
    
    public double perimetre(){
        return 2 * (longueur + largeur);
    };

    @Override
    public String affiche() {
        String s;
        s = "**************************************\n";
        s += "Je suis un rectangle : (" + largeur + ", " + longueur +") \n";
        s += "Ma surface : " + surface() + "\n";
        s += "Mon perimetre : " + perimetre();
        
        return s;
    }
    
    

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cours7.Labo;


/**
 *
 * @author Sklaerenn
 */
public class Carre extends Rectangle{
    
    public Carre(double lar){
        super(lar);
    }
    
    public double surface(){
        return super.getLargeur() * super.getLargeur();
    };
    
    public double perimetre(){
        return 2 * (super.getLargeur() + super.getLargeur());
    };
    
    public String affiche() {
        String s;
        s = "**************************************\n";
        s += "Je suis un carré : (" + super.getLargeur() +") \n";
        s += "Ma surface : " + surface() + "\n";
        s += "Mon perimetre : " + perimetre();
        
        return s;
    }

}

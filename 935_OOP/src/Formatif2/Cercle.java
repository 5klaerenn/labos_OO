/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Formatif2;

/**
 *
 * @author Sklaerenn
 */
public class Cercle extends Ellipse {

    public Cercle(double p) {
        super(p);
    }
    
    public double diametre(){
        return super.getPetitAxe() + super.getPetitAxe(); 
    };
    
    public double aire(){
        return 2 * super.getPI() * super.getPetitAxe();
    }
    
    public String afficher() {
        return "L'aire du cercles (" + super.getPetitAxe() + ") est : " + aire();
    }    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Formatif2;

/**
 *
 * @author Sklaerenn
 */
public class Trapeze extends FormeEuclidienne {
    
    private double petiteBase;
    private double grandeBase;
    private double hauteur;
    
    public Trapeze(double p, double g, double h){
        this.petiteBase = p;
        this.grandeBase = g;
        this.hauteur = h;
    }
    
    public double aire(){
        return ((petiteBase+grandeBase)*hauteur)/2;
    }
    
    public String afficher() {
        return "L'aire du trapeze (" + petiteBase + ", " + grandeBase + ", " + hauteur + ") est : " + aire();
    }    


}

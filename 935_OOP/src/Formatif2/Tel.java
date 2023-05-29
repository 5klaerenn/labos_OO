/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Formatif2;

/**
 *
 * @author Sklaerenn
 */
public class Tel extends Produit {
    
    private int capacité; 
    
    private final double taxe = 1.10;
    
    public Tel(double p, String m, int c){
        super(p, m);
        this.capacité = c;
    }
    
    public double calculerPrixTTC(){
        return super.getPrixNet() * taxe;
    }

    public int getCapacite() {
        return capacité;
    }
        
    @Override
    public String afficher() {
        return "Le téléphone (" + capacité + "G) de " + super.afficher() + " a un prix égal à " + calculerPrixTTC();
    }

}

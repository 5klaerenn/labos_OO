/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Formatif2;

/**
 *
 * @author Sklaerenn
 */
public class Ordinateur extends Produit {

    private String processeur; 
    
    private final double taxe = 1.15; 
    
    public Ordinateur(double p, String m, String pr){
        super(p, m);
        this.processeur = pr;
    }
    
    public double calculerPrixTTC(){
        return super.getPrixNet() * taxe;
    }
    
    @Override
    public String afficher() {
        return "L'ordinateur (" + processeur + ") de " + super.afficher() + " a un prix égal à " + calculerPrixTTC();
    }
    
}

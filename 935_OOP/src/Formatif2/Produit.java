/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Formatif2;

/**
 *
 * @author Sklaerenn
 */
public abstract class Produit {
    
    private double prixNet;
    private String marque;
    
    public Produit(double p, String m){
        this.prixNet = p;
        this.marque = m;
    }

    public double getPrixNet() {
        return prixNet;
    }
    
    public String afficher(){
        return "la marque " + marque;
    }
    
    public abstract double calculerPrixTTC();
}

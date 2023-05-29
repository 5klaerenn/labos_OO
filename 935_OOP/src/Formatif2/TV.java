/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Formatif2;

/**
 *
 * @author Sklaerenn
 */
public class TV extends Produit {
    private int taille;
    
    private final double taxe = 1.20;
    
    public TV(double p, String m, int t){
        super(p, m);
        this.taille = t;
    }
    
    public double calculerPrixTTC(){
        return super.getPrixNet() * taxe;
    }

    @Override
    public String afficher() {
        return "La télévison (" + taille + " pouces) de " + super.afficher() + " a un prix égal à " + calculerPrixTTC();
    }
    
    

}

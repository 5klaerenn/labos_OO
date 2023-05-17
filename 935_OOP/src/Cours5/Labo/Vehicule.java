/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cours5.Labo;

/**
 *
 * @author Sklaerenn
 */
public class Vehicule {
    
    private String marque;
    private double prixAchat;
    private double prixCourant;
    
    public Vehicule(String m, double pa, double pc){
        this.marque = m;
        this.prixAchat = pa;
        this.prixCourant = pc;
    }

    public double getPrixAchat() {
        return prixAchat;
    }

    public double getPrixCourant() {
        return prixCourant;
    }
    
    public void afficher(){
        System.out.println("Je suis un vehicule : "+marque+", "+prixAchat+", "+prixCourant+".");
    }

}

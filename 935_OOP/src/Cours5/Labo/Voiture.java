/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cours5.Labo;

/**
 *
 * @author Sklaerenn
 */
public class Voiture extends Vehicule {
    
    private double chevaux; 
    private int nbPortes;
    private double kilometrage;
    
    public Voiture(String m, double pa, double pc, double c, int nbp, double km){
        super(m, pa, pc);
        this.chevaux = c;
        this.nbPortes = nbp;
        this.kilometrage = km;
    }
    
    public double calculPrix(){
        return super.getPrixAchat() - super.getPrixCourant();
    }
    
    public void afficher(){
        System.out.println("Je suis une voiture : "+ chevaux +", " + nbPortes + ", "+ kilometrage +".");
    }
    

}

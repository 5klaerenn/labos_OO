/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cours5.Labo;

/**
 *
 * @author Sklaerenn
 */
public class Avion extends Vehicule {
    
    private String moteur;
    private double heuresVol;
    
    public Avion(String m, double pa, double pc, String mot, double hv){
        super(m, pa, pc);
        this.moteur = mot;
        this.heuresVol = hv;
    }
    
    public double calculPrix(){
        return super.getPrixAchat() - super.getPrixCourant();
    }
    
    public void afficher(){
        System.out.println("Je suis un avion : "+ moteur +", " + heuresVol +".");
    }

}

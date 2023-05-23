/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cours6.Labo;

/**
 *
 * @author Sklaerenn
 */
public class Vendeur extends Commercial {

    private final double pourcentageVendeur = 0.2;
    private final int bonusVendeur = 400;
    
    public Vendeur(String n, String p, int a, String e, double ca){
        super(n, p, a, e, ca);
    }

    @Override
    public String getTitre() {
        return "Le vendeur ";
    }

    @Override
    public double calculerSalaire() {
        return (getChiffreAff() * 0.2) + bonusVendeur;
    }
    
    
    
    
    
    
    
}

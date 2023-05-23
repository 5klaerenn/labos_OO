/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cours6.Labo;

/**
 *
 * @author Sklaerenn
 */
public abstract class Ustensile {
    
    private int annee;
    
    public Ustensile(int a){
        this.annee = a;
    }

    public int getAnnee() {
        return annee;
    }
    
    
    public int calculerValeur(int anneeActuelle){
        int valeur = 0;
        int age = anneeActuelle - annee;
        
        if(age > 50){
            valeur = age - 50;
        }
        return valeur;
    };
    

}

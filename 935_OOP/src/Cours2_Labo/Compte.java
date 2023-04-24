/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cours2_Labo;

/**
 *
 * @author Sklaerenn
 */
public class Compte {
    
    private String proprio;
    private int solde ;
    
    public Compte(String p, int s)
    {
        proprio = p;
        solde = s;
    }
    
    void deposer(int montant)
    {
        solde = solde + montant;
    }
    
    void retirer(int montant)
    {
        solde = solde - montant;
    }
    
    void virerVers(int montant, Compte destination)
    {
        this.retirer(montant);
        destination.deposer(montant);
    }
    
    void afficher()
    {
        System.out.println("solde: "+ solde);
    }
        

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cours2.Activité;

/**
 *
 * @author Sklaerenn
 */
public class Compteur {
    
    private int compteur;
    
    public Compteur()
    {
        compteur = 0;
    }
    
    public Compteur(int c)
    {
        compteur = c;
    }
    
    public void incrementer()
    {
        compteur = compteur + 1;
    }
    
    public void decrementer()
    {
        compteur = compteur - 1;
    }
    
    public void aZero()
    {
        compteur = 0;
    }
    
    public void afficher()
    {
        System.out.println("compteur: "+ compteur);

    }
}

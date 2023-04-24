/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cours2_Activité;

/**
 *
 * @author Sklaerenn
 */
public class Test_Compteur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Compteur cpt1 = new Compteur();
        Compteur cpt2 = new Compteur(5);
        
        cpt1.afficher();
        cpt2.afficher();
        
        cpt1.incrementer();
        cpt1.incrementer();
        cpt1.afficher();
        
        cpt2.aZero();
        cpt2.incrementer();
        cpt2.afficher();
        cpt2.decrementer();
        cpt2.afficher();
        
    }
    
}

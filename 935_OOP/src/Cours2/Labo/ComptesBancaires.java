/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cours2.Labo;

/**
 *
 * @author Sklaerenn
 */
public class ComptesBancaires {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Compte compte1 = new Compte("Jean", 5600);
        Compte compte2 = new Compte("Martin", 1200);
        
        compte1.deposer(500);
        compte2.deposer(1000);
        compte2.retirer(10);
        compte1.virerVers(75, compte2);
        
        compte1.afficher();
        compte2.afficher();
        
        
        
    }
    
}

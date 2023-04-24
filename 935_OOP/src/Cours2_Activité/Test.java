/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cours2_Activité;

/**
 *
 * @author Sklaerenn
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Etudiant etu1 = new Etudiant();
        Etudiant etu2 = new Etudiant("ABC1234", "Bob", 75.0);
        
        etu1.setNom("Antoine");
        etu1.setNumero("DUP1234");
        etu1.setNote(92.50);
        
        System.out.println(etu2.getNom() + " a une note de "+etu2.getNote());
        System.out.println("Le numéro de "+etu1.getNom()+" est "+etu1.getNumero());
        
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cours4.Labo;

/**
 *
 * @author Sklaerenn
 */
public class DemoJeuDeDes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int tabFaces[] = {6, 18, 20, 12, 20};
        int[] tabEach = new int[5];
        
        JeuDeDes j1 = new JeuDeDes();
        JeuDeDes j2 = new JeuDeDes(20);
        JeuDeDes j3 = new JeuDeDes(tabFaces);
        
        System.out.println("Lancer du premier set : ");
        j1.lancerSet();
        System.out.println(" ");
        
        System.out.println("Lancer du deuxième set :");
        tabEach = ;
        System.out.println(" ");    
        
        System.out.println("Lancer du troisième set : ");
        j3.lancerSet();
        System.out.println(" ");
                
    }
    

    
}

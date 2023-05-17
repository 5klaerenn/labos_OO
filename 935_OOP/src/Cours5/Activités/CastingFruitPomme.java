/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cours5.Activités;

/**
 *
 * @author Sklaerenn
 */
public class CastingFruitPomme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Fruit monFruit = new Fruit();
        Pomme maPomme = new Pomme();
        
        monFruit.methode1(); 
        monFruit = maPomme; 
        
        monFruit.methode1(); 
        
        //monFruit.methode2(); 

        maPomme = (Pomme)monFruit; // OK! - casting explicite
        maPomme.methode1(); // va afficher : ??
        maPomme.methode2(); // va afficher : ??
        

    } 
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cours6.Labo;

/**
 *
 * @author Sklaerenn
 */
public class TestPersonnes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Personne p1 = new Manager("Kelso", "Bob", 500, "Cobol");
        Personne p2 = new Manager("Cox", "Perry", 475, "QA");
        Personne p3 = new Developpeur("Dorian", "John", 350, "JAVA");
        Personne p4 = new Developpeur("Reid", "Eliott", 325, "Python");
        
        ((Manager) p1).afficher();
        ((Manager) p2).afficher();
        
        ((Developpeur) p3).afficher();
        ((Developpeur) p4).afficher();        

    }
    
}

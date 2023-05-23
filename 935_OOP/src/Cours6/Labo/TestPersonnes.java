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

        Manager m1 = new Manager("Kelso", "Bob", 500, "Cobol");
        Manager m2 = new Manager("Cox", "Perry", 475, "QA");
        Developpeur d1 = new Developpeur("Dorian", "John", 350, "JAVA");
        Developpeur d2 = new Developpeur("Reid", "Eliott", 325, "Python");
        
        m1.afficher();
        m2.afficher();
        
        d1.afficher();
        d2.afficher();        

    }
    
}

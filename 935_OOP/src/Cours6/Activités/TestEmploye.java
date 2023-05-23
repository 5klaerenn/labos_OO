/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cours6.Activités;

/**
 *
 * @author Sklaerenn
 */
public class TestEmploye {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Employe emp1 = new EmployeHoraire("Kelso", "Bob", 25.50, 18, 40);
        Employe emp2 = new EmployeCommission("Dorian", "John", 18.95, 37.5);
        
        ((EmployeHoraire) emp1).afficher(); 
        ((EmployeCommission) emp2).afficher();
       

    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ProjetFinal;

/**
 *
 * @author Sklaerenn
 */
public class TestReservation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Departement d1 = new Departement("Informatique");
        Departement d2 = new Departement("Sciences Humaines");
        Departement d3 = new Departement("Science Nature");
        
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        
        Local l1 = new LocalFormationReguliere(421, 4, 18, 21, "Hiver", d2);
        System.out.println(l1);
        
        Local l2 = new LocalFormationContinue(410, 4, 18, 21, 3);
        System.out.println(l2);
        
        
        System.out.println(l2.reserver(18, 21));
        
        System.out.println("TEST 1 FAUX " + l1.reserver(10, 13));
        System.out.println("TEST 2 FAUX " + l1.reserver(12, 14));
        System.out.println("TEST 3 VRAI " + l1.reserver(9, 12));
        System.out.println("TEST 4 VRAI " + l1.reserver(13, 17));
        System.out.println("TEST 5 FAUX " + l1.reserver(8, 17));
        
        
    }
    
}

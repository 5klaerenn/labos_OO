/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cours5.Labo;

/**
 *
 * @author Sklaerenn
 */
public class TestVehicule {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Voiture v = new Voiture("Toyota",10000, 12000, 125, 5, 25000);
        Avion a = new Avion("Airbus", 350000, 425000, "blorg", 12000);
        
        Vehicule v1 = a;
        Vehicule v2 = v;
        
        System.out.print("v1 : ");
        v1.afficher();
        System.out.print("v2 : ");
        v2.afficher();
        
        Voiture v3 = new Voiture("Ferrari", 92000, 112000, 800, 2, 10000);
        
        System.out.print("v3 : ");
        v3.afficher();
        
        System.out.println("");
        
        System.out.print("Avion v1 : Prix d'achat - Prix courant : ");
        System.out.println(((Avion) v1).calculPrix());
        System.out.print("Voitiure v2 : Prix d'achat - Prix courant : ");
        System.out.println(((Voiture) v2).calculPrix());
        System.out.print("Voitiure v3 : Prix d'achat - Prix courant : ");
        System.out.println(v3.calculPrix());
        
        System.out.println("");
        
        System.out.println("Prix courant des véhicules : ");
        System.out.print("Avion v1 : " + v1.getPrixCourant()+" \n");
        System.out.print("Voiture v2 : " + v2.getPrixCourant()+" \n");
        System.out.print("Voiture v3 : " + v3.getPrixCourant()+" \n");

        
        
        

    }
    
}

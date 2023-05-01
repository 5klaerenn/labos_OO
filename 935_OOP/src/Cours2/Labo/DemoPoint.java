/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cours2.Labo;

/**
 *
 * @author Sklaerenn
 */
public class DemoPoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Création des deux premiers points
        Point pointOrigine = new Point();
        Point point1 = new Point(4, 10);
        
        //Création de deux points suppl. 
        Point point2 = new Point(12, 5);
        Point point3 = new Point(8, 6);
        
        System.out.println("Coordonnées du premier point");
        point2.afficher();
        System.out.println("Coordonnées du second point :");
        point3.afficher();
        
        System.out.println("Nombre de points créés: "+Point.cpteur);
    }
    
}

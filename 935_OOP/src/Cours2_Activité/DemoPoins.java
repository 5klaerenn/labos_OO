/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cours2_Activité;

/**
 *
 * @author Sklaerenn
 */
public class DemoPoins {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Point p1 = new Point(12, 5);
        System.out.println("Le premier point a les coordonnées :");
        p1.afficher();
        
        Point p2 = new Point();
        System.out.println("Le deuxième point a les coordonnées :");
        p2.afficher();
        
        
        Point p3 = new Point(p1);
        System.out.println("Le troisième point a les coordonnées :");
        p3.afficher();
        
    }
    
}

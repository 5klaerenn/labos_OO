package Cours2_Labo;

import Cours2_Activité.*;

/**
 *
 * @author Sklaerenn
 */
public class Point {
    
    private double x;
    private double y;
    public static int cpteur = 0;


    
    public Point(double a, double b)
    {
        x = a;
        y = b;
    }
    
    public Point()
    {
        x = 0;
        y = 0;
    }
        
    public void afficher()
    {
        System.out.println("x: "+x + " y: "+y);
    }
    
    public void afficherCompteur()
    {
        System.out.println("compteur: "+ cpteur);
    }   


}

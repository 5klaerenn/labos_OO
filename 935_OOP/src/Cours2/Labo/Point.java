package Cours2.Labo;

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
        cpteur++;
    }
    
    public Point()
    {
        x = 0;
        y = 0;
        cpteur++;
    }
        
    public void afficher()
    {
        System.out.println("x: "+x + " y: "+y);
    }
    
}

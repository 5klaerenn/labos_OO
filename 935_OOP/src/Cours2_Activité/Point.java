package Cours2_Activité;

/**
 *
 * @author Sklaerenn
 */
public class Point {
    
    private double x;
    private double y; 
    
    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    
    public Point(Point p){
        x = p.x;
        y = p.y;
    }
    
    public Point()
    {
        this(0,0);
    }

    public void afficher()
    {
        System.out.println("x: "+x + " y: "+y);
    }
    
}

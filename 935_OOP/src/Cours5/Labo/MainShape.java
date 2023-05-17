/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cours5.Labo;

/**
 *
 * @author abenkhedher
 */
public class MainShape {
    public static void main(String[] args) {
        
        Circle c1,c2 ;
        c1 = new Circle(1,1,3) ;
        c2 = new Circle() ;
        
        System.out.println(c1 + "\n" + c2) ;
        System.out.println(c1.isBigger(c2));
        
        //Test cylindres
        
        Cylinder cy1, cy2;
        cy1 = new Cylinder();
        cy2 = new Cylinder(1, 2, 3, 4);
              
        System.out.println(cy1 + "\n" + cy2);
        
        //Test Colored circle
        
        ColoredCircle cc1, cc2;
        cc1 = new ColoredCircle(02, 2, 2, "bleu");
        cc2 = new ColoredCircle();
        
        System.out.println(cc1.toString() + "\n" + cc2.toString());
        
        
        
}

    
}

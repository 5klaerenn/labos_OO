/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cours3.Activités;

/**
 *
 * @author Sklaerenn
 */
public class DemoRectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(12, 4); 
        
        Rectangle r2 = new Rectangle(13, 6);
        
        if(r1.equals(r2)){
            System.out.println("Les deux rectangles ont la même largeur");
        } else {
            System.out.println("Les deux rectangles n'ont pas la même largeur");
        }
        
        r1 = r2;
        
        if(r1.equals(r2)){
            System.out.println("Les deux rectangles ont la même largeur");
        } else {
            System.out.println("Les deux rectangles n'ont pas la même largeur");
        }

        

    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cours4.Activités;

/**
 *
 * @author Sklaerenn
 */
public class TabRectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Rectangle[] tabRect = new Rectangle[5];
        
        tabRect[0] = new Rectangle(3, 6);
        tabRect[1] = new Rectangle(4, 6);
        tabRect[2] = new Rectangle(6, 12);
        tabRect[3] = new Rectangle(5, 3);
        tabRect[4] = new Rectangle(10, 15);
        
        for (Rectangle r : tabRect) {
            System.out.println(r.toString());;
        }
        
    }
    
}

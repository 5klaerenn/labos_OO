/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cours7.Activités;

/**
 *
 * @author Sklaerenn
 */
public class Dessin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Figure[] figures = new Figure[3];
        
        Figure f1 = new Rectangle();
        figures[0] = f1;
        
        Figure f2 = new Cercle();
        figures[1] = f2;
        
        Figure f3 = new Rectangle();
        figures[2] = f3;
        
        for(int i = 0; i < figures.length; i++){
            figures[i].dessineToi();
        }
        
        System.out.println("L'ordonnée du 1er rectangle est :" + ((Rectangle) figures[0]).getY());
        
        System.out.println("Le rayon du cercle est : " + ((Cercle) figures[1]).getRayon());
    }
    
}

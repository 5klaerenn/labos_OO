/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cours7.Activités;

/**
 *
 * @author Sklaerenn
 */
public class Point2D implements Point {
    
    int x, y;
    
    public void deplacer(int a, int b){
        x += a;
        y += b;
    }
    
    public void afficher(){
        System.out.println("Abcisse : " + x + " Ordonnée :" + y);
    }

}

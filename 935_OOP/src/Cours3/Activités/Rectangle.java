/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cours3.Activités;

/**
 *
 * @author Sklaerenn
 */
public class Rectangle {
    
    private int longueur;
    private int largeur; 
    
    public Rectangle(int x, int y){
        this.longueur = x;
        this.largeur = y;
    }
    
@Override
   public boolean equals(Object obj){
   if(obj instanceof Rectangle){

       Rectangle autre = (Rectangle) obj;

       if(this.largeur == autre.largeur){
          return true;
       } else{
          return false; 
        }
   } else 
       return false;
}

}

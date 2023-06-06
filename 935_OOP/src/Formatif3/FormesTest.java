/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Formatif3;

import java.util.ArrayList;

/**
 *
 * @author Sklaerenn
 */
public class FormesTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<FormeGeo> liste = new ArrayList<FormeGeo>();
        
        liste.add(new Cercle("Jaune", 3.0, 4.0, 10.0));
        liste.add(new Cercle("Bleu", 5.0, 7.0, 5.0));
        liste.add(new Rectangle("Vert", -6.0, -8, 3.0, 4.0));
        liste.add(new Rectangle("Rouge", 0.0, 0.0, 2.0, 5.0));
        
        for(FormeGeo fg : liste){
            fg.deplacer(6.0, 8.0);
            System.out.println(fg.toString());
            System.out.println("-------------------------------------");
        }

    }
    
}

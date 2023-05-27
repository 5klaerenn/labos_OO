/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cours7.Labo;

/**
 *
 * @author Sklaerenn
 */
public class TestForme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        FormesGeometriques[] formes = new FormesGeometriques[5];
        
        //Création d'un Rectangle 
        FormesGeometriques f1 = new Rectangle(7.0, 8.0);
        formes[0] = f1;
        
        //Création d'un Rectangle 
        FormesGeometriques f2 = new Rectangle(3.0, 7.0);
        formes[1] = f2;
        
        //Création d'un Cercle 
        FormesGeometriques f3 = new Cercle(4.5);
        formes[2] = f3;
        
        //Création d'un Carré 
        FormesGeometriques f4 = new Carre(5.0);
        formes[3] = f4;
        
        //Création d'un Cercle 
        FormesGeometriques f5 = new Cercle(7);
        formes[4] = f5;
        
        for(int i = 0; i < formes.length; i++){
            System.out.println(formes[i].affiche());
        }
        
        for(int i = 0; i < formes.length; i++){
            if(formes[i] instanceof Cercle){
                System.out.println("Diamètre : " + ((Cercle) formes[i]).diametre());
            }
        }
        
    }
    
}

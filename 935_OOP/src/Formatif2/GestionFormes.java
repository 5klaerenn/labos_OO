/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Formatif2;

/**
 *
 * @author Sklaerenn
 */
public class GestionFormes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Affichable[] formes = new Affichable[6];
        
        formes[0] = new Ellipse(8.0, 2.0);
        formes[1] = new Ellipse(4.5, 3.0);
        formes[2] = new Trapeze(3.0, 4.0, 3.0);
        formes[3] = new Trapeze(5.5, 8.0, 2.5);
        formes[4] = new Cercle(3.5);
        formes[5] = new Cercle(7.0);
        
        System.out.println("Affichage de toutes les formes :");
        afficherTout(formes);
        
        System.out.println("\n*************************************");

        System.out.println("Affichage des ellipses : ");
        afficherAiresEllipse(formes);
        
        System.out.println("\n*************************************");

        System.out.println("Affichage du diamètre des cercles : ");
        afficherDiametreCercle(formes);
        
    }
    
    public static void afficherTout(Affichable[] formes){
        for(Affichable aff : formes) {
            System.out.println(aff.afficher());
        }
    }
    
    public static void afficherAiresEllipse(Affichable[] formes){
        for(int i = 0 ; i<formes.length; i++){
            if(formes[i] instanceof Ellipse && !(formes[i] instanceof Cercle)){
                System.out.println(formes[i].afficher());
            }
        }
    }
    
    public static void afficherDiametreCercle(Affichable[] formes){
        for(int i = 0; i<formes.length; i++){
            if(formes[i] instanceof Cercle){
                System.out.println("Le diamètre du cercle est : " + ((Cercle) formes[i]).diametre());
            }
    }
    }    
    
    
}

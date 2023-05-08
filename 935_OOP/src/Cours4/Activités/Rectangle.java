/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cours4.Activités;

/**
 *
 * @author Asma
 */
public class Rectangle {
    
        private int longueur;
	private int largeur ;
	
	public Rectangle(int longueur, int largeur) 
	{ this.longueur = longueur; 
	  this.largeur = largeur;
	}

	// méthode pour calculer et retourner le périmètre
	public int perimetre(){
		return 2 * (longueur + largeur);
	}
	
		
	// methode pour afficher un rectangle
	public void afficher () {
		System.out.println( "<longueur = " + longueur + ", largeur = " + largeur + ", perimetre = "
		+ perimetre() + ">");	
	}
	
	public int getLongueur() {
		return longueur;
	}

        public int getLargeur()  {
              return largeur;
       }
          
}

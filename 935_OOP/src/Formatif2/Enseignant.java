/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Formatif2;

/**
 *
 * @author Sklaerenn
 */
public abstract class Enseignant {
    
    private String nom; 
    private String prenom; 
    private int heure;
    
    public Enseignant(String n, String p, int h){
        this.nom = n;
        this.prenom = p;
        this.heure = h;
    }

    public int getHeure() {
        return heure;
    }
    
    public String afficher(){
        return prenom + " " + nom;
    }
    
    public abstract int calculerSalaire();

}

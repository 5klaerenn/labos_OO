/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cours6.Activités;

/**
 *
 * @author Sklaerenn
 */
public abstract class Employe {
    
    private String nom;
    private String prenom;
    
    public Employe(String n, String p){
        this.nom = n;
        this.prenom = p;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }  
    
    public abstract double calculerPaie();
    

}

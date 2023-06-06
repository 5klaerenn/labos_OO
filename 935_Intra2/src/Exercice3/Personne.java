/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Exercice3;

/**
 *
 * @author Sklaerenn
 */
public abstract class Personne {
    
    protected String nom;
    protected String prenom; 
    protected int age;

    public Personne(String n, String p, int anneeNaissance){
        this.nom = n;
        this.prenom = p;
        this.age = 2023 - anneeNaissance;
    }
    
    public abstract String afficher();
    

}

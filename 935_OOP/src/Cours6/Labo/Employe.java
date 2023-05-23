/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cours6.Labo;

/**
 *
 * @author Sklaerenn
 */
public abstract class Employe {
    
    private String nom;
    private String prenom;
    private int age;
    private String anEntree;
    
    public Employe(String n, String p, int a, String e){
        this.nom = n;
        this.prenom = p;
        this.age = a;
        this.anEntree = e;
    }
    
    public String getTitre(){
        return "L'employé ";
    }
    
    public String getNom(){
        return getTitre() + nom + " " + prenom;
    }
    
    public abstract double calculerSalaire();

}

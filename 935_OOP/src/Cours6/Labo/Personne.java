/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cours6.Labo;

import java.net.IDN;

/**
 *
 * @author Sklaerenn
 */
public abstract class Personne {
    
    private int id;
    private String nom;
    private String prenom;
    private String mail;
    private String telephone;
    private double salaire;
    
    public Personne(int i, String n, String p, String m, String t, double s){
        this.id = i;
        this.nom = n;
        this.prenom = p;
        this.mail = m;
        this.telephone = t;
        this.salaire = s;
    }
    
    public Personne(String n, String p, double s){
        this.nom = n;
        this.prenom = p;
        this.salaire = s;
    }

    public double getSalaire() {
        return salaire;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }    
    
    public abstract double calculerSalaire();
}

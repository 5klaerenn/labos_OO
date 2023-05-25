/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cours7.Labo;

/**
 *
 * @author Sklaerenn
 */
public class Personne implements IPersonne {
    
    private int id;
    private String nom;
    private String prenom;
    private String anneeNais;
    private double salaire;
    private Profil profil;
    
    public static int comp = 0;
    
    public Personne(String n, String p, String a, double s, Profil prof){
        this.id = comp + 1;
        this.nom = n;
        this.prenom = p;
        this.anneeNais = a;
        this.salaire = s;
        this.profil = prof;
        comp++;
    }

    public double getSalaire() {
        return salaire;
    }
    
    public int getComp(){
        return comp;
    }
    
    public void affiche(){
        System.out.println(id + "- Je suis " + prenom + " " + nom + " (" + profil.getLibelle() + ") né en " + anneeNais + " mon salaire est " + salaire + " CAD" );
        
    };
    
    public void augmenterSalaire(){
        if(profil.getCode().equals("EMP")){
            salaire = salaire * 1.10;
        } else if(profil.getCode().equals("DG")){
            salaire = salaire * 1.20;
        }
    };
    
}

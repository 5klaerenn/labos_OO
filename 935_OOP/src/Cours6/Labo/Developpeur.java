/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cours6.Labo;

/**
 *
 * @author Sklaerenn
 */
public class Developpeur extends Personne {
    
    private String specialite;
    
    public Developpeur(String n, String p, double s, String spe){
        super(n, p, s);
        this.specialite = spe;
    }
    
    public double calculerSalaire(){
        return super.getSalaire() * 1.20;
    }
    
    public void afficher(){
        System.out.println("Le salaire du developpeur " + super.getNom() + " " + super.getPrenom() + " est : " + calculerSalaire() + "$, sa spécialité : " + specialite);
    }

}

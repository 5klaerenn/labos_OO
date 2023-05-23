/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cours6.Activités;

/**
 *
 * @author Sklaerenn
 */
public class EmployeHoraire extends Employe {
    
    private double salaire;
    private double commission;
    private double quantité; 
    
    public EmployeHoraire(String n, String p, double s, double c, double q){
        super(n, p);
        this.salaire = s;
        this.commission = c;
        this.quantité = q;
    }
    
    public double calculerPaie(){
        return salaire + (commission * quantité);
    }
    
    public void afficher(){
        System.out.println("Salaire de l'employé " + super.getPrenom() + " " + getNom() + " : " + calculerPaie() + "$");
    }

}

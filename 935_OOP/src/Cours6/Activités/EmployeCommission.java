/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cours6.Activités;

/**
 *
 * @author Sklaerenn
 */
public class EmployeCommission extends Employe {
    
    private double taux;
    private double heures;
    
    public EmployeCommission(String n, String p, double t, double h){
        super(n, p);
        this.taux = t;
        this.heures = h;
    }
    
    public double calculerPaie(){
        return taux * heures;
    }
    
    public void afficher(){
        System.out.println("Salaire de l'employé " + super.getPrenom() + " " + getNom() + " : " + calculerPaie() + "$");
    }

}

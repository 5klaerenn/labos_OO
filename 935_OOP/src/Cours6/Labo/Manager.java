/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cours6.Labo;

/**
 *
 * @author Sklaerenn
 */
public class Manager extends Personne {
    
    private String service;
    
    public Manager(String n, String p, double s, String serv){
        super(n, p, s);
        this.service = serv;
    }

    @Override
    public double calculerSalaire() {
        return super.getSalaire() * 1.35; 
    }
    
    public void afficher(){
        System.out.println("Le salaire du manager " + super.getNom() + " " + super.getPrenom() + " est : " + calculerSalaire() + "$, son service : " + service);    
    }
    
    

}

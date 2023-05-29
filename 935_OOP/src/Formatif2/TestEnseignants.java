/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Formatif2;

import java.util.ArrayList;

/**
 *
 * @author Sklaerenn
 */
public class TestEnseignants {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Création d'un arrayList avec des objets Enseignant
        
        ArrayList<Enseignant> enseignants = new ArrayList<Enseignant>(); 
        
        enseignants.add(new EnseignantChercheur("Kelso", "Bob", 200));
        enseignants.add(new EnseignantChercheur("Cox", "Perry", 185));
        enseignants.add(new Vacataire("Reid", "Eliott", 45, "Orga3000"));
        enseignants.add(new Vacataire("Espinosa", "Carla", 125, "Super Organisme"));
        enseignants.add(new Doctorant("Dorian", "John", 125));
        enseignants.add(new Doctorant("Turkelton", "Turk", 95));
        
        //Affichage des éléments du ArrayList 
        afficherTout(enseignants);
        
        System.out.println("\n*************************************");
        
        //Affichage du salaire des enseignants qui ont fait des heures sup
        System.out.println("Enseignant Chercheur ayant fait des heures sup cette année : ");
        afficherHSupEnsCh(enseignants);
        
        System.out.println("\n*************************************");
        
        //Affichage des doctorants 
        System.out.println("Doctorants ayant enseigné cette année : ");
        afficherDoctorants(enseignants);
        
        System.out.println("\n*************************************");

        //Affichage des organismes des vacataires
        System.out.println("Organismes des vacataires ayant enseigné cette année : ");
        affichageOrganismes(enseignants);

    }
    
    public static void afficherTout(ArrayList<Enseignant> enseignants){
        for (Enseignant ens : enseignants){
            System.out.println(ens.afficher());
        }
    }
    
    public static void afficherHSupEnsCh(ArrayList<Enseignant> enseignants){
        for (Enseignant ens : enseignants){
            if(ens instanceof EnseignantChercheur && ens.getHeure() >= 192){
                System.out.println(ens.afficher());
            }
        }
    }
    
    public static void afficherDoctorants(ArrayList<Enseignant> enseignants){
        for (Enseignant ens : enseignants){
            if(ens instanceof Doctorant){
                System.out.println(ens.afficher());
            }
        }
    }
    
    public static void affichageOrganismes(ArrayList<Enseignant> enseignants){
        for(Enseignant ens : enseignants){
            if(ens instanceof Vacataire){
                System.out.println(((Vacataire) ens).getOrganisme());
            }
        }
    }
            
    
}

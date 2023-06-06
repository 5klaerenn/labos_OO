/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercice3;

import java.util.ArrayList;

/**
 *
 * @author Sklaerenn
 */
public class ServiceRH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Personne> personnes = new ArrayList<Personne>(); 
        
        personnes.add(new Enseignant("Kelso", "Bob", 1963, "cdd", 2015, "PhD"));
        personnes.add(new Administratif("Sullivan", "Jordan", 1972, "CDI", 2018, "conseiller pedagogique"));
        personnes.add(new Administratif("Buckland", "Ted", 1979, "INTERIM", 2013, "technicien"));
        personnes.add(new Enseignant("Cox", "Perry", 1975, "cdi", 2017, "Maitrise"));
        personnes.add(new ContactExtr("Dorian", "John", 1979, "Chef"));
        personnes.add(new ContactExtr("Reid", "Eliott", 1983, "Salarie"));
        
                
        //Affichage de toutes les personne de la liste :
        for(Personne pers : personnes){
            System.out.println(pers.afficher());
        }
        
        //Test de la méthode typerPersonneParNomPrenom() 
        
        System.out.println("Test avec une première personne : ");
        String nomTest = "Turkleton";
        String prenomTest = "Turk"; 
        typePersonneParNomPrenom(personnes, nomTest, prenomTest);
         
        System.out.println("============================================");
        
        System.out.println("Test avec une deuxième personne : ");
        nomTest = "Reid";
        prenomTest = "Eliott"; 
        typePersonneParNomPrenom(personnes, nomTest, prenomTest);
        
        //Affichage de l'ancienneté des membres du personnel 
        
        System.out.println("***************ANCIENNETÉ*******************");
        anciennete(personnes);

    }
    
    public static void typePersonneParNomPrenom(ArrayList<Personne> personnes, String nomTest, String prenomTest){
        
        boolean existe = false; 
        int i = 0;
        int indice = 0;
        
        while(i < personnes.size() && !existe){
            if(personnes.get(i).nom.equalsIgnoreCase(nomTest) && personnes.get(i).prenom.equalsIgnoreCase(prenomTest)){
                existe = true;
                indice = i;
            } i++;
        } 
        
        if(existe){
            System.out.println(personnes.get(indice).afficher());
        } else {
            System.out.println(prenomTest.toUpperCase() + " " + nomTest.toUpperCase() + " n'existe pas dans la liste");
        }
    }
    
    public static void anciennete(ArrayList<Personne> personnes){
        for(Personne pers : personnes){
            if(pers instanceof Personnel){
                System.out.println(pers.nom + " " + pers.prenom + " : " +((Personnel) pers).calculerAnciennete() + " années d'ancienneté");
            }
        }
    }
    
}

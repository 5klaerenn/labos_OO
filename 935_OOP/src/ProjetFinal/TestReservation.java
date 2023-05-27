/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ProjetFinal;

import java.util.ArrayList;

/**
 *
 * @author Sklaerenn
 */
public class TestReservation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Création des trois objets de type Département
        Departement d1 = new Departement("Informatique");
        Departement d2 = new Departement("Sciences Humaines");
        Departement d3 = new Departement("Science Nature");
        
        //Déclaration et remplissage du ArrayList des locaux 
        ArrayList<Local> locaux = new ArrayList<Local>(); 
        
        Local l1 = new LocalFormationReguliere(421, 4, 9, 12, "Été", d2);
        Local l2 = new LocalFormationReguliere(410, 4, 15, 18, "Été", d1);
        Local l3 = new LocalFormationReguliere(250, 2, 13, 16, "Été", d3);
        Local l4 = new LocalFormationContinue(125, 1, 18, 21, 3);
        Local l5 = new LocalFormationContinue(333, 3, 20, 23, 3);
        Local l6 = new LocalFormationContinue(312, 3, 9, 12, 3);
        Local l7 = new LocalFormationReguliere(123, 1, 10, 13, "Été", d1);
        Local l8 = new LocalFormationReguliere(251, 2, 10, 13, "Été", d3);
        Local l9 = new LocalFormationReguliere(112, 1, 14, 17, "Été", d2);
        Local l10 = new LocalFormationContinue(212, 2, 18, 22, 3);
        
        locaux.add(l2);
        locaux.add(l3);
        locaux.add(l4);
        locaux.add(l5);
        locaux.add(l6);
        locaux.add(l7);
        locaux.add(l8);
        locaux.add(l9);
        locaux.add(l10);
//        
//        for(Local loc : locaux){
//            System.out.println(loc);
//            }

        // Validation de la réservation pour réserver les locaux de la liste 
        for (int i = 0; i < locaux.size(); i++){
            int hD = locaux.get(i).getHeureDebut();
            int hF = locaux.get(i).getHeureFin();
            
            locaux.get(i).reserver(hD, hF);
        }
        
        // Affichage des locaux
        for(Local loc : locaux){
            System.out.println(loc);
         }
                
   
        
    }
    
    public static void testReservation(){       
        
    }
    
    public static void afficherLocalParHeure(){
        
    }
    
    public static void compterLocauxReserves(){
        
    }
    
}

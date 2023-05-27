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

        locaux.add(new LocalFormationReguliere(421, 4, 9, 12, "Été", d2));
        locaux.add(new LocalFormationReguliere(410, 4, 15, 18, "Été", d1));
        locaux.add(new LocalFormationReguliere(250, 2, 13, 16, "Été", d3));
        locaux.add(new LocalFormationContinue(125, 1, 18, 21, 3));
        locaux.add(new LocalFormationContinue(333, 3, 20, 23, 3));
        locaux.add(new LocalFormationContinue(312, 3, 9, 12, 3));
        locaux.add(new LocalFormationReguliere(123, 1, 10, 13, "Été", d1));
        locaux.add(new LocalFormationReguliere(251, 2, 10, 13, "Été", d3));
        locaux.add(new LocalFormationReguliere(112, 1, 14, 17, "Été", d2));
        locaux.add(new LocalFormationContinue(212, 2, 18, 22, 3));
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
        
        afficherLocalParHeure(locaux); //Appel de la méthode qui permet d'afficher les locaux réservés
        
        compterLocauxReserves(locaux); //Appel de la méthode pour afficher les statistiques
                
   
        
    }
    
    public static void testReservation(){       
        
    }
    
    public static void afficherLocalParHeure(ArrayList<Local> locaux){
        
        System.out.println("\n************AFFICHAGE HEURE PAR HEURE************");
        for(int heure = 8; heure <= 23; heure++){ //Horaires de 8 à 23h
            
            for(int i = 0; i < locaux.size(); i++){ //Boucle pour passer à travers le ArrayList
                
                boolean estReservé = locaux.get(i).getReservation(); 
                
                if(estReservé && locaux.get(i).getHeureDebut() == heure){
                    System.out.print(heure + "h : " + "Local : " + locaux.get(i).getEtage() + "-" + locaux.get(i).getNum() + "\n");
                }                
            }          
        }
    }
    
    public static void compterLocauxReserves(ArrayList<Local> locaux){
        int cpteContinu = 0;
        int cpteReg = 0;
        int cpteRegInfo = 0;
        int cpteRegHum = 0;
        int cpteRegNat = 0;
        
        //Incrémentation des compteurs en fonction du type de local puis en fonction de son nom;
        
        for(int i = 0; i < locaux.size(); i++){
            if(locaux.get(i) instanceof LocalFormationContinue){
                cpteContinu += 1;
            } else {
                cpteReg += 1;
                String dep = ((LocalFormationReguliere) locaux.get(i)).getDepartement().getNom();
              
                switch(dep){
                    case "Informatique" :
                        cpteRegInfo += 1;
                        break;
                    case "Sciences Humaines" :
                        cpteRegHum += 1;
                        break;
                    case "Science Nature" :
                        cpteRegNat += 1;
                        break;
                    default :
                        System.out.println("Erreur");
                        break;
                    }           
                }
            }
        
        // Affichage des statistiques
        
        System.out.println("\n****************STATISTIQUES RÉSERVATIONS*****************");
        System.out.println("Il y a : "+ (cpteContinu + cpteReg) + " au total : ");
        System.out.println("        " + cpteContinu + " Formation continue");
        System.out.println("        " + cpteReg + " Formation régulière");
        System.out.println("                "+ cpteRegInfo + " Informatique");
        System.out.println("                "+ cpteRegHum + " Sciences Humaines");
        System.out.println("                "+ cpteRegNat + " Science Nature");
        
        }
        
}
    


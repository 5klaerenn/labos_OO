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
        
        locaux.add(new LocalFormationReguliere(110, 1, 14, 17, "Été", d2));
        locaux.add(new LocalFormationReguliere(120, 1, 10, 13, "Été", d1)); // Ne sera pas réservé car tombe sur la période entre 12 et 13
        locaux.add(new LocalFormationReguliere(250, 2, 13, 16, "Été", d3));
        locaux.add(new LocalFormationReguliere(270, 2, 10, 12, "Été", d1)); // Ne sera pas réservé car hors de l'horaire pour le programme Informatique
        locaux.add(new LocalFormationReguliere(420, 4, 9, 12, "Été", d2));
        locaux.add(new LocalFormationReguliere(421, 4, 15, 18, "Été", d1));
        locaux.add(new LocalFormationContinue(125, 1, 18, 21, 3));
        locaux.add(new LocalFormationContinue(215, 2, 18, 22, 3));
        locaux.add(new LocalFormationContinue(315, 3, 9, 12, 3)); // Ne sera pas réservé car hors de l'horaire formation continue
        locaux.add(new LocalFormationContinue(425, 4, 20, 23, 3));

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
        
        
        // Tester si un local donné est réservé ou non 
        
        System.out.println("\n***************TEST DES RÉSERVATIONS*******************");
        // Local existe déjà ET est déjà réservé sur le même créneau :
        Local locTest1 = new LocalFormationContinue(125, 1, 18, 21, 3);
        System.out.println("** Premier test avec le local " + locTest1.getEtage()+ "-" + locTest1.getNum()+"**");
        testReservation(locaux, locTest1);
        
        // Local n'existe pas encore : 
        Local locTest2 = new LocalFormationReguliere(115, 1, 9, 12, "Été", d2);
        System.out.println("** Deuxième test avec le local " + locTest2.getEtage()+ "-" + locTest2.getNum()+"**");
        testReservation(locaux, locTest2);
                
        // Local existe déjà mais n'est pas réservé sur ce créneau :
        Local locTest3 = new LocalFormationReguliere(420, 4, 13, 17, "Été", d2);
        System.out.println("** Troisième test avec le local " + locTest3.getEtage()+ "-" + locTest3.getNum()+"**");
        testReservation(locaux, locTest3);
        
        System.out.println("\n============================================================");

        
        afficherLocalParHeure(locaux); //Appel de la méthode qui permet d'afficher les locaux réservés
        
        compterLocauxReserves(locaux); //Appel de la méthode pour afficher les statistiques
                
    }
    

    public static void testReservation(ArrayList<Local> locaux, Local l){       
        boolean existe = false;
        int i = 0;  
        
        while(i < locaux.size() && !existe){ 
            if(l.getNum() == locaux.get(i).getNum()){ // Vérifie si le local existe déjà
                existe = true;
                boolean estReservé = locaux.get(i).getReservation(); // Vérifie si le local est déjà réservé
                
                if(!estReservé){ 
                    System.out.println("Ce local est libre");
                } else { // Si le local est déjà réservé, vérifie le créneau horaire
                    int hD = locaux.get(i).getHeureDebut();
                    int hF = locaux.get(i).getHeureFin();
                    
                    int hDTest = l.getHeureDebut();
                    int hFTest = l.getHeureFin();
                    
                    if((hDTest < hD && hFTest < hD)
                        || (hDTest > hF) ){
                        System.out.println("Ce local est libre");
                    } else {
                        System.out.println("Ce local est déjà réservé de " + hD  + "h à " + hF + "h.");
                    }
                }               
            }  i++;            
        } 

        if(!existe){
            System.out.println("Ce local est libre.");
        }
        
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
            if(locaux.get(i) instanceof LocalFormationContinue && locaux.get(i).getReservation()){
                cpteContinu += 1;
            } else if (locaux.get(i) instanceof LocalFormationReguliere && locaux.get(i).getReservation()) {
                cpteReg += 1;
                String dep = ((LocalFormationReguliere) locaux.get(i)).getDepartement().getNom();
              
                if(dep.equalsIgnoreCase("Informatique")){
                    cpteRegInfo += 1;
                } else if(dep.equalsIgnoreCase("Sciences Humaines")){
                    cpteRegHum += 1;
                } else if(dep.equalsIgnoreCase("Science Nature")){
                    cpteRegNat += 1;
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
    


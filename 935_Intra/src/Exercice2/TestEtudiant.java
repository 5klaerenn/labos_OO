/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercice2;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Sklaerenn
 */
public class TestEtudiant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Déclaration du ArrayList
        ArrayList<Etudiant> listEtu = new ArrayList();
        boolean logged = true;
        int choix = 0;
        
        do{ 
            choix = menu();
            
            switch(choix){
                case 1 :
                    afficherEtu(listEtu);
                    break;
                case 2 : 
                    ajouterEtu(listEtu);
                    break;
                case 3 : 
                    afficherNoteGlob(listEtu);
                    break;
                case 4 : 
                    afficherFinaux(listEtu);
                    break;
                case 5 : 
                    System.out.println("Merci d'avoir utilisé le programme.");
                    logged = false;
                    break;
                default:
                    System.out.println("Erreur");
                    break;
            } 
        } while (logged != false);
    }
        
    public static int menu(){      
        System.out.println("1: Afficher la liste des étudiants") ;
        System.out.println("2: Ajouter un étudiant à la liste") ;
        System.out.println("3: Afficher les notes globales") ;
        System.out.println("4: Afficher les résultats finaux") ;
        System.out.println("5: Quitter") ;
        System.out.println("Faites votre choix") ;
        
        int choix = estEntierPositif() ;
        
        while(choix != 1 && choix != 2 && choix != 3 && choix != 4 && choix != 5){
            System.out.println("Erreur. Les choix possibles sont 1, 2, 3, 4 ou 5. Réessayez");
            choix = estEntierPositif();
        }
        
        return choix ;
    }
    
    public static void afficherEtu(ArrayList<Etudiant> listEtu){
        
        if(!listEtu.isEmpty()){
            for(int i = 0; i < listEtu.size(); i++){
                System.out.println(listEtu.get(i).toString());
            }
            System.out.println("");
        } else {
            System.out.println("Il n'y a rien à afficher pour le moment");
            System.out.println("");
        }
    }
    
    
    
    public static void ajouterEtu(ArrayList<Etudiant> listEtu){ 
        
    /*
        Ajout de useLocale après lecture de la documentation de Scanner pour régler le bug
        qui obligeait l'entrée des double avec une ',' au lieu d'un '.'. Sinon, renvoyait un inputMismatchException 
        lorsque les double étaient entrés avec un "."  
    */
    
    Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Entrez le code de l'étudiant");
        String code = sc.nextLine();
        System.out.println("Entrez le nom et prénom de l'étudiant");
        String nom = sc.nextLine();        
        System.out.println("Entrez la note de TP1 de l'étudiant");
        double n1 = sc.nextDouble();
        System.out.println("Entrez la note de TP2 de l'étudiant");
        double n2 = sc.nextDouble();
        System.out.println("Entrez la note d'examen de l'étudiant");
        double nEx = sc.nextDouble();
        
        Etudiant etu = new Etudiant(code, nom, n1, n2, nEx);
        listEtu.add(etu);
        
    }
    
    public static void afficherNoteGlob(ArrayList<Etudiant> listEtu){
        if(!listEtu.isEmpty()){
            for(int i = 0; i < listEtu.size(); i++){
                System.out.print("La note globale de "+listEtu.get(i).getNom()+" est : ");
                System.out.printf("%.2f %s" , listEtu.get(i).calculerGlobal(), "\n");
            }
            System.out.println("");
        } else {
            System.out.println("Il n'y a rien à afficher pour le moment");
            System.out.println("");
        }
    }
    
        public static void afficherFinaux(ArrayList<Etudiant> listEtu){
        if(!listEtu.isEmpty()){
            for(int i = 0; i < listEtu.size(); i++){
                listEtu.get(i).resultatFinal();
            }
            System.out.println("");
        } else {
            System.out.println("Il n'y a rien à afficher pour le moment");
            System.out.println("");
        }
    }
        
//Méthode pour la vérification du format de l'entrée dans le scanner pour le choix du menu pour éviter les exceptions
        
        static int estEntierPositif(){    
    
               Scanner sc = new Scanner(System.in);
               int test;
               
               do{
                    while(!sc.hasNextInt()){
                        System.out.println("Erreur, entrez un entier positif");
                        sc.next();
                    } test = sc.nextInt();
               } while (test < 0);
               
               return test;
           }
    
}
    


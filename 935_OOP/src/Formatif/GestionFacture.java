/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Formatif;

import Cours3.Labo.Client;
import Cours3.Labo.LigneFacture;
import Cours3.Labo.Produit;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Sklaerenn
 */
public class GestionFacture {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        Scanner sc = new Scanner(System.in);
        String nom, tel;
        int artMax;
        int choix = 0;
        boolean continuer = true;
                
        System.out.println("Entrez le nom du client");
        nom = sc.nextLine();
        System.out.println("Entrez le numéro de téléphone du client ");
        tel = sc.nextLine();
        Client c1 = new Client(nom, tel);
           
        System.out.println("Combien d'articles maximum sur la facture ?");
        artMax = estEntierPositif();

        Facture f1 = new Facture(c1, artMax);
        
        do {
            choix = menu();
            
            switch(choix){
                case 1 : 
                    afficher(f1);
                    continuer = continuer();
                    break;
                case 2 :
                    ajouter(f1, artMax);
                    continuer = continuer();
                    break;
            }
        } while(continuer);    
    }
    
    public static int menu(){      
        System.out.println("1: Afficher la facture") ;
        System.out.println("2: Ajouter un article à la facture") ;
        System.out.println("Votre choix") ;
        
        int choix = estEntierPositif() ;
        
        while(choix != 1 && choix != 2){
            System.out.println("Erreur. Les choix possibles sont 1 ou 2. Réessayez");
            choix = estEntierPositif();
        }        
        return choix ;
    }
    
    static void afficher(Facture f){
        System.out.println(f.toString());
    }
    
    static void ajouter(Facture f1, int artMax){
        Scanner sc = new Scanner(System.in);

        if(f1.cpteLignes == artMax) {
            System.out.println("Vous ne pouvez pas ajouter d'articles supplémentaires");
            } else {

                String noRef, nomP;
                double prix;
                int qty;

                System.out.println("Entrez le numéro de l'article");
                noRef = sc.nextLine();
                System.out.println("Entrez le nom de l'article");
                nomP = sc.nextLine();
                System.out.println("Entrez le prix unitaire de l'article");
                prix = estDouble();
                System.out.println("Entrez la quantité commandée");
                qty = estEntierPositif();

                Produit p = new Produit(noRef, nomP, prix);
                LigneFacture l = new LigneFacture(p, qty);

                f1.ajouterLigne(l);
            }
    }
     
    static boolean continuer(){
        System.out.println("Continuer ? 1: Oui / 2: Non") ;
        
        int choix = estEntierPositif() ;
        
        while(choix != 1 && choix != 2){
            System.out.println("Erreur. Les choix possibles sont 1 pour 'Oui' ou 2 pour 'Non'. Réessayez");
            choix = estEntierPositif();
        }        
        
        if(choix == 1) {
            return true;
        } else {
            return false;
        }
    }
    
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
    
    static double estDouble(){    
        
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        double test;

           do{
                while(!sc.hasNextDouble()){
                    System.out.println("Erreur dans le nombre entré");
                    sc.next();
                } test = sc.nextDouble();
           } while (test < 0);

           return test;
       }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Formatif;

import Cours3.Labo.Client;
import Cours3.Labo.LigneFacture;
import Cours3.Labo.Produit;
import java.awt.PageAttributes;
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
    
    static void afficher(Facture f1){
        
        f1.sumHT();
        f1.sumTPS();
        f1.sumTVQ();
        f1.sumTTC();
        
        afficherTab(f1);
    } 
    
    static void afficherTab(Facture f1){
        
        LigneFacture[] tab = f1.getLigneFact();
        
        System.out.println("=============  FACTURE  ============= ");
        System.out.println(f1.getClient());
        System.out.println("--------------------------------------");
        
        for(int i = 0; i < f1.cpteLignes; i++){
            System.out.println(tab[i]);
        }
        
        System.out.println("--------------------------------------");
        System.out.println("Montant HT :" + f1.getHT());
        System.out.println("Montant TPS :" + f1.getTPS());
        System.out.println("Montant TVQ :" + f1.getTVQ());
        System.out.println("Montant total :" + f1.getTTC());
        System.out.println("=======================================");
        
    }
    
    static boolean continuer(){
        System.out.println("Voulez-vous continuer ?") ;
        System.out.println("1 : Oui") ;
        System.out.println("2 : Non") ;
        
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
        double test;

           do{
                while(!sc.hasNextDouble()){
                    System.out.println("Erreur, entrez un entier positif");
                    sc.next();
                } test = sc.nextDouble();
           } while (test < 0);

           return test;
       }
    
    
}

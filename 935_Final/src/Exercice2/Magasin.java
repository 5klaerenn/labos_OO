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
public class Magasin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Création d'une liste pour regrouper les articles
        ArrayList<Article> articles = new ArrayList<Article>();
        
        
        System.out.println("-------------------------------");
        System.out.println("Ajout d'un nouvel article  ");
        System.out.println("-------------------------------");
        
        add(articles); 
        
        System.out.println("-------------------------------");
        System.out.println("Ajout d'un nouvel article  ");
        System.out.println("-------------------------------");
        add(articles); 
        
        System.out.println("-------------------------------");
        System.out.println("Ajout d'un nouvel article  ");
        System.out.println("-------------------------------");
        add(articles); 
        
        System.out.println("-------------------------------");
        System.out.println("Ajout d'un nouvel article  ");
        System.out.println("-------------------------------");
        add(articles); 
        

        //Affichage des produits créés : 
        System.out.println("-----------------------------------------------------");
        System.out.println("Voici les produit que vous avez ajouté au magasin : ");
        
        for(Article art : articles){
            System.out.println(art.toString());
        }
        
        //Tester si un article existe dans la liste
        int test = 123;
        boolean reponse = contains(articles, test);
        
        if(reponse){
            System.out.println("Article disponible au magasin");
        } else {
            System.out.println("Article non disponible au magasin");
        }
        
        System.out.println("-----------------------------------------------------");
        
        //Affichage du prix total des droits de douanes lors de l'export : 
        System.out.println("Le prix total des droits de douanes lors de l'export pour les articles ajoutés est le suivant : ");
        System.out.println(totalExport(articles));

    }
    
    
    public static void add(ArrayList<Article> articles){ 
        
        Scanner sc = new Scanner(System.in);
        boolean fragile;
        int code;
        String nom;
        double prix; 
                
        fragile = demanderFragile();
        
        System.out.println("Entrez le code de l'article : ");
        code = estEntierPositif();
        
        System.out.println("Entrez le nom de l'article : ");
        nom = sc.nextLine();
        
        System.out.println("Entrez le prix de l'article : ");
        prix = estDoublePositif();
        
        if(fragile){
            Emballage emb = typeEmballage();
            articles.add(new Fragile(code, nom, prix, emb));
        } else {
            articles.add(new Article(code, nom, prix)); 
        }
        
    }
    
    public static boolean demanderFragile(){ // Pour demander à l'utilisateur si l'article est fragile ou non 
        boolean reponse;
        System.out.println("L'article est-il fragile ? ");
        System.out.println("1. oui / 2. non");
         
        int choix = estEntierPositif() ;
        
        while(choix != 1 && choix != 2){
            System.out.println("Erreur. Les choix possibles sont 1 ou 2. Réessayez");
            choix = estEntierPositif();
        }
        
        if(choix == 1){
            reponse = true;
        } else {
            reponse = false;
        }
        
        return reponse;
    }
    
    public static Emballage typeEmballage(){ // Pour savoir le type d'emballage qui sera utilisé 
        Scanner sc = new Scanner(System.in);
        String reponse;
        Emballage emb = new Emballage("carton");
                
        System.out.println("Quel est le type d'emballage du produit ? (carton, papier ou plastique)");
        reponse = sc.next(); 
        
        while(!reponse.equalsIgnoreCase("carton") && !reponse.equalsIgnoreCase("papier") && !reponse.equalsIgnoreCase("plastique")){
            System.out.println("Erreur. Les chois possibles sont carton, papier ou plastique");
            reponse = sc.next();
        }
        
        switch(reponse){
            case "carton" : 
                emb = new Emballage("carton");
                break;
            case "papier" : 
                emb = new Emballage("papier");
                break;
            case "plastique" :
                emb = new Emballage("plastique");
                break;
            default :
                System.out.println("Erreur");    
        } 
        
        return emb; 
        
    }
    
    public static boolean contains(ArrayList<Article> articles, int test){
        boolean existe = false; 
        int i = 0;
        
        while(i < articles.size() && !existe){
            if(articles.get(i).getCode() == test){
                existe = true;
            }
            i++; 
        }

        return existe;
        
    }
    
    public static double totalExport(ArrayList<Article> articles){
        double total = 0;
        
        for(Article art : articles){
            total += art.droitDouane();
        }
        
        return total;
        
    }
    
    
    
// Méthodes de validation des entrées numériques : 
    
    public static int estEntierPositif(){    
    
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
    
    public static double estDoublePositif(){    
    /*
        Ajout de useLocale après lecture de la documentation de Scanner pour régler le bug
        qui obligeait l'entrée des double avec une ',' au lieu d'un '.'. Sinon, renvoyait un inputMismatchException 
        lorsque les double étaient entrés avec un "."  
        (Comme pour le premier examen)
    */
    
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double test;
               
        do{
            while(!sc.hasNextDouble()){
                System.out.println("Erreur, entrez un nombre positif");
                sc.next();
            } test = sc.nextDouble();
        } while (test < 0);
               
        return test;
    }
    
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Révisions;

import java.util.Scanner;

/**
 *
 * @author Sklaerenn
 */
public class Exercice1 {
    
     public static void main(String[] args) {
        
        /*
        Partie A - Exercice 1 : Demander à l'utilisateur d'entrer son nom, son prénom et son année de naissance. 
        Afficher un message de salutation contenant son nom, son prénom et son âge.
                */
       
       Scanner sc = new Scanner(System.in);
       String nom, prenom;
       int date, age; 
       
        System.out.println("Entrez votre nom");
       nom = sc.nextLine();
        System.out.println("Etrez votre prénom");
        prenom = sc.nextLine();
        System.out.println("Entrez votre année de naissance");
       date = estEntierPositif(); 
       age = 2023 - date;
        
        System.out.printf("%s %s %s %s %s %s", "Bonjour", prenom, nom, "vous avez", age, "ans. \n");

    
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
     
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cours1_Révisions;

import java.util.Scanner;

/**
 *
 * @author Sklaerenn
 */
public class Exercice6 {
    
    public static void main(String[] args) {
        
        /*
        Exercice 6 : Écrire un programme qui créée un tableau de chaines de caractères ("POO", "Classe", 
        "Objet", "Constructeur", "Attribut", "Méthode"), demande à l’utilisateur un indice et affiche en 
        majuscule la chaine qui se trouve à cet indice.
        
        Dans ce même programme, demander à l’utilisateur une chaine :
        • Si cette chaine existe, afficher son indice sinon afficher le message suivant « Cette chaine n’existe pas dans le tableau ».
           */
        
        Scanner sc = new Scanner(System.in);
        
        int ind, i, j; 
        String test;
        boolean rep = false;
        String tab[] = {"POO", "Classe", "Objet", "Constructeur", "Attribut", "Méthode"};
        i = 0;
        
        System.out.println("Entrez l'indice que vous voulez afficher");
        ind = estEntierPositif();
        
        while(ind > 5){
            System.out.println("Erreur, le nombre doit être compris entre 0 et 5 inclus");
            ind = estEntierPositif();
        }
        
        System.out.println(tab[ind].toUpperCase());
        
        System.out.println("Entrez une chaine de caractère");
        test = sc.next(); 
        
        while(i < tab.length && rep == false){
               if(tab[i].equalsIgnoreCase(test)){
                      rep = true;
                    } i++;   
                }

                if(rep == false){
                    System.out.println("Il n'y a pas d'étudiant-e avec ce nom et ce prénom dans la liste.");
                } else {
                    System.out.println(i-1);
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
    
}

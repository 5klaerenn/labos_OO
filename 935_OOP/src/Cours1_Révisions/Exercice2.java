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
public class Exercice2 {
    
        public static void main(String[] args) {

            /*
        Exercice 2 : Écrire un programme qui lit deux nombres réels et un opérateur (+, *, -, /). Si le choix est :
            • + : le programme affiche la somme des deux nombres
            • * : le programme affiche le produit des deux nombres
            • - : le programme affiche la différence entre les deux nombres
            • / : le programme affiche la division entre les deux nombres
            • Autre : le programme affiche « Mauvais opérateur »
            */
    
        
        int nbr1, nbr2;
        char op; 
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entrez le premier nombre");
        nbr1 = estEntier();
        System.out.println("Entrez un second nombre");
        nbr2 = estEntier();
        System.out.println("Entrez l'opérateur");
        op = sc.next().charAt(0);
        
        switch(op){
            case '+':
                System.out.println(nbr1+nbr2);
                break;
            case '-':
                System.out.println(nbr1-nbr2);
                break;
            case '*':
                System.out.println(nbr1*nbr2);
                break;
            case '/':
                if(nbr2 != 0){
                    System.out.println(nbr1/nbr2);
                } else {
                    System.out.println("Erreur. On ne peut pas diviser par 0");
                }
                break;
            default :
                System.out.println("Mauvais opérateur");
        }
                
            
        }
        
        
        static int estEntier(){    
    
               Scanner sc = new Scanner(System.in);
               int test;
               
               while(!sc.hasNextInt()){
                      System.out.println("Erreur, entrez un entier positif");
                        sc.next();
                    } return test = sc.nextInt();

                    
           }
        
}

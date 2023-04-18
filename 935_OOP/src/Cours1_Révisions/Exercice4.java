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
public class Exercice4 {

    public static void main(String[] args) {

        /*
        Exercice 4 : Écrire un programme qui demande à l’utilisateur de saisir un nombre entier n inférieur 
        ou égale à 9 et de lui afficher la table de multiplication de ce nombre.
        */
        
        Scanner sc = new Scanner(System.in);
        int i, n, prod; 
  
        System.out.println("Entrez un nombre compris entre 0 et 9");
        n = estEntierPositif();
        
        while(n > 9){
            System.out.println("Entrez un nombre compris entre 0 et 9");
            n = estEntierPositif();
        } 
        
        for(i = 0; i <= 10; i++){
            prod = i * n;
            System.out.println(i + " * " + n + " = "+ prod);
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

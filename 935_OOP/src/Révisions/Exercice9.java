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
public class Exercice9 {
    
    public static void main(String[] args) {
        
        /**
         * Exercice 9 :
         * Écrire un programme Java, permettant de résoudre un polynôme du second degré de la forme:
         * ax2 + bx + c où les coefficients a, b et c sont des nombres réels et a est non nul.
         * 1. Demander à l’utilisateur les valeurs de a, b et c dans le programme principal
         * 2. Pour résoudre une équation du second degré il faut calculer le discriminant (dans une fonction) : 
         * delta = b*b – 4*a*c
         * 3. Pour le calcul de la solution (dans une méthode), différents cas peuvent se produire en fonction 
         * de la valeur du discriminant :
         * a. Si delta est négatif, il n'y a pas de solution réelle.
         * b. Si delta est nul, la solution est unique et vaut -b/2a.
         * c. Sinon, les solutions sont :
         * x1 = (-b + sqrt(delta))/2a ET x2 = (-b - sqrt(delta))/2a
         * 4. La méthode Java permettant de calculer des racines carrées s'appelle sqrt() de la classe
         * Math → Math.sqrt().
         */
        Scanner sc = new Scanner(System.in);

        int a, b, c, delta; 
        
        System.out.println("Entrez un premier nombre");
        a = estNonNul();
        System.out.println("Entrez un second nombre");
        b = sc.nextInt();
        System.out.println("Entrez un troisième nombre");
        c = sc.nextInt();
        
        delta = discriminant(a,b,c);
        
        System.out.println(delta);
        solution(delta, a, b, c);
        
    }

    static int estNonNul(){    

       Scanner sc = new Scanner(System.in);
       int test = sc.nextInt();

       while(test == 0){
              System.out.println("Erreur, le nombre ne peut être nul");
                test = sc.nextInt();
            } 
       return test;
   }
    
    static int discriminant(int a, int b, int c){
        int delta;
        
        delta = b*b - 4*a*c;
        return delta;      
    }
    
    static void solution(int delta, int a, int b, int c){
        
        if(delta < 0){
            System.out.println("Il n'y a pas de solution réelle");
        } else if(delta == 0){
            System.out.println((-b / 2*a));
        } else {
            System.out.println("Première solution : ");
            System.out.println((-b + Math.sqrt(delta))/2*a);
            System.out.println("Seconde solution : ");
            System.out.println((-b - Math.sqrt(delta))/2*a);
        }
        
    }
    
}

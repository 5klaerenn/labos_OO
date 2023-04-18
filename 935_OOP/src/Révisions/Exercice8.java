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
public class Exercice8 {
    
    public static void main(String[] args) {
        
       /*
        Exercice 8 : Écrire un programme calculant la factorielle d’un nombre n saisi par l’utilisateur.
            • Factorielle de n : n! = 1 × 2 × … × n
            • Exemple : 4! = 1*2*3*4 = 24
            • Indice : fac = fact*i (i allant de 1 à n)
            Ce programme demandera aussi à l’utilisateur un choix de boucle : for, while et do while pour
            calculer la factorielle de trois façons différentes.
            Utiliser une fonction distincte pour chaque boucle.
       */  
        
                Scanner sc = new Scanner(System.in);
                int n, rep;

                System.out.println("Entrez un entier positif");
                n = estEntierPositif();
                
                System.out.println("Choisissez la boucle à utiliser");
                System.out.println("1. For");
                System.out.println("2. While");
                System.out.println("3. Do While");
                
                rep = sc.nextInt();
                
                switch(rep){
                    case 1:
                        System.out.println(bouclePour(n));
                        break;
                    case 2:
                        System.out.println(boucleWhile(n));
                        break;
                    case 3:
                         System.out.println(boucleDo(n));
                        break;
                    default: 
                        System.out.println("Erreur dans la demande");
                        break;
                 }
               
        }
    
    
    static int bouclePour(int n){
            int facto = 1;
            for( int i=1; i<=n;i++){
                    facto = facto*i;
            } 
            return facto;
    }

    static int boucleWhile(int n){
        int facto = 1;
        int i = 1;

        while(i <= n){
                facto = facto*i;
                 i++;
        } 

        return facto;
    }

    static int boucleDo(int n){
            int facto = 1;
            int i = 1;

            do{
                  facto = facto * i;
                  i++;
            } while(i <= n);

            return facto;

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

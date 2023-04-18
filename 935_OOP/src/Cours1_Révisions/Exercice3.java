/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cours1_Révisions;

/**
 *
 * @author Sklaerenn
 */
public class Exercice3 {
    
       public static void main(String[] args) {
                
       /*
            Exercice 3 : Écrire un programme qui, étant donné une variable n >= 0, calcule et affiche la 
            somme des n premiers nombres impairs (par exemple, pour n=4 : 1 + 3 + 5 + 7). 
            Le choix de la valeur de n vous revient.
       */
        
        int i, j, n, sum; 
        n = 4;
        j = 1;
        sum = 0;
        
        for(i = 0; i < n ; i++){
            sum = sum + (j +=2);
        }
       
        System.out.println(sum);
          
                
        }
    
}

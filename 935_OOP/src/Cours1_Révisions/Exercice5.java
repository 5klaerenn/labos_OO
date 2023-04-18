/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cours1_Révisions;

/**
 *
 * @author Sklaerenn
 */
public class Exercice5 {
    
    public static void main(String[] args) {
        
         /*
        Exercice 5 : Écrire un programme qui créée un tableau d’entiers de taille 50 et de le remplir avec des valeurs aléatoires entre [1 et 30[. 
        Ensuite, déterminer :
        • Combien de fois le chiffre 8 existe dans le tableau.
        • Combien il y a de chiffres pairs.
                */
        
        int tab[] = new int[50];
        int cpteHuit = 0;
        int cptePair= 0;
        
        for(int i = 0; i < tab.length; i++){
            tab[i] = (int) (1 + Math.random()* 31-1);
            System.out.println(tab[i]);
            
            if(tab[i] == 8){
                cpteHuit ++;
            }
            
            if(tab[i]%2 == 0){
                cptePair ++;
            }    
        }
        
        System.out.println("Il y a " + cpteHuit + " 8 dans le tableau");
        System.out.println("Il y a " + cptePair + " nombres pairs dans le tableau");
        

        
    }
    
}

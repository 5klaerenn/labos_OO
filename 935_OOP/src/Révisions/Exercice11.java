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
public class Exercice11 {
    
    public static void main(String[] args) {
        
        /* Exercice 11 : Utiliser la méthode menu() en lui ajoutant une boucle de validation sur le choix, et compléter le
        programme principal dans lequel déclarer un tableau d’entiers vide de dimension 5 et faire suivre
        par un menu d’options répétitif qui permet de :
        1. d’afficher le tableau (option 1),
        2. de remplir le tableau aves des valeurs de votre choix (option2),
        3. de changer la valeur d’une case à un indice précis; l’indice et la nouvelle valeur sont
        donnés par l’utilisateur. Faites une validation de saisie sur l’indice (option3)
        4. de quitter avec un message de courtoisie (option 4)
        Chaque option est à développer dans une fonction à part.
    */
        int tab[] = new int[5];
        boolean logged = true;
        int choix = menu();
        
        do{   
            switch(choix){
                case 1 :
                    afficherTab(tab);
                    choix = menu();
                    break;
                case 2 : 
                    remplirTab(tab);
                    choix = menu();
                    break;
                case 3 : 
                    modifierTab(tab);
                    choix = menu();
                    break;
                case 4 : 
                    System.out.println("Merci d'avoir utilisé le programme.");
                    logged = false;
                    break;
                default:
                    System.out.println("Erreur");
                    choix = menu();
                    break;
            } 
        } while (logged != false);
    }
        
    public static int menu(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1: Afficher") ;
        System.out.println("2: Remplir") ;
        System.out.println("3: Modifier") ;
        System.out.println("4: Quitter") ;
        System.out.println("Faites votre choix") ;
        
        int choix = sc.nextInt() ;
        return choix ;
    }

    public static void afficherTab(int[] tab){
        
        for(int i = 0; i < tab.length; i++){
            System.out.printf("%s %s", tab[i], " ");
        } System.out.println("");
    }
    
    public static void remplirTab(int[] tab){
        
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < tab.length; i++){
            System.out.println("Entrez la valeur" + (i+1));
            tab[i] = sc.nextInt();
        }
    }
    
    public static void modifierTab(int[] tab){
        Scanner sc = new Scanner(System.in);
        int i = indiceValide();
        System.out.println(i);
        
        System.out.println("Quelle est la nouvelle valeur ?");
        tab[i] = sc.nextInt();

    }
    
    public static int indiceValide(){
                
        Scanner sc = new Scanner(System.in);
        int i = 0;
        
        do{
            System.out.println("Quel est l'indice de la valeur que vous souhaitez modifier ?");
            while(!sc.hasNextInt()){
                System.out.println("Erreur, vous devez entrez un entier positif compris entre 0 et 4");
                sc.next();
            } i = sc.nextInt();
            
            if(i < 0 || i > 4){
                System.out.println("Erreur, vous devez entrez un entier positif compris entre 0 et 4");
            }
   
        } while (i < 0 || i > 4);
        
        return i;
    }

}

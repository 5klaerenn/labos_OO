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
public class Exercice7 {
    
    public static void main(String[] args) {
        
        /*
        Exercice 7 : Écrire un programme qui crée les tableaux suivants :
            String[] noms = {"Al","Ben","Carla","Diana","Enzo"};
            double[] heures = {0.0,0.0,0.0,0.0,0.0};
            double[] taux_horaires = {12.50, 10.80, 14.25, 17.56, 23.20};
            double[] salaires = {0.0,0.0,0.0,0.0,0.0};
        Ensuite, le programme, dans une boucle :
            • affiche, un à la fois, le nom de chaque employé et demande d’entrer le nombre d’heures travaillées par cette personne. 
               Le résultat doit être placé dans la case correspondante du tableau heures.
            • calcule le salaire obtenu pour chaque personne et place le résultat dans la bonne case du tableau salaires.
            • pour chaque personne, le programme affiche les résultats selon le format :
                Nom : xx, Heures : xx, Salaire : xx $
        Dans le même programme, demander à l’utilisateur d’entrer un nom et de :
            • afficher son salaire s’il existe
            • afficher le message suivant «Nom introuvable » sinon
       */
        
               Scanner sc = new Scanner(System.in);
                
                String[] noms = {"Al","Ben","Carla","Diana","Enzo"};
                double[] heures = {0.0,0.0,0.0,0.0,0.0};
                double[] taux_horaires = {12.50, 10.80, 14.25, 17.56, 23.20};
                double[] salaires = {0.0,0.0,0.0,0.0,0.0};
                
                String test;
                boolean spotted = false;
                int i;
                
               for(i = 0; i < noms.length; i++){
                      System.out.println(noms[i]);
                      System.out.println("Entrez le nombre d'heures de l'employé-e");
                      heures[i] = sc.nextDouble();
                      salaires[i] = heures[i]*taux_horaires[i];
                      
                      System.out.println("Nom : " + noms[i] + ", Heures : " + heures[i] + ", Salaire :" + salaires[i] + " $");
               }
               
               System.out.println("Entrez le nom de la personne que vous voulez rechercher");
               test = sc.next();
               
               i = 0;
               
               while(i < noms.length && spotted == false){
                        if(noms[i].equalsIgnoreCase(test)){
                               spotted = true;
                             } i++;   
                         }

                         if(spotted == false){
                             System.out.println("Nom introuvable");
                         } else {
                             System.out.println(salaires[i-1]);
                }
        
    }
   
}

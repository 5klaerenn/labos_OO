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
public class Exercice10 {
    
    public static void main(String[] args) {
        
        /*
        Exercice 10:
        Écrire un programme qui créée les fonctions suivantes :
            • afficherInformations qui reçoit en paramètre un nom, un nombre d’heures et un salaire
            pour afficher dans ce format :
                    *******************************************
                    * Nom : nom_recu_en_parametre
                    * Heures : nb_heures recu_en_parametre
                    * Salaire : salaire_recu_en_parametre $
                    *******************************************
       • calculerSalaire qui reçoit un nombre d’heures et un taux horaire, puis calcule et retourne
        un salaire (incluant une prime de ½ taux horaire pour chaque heure travaillée en haut de
        40 heures).
        Le programme principal devra accomplir les tâches décrite ci-dessous, en utilisant les fonctions
        décrites précédemment, et ce tant que l’utilisateur désire continuer :
        • Demandez le nom du travailleur
        • Générez un nombre d’heures aléatoire entre 20.0 et 50.0 (voir notre plus bas)
        • Calculez le salaire, en utilisant la bonne fonction, en supposant un taux horaire de 25.0
        $/heure
        • Affichez les informations du travailleur en utilisant la bonne fonction
        */
        
        Scanner sc = new Scanner(System.in);
        boolean continuer = true;
        String nom = new String();
        double heures, salaireHoraire, salaire;
        salaireHoraire = 25.0;
        
        do {            
            System.out.println("Entrez le nom du travailleur");
            nom = sc.nextLine();
            
            heures = 20.0 + Math.random()*(51.00-20.0);
            salaire = calculerSalaire(heures, salaireHoraire);
                    
            
            afficherInformations(nom, heures, salaire);
            
            continuer = keepGoing();
            
        } while (continuer == true);

        
    }
    
    static void afficherInformations(String nom, double heures, double salaire){
        System.out.println("**********************************");
        System.out.println("* Nom : "+nom);
        System.out.printf("%s %.2f %s", "* Heures :",heures, "heures \n");
        System.out.printf("%s %.2f %s", "* Salaire : ",salaire, "$\n");
        System.out.println("**********************************");
    }
    
    static double calculerSalaire(double heures, double salaire){
        double result, sup;
        
        if(heures < 40){
            result = heures*salaire;
        } else {
             sup = heures - 40;
             result = (salaire*40) + ((salaire*1.5)*sup);
        }
        
        return result;
    }
    
    static boolean keepGoing(){
        
        Scanner sc = new Scanner(System.in);
        String test;
        Boolean reponse;
        
        System.out.println("Voulez-vous continuer ? oui/non");
        test = sc.next();
        
        reponse = test.equalsIgnoreCase("oui");
       
        return reponse;
    }
}

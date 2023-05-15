/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercice1;

import java.util.Scanner;

/**
 *
 * @author Sklaerenn
 */
public class Voitures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Création du tableau et des voitures    
        Voiture[] voitures = new Voiture[3];
        
        Voiture v1 = new Voiture("AB3 H2O", "Blanc");
        Voiture v2 = new Voiture("4FO 89X", "Noir");
        Voiture v3 = new Voiture("L73 44S", "Bleu");
               
        
        voitures[0] = v1;
        voitures[1] = v2;
        voitures[2] = v3;
        
        
        //Affichage du tableau
        for(int i = 0; i < voitures.length; i++){
            System.out.println(voitures[i].toString());
        }
        
        //Test
        
        Voiture vTest1 = new Voiture("34J K4L", "null");
        Voiture vTest2 = new Voiture("AB3 H2O", "null");
        
        System.out.println("Est-ce que vTest1 et la voiture 3 ont la même immatriculation ?");
        verifier(vTest1, v3);
        
        System.out.println("Est-ce que vTest2 et la voiture 1 ont la même immatriculation ?");
        verifier(vTest2, v1);
        
    }
    
    static void verifier(Voiture v1, Voiture v2){
        if(v1.equals(v2)){
            System.out.println(v2.toString());
        } else {
            System.out.println("Aucune voiture ne correspond");
        }
    }

    
}

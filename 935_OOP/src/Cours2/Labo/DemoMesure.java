/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cours2.Labo;

import java.util.Scanner;

/**
 *
 * @author Sklaerenn
 */
public class DemoMesure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int valeur;
        Mesure mes;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("Entrez une mesure :");
            valeur = sc.nextInt();
            if (valeur!=0){
                mes = new Mesure(valeur);
            }
        } while(valeur !=0);
        
        Mesure.afficherMoyenne();

    }
    
}

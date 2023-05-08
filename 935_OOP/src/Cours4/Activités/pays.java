/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cours4.Activités;
import java.util.*;

/**
 *
 * @author Sklaerenn
 */
public class pays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int i; 
        
        ArrayList pays = new ArrayList();
        
        pays.add("Canada");
        pays.add("France");
        pays.add("Espagne");
        pays.add("Belgique");
        
        
        System.out.println("Première liste de pays : ");
        for(i = 0; i < pays.size(); i++){
            System.out.println(pays.get(i));
        }
        
        //Suppression des éléments de la liste
        pays.clear();

        if(pays.isEmpty()){
            System.out.println("La liste est vide");
        } else {
            for(i = 0; i < pays.size(); i++){
                System.out.println(pays.get(i));
            }
        }
        
        pays.add("Ecosse");
        pays.add("Irlande");
        pays.add("Argentine");
        pays.add("Bolivie");
        pays.add("Japon");
        
        //Rechercher si la collection contient un pays donné par l'utilisateur
        
        String test = new String(); 
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entrez le nom du pays à rechercher");
        test = sc.nextLine();
        
        if(pays.contains(test)){
            System.out.println(test + " est dans la liste");
        } else {
            System.out.println(test + " n'est pas dans la liste");
        }
        
        //Organisation de la liste
        Collections.sort(pays);
        
        //Affichage de la deuxième liste de pays 
        System.out.println("Deuxième liste de pays : ");
        for(i = 0; i < pays.size(); i++){
            System.out.println(pays.get(i));
        }
        
        
    }
    
}

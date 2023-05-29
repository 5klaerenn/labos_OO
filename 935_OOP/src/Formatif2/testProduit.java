/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Formatif2;

import java.util.ArrayList;

/**
 *
 * @author Sklaerenn
 */
public class testProduit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Produit> produits = new ArrayList<Produit>();
        
        produits.add(new TV(2158.80, "Samsung", 65));
        produits.add(new TV(3358.80, "Samsung", 75));
        produits.add(new Ordinateur(1840.5, "DELL", "i7"));
        produits.add(new Ordinateur(1275.0, "HP", "i5"));
        produits.add(new Tel(750.00, "Apple", 64));
        produits.add(new Tel(550.50, "Google", 128));
        
        System.out.println("*************************************");
        
        for(Produit prod : produits){
            System.out.println(prod.afficher());
        }
        
        System.out.println("\n*************************************");

        
        System.out.println("Somme totale des prix produtis de la liste : " + calculerPrixGlobal(produits) + " $");
        
        System.out.println("\n*************************************");
        
        produitPlusCher(produits);
        
        System.out.println("\n*************************************");
        
        afficherOrdinateurs(produits);
        
        System.out.println("\n*************************************");
        
        System.out.println("Téléphone(s) dont la capacité est supérieure à 100Go : ");
        afficherTelGdeCapacite(produits);
        
        

    }
    
    public static double calculerPrixGlobal(ArrayList<Produit> produits){
        
        double sum = 0;

        for(int i = 0; i<produits.size(); i++){
            sum += produits.get(i).calculerPrixTTC();
        }
        
        return sum;
    }
    

    public static void produitPlusCher(ArrayList<Produit> produits){
        double prixMax = 0;
        int indice = 0;
   
        for(int i = 0; i<produits.size(); i++){  
            double prix = produits.get(i).calculerPrixTTC();
            if(prix > prixMax){
                prixMax = prix;
                indice = i;
            }
        }
        System.out.println("Le produit dont le prix est le plus élevé est " + produits.get(indice).afficher());
    }
    
    public static void afficherOrdinateurs(ArrayList<Produit> produits){
        for(int i = 0; i<produits.size(); i++){
            if(produits.get(i) instanceof Ordinateur){
                System.out.println(produits.get(i).afficher());
            }
        }
    }
    
    public static void afficherTelGdeCapacite(ArrayList<Produit> produits){
        for(int i = 0; i < produits.size(); i++){
            if(produits.get(i) instanceof Tel && ((Tel) produits.get(i)).getCapacite() > 100){
                System.out.println(produits.get(i).afficher());
            }
        }
    }

}

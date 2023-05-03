/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cours3.Labo;

/**
 *
 * @author Sklaerenn
 */
public class DemoProduit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Produit p1 = new Produit();
        System.out.println(p1);
        
        Produit p2 = new Produit("123A", "Chaise", 59.99);
        System.out.println(p2);
        
        Produit p3 = new Produit("456B", "Fauteuil", 129.39);
        System.out.println(p3);
        
        Produit p4 = new Produit("000CH", "Canapé", 399.79);
        System.out.println(p4);
        
        System.out.println("");
        
        p1.setNoRef("000CH");
        System.out.println("Nouveau No de ref de p1 : "+ p1.getNoRef());
        System.out.println("");
        
        p1.setDesignation("Canapé");
        System.out.println("Nouveau nom de p1 : "+p1.getDesignation());
        System.out.println("");
        
        p1.setPrix(399.79);
        System.out.println("Nouveau prix de p1 : "+p1.getPrix());
        System.out.println("");
        
        System.out.println("p1 = p2 ?");
        System.out.println(p1.equals(p2));
        
        System.out.println("p1 = p4 ?");
        System.out.println(p1.equals(p4));
        
        

    }
    
}

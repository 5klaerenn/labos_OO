/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cours3.Labo;

/**
 *
 * @author Sklaerenn
 */
public class DemoLigneFacture {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Produit p1 = new Produit("123A", "Chaise", 59.99);
        Produit p2 = new Produit("456B", "Fauteuil", 129.39);
        Produit p3 = new Produit("000CH", "Canapé", 399.79);

        LigneFacture l1 = new LigneFacture(p1, 3);
        LigneFacture l2 = new LigneFacture(p2, 2);
        LigneFacture l3 = new LigneFacture(p3, 5);
        
        System.out.println(l1.getProduit());
        
        System.out.println(l2.getQuantité());
        
        System.out.println("Facture :");
        System.out.println(l1.toString());
        System.out.println(l2.toString());
        System.out.println(l3.toString());
        
       
        

    }
    
}

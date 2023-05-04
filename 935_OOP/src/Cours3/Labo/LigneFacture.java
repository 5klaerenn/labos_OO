/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cours3.Labo;

/**
 *
 * @author Sklaerenn
 */
public class LigneFacture {
    
    private Produit prod;
    private int quantité;
    
    public LigneFacture(Produit p, int q){
        this.prod = p;
        this.quantité = q;
    }
    
    public LigneFacture(Produit p){
        this.prod = p;
        this.quantité = 1;
    }
       
    public String getProduit(){
        return prod.toString();
    }
    
    public int getQuantité(){
        return quantité;
    }
    
    public void setProduit(Produit p){
        this.prod = p;
    }  
    
    public void setQuantité(int q){
        this.quantité = q;
    }
        
    public double totalHT(){
        return quantité*prod.getPrix();
    }
    
    public String toString(){
        return prod.toString()+" Prix total HT : "+totalHT();
        
    }
    
    
    

    
    

}

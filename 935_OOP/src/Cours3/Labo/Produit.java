/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cours3.Labo;

/**
 *
 * @author Sklaerenn
 */
public class Produit {
    
    private String noRef, designation;
    private double prix; 

    public Produit(){
        noRef = "";
        designation = "";
        prix = 1.0;
    }
    
    public Produit(String noRef, String designation, double prix ){
        this.noRef = noRef;
        this.designation = designation;
        this.prix = prix;
    }
    
    public Produit(String noRef, String designation){
        this.noRef = noRef;
        this.designation = designation;
        prix = 1.0;
    }
    
    public String getNoRef(){
        return noRef;
    }
    public String getDesignation(){
        return designation;
    }
    public double getPrix(){
        return prix;
    }
    
    public void setNoRef(String noRef){
        this.noRef = noRef;
    }   
    public void setDesignation(String designation){
        this.designation = designation;
    }  
    public void setPrix(double prix){
        this.prix = prix;
    }
    
    @Override
    public String toString(){
        return "Ref: "+noRef+", Nom : "+designation+" prix : "+prix;
    }
    
    @Override
   public boolean equals(Object obj){
       if(obj instanceof Produit){
           
           Produit autre = (Produit) obj;
           
           if(this.noRef.equals(autre.noRef) && 
                this.designation.equals(autre.designation)&& 
                this.prix == autre.prix){
              return true;
           } else{
                   return false; 
                   }
       } else 
           return false;
   }
    

}



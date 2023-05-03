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
    private double prixUnitaire; 

    public Produit(){
        noRef = "";
        designation = "";
        prixUnitaire = 1.0;
    }
    
    public Produit(String noRef, String designation, double prix ){
        this.noRef = noRef;
        this.designation = designation;
        this.prixUnitaire = prix;
    }
    
    public Produit(String noRef, String designation){
        this.noRef = noRef;
        this.designation = designation;
        prixUnitaire = 1.0;
    }
    
    public String getNoRef(){
        return noRef;
    }
    public String getDesignation(){
        return designation;
    }
    public double getPrix(){
        return prixUnitaire;
    }
    
    public void setNoRef(String noRef){
        this.noRef = noRef;
    }   
    public void setDesignation(String designation){
        this.designation = designation;
    }  
    public void setPrix(double prix){
        this.prixUnitaire = prix;
    }
    
    @Override
    public String toString(){
        return "Ref: "+noRef+", Nom : "+designation+" prix : "+prixUnitaire;
    }
    
    @Override
   public boolean equals(Object obj){
       if(obj instanceof Produit){
           
           Produit autre = (Produit) obj;
           
           if(this.noRef.equals(autre.noRef)){
              return true;
           } else{
                   return false; 
                   }
       } else 
           return false;
   }
    

}



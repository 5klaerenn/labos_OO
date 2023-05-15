package Exercice1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Asma
 */
public class Voiture {
    
    private String immatriculation;
    private String couleur;

    public Voiture(String matricule, String couleur)
    {
            immatriculation = matricule;
            this.couleur=couleur;
    }	


    public String getCouleur()
    {
            return couleur;
    }
    public String getImmatriculation()
    {
            return immatriculation;
    }
    
@Override
    public String toString(){
        return "("+immatriculation.toUpperCase()+";"+couleur.toUpperCase()+")";
    }
    
    public boolean equals(Object obj){
        if(obj instanceof Voiture){
           
           Voiture autre = (Voiture) obj;
           
           if(this.immatriculation.equals(autre.immatriculation)){
              return true;
           } else{
                   return false; 
                   }
       } else 
           return false;
   }
}
       

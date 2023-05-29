/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Formatif2;

/**
 *
 * @author Sklaerenn
 */
public class Doctorant extends Enseignant {
    
    private final int salaire = 30;
    private final int maxHeures = 96;
    
    public Doctorant(String n, String p, int h){
        super(n, p, h);
    }
     
    public int calculerSalaire(){
        int totalSalaire; 
        
        if(super.getHeure() > maxHeures){
            totalSalaire = salaire * maxHeures;
        } else {
            totalSalaire = super.getHeure() * salaire;
        }
      
        return totalSalaire; 
    }
    
    public String afficher(){
        return super.afficher() + " (Doctorant) a travaillé " + super.getHeure() + " heures pour un salaire total de  " + calculerSalaire() + "$";
    }
    
    

}

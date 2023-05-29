/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Formatif2;

/**
 *
 * @author Sklaerenn
 */
public class EnseignantChercheur extends Enseignant{
    
    private final int salaire = 4000;
    public final int salaireHeureSup = 60;
    public final int debutHSup = 192;
    
    public EnseignantChercheur(String n, String p, int h){
        super(n, p, h);
    }
    
    public int calculerSalaire(){
        int heuresSup;
        int salaireTotal = 0;
        
        if(super.getHeure() >= debutHSup){
            heuresSup = (super.getHeure() - debutHSup) * 60;
            salaireTotal = salaire*12 + heuresSup; 
        } else {
            salaireTotal = salaire * 12;
        }
        
        return salaireTotal; 
    }
    
    public String afficher(){
        return super.afficher() + " (Enseignant Chercheur) a travaillé " + super.getHeure() + " heures pour un salaire total de "+ calculerSalaire() + "$";
    };
    

}

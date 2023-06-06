/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Exercice3;

/**
 *
 * @author Sklaerenn
 */
public abstract class Personnel extends Personne {
    
    protected String contrat; 
    protected int anneeRecrut; 
    
    public Personnel(String n, String p, int anneeNaissance, String contrat, int aR){
        super(n, p, anneeNaissance);
        
        if(contrat.equalsIgnoreCase("CDD") || contrat.equalsIgnoreCase("CDI") || contrat.equalsIgnoreCase("INTERIM")){
            this.contrat = contrat; 
            }   else {
                System.out.println("Erreur dans l'entrée du contrat");
            }
        
        this.anneeRecrut = aR; 
    }
    
    public abstract int calculerAnciennete();
    
    public abstract String afficher();

}

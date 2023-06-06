/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Exercice3;

/**
 *
 * @author Sklaerenn
 */
public class Administratif extends Personnel {
    
    private String poste;
    
    public Administratif(String n, String p, int anneeNaissance, String contrat, int aR, String poste){
       super(n, p, anneeNaissance, contrat, aR);
       
       if(poste.equalsIgnoreCase("conseiller pedagogique") || poste.equalsIgnoreCase("technicien")){
            this.poste = poste; 
        }   else {
            System.out.println("Erreur dans l'entrée du poste");
        } 
       
       this.poste = poste;
    }
    
       
    @Override
    public int calculerAnciennete() {
        return 2023 - super.anneeRecrut;
    }
    
    @Override
    public String afficher(){
        String s;
        
        s = "Personnel Administratif : \n";
        s += "nom :" + super.nom.toUpperCase() + " ";
        s += "prenom : " + super.prenom.toUpperCase() + " ";
        s += "age : " + super.age + "\n";
        s += "Poste : " + poste.toUpperCase() + "\n";
        s += "***************************************  \n";
        
        return s; 
    }
    

}

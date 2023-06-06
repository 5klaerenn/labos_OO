/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Exercice3;

/**
 *
 * @author Sklaerenn
 */
public class Enseignant extends Personnel {
    
    private String grade; 
    
    public Enseignant(String n, String p, int anneeNaissance, String contrat, int aR, String g){
        super(n, p, anneeNaissance, contrat, aR);
        
        if(g.equalsIgnoreCase("Bacc") || g.equalsIgnoreCase("Maitrise") || g.equalsIgnoreCase("PhD")){
            this.grade = g; 
        }   else {
            System.out.println("Erreur dans l'entrée du grade");
        }
    }

    @Override
    public int calculerAnciennete() {
        int anciennete = 2023 - anneeRecrut; 
        
        if(this.grade.equalsIgnoreCase("BAC")){
            anciennete += 4;
        } else if(this.grade.equalsIgnoreCase("MAITRISE")){
            anciennete += 6;
        } else if(this.grade.equalsIgnoreCase("PhD")){
            anciennete += 8; 
        } 
        
        return anciennete;
    }
    
    public String afficher(){
        String s;
        
        s = "Personnel Enseignant : \n";
        s += "nom :" + super.nom.toUpperCase() + " ";
        s += "prenom : " + super.prenom.toUpperCase() + " ";
        s += "age : " + super.age + "\n";
        s += "Grade : " + grade + "\n";
        s += "***************************************  \n";
        
        return s; 
    }
    
    
    
}

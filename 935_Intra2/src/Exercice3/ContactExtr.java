/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Exercice3;

/**
 *
 * @author Sklaerenn
 */
public class ContactExtr extends Personne {

    private String typeContact;
    
    public ContactExtr(String n, String p, int anneeNaissance, String t){
        super(n, p, anneeNaissance);
        
        if(t.equalsIgnoreCase("Chef") || t.equalsIgnoreCase("Salarie")){
            this.typeContact = t; 
        }   else {
            System.out.println("Erreur dans l'entrée du type");
        } 
        
        
        this.typeContact = t;
    }
    
    @Override
    
    public String afficher(){
        String s;
        
        s = "Contact extérieur : \n";
        s += "nom :" + super.nom.toUpperCase() + " ";
        s += "prenom : " + super.prenom.toUpperCase() + " ";
        s += "age : " + super.age + "\n";
        s += "Type de contact extérieur : " + typeContact.toUpperCase() + "\n";
        s += "***************************************  \n";
        
        return s; 
    }
    
}

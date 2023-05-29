/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Formatif2;

/**
 *
 * @author Sklaerenn
 */
public class Vacataire extends Enseignant {

    private String organisme;
    
    private final int salaire = 40;
    
    public Vacataire(String n, String p, int h, String o){
        super(n, p, h);
        this.organisme = o;
    }

    public String getOrganisme() {
        return organisme;
    }
    
    
    public int calculerSalaire(){
        return super.getHeure() * salaire; 
    }
    
    public String afficher(){
        return super.afficher() + " (" + organisme + ") a travaillé " + super.getHeure() + " heures pour un salaire total de " + calculerSalaire() + "$";
    }
    
}

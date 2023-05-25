/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cours7.Labo;

/**
 *
 * @author Sklaerenn
 */
public class Profil {
    
    private String code;
    private String libelle;
    
    public Profil(String c, String l){
        this.code = c;
        this.libelle = l;
    }

    public String getLibelle() {
        return libelle;
    }
    
    public String getCode(){
        return code;
    }
    
    

}

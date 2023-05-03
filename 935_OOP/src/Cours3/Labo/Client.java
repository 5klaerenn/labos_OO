/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cours3.Labo;

/**
 *
 * @author Sklaerenn
 */
public class Client {
    
    private String nom, tel;
    
    public Client(){
        this.nom = "Collège de Rosemont"; 
        this.tel = "514-376-1620";
    }
    
    public Client(String nom, String tel){
        this.nom = nom;
        this.tel = tel;
    }
    
    public String getNom(){
        return nom;
    }
    
    public String getTel(){
        return tel;
    }
    
    public void setNom(String nom){
        this.nom = nom;
    }  
    
    public void setTel(String tel){
        this.tel = tel;
    }
    
    public String toString(){
        return nom+" : "+tel;
    }
    
    
 
}
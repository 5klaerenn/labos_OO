/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cours5.Labo;

/**
 *
 * @author Sklaerenn
 */
public class Chien extends Animal {

    public Chien(){
        super();
    }
    
    public Chien(int a, String n, String p){
        super(a, n, p);
    }
    
    public void afficher(){
        System.out.println("Chien " + "[" + getNom() + ", " + getAge() + ", " + getProprio() + "]");
    }

    
}

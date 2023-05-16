/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cours5.Labo;

/**
 *
 * @author Sklaerenn
 */
public class Animal {
    
    private String nom, proprio;
    private int age;
    
    public Animal(){
        this.age = 1;
        this.nom = "";
        this.proprio = "";
    }
    
    public Animal(String n){
        this.age = 1;
        this.nom = n;
        this.proprio = "";
    }
    
    public Animal(int a, String n){
        this.age = a;
        this.nom = n;
        this.proprio = "";
    }
    
    public Animal(String n, String p){
        this.age = 1;
        this.nom = n;
        this.proprio = p;
    }

    public Animal(int a, String n, String p){
        this.age = a;
        this.nom = n;
        this.proprio = p;
    }

    public int getAge() {
        return age;
    }

    public String getNom() {
        return nom;
    }

    public String getProprio() {
        return proprio;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setProprio(String proprio) {
        this.proprio = proprio;
    }
    
    public void afficher(){
        System.out.println("Animal " + "[" + nom + ", " + age + ", " + proprio + "]");
    }
    

}

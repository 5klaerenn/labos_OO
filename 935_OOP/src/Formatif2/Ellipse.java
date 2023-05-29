/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Formatif2;

/**
 *
 * @author Sklaerenn
 */
public class Ellipse extends FormeEuclidienne {

    private double grandAxe;
    private double petitAxe;
    
    private final double PI = 3.14;
    
    public Ellipse(double p){
        this.petitAxe = p;
    }
    
    public Ellipse(double g, double p){
        this.grandAxe = g;
        this.petitAxe = p;
    }

    public double getPI() {
        return PI;
    }
    
    

    public double getPetitAxe() {
        return petitAxe;
    }
    
    public double aire(){
        return PI * grandAxe * petitAxe;
    }
    
    public String afficher() {
        return "L'aire de l'ellipse (" + grandAxe + ", " + petitAxe + ") est : " + aire();
    }    

    
}

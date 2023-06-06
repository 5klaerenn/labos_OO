/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Formatif3;

/**
 *
 * @author Sklaerenn
 */
public abstract class FormeGeo implements Deplacable {

    private String couleur;
    private double positionX;
    private double positionY;
    
    public FormeGeo(String c, double x, double y){
        this.couleur = c;
        this.positionX = x;
        this.positionY = y;
    }
    
    
    public double getPositionX() {
        return positionX;
    }
    
    public double getPositionY() {
        return positionY;
    }
    
    public void setPositionX(double x){
        this.positionX = x;
    }
    
    public void setPositionY(double y){
        this.positionY = y;
    }
    
    public abstract double calculerAire();
    
    public String toString(){
        return "La forme " + "(Couleur : " + this.couleur + ", " + this.positionX + "; " + this.positionY + ")";
    }
    
}

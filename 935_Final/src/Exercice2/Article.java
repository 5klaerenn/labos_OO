/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Exercice2;

/**
 *
 * @author Sklaerenn
 */
public class Article implements Exportable {
    
    private int code;
    private String nom;
    private double prixHT; 
    
    public final double TAXE = 1.15;
    public final double FRAIS_DOUANE = 0.09;
    public final double TAXE_TRANSPORT = 0.12;
    
    public Article(int c, String n, double p){
        this.code = c;
        this.nom = n;
        this.prixHT = p;
    }

    public int getCode() {
        return code;
    }
        
    public double prix(){
        return Math.round(prixHT * TAXE);
    }
    
    public double droitDouane(){
        double prix = prix();
        double frais = prix * FRAIS_DOUANE;
        double taxeTransport = prix * TAXE_TRANSPORT;
        
        return Math.round(frais + taxeTransport);
    }
    
    
    public String toString(){
        String s;
        
        s = "L'article " + code + " est : " + nom + "\n";
        s += "Prix HT : " + prixHT + "\n";
        s += "Prix TTC : " + prix() + "\n";
        s += "Droits de douane pour USA : " + droitDouane()+ "\n";

        return s;
    }
    

}

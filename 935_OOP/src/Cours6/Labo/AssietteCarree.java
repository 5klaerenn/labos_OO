/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cours6.Labo;

/**
 *
 * @author Sklaerenn
 */
public class AssietteCarree extends Assiette {
    
    private double cote; 
    
    public AssietteCarree(int a, double c){
        super(a);
        this.cote = c;
    }
    
    public double calculerSurface(){
        return cote * cote;
    };
    
    public int calculerValeur(int anneeActuelle){
        return 5 * super.calculerValeur(anneeActuelle);
    }

}

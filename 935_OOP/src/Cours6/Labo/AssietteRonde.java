/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cours6.Labo;

/**
 *
 * @author Sklaerenn
 */
public class AssietteRonde extends Assiette{
    
    private double rayon;
    
    public AssietteRonde(int a, double r){
        super(a);
        this.rayon = r;
    }
    
    public double calculerSurface(){
        return 3.14 * rayon * rayon;
    }

}

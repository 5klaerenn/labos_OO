/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cours6.Labo;

/**
 *
 * @author Sklaerenn
 */
public class Technicien extends Employe {
    
    private int unités;
    private final double facteurUnité = 5.0;
    
    public Technicien(String n, String p, int a, String e, int u){
        super(n, p, a, e);
        this.unités = u;
    }

    @Override
    public String getTitre() {
        return "Le technicien ";
    }
    
        @Override
    public double calculerSalaire() {
        return unités * 5;
    }
    
    
    

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cours6.Labo;

/**
 *
 * @author Sklaerenn
 */
public class Manutentionnaire extends Employe {
    
    private int heures;
    private final double salaireHoraire = 65.0;
    
    public Manutentionnaire(String n, String p, int a, String e, int h){
        super(n, p, a, e);
        this.heures = h;
    }
    
    @Override
    public String getTitre() {
        return "Le manut. ";
    }

    @Override
    public double calculerSalaire() {
        return heures * salaireHoraire;
    }
}

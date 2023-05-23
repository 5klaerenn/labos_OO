/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cours6.Labo;

/**
 *
 * @author Sklaerenn
 */
public class Commercial extends Employe {

    private double chiffreAff;
    
    public Commercial(String n, String p, int a, String e, double ca){
        super(n, p, a, e);
        this.chiffreAff = ca;
    }

    public double getChiffreAff() {
        return chiffreAff;
    }
    
    public double calculerSalaire(){
        return 0.0;
    }
        
}

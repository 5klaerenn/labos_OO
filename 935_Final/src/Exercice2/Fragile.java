/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Exercice2;

/**
 *
 * @author Sklaerenn
 */
public class Fragile extends Article {

    private Emballage emballage; 
    
    public Fragile(int c, String n, double p, Emballage e){
        super(c, n, p);
        this.emballage = e;
    }

    @Override
    public int getCode() {
        return super.getCode(); 
    }
    
    
    public String toString(){
        String s;
        s = super.toString();
        s += "Attention fragile \n";
        s += emballage + "\n";
        return s; 
    }
    
}

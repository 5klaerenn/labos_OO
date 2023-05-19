/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetFinal;

/**
 *
 * @author Sklaerenn
 */
public class Local {
    
    private int numero;
    private int etage;
    private int heureDeb;
    private int heureFin;
    private Departement departement;
    private boolean reservation; 
    
    public Local(int n, int e, int hD, int hF){
        this.numero = n;
        this.etage = e;
        this.heureDeb = hD;
        this.heureFin = hF;
    }
    
    public int getNum(){
        return numero;
    }
    
    public int getEtage(){
        return etage;
    }
    
    public int getHeureDebut(){
        return heureDeb;
    }
    
    public int getHeureFin(){
        return heureFin;
    }
    
    
    
    public String toString(){
        return "Local : " + etage + "-" + numero + "\n" 
                + "Reservé : " + reservation + "\n";
    }
}

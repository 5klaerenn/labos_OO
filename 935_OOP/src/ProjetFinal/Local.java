/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetFinal;

/**
 *
 * @author Sklaerenn
 */
public abstract class Local {
    
    private int numero;
    private int etage;
    private int heureDeb;
    private int heureFin;
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
    
    public void setReservation(boolean test){
        this.reservation = test;
    }
    
    @Override
    public String toString(){
        String s; 
        String resultat; 
        
        if(reservation){
            resultat = "Oui";
        } else {
            resultat = "Non";
        }
        
        s = "========================================== \n";
        s += "Local : " + etage + "-" + numero + "\n";
        s += "Reservé : " ; 
        s += resultat + "\n";
                   
        return s;
    }
    
    public abstract boolean reserver(int heureDeb, int heureFin); 
}

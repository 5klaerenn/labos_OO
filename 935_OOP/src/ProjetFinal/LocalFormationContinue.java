/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetFinal;

/**
 *
 * @author Sklaerenn
 */
public class LocalFormationContinue extends Local {
    
    private int numEtape;
    
    private final int heureMini = 18;
    private final int heureMax = 23;
    
    public LocalFormationContinue(int n, int e, int hD, int hF, int numEtape){
        super(n, e, hD, hF);
        this.numEtape = numEtape;
    }
   
    @Override
    public String toString(){
        String s; 
        
        s = super.toString();
        s += "Formation continue (étape " + numEtape + ")";
        
        return s;
    }
    
    @Override
    public boolean reserver(int heureDeb, int heureFin){
        boolean test = true;
        
        if(heureDeb >= heureMini && heureFin <= heureMax && heureDeb < heureFin){
            test = true;
        } else {
            test = false;
        }
        
        this.setReservation(test);
        return test; 
    }
    
}

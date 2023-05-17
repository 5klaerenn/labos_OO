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
    
    public LocalFormationContinue(int n, int e, int hD, int hF, int numEtape){
        super(n, e, hD, hF);
        this.numEtape = numEtape;
    }
    
    public String toString(){
        String s; 
        
        s = super.toString();
        s += "Formation continue (étape " + numEtape + ")";
        
        return s;
    }
    
}

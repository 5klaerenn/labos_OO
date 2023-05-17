/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetFinal;

/**
 *
 * @author Sklaerenn
 */
public class LocalFormationReguliere extends Local {
    
    private String session; 
    private Departement departement;
    
    public LocalFormationReguliere(int n, int e, int hD, int hF, String session, Departement dep){
        super(n, e, hD, hF);
        this.session = session;
        this.departement = dep;
    }
    
    public String toString(){
        String s; 
        
        s = super.toString();
        s += "Formation régulière (session " + session + ") \n";
        s += departement;
        
        return s;
    }
}

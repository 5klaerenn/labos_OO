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
    
    private final int heureMini = 8;
    private final int heureMiniInfo = 15; 
    private final int heureMax = 18; 
    
    public LocalFormationReguliere(int n, int e, int hD, int hF, String session, Departement dep){
        super(n, e, hD, hF);
        this.session = session;
        this.departement = dep;
    }
    
    public Departement getDepartement(){
        return departement;
    }
      
    @Override
    public String toString(){
        String s; 
        
        s = super.toString();
        s += "Formation régulière (session " + session + ") \n";
        s += departement;
        
        return s;
    }
    
    @Override
    public boolean reserver(int heureDeb, int heureFin){
        boolean test = false;

        switch(departement.getNom()){
            case "Informatique" : 
                if(heureDeb >= heureMiniInfo && heureFin <= heureMax && heureDeb < heureFin){
                    test = true;
                    } else {
                    test = false;
                    }
                break;
            case "Sciences Humaines", "Science Nature" :
                if(heureDeb >= heureMini && heureFin <= heureMax && heureDeb < heureFin){
                    test = !((heureDeb < 12 && heureFin > 12) // Empêche les réservations qui commencent avant 12h et se terminent entre 12 et 13
                            || (heureDeb < 13 && heureFin > 13 ) // Empêche les réservations qui commencent avant 13h et qui se terminent après 13h
                            || (heureDeb <= 12 && heureFin >= 13)); // Empêche les réservations qui commencent avant 12h et qui finissent après 13h et les réservations qui commencent à 12h et se finissent à 13h.
                } else {
                    test = false;
                    }
                break;
            default : 
                System.out.println("Erreur");
                break;         
        }
        
        this.setReservation(test);
        return test; 
    }
    
}

package Cours2_Activité;

/**
 *
 * @author Sklaerenn
 */
public class Etudiant {
    
    private String numero, nom;
    private double note; 
    
    public Etudiant()
    {
        numero = "";
        nom = "";
        note = 0.0;
    }
    
    public Etudiant(String num, String n, double nte)
    {
        numero = num;
        nom = n;
        note = nte;
    }
    
    public String getNumero(){
        return numero;
    }
    public String getNom(){
        return nom;
    }
    public double getNote(){
        return note;
    }
    
    public void setNumero(String num){
        numero = num;
    }   
    public void setNom(String n){
        nom = n;
    }  
    public void setNote(double nte){
        note = nte;
    }
    

}

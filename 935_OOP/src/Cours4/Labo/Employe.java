
package Cours4.Labo;

/**
 *
 * @author Sklaerenn
 */
public class Employe {

    private String nom; 
    private int age; 
    private long salaire;
    
    public Employe(String n, int a, long s){
        this.nom = n;
        this.age = a;
        this.salaire = s;
    }
    
    public String getNom(){
        return nom;
    }
    
    public int getAge(){
        return age;
    }
    
    public long getSalaire(){
        return salaire;
    }
    
    public String toString(){
        return "Nom : "+nom+" - Age : "+age+" - Salaire "+salaire;
    }
    
    
}

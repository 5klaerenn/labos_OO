/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cours7.Labo;

/**
 *
 * @author Sklaerenn
 */
public class TestPersonne {
    
     public static void main(String[] args) {
     
        Profil pDG = new Profil("DG", "Directeur Général");
        Profil pEmp = new Profil("EMP", "Employé");

        Personne[] tabPers = new Personne[4];

        Personne p1 = new Personne("Starr", "Ringo", "1947", 97000.50, pDG);
        tabPers[0] = p1;
        Personne p2 = new Personne("Kelso", "Bob", "1978", 55000, pEmp);
        tabPers[1] = p2;
        Personne p3 = new Personne("Dorian", "John", "1987", 25000, pEmp);
        tabPers[2] = p3;
        Personne p4 = new Personne("Reid", "Eliott", "1989", 32000.00, pEmp);
        tabPers[3] = p4;
        
        //Affichage avant l'augmentation 
         System.out.println("Salaire avant augmentation");
        for (int i = 0; i< tabPers.length; i++){
            tabPers[i].affiche();
        }
        
        augmentation(tabPers);
        
        //Affichage après l'augmentation
         System.out.println("Salaire après augmentation");
        for (int i = 0; i< tabPers.length; i++){
            tabPers[i].affiche();
        }
        
        //Affichage du nombre d'employés dans la compagnie;
        System.out.println("Nombre d'employés dans la compagne : " + (Personne.comp));
        
        //Moyenne des salaires
         System.out.println("Salaire moyen dans l'entreprise : " + salaireMoyen(tabPers));
         
         //Affichage du nombre de personnes dont le salaire est inférieur à 80k 
         System.out.println("Nombre de personnes dont le salaire est inférieur à 80k : " + compterSalaire(tabPers));
        
     }
     
     public static void augmentation(Personne[] tabPers){
         for(int i = 0; i < tabPers.length; i++){
             tabPers[i].augmenterSalaire();
         }
    }
     
    public static double salaireMoyen(Personne[] tabPers){
        int sum = 0;
        
        for(int i = 0 ; i < tabPers.length; i++){
            sum += tabPers[i].getSalaire();
        }
        
        return sum / (Personne.comp);
    }
    
    public static int compterSalaire(Personne[] tabPers){
        int cpte = 0; 
        for(int i = 0; i < tabPers.length; i++){
            if(tabPers[i].getSalaire() < 80000){
                cpte++;
            }
        } 
        return cpte;
    }
}

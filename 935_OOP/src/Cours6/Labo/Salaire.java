/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cours6.Labo;

/**
 *
 * @author Sklaerenn
 */
public class Salaire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Employe[] personnels = new Employe[4];
        
        personnels[0] = new Vendeur("Pierre", "Business", 45, "1995", 30000);
        personnels[1] = new Representant("Léon", "Vendtout", 25, "2001", 20000);
        personnels[2] = new Technicien("Yves", "Bosseur", 28, "1998", 1000);
        personnels[3] = new Manutentionnaire("Jeanne", "Stocketout", 32, "1998", 45);
        
        afficherSalaires(personnels);
        System.out.println("");
        salaireMoyen(personnels);

    }
    
    public static void afficherSalaires(Employe[] personnels){
        for(int i = 0; i < personnels.length; i++){
            System.out.println(personnels[i].getTitre() + personnels[i].getNom() + " gagne " + personnels[i].calculerSalaire() + " dollars.");
        }
    }
    
    public static void salaireMoyen(Employe[] personnels){
        double sum = 0;
        
        for(int i = 0; i < personnels.length; i++){
            sum += personnels[i].calculerSalaire();
        }
        
        System.out.println("Le salaire moyen dans l'entreprise est de " + sum / personnels.length + " dollars.");
    }
    
}

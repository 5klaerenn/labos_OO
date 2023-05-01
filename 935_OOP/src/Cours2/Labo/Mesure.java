/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cours2.Labo;

/**
 *
 * @author Sklaerenn
 */
public class Mesure {
    
    private int valeur;  
    
    private static int NbMesures = 0;
    private static int SomMesures = 0;
    
    public final static int min = -101;
    public final static int max = 101;
    
    
    
    public Mesure (int val){
        if(val > min && val < max){
            this.valeur = val;
            NbMesures++;
            SomMesures = SomMesures + valeur;
        } else {
            System.out.println("mesure hors intervalle");
        }
    }
    
    public static void afficherMoyenne(){
        if(NbMesures == 0){
            System.out.println("zéro mesures");
        } else {
            System.out.println("Moyenne des "+NbMesures+" mesures est : "+(SomMesures/NbMesures));
        }
    }
            
    
    
}

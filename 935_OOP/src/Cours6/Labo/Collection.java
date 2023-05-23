/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cours6.Labo;

/**
 *
 * @author Asma
 */
public class Collection {

   // Cette variable stocke l'année actuelle.
    private final static int CURRENT_YEAR = 2023;
    
    public static void main(String[] args) {
        Ustensile[] us = new Ustensile[5];
        us[0] = new AssietteRonde(1926, 8.4);
        us[1] = new Cuillere(1881, 7.3);
        us[2] = new AssietteCarree(1935, 5.6);
        us[3] = new Cuillere(1917, 8.8);
        us[4] = new AssietteRonde(1837, 5.4);
 
        afficherCuilleres(us);
        afficherSurfaceAssiettes(us);
        afficherValeurTotale(us);
    }
 
    public static void afficherCuilleres(Ustensile[] us) {
        int nbCuilleres = 0;
        for (int i = 0; i < us.length; i++) {
            if(us[i] instanceof Cuillere){
                nbCuilleres += 1 ;
            }
        }
        System.out.println("Il y a " + nbCuilleres + " cuillères.");
    }
 
    public static void afficherSurfaceAssiettes(Ustensile[] us) {
        double somme = 0;
        for (int i = 0; i < us.length; i++) {
            if(us[i] instanceof Assiette){
                somme += ((Assiette) us[i]).calculerSurface();
            }
        }
        System.out.println("Surface totale des assiettes : " + somme);
    }

    public static void afficherValeurTotale(Ustensile[] us) {
        double somme = 0;
        for (int i = 0; i < us.length; i++) {
            somme += us[i].calculerValeur(CURRENT_YEAR);
        }
        System.out.println("Valeur totale de la collection : " + somme);
    }
    
}

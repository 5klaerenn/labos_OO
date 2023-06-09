/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Formatif;

import Cours3.Labo.Client;
import Cours3.Labo.LigneFacture;
import Cours3.Labo.Produit;

/**
 *
 * @author Sklaerenn
 */
public class Facture {

    private Client client;
    private LigneFacture[] tabLignes;
    private double totalHT;
    private double montantTPS;
    private double montantTVQ;
    private double totalTTC;
    
    public static int cpteLignes; 
    
    public static final double TPS = 0.05;
    public static final double TVQ = 0.0975;
     
    public Facture(){
        this.client = new Client();
        this.tabLignes = new LigneFacture[10];
        cpteLignes = 0;
    }
    
    public Facture(int n){
        this.client = new Client();
        this.tabLignes = new LigneFacture[n];
        cpteLignes = 0;
    }
    
    public Facture(Client c, int n){
        this.client = c;
        this.tabLignes = new LigneFacture[n];
        cpteLignes = 0;
    }
    
    public Facture(String nom, String tel, int n){
        this.client = new Client(nom, tel);
        this.tabLignes = new LigneFacture[n];
        cpteLignes = 0;
    }
              
    public Client getClient(){
        return client;
    }
    
    public LigneFacture[] getLigneFact(){
        return tabLignes;
    }
    
    public double getHT(){
        return totalHT;
    }
    
    public double getTTC(){
        return totalTTC;
    }
    
    public double getTPS(){
        return montantTPS;
    }
    
    public double getTVQ(){
        return montantTVQ;
    }
    
    public boolean estPlein(LigneFacture[] tabLignes){
        if(cpteLignes < tabLignes.length){
            return false;
        } else {
            return true;
        }
    }
    
    public void ajouterLigne(LigneFacture ligne){
            tabLignes[cpteLignes] = ligne;
            cpteLignes ++;
    }
    
    public void calculer(){
        for(int i = 0; i<cpteLignes; i++){
            totalHT = totalHT + tabLignes[i].totalHT();
        }
        
        montantTPS = (double) Math.round((totalHT * TPS) * 100)/100;
        montantTVQ = (double) Math.round((totalHT * TVQ) * 100)/100;
        
        totalTTC = (double) Math.round((totalHT + montantTPS + montantTVQ) * 100)/100;
    }
    
    public String toString(){
        
        calculer();
        
        String s = new String();
        
        s = "=============  FACTURE  ============= \n";
        s += client + "\n";
        s += "-------------------------------------- \n";
        for(int i = 0; i < cpteLignes; i++){
            s += tabLignes[i]+"\n";
        }
        s += "\n--------------------------------------";
        s += "\nMontant HT : " + totalHT;
        s += "\nMontant TPS : " + montantTPS;
        s += "\nMontant TVQ : " + montantTVQ;
        s += "\nMontant total : " + totalTTC;
        s += "\n=======================================";
        
        return s;
        
    }
    
}
    
   
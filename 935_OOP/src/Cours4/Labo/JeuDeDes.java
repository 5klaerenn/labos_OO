/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cours4.Labo;
import Cours2.Labo.De;

/**
 *
 * @author Sklaerenn
 */
public class JeuDeDes {
    
     De[] tabDe = new De[5];
    
    public JeuDeDes(){
        for(int i = 0; i < tabDe.length; i++){
            tabDe[i] = new De(6);
        }
    }
    
    public JeuDeDes(int n){
        for(int i = 0; i < tabDe.length; i++){
            tabDe[i] = new De(n);
        }
    }
    
    public JeuDeDes(int[] n){
        tabDe[0] = new De(n[0]);
        tabDe[1] = new De(n[1]);
        tabDe[2] = new De(n[2]);
        tabDe[3] = new De(n[3]);
        tabDe[4] = new De(n[4]);
    }
    
    public void lancerSet(){
         for(int i = 0; i < tabDe.length; i++) {
             tabDe[i].lancerDe();
             System.out.println(tabDe[i].getFacette());
         }
    }
    
    public int[] chaqueDe(){
        int[] chaqueDe = new int[5];
        
        for(int i = 0; i < chaqueDe.length;i++){
            tabDe[i].lancerDe();
            chaqueDe[i] = tabDe[i].getFacette();
        }
        
        return chaqueDe;
    }
    

    

    

    
    

}

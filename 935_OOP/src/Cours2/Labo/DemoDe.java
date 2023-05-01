/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cours2.Labo;

/**
 *
 * @author Sklaerenn
 */
public class DemoDe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int lancers = 5;
        
        De de20 = new De(20);
        
        for(int i = 0; i<lancers; i++){
            de20.lancerDe();
            System.out.println(de20.getFacette());
        }


    }
    
}

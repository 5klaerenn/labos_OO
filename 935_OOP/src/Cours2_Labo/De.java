/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cours2_Labo;

/**
 *
 * @author Sklaerenn
 */
public class De {
    
    private int nbrFaces;
    private int facetteAct; 
    
    public De(int n)
    {
        nbrFaces = n;
    }
    
    public void lancerDe(){
        facetteAct = (int) (1 + Math.random() * ((this.nbrFaces+1) - 1));
    }
    
    public int getFacette(){
        return facetteAct;
    }

}

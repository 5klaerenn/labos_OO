/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Exercice2;

/**
 *
 * @author Sklaerenn
 */
public class Etudiant {
    
    private String code;
    private String nomPrenom;
    private double noteTP1, noteTP2, noteExamen;
    
    public static double coef1 = 0.3;
    public static double coef2 = 0.4;
    
    public final static double min = 0.0;
    public final static double max = 100.0;
    public final static double notePass = 60.0;
    
    
    public Etudiant(){
        this.code = "";
        this.nomPrenom = "";
        this.noteTP1 = 0.0;
        this.noteTP2 = 0.0;
        this.noteExamen = 0.0;
    }
    
    public Etudiant(String c, String nom, double n1, double n2, double nExam){
        this.code = c;
        this.nomPrenom = nom;
        this.noteTP1 = n1;
        this.noteTP2 = n2;
        
        if(nExam > min && nExam <= max ){
            this.noteExamen = nExam;
        } else {
            this.noteExamen = 0.0;
        }
    }
    
    public String getNom(){
        return nomPrenom;
    }
    
    public String toString(){
        return nomPrenom+"("+noteTP1+", "+noteTP2+", "+noteExamen+")";
    }
    
    public double calculerGlobal(){
        return coef1*noteTP1 + coef1*noteTP2 + coef2*noteExamen;
    }
    
    public void resultatFinal(){
        if(calculerGlobal() >= notePass){
            System.out.println(code + " (Réussite)");
        } else {
            System.out.println(code + " (Échec)");
        }
    }


}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cours3.Activités;

/**
 *
 * @author Sklaerenn
 */
public class toStringActivite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String s = "Dupont,Paul,34:Tremblay,Serge,25:Thibaut,Annie,33" ;
        
        String[] t = s.split(":");
        String[] tPre = new String[3];
        String[] tNom = new String[3];
        String[] tAge = new String[3];
        
        for(int i = 0; i<t.length; i++){        
            int j = 0;
                tNom[i] = (t[i].split(","))[j];
                tPre[i] = (t[i].split(","))[j+1];
                tAge[i] = (t[i].split(","))[j+2];
           }
        
        for(int i=0; i<t.length;i++){
            System.out.println(tPre[i]);
            System.out.println(tNom[i]);
            System.out.println(tAge[i]);
            System.out.println("");
        }
        
        }
        
    }
    


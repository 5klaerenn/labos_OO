/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Révisions;

import java.util.Scanner;

/**
 *
 * @author Sklaerenn
 */
public class Exercice12 {
    
    public static void main(String[] args) {
        
        /*
        Exercice 12 : Un programme principal saisit une séquence d’ADN valide :
        • Écrire une fonction valide () qui reçoit en paramètre une séquence et qui renvoie vrai si la
        saisie de la séquence est valide, faux sinon.
        o « valide » signifie que la séquence n’est pas vide et est formée exclusivement d’une
        combinaison arbitraire de "a", "t", "g" ou "c").
        • Écrire une méthode occurrences () qui reçoit en paramètre une séquence et qui affiche le
        nombre d’occurrences de chaque caractère (a, t, g, c).
        • Écrire une méthode saisie () qui demande à l’utilisateur de saisir une séquence et vérifie si
        la séquence est valide ou non
        o Si la séquence est valide, afficher le nombre d’occurrence de chaque caractère.
        o Sinon, afficher un message pour d’erreur pour l’utilisateur.   
        */
        
        
        saisie();
        
    }
    
    static boolean valide(String sequence){
        
        boolean valide = true;
        int i = 0;
        String[] st = sequence.split("");
        
        if(sequence.isEmpty()){
            valide = false; 
        } 
        
        while(i < st.length  && valide){
            if (st[i].compareTo("a") != 0 && st[i].compareTo("t") != 0 && st[i].compareTo("g") != 0 && st[i].compareTo("c") != 0){
                valide = false;
            } i++;
        }       
        return valide;
    }
    
    static void saisie(){
        Scanner sc = new Scanner(System.in);
        String sequence;
        
        System.out.println("Entrez une séquence");
        sequence = sc.nextLine();
        
        if(!valide(sequence)){
            System.out.println("Erreur dans la séquence entrée");
        } else {
            occurences(sequence);      
        }
        
    }
    
    static void occurences(String sequence){
        
        int cptA=0, cptT=0, cptG=0, cptC=0;
        
        String[] st = sequence.split("");
        
        for(int i=0; i < st.length; i++){
            if(st[i].equalsIgnoreCase("a")){
                cptA = cptA + 1;
            } else if (st[i].equalsIgnoreCase("t")){
                cptT = cptT + 1;
            } else if (st[i].equalsIgnoreCase("g")){
                cptG = cptG + 1;
            } else if (st[i].equalsIgnoreCase("c")){
                cptC = cptC + 1;
            }    
        }
        
        System.out.println("Il y a "+cptA+" a dans la séquence");
        System.out.println("Il y a "+cptT+" t dans la séquence");
        System.out.println("Il y a "+cptG+" g dans la séquence");
        System.out.println("Il y a "+cptC+" c dans la séquence");
        
        
    }
    
    
}

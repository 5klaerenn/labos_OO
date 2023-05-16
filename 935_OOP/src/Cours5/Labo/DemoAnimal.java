/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cours5.Labo;

/**
 *
 * @author Sklaerenn
 */
public class DemoAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Animal[] tabAnimaux = new Animal[5];
        
        tabAnimaux[0] = new Chat(6, "Kuzco", "Poupou");
        tabAnimaux[1] = new Chat(3, "Patoune", "Poupou");
        tabAnimaux[2] = new Chat(9, "Memph", "Julie");
        tabAnimaux[3] = new Chat(7, "Milka", "Julie");
        tabAnimaux[4] = new Chien(12, "Endrix", "Kara");
        
       
        
        for(int i = 0; i < tabAnimaux.length; i++){
            tabAnimaux[i].afficher();
        }
        
    }
    
}

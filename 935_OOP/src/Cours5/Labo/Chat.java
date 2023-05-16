/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cours5.Labo;

/**
 *
 * @author Sklaerenn
 */
public class Chat extends Animal {
    
    public Chat(){
        super();
    }
    
    public Chat(int a, String n, String p){
        super(a, n, p);
    }
    
    public void afficher(){
        System.out.println("Chat " + "[" + getNom() + ", " + getAge() + ", " + getProprio() + "]");
    }

}

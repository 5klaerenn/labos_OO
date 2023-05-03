/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cours3.Labo;

/**
 *
 * @author Sklaerenn
 */
public class DemoClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Client c1 = new Client();
        Client c2 = new Client("Bob", "514-555-5555");
        
        System.out.println(c1);
        System.out.println(c2);
        
    }
    
}

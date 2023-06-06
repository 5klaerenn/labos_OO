/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cours9.Activités;

import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Sklaerenn
 */
public class TestCases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cases fenetre = new Cases();
        fenetre.setVisible(true);
        
        selection(fenetre.cb1);
        
    }
    
        public static void selection(JCheckBox c){
            if(c.isSelected()){
                JOptionPane.showMessageDialog(null, "Case : cochée");
            } else {
                JOptionPane.showMessageDialog(null, "Case : non cochée");
            }
        }
    
}

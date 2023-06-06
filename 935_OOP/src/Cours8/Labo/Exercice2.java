/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cours8.Labo;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Sklaerenn
 */
public class Exercice2 extends JFrame {
    
    JPanel pan = new JPanel();
    
    JButton bouton1 = new JButton("Bouton 1");
    JButton bouton2 = new JButton("Bouton 2");
    JButton bouton3 = new JButton("Bouton 3");
    JButton bouton4 = new JButton("Bouton 4");

    public Exercice2(){
        this.setTitle("Exercice 2");
        this.setSize(350, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Color c = new Color(154, 217, 171);
        pan.setBackground(c);
        
        pan.setLayout(new BorderLayout());
        pan.add(bouton1, BorderLayout.NORTH);
        pan.add(bouton2, BorderLayout.SOUTH);
        pan.add(bouton3, BorderLayout.WEST);
        pan.add(bouton4, BorderLayout.EAST);
        
        this.add(pan);

        
    }

}

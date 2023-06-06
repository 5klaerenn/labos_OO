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
public class Exercice1 extends JFrame {

    JPanel pan = new JPanel();

    public Exercice1(){
        this.setTitle("Exercice 1");
        this.setSize(350, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        pan.setBackground(Color.pink);
        
        this.add(pan);

        
    }
}

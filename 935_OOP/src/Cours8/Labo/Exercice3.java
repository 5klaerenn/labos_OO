/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cours8.Labo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.*;

/**
 *
 * @author Sklaerenn
 */
public class Exercice3 extends JFrame implements ActionListener {
    
    JPanel pan = new JPanel();
    JLabel label = new JLabel("");
    JButton btn1 = new JButton("Clique moi !");
    
    public Exercice3() {
    
        this.setTitle("Exercice 3");
        this.setSize(400, 350);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        Color c = new Color(154, 217, 171);
        pan.setBackground(c);
        
        GridLayout grid = new GridLayout(3, 1);
        pan.setLayout(grid);
        
        pan.add(label);
        pan.add(btn1);      
        this.add(pan);
        
        btn1.addActionListener(this);

    }
    
    public void actionPerformed(ActionEvent e){
        Scanner sc = new Scanner(System.in);
        String nom;
        int annee, age;
        
        System.out.println("Entrez votre nom");
        nom = sc.nextLine();
        
        System.out.println("Entrez votre année de naissance");
        annee = sc.nextInt();
        age = 2023 - annee;
        
        label.setText("Bonjour " + nom + ", vous avez " + age + " ans");
        
    } 

}

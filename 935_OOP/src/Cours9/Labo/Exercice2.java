/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cours9.Labo;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author Sklaerenn
 */
public class Exercice2 extends JFrame implements ActionListener {
    
    JPanel p = new JPanel();
    
    JTextField tf1, tf2, tf3;
    JLabel lb1, lb2;
    JButton btn = new JButton("Calculer");
    
    public Exercice2(){
        this.setTitle("Exercice 2");        
        this.setSize(450, 100);
        this.setDefaultCloseOperation(3); 
                
        tf1 = new JTextField();
        tf1.setPreferredSize(new Dimension(100, 20));
        
        p.add(tf1);
        
        lb1 = new JLabel(" + ");
        p.add(lb1);
        
        tf2 = new JTextField();
        tf2.setPreferredSize(new Dimension(100, 20));
        
        p.add(tf2);
        
        lb2 = new JLabel(" = ");
        p.add(lb2);
        
        tf3 = new JTextField();
        tf3.setPreferredSize(new Dimension(100, 20));
        tf3.setFocusable(false);
        p.add(tf3);
        
        p.add(btn);
                
        this.add(p);
        
        btn.addActionListener(this);
    }
    
    public void calculer(){
        int nbr1 = Integer.parseInt(tf1.getText());
        int nbr2 = Integer.parseInt(tf2.getText());
        int result = nbr1 + nbr2; 
        
        tf3.setText(Integer.toString(result));
    }
    
    public void actionPerformed(ActionEvent e){
        calculer();
    } 

}

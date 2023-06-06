/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cours9.Labo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Sklaerenn
 */
public class Exercice1 extends JFrame implements ActionListener {
    
    JPanel p = new JPanel();
    JLabel label = new JLabel("");
    JButton btn = new JButton("Copier");
    JTextField tf = new JTextField("Hello");
    
    
    public Exercice1(){
        this.setTitle("Exercice 1");        
        this.setSize(450, 100);
        this.setDefaultCloseOperation(3); // equivaut à exit_on_close
        
        tf.setPreferredSize(new Dimension(240, 25));
        
        p.add(tf);
        p.add(btn);
        p.add(label);
        
        this.add(p);
        
        btn.addActionListener(this);
        
    }
    
            
    public void actionPerformed(ActionEvent e){

        label.setText(tf.getText());
               
    } 
    
    

}

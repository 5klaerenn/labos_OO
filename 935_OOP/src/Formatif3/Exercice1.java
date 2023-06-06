/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Formatif3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Sklaerenn
 */
public class Exercice1 extends JFrame implements ActionListener  {
    
    JPanel p = new JPanel(new GridLayout(5, 1));
    JTextField input;
    JRadioButton rd1, rd2, rd3;
    ButtonGroup radio = new ButtonGroup();
    JButton btn1; 
    
    Color c = new Color(128, 128, 128);
    Color r = new Color(255,0,0);
    Color g = new Color(0,255,0);
    Color b = new Color(0,0,255);

    public Exercice1(){
        this.setTitle("Exercice 1");        
        this.setSize(450, 600);
        this.setDefaultCloseOperation(3);
        
        input = new JTextField();
        input.setBackground(c);
        p.add(input);
        
        rd1 = new JRadioButton("Rouge"); 
        rd1.setBackground(r);
        radio.add(rd1);
        p.add(rd1);
        
        rd2 = new JRadioButton("Vert"); 
        rd2.setBackground(g);
        radio.add(rd2);
        p.add(rd2);
        
        rd3 = new JRadioButton("Bleu"); 
        rd3.setBackground(b);
        radio.add(rd3);
        p.add(rd3);
        
        btn1 = new JButton("Changez couleur");
        p.add(btn1);
        
        this.add(p);
        
        btn1.addActionListener(this);

    }
    
    public void changeBackground(){
        
        if(rd1.isSelected()){
            input.setBackground(r);
        } else if(rd2.isSelected()){
            input.setBackground(g);
        } else {
            input.setBackground(b);
        }
    }
    
    public void actionPerformed(ActionEvent e){

        changeBackground();
        
    } 
    
}
